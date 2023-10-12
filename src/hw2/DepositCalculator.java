package hw2;

public class DepositCalculator {
    public static void main(String[] args) {
        double deposit = Integer.parseInt(args[0]); //10000.0
        int percent = Integer.parseInt(args[1]); //11
        int amountOfYears = Integer.parseInt(args[2]); //3

        double res = deposit;
        for (int i = 0; i < amountOfYears; i++) {
            res = res * Math.pow((1 + (percent / 100.0) / 12.0), 12);
            System.out.println((i + 1) + " year: " + res);
        }
        System.out.println("Interest charges: " + (res - deposit));
    }
}

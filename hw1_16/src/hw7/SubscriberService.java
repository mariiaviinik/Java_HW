package hw7;

public interface SubscriberService {
    public void getSubscribersWithExceededCityCallDuration(double givenTime);

    public void getSubscribersThatUsedInterCityCall();

    public double calculateSumOfTrafficInCity(String city);

    public int getAmountOfSubscribersWithNegativeBalance();

    public void searchByFirstLetterOfLastName(String letter);
}

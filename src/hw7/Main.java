package hw7;

public class Main {
    public static void main(String[] args) {
        Subscriber[] subscribers = {new Subscriber(1, "Ponce", "Kate", "Kyiv", "+0673462885", "7346793", 20.3, 248.6, 31.2, 8),
                new Subscriber(2, "Krass", "Eva", "Kyiv", "+0679674395", "290385", 10.3, 150.6, 11.2, 6.5),
                new Subscriber(3, "Patt", "Cristopher", "Kharkiv", "+0679564034", "096743343", -5.3, 341.6, 0, 12.5),
                new Subscriber(4, "Brik", "Caroline", "Poltava", "+0679743659", "98756456", 14.6, 185.7, 51.2, 11.4),
                new Subscriber(5, "Trop", "Cole", "Kyiv", "+0677694543", "948376353", -3.6, 234.3, 16.0, 20.3),
        };

        SubscriberServiceImpl subscriberServiceImplInstance = new SubscriberServiceImpl(subscribers);

        System.out.println("         Subscribers whose city calls time exceeds the specified time:");
        subscriberServiceImplInstance.getSubscribersWithExceededCityCallDuration(200);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("         Subscribers who used intercity communication:");
        subscriberServiceImplInstance.getSubscribersThatUsedInterCityCall();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("         Subscribers whose the first letter of the last name is P:");
        subscriberServiceImplInstance.searchByFirstLetterOfLastName("P");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Total consumption of Internet traffic for Kyiv is " + subscriberServiceImplInstance.calculateSumOfTrafficInCity("Kyiv"));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The number of subscribers with a negative balance is " + subscriberServiceImplInstance.getAmountOfSubscribersWithNegativeBalance());
    }
}

package hw7;

public class SubscriberServiceImpl implements SubscriberService {
    private Subscriber[] subscribers;

    public SubscriberServiceImpl(Subscriber[] subscribers) {
        this.subscribers = subscribers;
    }

    public Subscriber[] getSubscribers() {
        return subscribers;
    }

    @Override
    public void getSubscribersWithExceededCityCallDuration(double givenTime) {
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.getCityCallDuration() > givenTime) {
                System.out.println(subscriber.toString());
            }
        }
    }

    @Override
    public void getSubscribersThatUsedInterCityCall() {
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.getInterCityCallDuration() > 0) {
                System.out.println(subscriber.toString());
            }
        }
    }

    @Override
    public double calculateSumOfTrafficInCity(String city) {
        double sum = 0;
        for (Subscriber subscriber : this.subscribers) {
            if ((subscriber.getCity()).equals(city)) {
                sum += subscriber.getInternetTraffic();
            }
        }
        return sum;
    }

    @Override
    public int getAmountOfSubscribersWithNegativeBalance() {
        int subscribersAmount = 0;
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.getBalance() < 0) {
                subscribersAmount++;
            }
        }
        return subscribersAmount;
    }

    @Override
    public void searchByFirstLetterOfLastName(String letter) {
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.getLastName().split("")[0].equals(letter)) {
                System.out.println(subscriber.getFirstName() + " " + subscriber.getLastName() + " has phone number " + subscriber.getPhoneNumber() + " and balance " + subscriber.getBalance());
            }
        }
    }
}

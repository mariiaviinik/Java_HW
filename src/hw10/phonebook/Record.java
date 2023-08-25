package hw10.phonebook;

public class Record {
    private String name;
    private String phoneNumbers;

    public Record(String name, String phoneNumbers){
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
    public String getName(){
        return this.name;
    }

    public String getPhoneNumbers(){
        return this.phoneNumbers;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\"' +
                ", phoneNumbers='" + phoneNumbers + '\"' +
                '}';
    }
}

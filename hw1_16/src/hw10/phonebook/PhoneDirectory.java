package hw10.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneDirectory {
    private List<Record> records = new ArrayList<>();

    public List<Record> getRecords(){
        return this.records;
    }
    public void add(Record record){
        this.records.add(record);
    }

    public Record find(String name){
        Iterator<Record> iterator = records.iterator();
        while (iterator.hasNext()){
            Record next = iterator.next();
            if(next.getName() == name){
                return next;
            }
        }
        return null;
    }

    public List<Record> findAll(String name){
        Iterator<Record> iterator = records.iterator();
        List<Record> result = new ArrayList<>();

        while (iterator.hasNext()){
            Record next = iterator.next();
            if(next.getName() == name){
                result.add(next);
            }
        }

        if(result.size() > 0) return result;
        return null;
    }

    public static void main(String[] args) {
        PhoneDirectory directory1 = new PhoneDirectory();

        Record record1 = new Record("Mariia", "+380993746518");
        Record record2 = new Record("Mariia", "+380936446000");
        Record record3 = new Record("Karina", "+3806578595950");
        Record record4 = new Record("Alexandra", "+380674747839");
        Record record5 = new Record("Max", "+38077920086325");

        directory1.add(record1);
        directory1.add(record2);
        directory1.add(record3);
        directory1.add(record4);
        directory1.add(record5);

        System.out.println(directory1.getRecords());

        System.out.println(directory1.find("Max"));

        System.out.println(directory1.findAll("Max"));
        System.out.println(directory1.findAll("Mariia"));
        System.out.println(directory1.findAll("Liza"));

    }
}

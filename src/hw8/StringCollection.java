package hw8;

//Реалізувати просту динамічну колекцію для String на основі масиву.
//
//        Реалізувати такі методи для роботи з колекцією:
//
//        1. boolean add(int index, String value);
//        2. boolean add(String value);
//        3. boolean delete(int index);
//        4. boolean delete(String value);
//        5. String get(int index);

import java.util.Arrays;

public class StringCollection {
    private String[] stringCollection = new String[10];
    private int collectionLength = 1;

    public StringCollection(String str) {
        this.stringCollection[collectionLength - 1] = str;
        collectionLength++;
    }

    public StringCollection(String[] strArray) {
        if (strArray.length > stringCollection.length) {
            this.stringCollection = new String[this.stringCollection.length * 2];
        }

        for (String str : strArray) {
            for (int i = 0; i < strArray.length; i++) {
                stringCollection[i] = strArray[i];
            }

            collectionLength = strArray.length;
        }
    }

    boolean add(int index, String value) {
        if (collectionLength + 1 >= stringCollection.length) {
            String[] newStrArray = new String[stringCollection.length * 2];

            for (int i = 0; i < stringCollection.length; i++) {
                newStrArray[i] = stringCollection[i];
            }

            stringCollection = newStrArray;
        }

        String loopStrValue = "";
        for (int i = index; i < collectionLength + 1; i++) {
            if(index==i){
                loopStrValue = stringCollection[i];
                stringCollection[i] = value;
                continue;
            }
            if(index < i){
                String str = loopStrValue;
                loopStrValue = stringCollection[i];
                stringCollection[i] = str;
            }
        }

        collectionLength++;
        return true;
    }

    boolean add(String value) {
        if (collectionLength >= stringCollection.length) {
            String[] newStrArray = new String[stringCollection.length * 2];
            for (int i = 0; i < stringCollection.length; i++) {
                newStrArray[i] = stringCollection[i];
            }
            stringCollection = newStrArray;
        }

        stringCollection[collectionLength] = value;
        collectionLength++;
        return true;
    }

    boolean delete(int index) {
        for (int i = index; i < stringCollection.length - 1; i++) {
            stringCollection[i] = stringCollection[i + 1];
        }

        collectionLength--;
        return true;
    }

    boolean delete(String value) {
        int index = -1;
        for (int i = 0; i < stringCollection.length; i++) {
            if (value == stringCollection[i]) {
                index = i;
                break;
            }
        }
        delete(index);

        return true;
    }

    String get(int index) {
        return stringCollection[index];
    }

    public String[] getStringCollection() {
        return stringCollection;
    }

    public int getCollectionLength() {
        return collectionLength;
    }

    public static void main(String[] args) {
        String[] strArray = {"red", "orange", "yellow", "green", "blue", "dark blue", "violet", "pink", "brown", "gray"};

        StringCollection stringCollection1 = new StringCollection("red");
        StringCollection stringCollection2 = new StringCollection(strArray);

        stringCollection2.add(2, "color with index 2 added");
        stringCollection2.add(3, "color with index 3 added");

        stringCollection2.add("black");
        stringCollection2.add("white");

        stringCollection2.delete(3);
        stringCollection2.delete("color with index 2 added");

        System.out.println(stringCollection2.get(4));

        System.out.println(Arrays.toString(stringCollection1.getStringCollection()));
        System.out.println(Arrays.toString(stringCollection2.getStringCollection()));
    }
}

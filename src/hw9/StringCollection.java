package hw9;

import java.util.Arrays;

class StringCollection implements Collection {
    public String[] getStringCollection() {
        return stringCollection;
    }

    public int getCollectionLength() {
        return collectionLength;
    }

    private String[] stringCollection = new String[10];
    private int collectionLength = 0;

    public StringCollection(String str) {
        this.stringCollection[collectionLength] = str;
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

    @Override
    public boolean add(int index, String value) {
        if (collectionLength + 1 >= stringCollection.length) {
            String[] newStrArray = new String[stringCollection.length * 2];

            for (int i = 0; i < stringCollection.length; i++) {
                newStrArray[i] = stringCollection[i];
            }

            stringCollection = newStrArray;
        }

        String loopStrValue = "";
        for (int i = index; i < collectionLength + 1; i++) {
            if (index == i) {
                loopStrValue = stringCollection[i];
                stringCollection[i] = value;
                continue;
            }
            if (index < i) {
                String str = loopStrValue;
                loopStrValue = stringCollection[i];
                stringCollection[i] = str;
            }
        }

        collectionLength++;
        return true;
    }

    @Override
    public boolean add(String value) {
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

    @Override
    public boolean delete(String value) {
        int index = -1;
        for (int i = 0; i < stringCollection.length; i++) {
            if (value == stringCollection[i]) {
                index = i;
                break;
            }
        }

        for (int i = index; i < stringCollection.length - 1; i++) {
            stringCollection[i] = stringCollection[i + 1];
        }

        collectionLength--;

        return true;
    }

    @Override
    public String get(int index) {
        return stringCollection[index];
    }

    @Override
    public boolean contain(String o) {
        for (String str: this.stringCollection) {
            if(str == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if(this == str) return true;
        if (str == null || getClass()!=str.getClass()) return false;
        StringCollection stringCollection = (StringCollection)str;
        return this.collectionLength == stringCollection.collectionLength && Arrays.equals(this.stringCollection, stringCollection.stringCollection);
    }

    @Override
    public boolean clear() {
        this.stringCollection = new String[10];
        this.collectionLength = 0;
        return true;
    }

    @Override
    public int size() {
        return this.collectionLength;
    }

    public static void main(String[] args) {
        String[] strArray = {"red", "orange", "yellow", "green", "blue", "dark blue", "violet", "pink", "brown", "gray"};

        StringCollection stringCollection1 = new StringCollection("red");
        StringCollection stringCollection2 = new StringCollection(strArray);

        System.out.println("Element with index 4 is " + stringCollection2.get(4)); // blue

        stringCollection2.add(2, "color with index 2 added");
        stringCollection2.add(3, "color with index 3 added");

        stringCollection2.add("black");
        stringCollection2.add("white");

        System.out.println("collection after adding new elements:  " + Arrays.toString(stringCollection2.getStringCollection()));

        stringCollection2.delete("color with index 2 added");

        System.out.println("Size of first collection is " + stringCollection1.size()); // 1
        System.out.println("Size of second collection is " + stringCollection2.size()); // 13

        System.out.println("if first collection contains brown? " + stringCollection1.contain("brown")); // false
        System.out.println("if first collection contains brown? " + stringCollection2.contain("brown")); // true

        System.out.println("collection 1 = collection 2 : " + stringCollection1.equals(stringCollection2)); // false
        System.out.println("collection 2 = collection 2 : " + stringCollection2.equals(stringCollection2)); // true

        stringCollection1.clear();
        System.out.println("cleared collection: " + Arrays.toString(stringCollection1.getStringCollection()));
    }
}

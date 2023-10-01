package hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurrence("barbie", 'b'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple", "plant"));
        System.out.println(stringReverse("aiiraM"));
    }

    static public int findSymbolOccurrence(String str, char c) {
        int charRepeat = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                charRepeat++;
            }
        }
        return charRepeat;
    }

    static public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    static public String stringReverse(String str) {
        char[] arrOfChars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arrOfChars[i] = str.charAt(str.length() - 1 - i);
        }
        return String.valueOf(arrOfChars);
    }
}

package org.example;

import java.util.Arrays;
import java.util.List;

public class Pair {
    private List<String> pair;

    public Pair(String str1, String str2) {
        this.pair = Arrays.asList(str1, str2);
    }

    public List<String> getPair() {
        return pair;
    }

    @Override
    public String toString() {
        return pair + "";
    }
}

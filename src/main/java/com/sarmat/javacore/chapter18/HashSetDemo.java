package chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);
    }
}

package chapter18;

import java.util.*;


class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
    class CompThenByFirstName implements Comparator<String> {
        public int compare(String aStr, String bStr) {
            int i, j;

            return aStr.compareToIgnoreCase(bStr);
        }
    }

    class TreeMapDemo2A {
        public static void main(String[] args) {

            CompLastNames compLN = new CompLastNames();
            Comparator<String> compLastThenFirst =
                    compLN.thenComparing(new CompThenByFirstName());

            TreeMap<String, Double> tm =
                    new TreeMap<String, Double>(compLastThenFirst);

            tm.put("Джон Доу", 3434.34);
            tm.put("Том Смит", 123.22);
            tm.put("Джейн Бейкер", 1378.00);
            tm.put("Тод Халл", 99.22);
            tm.put("Ральф Смит", -19.08);

            Set<Map.Entry<String, Double>> set = tm.entrySet();
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }

            System.out.println();
            double balance = tm.get("text1");
            tm.put("text1", balance + 1000);
            System.out.println("new text1 bal " + tm.get("text1"));

        }
    }

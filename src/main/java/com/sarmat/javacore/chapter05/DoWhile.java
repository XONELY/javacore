package main.java.com.sarmat.javacore.chapter05;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("Tick " + n);
        } while (--n >0);
    }
}
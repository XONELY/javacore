package chapter07;

//Раздел модификаторов доступа
public class Test2 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        ob.a = 10;
        ob.b = 20;
        //ob.c = 100;

        ob.setc(100);
        System.out.println(ob.getc());
    }
}
package demo03;

public class Demo01System {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);

    }
}

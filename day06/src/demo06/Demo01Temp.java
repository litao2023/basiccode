package demo06;

public class Demo01Temp {
    public static void main(String[] args) {
        int n = 8;
        int fourthBitFromRight = (n & 0b1000);
        System.out.println(fourthBitFromRight);
    }
}

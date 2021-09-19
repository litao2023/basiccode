package demo01;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 18);
        Person p2 = new Person();
        p2.setAge(18);
        p2.setName("张三");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
    }
}

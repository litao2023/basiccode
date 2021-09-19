package demo02;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "haha";
        person.showName();
        new Person().showName();
    }
}

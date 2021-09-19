package demo03;

public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();

    }
}

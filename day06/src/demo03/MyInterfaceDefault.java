package demo03;

public interface MyInterfaceDefault {
    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
}

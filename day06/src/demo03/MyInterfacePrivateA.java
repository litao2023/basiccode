package demo03;

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        methodCommon();
        System.out.println("默认方法1");

    }
    public default void methodDefault2(){
        methodCommon();
        System.out.println("默认方法2");
    }
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

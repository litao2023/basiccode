package demo06;

public class MyOuter {
    public void methodOuter(){
        int num = 10;

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }


}

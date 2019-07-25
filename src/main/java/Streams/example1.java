package Streams;

public class example1 {

    public static void main(String[] str){
        f1 _f1=(int x)-> System.out.println(x*x);
        _f1.abstractFunc(5);
    }
}


interface f1{
    void abstractFunc(int x);
    default void normalRun(){
        System.out.println("Hello");
    }
}
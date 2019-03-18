package Strings;

import java.lang.*;


public class javacoreapp {

    public  static  void  main(String[] str){

        String sample1="A";
        String sample2="A";
        String sample3=new String("A");

        if(sample1==sample2)
            System.out.println("sample1==sample2");


        if(sample1.equals(sample2))
            System.out.println("sample1.equals(sample2)");

        if(sample1==sample3)
            System.out.println("sample1==sample3");

        if(sample1.equals(sample3))
            System.out.println("sample1.equals(sample3)");


    }
}

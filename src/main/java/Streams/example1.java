package Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class example1 {

    public static void main(String[] str){
        f1 _f1=(int x)-> System.out.println(x*x);
        _f1.abstractFunc(5);

        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

       Object[] _filme = (gamesList.stream().filter(item->item.equals("Cricket"))).toArray();
      String[] _meArray= Arrays.copyOf(_filme,_filme.length,String[].class);
    }
}


interface f1{
    void abstractFunc(int x);
    default void normalRun(){
        System.out.println("Hello");
    }
}
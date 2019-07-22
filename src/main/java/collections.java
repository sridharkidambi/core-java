import Strings.comparatorCustom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class collections {

    public static void main(String[] str){
//        ArrayList<int> intArray=new ArrayList<>(); prmititve types not allowed.
        ArrayList<Integer> intArray=new ArrayList<>();

        comparatorCustom _compare=new comparatorCustom();
        _compare.printMovies();

        int[] karray=new int[10];

        String name = "baeldung";
        System.out.println(name);
         name = "baeldung  me";
        System.out.println(name);

        final List<String> strings = new ArrayList<>();
//        assertEquals(0, strings.size());
        strings.add("baeldung");
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

//        assertEquals(0, strings.size());




    }
}

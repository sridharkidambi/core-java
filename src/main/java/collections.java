import java.util.ArrayList;
import java.util.List;

public class collections {

    public static void main(String[] str){
//        ArrayList<int> intArray=new ArrayList<>(); prmititve types not allowed.
        ArrayList<Integer> intArray=new ArrayList<>();

        int[] karray=new int[10];

        String name = "baeldung";
        System.out.println(name);
         name = "baeldung  me";
        System.out.println(name);

        final List<String> strings = new ArrayList<>();
//        assertEquals(0, strings.size());
        strings.add("baeldung");
//        assertEquals(0, strings.size());




    }
}

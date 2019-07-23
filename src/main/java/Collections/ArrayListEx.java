package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListEx {

    public  static void  main(String[] str){

        List<String> safeList = Collections.synchronizedList(new ArrayList<>());

        // adds some elements to the list
        safeList.add("practice");
        safeList.add("code");
        safeList.add("quiz");
        Iterator<String> iterator = safeList.iterator();

        synchronized (safeList) {
            while (iterator.hasNext()) {
                String next = iterator.next();
                System.out.println(next);
                iterator.remove();
            }
        }



//        Iterator<String> iterator = safeList.iterator();


        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
        List<String> list =
                Collections.synchronizedList(new ArrayList<>());

        list.add("practice");
        list.add("code");
        list.add("quiz");

        synchronized(list)
        {
            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext()){
                System.out.println("Elements of synchronized  :"+ it.next());
                it.remove();
            }

        }




        CopyOnWriteArrayList<String> threadSafeList =
                new CopyOnWriteArrayList<String>();

        // Adding elements to synchronized ArrayList
        threadSafeList.add("geek");
        threadSafeList.add("code");
        threadSafeList.add("practice");

        System.out.println("Elements of synchronized ArrayList :");

        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> it = threadSafeList.iterator();

        while (it.hasNext())
        {
            String str1 = it.next();
            System.out.println("the value is:"+ str1);
            it.remove();
        }
    }
}

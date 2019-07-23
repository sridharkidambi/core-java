package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
* LEARn link
* https://www.codejava.net/java-core/collections/understanding-collections-and-thread-safety-in-java
*
* type should implement comparable interface.
*
* */

public class TreeSetexample {

    public  static  void main(String[] args){

        SortedSet<String> _sortSet = new TreeSet<String>();
        _sortSet.add("Sk");
        _sortSet.add("IS");
        _sortSet.add("IS");
        _sortSet.add("AWESOME");
        _sortSet.add("aWESOME");
        Iterator<String>  itr= _sortSet.iterator();

        while(itr.hasNext()){
            System.out.println(" SortedSet Value is: "+ itr.next());
        }


        TreeSet<String> _treeSet = new TreeSet<String>();
        _treeSet.add("Sk");
        _treeSet.add("IS");
        _treeSet.add("IS");
        _treeSet.add("AWESOME");
        _treeSet.add("aWESOME");
         itr= _treeSet.iterator();

        while(itr.hasNext()){
            System.out.println("TreeSet Value is: "+ itr.next());
        }
    }
}

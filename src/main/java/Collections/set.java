package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {


    public  static  void main(String[] args) {

//        Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
//        Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
//        Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.println("Set output without the duplicates");

        //Sorted set using treeset
        System.out.println(hash_Set);
        Set<String> treeSetex= new TreeSet<String>(hash_Set);
        System.out.println(treeSetex);

    }
}

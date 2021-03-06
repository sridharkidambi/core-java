import Model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
    If two objects are equal, they MUST have the same hash code.
If two objects have the same hash code, it doesn't mean that they are equal.
Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc.
Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.
 */

public class eqHashcde {


    public static void main(String[] args) {
        Student alex = new Student(1, "Alex");
        Student alex0 = new Student(1, "Alex");

        System.out.println("Hashcode  = " + alex.hashCode());
        System.out.println("Hashcode 0 = " + alex0.hashCode());

        List< Student > studentsLst = new ArrayList<Student>();
        studentsLst.add(alex);
        studentsLst.add(alex0);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");

        System.out.println("Hashcode 1 = " + alex1.hashCode());
        System.out.println("Hashcode 2 = " + alex2.hashCode());

        HashSet < Student > students = new HashSet< Student >();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));
    }
}

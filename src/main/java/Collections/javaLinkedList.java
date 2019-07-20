package Collections;

import Model.employee;
import com.sun.javafx.UnmodifiableArrayList;

import java.util.*;

public class javaLinkedList {

    public  static  void main(String[] args){
        LinkedList<employee> lst =new LinkedList<employee>();
        lst.addFirst(new employee("SK","us","lead"));
        lst.addFirst(new employee("NS","S","homemaker"));
        lst.addFirst(new employee("SK1","K","kid"));

        UnmodifiableArrayList<employee> unlist=new UnmodifiableArrayList<employee>(lst.toArray(new employee[lst.size()]) ,lst.size());

        Iterator iter=lst.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }

         iter=unlist.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
    }
}

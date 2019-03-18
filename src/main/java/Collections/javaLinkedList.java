package Collections;

import Model.employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class javaLinkedList {

    public  static  void main(String[] args){
        LinkedList<employee> lst =new LinkedList<employee>();
        lst.addFirst(new employee("SK","us","lead"));
        lst.addFirst(new employee("NS","S","homemaker"));
        lst.addFirst(new employee("SK1","K","kid"));

        Iterator iter=lst.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

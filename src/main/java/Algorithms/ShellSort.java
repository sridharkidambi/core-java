package Algorithms;

import jdk.nashorn.internal.ir.WhileNode;

public class ShellSort {

/*
        Charecterstics of SelectionSort Algorithm:

        O(n^2) time complexity-quadratic
        100 steps to sort 10 items
        10,000 steps for 100 items.
        not much swapping as in InsertionSort.
        UnStable sort algorithm


Stable  sorting:
When sorting with same numbers the order of sequence is preserved if the same numbers happens twice.
     */

    public  static  void  main(String[] str) {

        int[] intArray = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        System.out.println("total items are:" +intArray.length);

        intArray=  (new ShellSort()).performShellSort(intArray);

        for(int i1=0;i1<intArray.length;i1++){
            System.out.println("SelectionSortArray list is :"+ intArray[i1]);
        }

    }

    private int[] performShellSort(int[] temp){
        System.out.println(temp.toString());
        int icount=0;

      for(int gap=temp.length/2;gap>0;gap=gap/2){
          icount++;
          for(int i=gap; i<temp.length;i++){
              icount++;
                int newElement=temp[i];
                int j=i;

              while (j>=gap && temp[j-gap]>newElement){
                  temp[j]=temp[j-gap];
                  j-=gap;
              }
              temp[j]=newElement;
          }

      }



        System.out.println("total iterations are:" +icount);


        return temp;

    }
}

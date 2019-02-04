package Algorithms;

public class Bubblesort {

    /*
        Charecterstics of BubbleSort Algorithm:

        O(n^2) time complexity-quadratic
        100 steps to sort 10 items
        10,000 steps for 100 items.
        degrades gradually
        Stable sort algorithm


Stable  sorting:
When sorting with same numbers the order of sequence is preserved if the same numbers happens twice.
     */




    public  static  void  main(String[] str) {

        int[] intArray = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        System.out.println("total items are:" +intArray.length);

      intArray=  (new Bubblesort()).performBubbleSort(intArray);

      for(int i=0;i<intArray.length;i++){
          System.out.println("BulleSortArray list is :"+ intArray[i]);
      }

    }

    private int[] performBubbleSort(int[] temp){
        System.out.println(temp.toString());
        int icount=0;
        for (int i=temp.length-1;i>0;i--){
            icount++;
            for (int j=0;j<i;j++){

                if(temp[j]>temp[j+1]){
                    swap(temp,j,j+1);
                }
                icount++;
            }

        }
        System.out.println("total iterations are:" +icount);
        return temp;

    }

    private static void swap(int[] array,int i,int j){
        if(i==j){
            return ;
        }

        int tempValue= array[i];
        array[i]=array[j];
        array[j]=tempValue;


    }
}

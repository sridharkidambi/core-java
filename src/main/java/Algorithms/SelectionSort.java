package Algorithms;

public class SelectionSort {


     /*
        Charecterstics of SelectionSort Algorithm:

        O(n^2) time complexity-quadratic
        100 steps to sort 10 items
        10,000 steps for 100 items.
        not much swapping as in bubblesort.
        UnStable sort algorithm


Stable  sorting:
When sorting with same numbers the order of sequence is preserved if the same numbers happens twice.
     */

    public  static  void  main(String[] str) {

        int[] intArray = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        System.out.println("total items are:" +intArray.length);

        intArray=  (new SelectionSort()).performSelectionSort(intArray);

        for(int i1=0;i1<intArray.length;i1++){
            System.out.println("SelectionSortArray list is :"+ intArray[i1]);
        }

    }

    private int[] performSelectionSort(int[] temp){
        int icount=0;

        for(int firstUnsortedIndex=temp.length-1; firstUnsortedIndex>0;firstUnsortedIndex--){

            icount++;
            int largestIndex=0;

            for (int i=0;i<firstUnsortedIndex+1;i++){
                icount++;
                if(temp[i]>temp[largestIndex]){
                    largestIndex=i;
                }
            }

            swap(temp,largestIndex,firstUnsortedIndex);

        }

//        for (int firstUnsortedIndex=1;firstUnsortedIndex<temp.length;firstUnsortedIndex++){
//            icount++;
//            int newElement=temp[firstUnsortedIndex];
//            int j;
//            for( j=firstUnsortedIndex; j>0&&temp[j-1]>newElement;j--){
//                icount++;
//                temp[j]=temp[j-1];
//               }
//             temp[j]=newElement;
//
//        }
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

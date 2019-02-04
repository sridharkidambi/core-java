package Algorithms;

public class SelectionSort {

    public  static  void  main(String[] str) {

        int[] intArray = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        System.out.println("total items are:" +intArray.length);

        intArray=  (new SelectionSort()).performSelectionSort(intArray);

        for(int i1=0;i1<intArray.length;i1++){
            System.out.println("SelectionSortArray list is :"+ intArray[i1]);
        }

    }

    private int[] performSelectionSort(int[] temp){
        System.out.println(temp.toString());
        int icount=0;

        for (int firstUnsortedIndex=1;firstUnsortedIndex<temp.length;firstUnsortedIndex++){
            icount++;
            int newElement=temp[firstUnsortedIndex];
            int j;
            for( j=firstUnsortedIndex; j>0&&temp[j-1]>newElement;j--){
                icount++;
                temp[j]=temp[j-1];
               }
             temp[j]=newElement;

        }
        System.out.println("total iterations are:" +icount);


        return temp;

    }

}

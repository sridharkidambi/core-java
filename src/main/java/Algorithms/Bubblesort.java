package Algorithms;

public class Bubblesort {

    public  static  void  main(String[] str) {

        int[] intArray = {20,-7,5,41,-2,-9,-100,100,1,-2200,1000};

      intArray=  (new Bubblesort()).performBubbleSort(intArray);

      for(int i=0;i<intArray.length;i++){
          System.out.println("BulleSortArray list is :"+ intArray[i]);
      }

    }

    private int[] performBubbleSort(int[] temp){
        System.out.println(temp.toString());
        for (int i=temp.length-1;i>0;i--){
            int bufferItem=temp[i];
            int currentItem=0;
            for (int j=0;j<i;j++){

                if(bufferItem<temp[j]){
                    currentItem=temp[j];
                    temp[j]=bufferItem;
                    bufferItem=currentItem;
                }

            }
            temp[i]=bufferItem;

        }
        return temp;
    }
}

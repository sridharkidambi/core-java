package Algorithms;

public class factorial {

    public  static  void  main(String[] str) {

        int intArray = 5;

       System.out.println (new factorial().performfactorial(intArray));


    }

    private int performfactorial(int temp){

        if(temp==0) //base case.
            return 1;

        return temp*performfactorial(temp-1);

    }
}

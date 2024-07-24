/*
Unique Number Detection with Java HashSets

Problem: Unique Number Echo

 */

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample3 {
    int [] arr1= new int[] {1,1,1,2,2,3,3,4,4,5,5,61,61,77,77,89,89,100};
    
    
   public Integer uniqueEcho(int [] arr) {
       //Create 2 Hashsets, uniqueWordList and duplicateList

       HashSet<Integer> uniqueWordList = new HashSet<>();
       HashSet<Integer> duplicateList = new HashSet<>();

       //Fill uniqueWordList with unique words and duplicateList with words already existing in uniqueWordList.
        for (int num: arr){
            if (uniqueWordList.contains(num)){
                duplicateList.add(num);
            }
            else{
                uniqueWordList.add(num);
            }
        }
       uniqueWordList.removeAll(duplicateList);

        for (int num : arr){
            if (uniqueWordList.contains(num)){
                return num;    }
        }

        return 0;
   }

    public static void main(String [] args){
        HashSetExample3 Result = new HashSetExample3();
        System.out.println(Result.uniqueEcho(Result.arr1));
    }
}

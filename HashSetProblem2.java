/*
Problem: Remove Duplicates
            Ensures each customers receives only one Newsletter
            The invitation list must be Free of Repeats
 */


import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class HashSetProblem2 {
    int [] arr101 = new int[] {2, 5, 6, 1, 11, 154, 123, 8, 44, 76 };
    int [] arr102 = new int[] {26, 58, 66, 241, 781, 354, 143, 26, 47 };

    //Code
    public int[] uniqueMembers(int [] arr1, int [] arr2) {

        //Transfered all the elements from both the arrays to a single HashSet named uniqueMembersSet

        HashSet<Integer> uniqueMembersSet = new HashSet<>();
        for (int num : arr1) {
            uniqueMembersSet.add(num);
        }

        for (int num : arr2) {
            uniqueMembersSet.add(num);
        }

        //Creating a new Array named uniqueElements to transfer all the elements from HashSet to the Array

        int [] uniqueElementsResult = new int[uniqueMembersSet.size()];
        int i =0;
        for (int num : uniqueMembersSet){
            uniqueElementsResult [i] = num;
            i++;
            //uniqueElementsResult [i++] = num;
        }
        return uniqueElementsResult;

    }

    public static void main(String [] args){
        HashSetProblem2 checkUnique = new HashSetProblem2();
        int [] Result = (checkUnique.uniqueMembers(checkUnique.arr101, checkUnique.arr102));
        System.out.println(Arrays.toString(Result));


    }

}

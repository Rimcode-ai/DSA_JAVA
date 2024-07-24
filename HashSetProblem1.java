/*
Problem: Check if 2 sets are disjoint
            retutn True if no elements match
 */
import java.util.HashSet;
import java.util.Set;

public class HashSetProblem1 {
    int [] arr101 = new int[] {2, 5, 6, 1, 11, 154, 123, 8, 44, 76 };
    int [] arr102 = new int[] {2, 51, 26, 21, 71, 154, 123, 7, 4, 0 };
    int [] arr103 = new int[] {26, 58, 66, 241, 781, 354, 143, 26, 47 };

    //Code
    public boolean isDisjoint(int [] arr1, int [] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        HashSetProblem1 check = new HashSetProblem1();
        System.out.println(check.isDisjoint(check.arr101, check.arr102));
        System.out.println(check.isDisjoint(check.arr101, check.arr103));

    }

}

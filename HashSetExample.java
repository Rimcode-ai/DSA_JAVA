import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        System.out.println("We are learning Java HashSet");

        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        //check by contains

        if (set.contains("Element1")){
            System.out.println("The HashSet named set contains Element1");
        }
        else{
            System.out.println("The HashSet named set does not contains Element1");
        }

        //Remove element
        set.remove("Element2");

        if (set.contains("Element2")){
            System.out.println("The HashSet named set contains Element1");
        }
        else{
            System.out.println("The HashSet named set does not contains Element1");
        }

        // Printing the existing HashSet
        System.out.println("HashSet elements: " + set);
    }
}
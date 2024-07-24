import java.util.HashSet;

/*
Part of java's collection framework
Stores unique elements in an unordered manner
Derived from AbstractSet class & implements the set interface
Used when dealing with a collection of unique items.
Provides efficient membership checks & remove duplicates
 */

/*
Complexity analysis of Hashset Operations:
Time Complexity: O(1)
Space Complexity: O(n),  Linear
 */

/*
Usage: Large Datasets,
Efficient for adding, checking, deleting items in a collection
Hashsets are applicable in tackling unique visited web pages

Efficiency: HashSets are like Mathematical sets- only unique type
 */
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
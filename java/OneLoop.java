import java.util.*;

//Write a function that takes in a list of integers as an argument and returns true if it contains two integers that are the same, false otherwise.
public class OneLoop {

    public static boolean twoIntegers(List<Integer> list) {
        for (int initial = 0; initial < list.size(); initial++) { // For every value in the list...
            int numberOfEncounters = 0; // reset counter
            for (int other = 0; other < list.size(); other++) { // ..check every value in the list
                if (list.get(initial) == list.get(other)) { // check against it, to see if it is the same
                    numberOfEncounters++;
                } // nOE should increase to 1 for all values, but if it appears twice, there is a
                  // double of an occurance
                if (numberOfEncounters == 2) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(); // declare a list
        list1.add(12);
        list1.add(15);
        list1.add(32);
        list1.add(89);
        list1.add(33);

        List<Integer> list2 = new ArrayList<Integer>(); // declare a list
        list2.add(21);
        list2.add(15);
        list2.add(32);
        list2.add(15);
        list2.add(30);

        boolean List1 = twoIntegers(list1);
        boolean List2 = twoIntegers(list2);

        System.out.println("Double in List 1?: " + List1);
        System.out.println("Double in List 2?: " + List2);

    }

}

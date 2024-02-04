import java.util.*;

public class Set{

    public static boolean twoIntegers(List<Integer> list){
        int initialSize = list.size();

        Set<Integer> set = new HashSet<Integer>(); 

        for(int i =0; i < list.size(); i++){
            set.add(list.get(i)); // any duplicates won't be added to the set
        }
        if(list.size() > set.size()){ // if the original is larger than the set, the original contained duplicates
            return true;
        }
        return false;
    }


    public static void main(String args[]){

        List<Integer> list1 = new ArrayList<Integer>(); // declare a list

        list1.add(12);
        list1.add(30);
        list1.add(21);
        list1.add(18);
        list1.add(9);
        list1.add(12);


        List<Integer> list2 = new ArrayList<Integer>(); // declare a seccond list list
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        boolean List1 = twoIntegers(list1);
        boolean List2 = twoIntegers(list2);

        System.out.println("Double in List 1?: " + List1);
        System.out.println("Double in List 2?: " + List2);

    }
}


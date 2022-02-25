import java.util.*;

public class App {
    public static void main(String[] args){
       
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        
        printLinkedList(numbers);
        reverseList(numbers);
        printLinkedList(numbers);

        
    }

    public static void reverseList(LinkedList<Integer> nums)
    {
        for(int i = 0, j = nums.size()-1; i < j; i++, j--)
        {
            int temp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j,temp);
        }
    }

    public static void printLinkedList(LinkedList<Integer> nums)
    {
        System.out.println();
        for(int i = 0; i < nums.size(); i++){
            System.out.println("Index " + i + ": " + nums.get(i));
        }
        System.out.println("\n**********************************");
    }
}

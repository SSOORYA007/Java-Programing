import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        int[] a = {1,8,6,5};
        int[] b = {4,9,7,3};
        ArrayList<Integer> c = new ArrayList<>();
        for (int i : a)  
        {
            c.add(i);
        }
         for (int j : b) 
        {
            c.add(j);
        }
        Collections.sort(c);
        System.out.println("Merged and Sorted Array:");
        for (int i : c)
        {
            System.out.print(i + " ");
        }
    }
}                             

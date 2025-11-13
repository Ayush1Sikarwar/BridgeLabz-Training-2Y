package EXAMPLES;

import java.util.ArrayList;
public class AutoBoxingUnboxing{
 public static void main(String[] args){
     ArrayList<Integer> list=new ArrayList<>();
     list.add(10);
     list.add(11);
     list.add(12);
     list.add(11);
     list.add(11);
     int sum=0;
     for(Integer x:list) sum+=x;
     System.out.println("Sum of numbers = "+sum);
 }
}

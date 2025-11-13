package EXAMPLES;

import java.util.Scanner;
public class PrimitiveToWrapper{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Integer obj=Integer.valueOf(n);
        System.out.println(n);
        System.out.println(obj);
    }
}
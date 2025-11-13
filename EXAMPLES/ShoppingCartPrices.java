package EXAMPLES;

import java.util.Scanner;
public class ShoppingCartPrices{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        String[] items=line.split("\\s+");
        int total=0;
        for(String p:items){
            try{
                total+=Integer.parseInt(p);
            }catch(NumberFormatException e){}
        }
        System.out.println("Total = "+total);
    }
}
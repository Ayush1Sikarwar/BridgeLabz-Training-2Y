package EXAMPLES;

import java.util.ArrayList;
import java.util.Collections;
public class EmployeeAgesProcessing{
    public static void main(String[] args){
        int[] ages={23,45,19,34,28,55};
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:ages) list.add(a);
        int min=Collections.min(list);
        int max=Collections.max(list);
        System.out.println("Youngest = "+min);
        System.out.println("Oldest = "+max);
    }
}
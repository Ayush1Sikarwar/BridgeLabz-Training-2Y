package EXAMPLES;

import java.util.ArrayList;
import java.util.Collections;
public class PricesToList{
    public static void main(String[] args){
        double[] prices={10.5,20.0,35.75,5.5};
        ArrayList<Double> list=new ArrayList<>();
        for(double d:prices) list.add(d);
        double max=Collections.max(list);
        double sum=0;
        for(Double v:list) sum+=v;
        double avg=sum/list.size();
        System.out.println("Highest price = "+max);
        System.out.println("Average price = "+avg);
    }
}

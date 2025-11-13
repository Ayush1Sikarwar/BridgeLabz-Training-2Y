package EXAMPLES;

import java.util.ArrayList;
import java.util.Objects;
public class ProductRatingsAnalyzer{
    public static void main(String[] args){
        int[] primitiveRatings={5,4,3,5};
        ArrayList<Integer> objectRatings=new ArrayList<>();
        objectRatings.add(4);
        objectRatings.add(null);
        objectRatings.add(5);
        ArrayList<Integer> combined=new ArrayList<>();
        for(int r:primitiveRatings) combined.add(r);
        for(Integer r:objectRatings) if(Objects.nonNull(r)) combined.add(r);
        int sum=0;
        for(Integer r:combined) sum+=r;
        double avg=combined.isEmpty()?0:(double)sum/combined.size();
        System.out.println("Average rating = "+avg);
    }
}
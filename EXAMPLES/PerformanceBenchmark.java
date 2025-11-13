package EXAMPLES;

import java.util.ArrayList;
public class PerformanceBenchmark{
    public static void main(String[] args){
        int n=1000000;
        long t1=System.currentTimeMillis();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=i;
        long sum1=0;
        for(int i=0;i<n;i++) sum1+=arr[i];
        long t2=System.currentTimeMillis();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++) list.add(i);
        long sum2=0;
        for(int i=0;i<n;i++) sum2+=list.get(i);
        long t3=System.currentTimeMillis();
        System.out.println("int[] fill+sum ms = "+(t2-t1));
        System.out.println("ArrayList<Integer> fill+sum ms = "+(t3-t2));
    }
}

package EXAMPLES;

import java.util.ArrayList;
public class SensorDataLogger{
    public static ArrayList<Double> acceptPrimitive(double[] data){
        ArrayList<Double> list=new ArrayList<>();
        for(double d:data) list.add(d);
        return list;
    }
    public static ArrayList<Double> acceptWrapper(Double[] data){
        ArrayList<Double> list=new ArrayList<>();
        for(Double d:data) list.add(d);
        return list;
    }
    public static void main(String[] args){
        double[] prim={23.5,24.0,22.8};
        Double[] wrap={null,25.0,24.5};
        ArrayList<Double> a=acceptPrimitive(prim);
        ArrayList<Double> b=acceptWrapper(wrap);
        System.out.println(a);
        System.out.println(b);
    }
}
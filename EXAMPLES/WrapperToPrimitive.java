package EXAMPLES;


public class WrapperToPrimitive{
 public static void main(String[] args){
     Double dObj=45.67;
     double d=dObj.doubleValue();
     int i=(int)dObj.doubleValue();
     System.out.println(dObj);
     System.out.println(d);
     System.out.println(i);
 }
}

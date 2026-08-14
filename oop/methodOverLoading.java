package oop;
class calculator {
   public double product(double x, double y) {
       return x * y;
   }

   //method overloading for the three arguments
   public double product(double x, double y, double z) {
       return x * y * z;
   }
//method overloading for the int datatypes

    public int product(int a, int b) {
        return a * b;
    }
}
public class methodOverLoading {

public static void main (String []args){

    calculator Calculator = new calculator();
    double x = 10;
    double y = 20;
    double z = 5;

    int a = 30;
    int b = 12;

    System.out.println(Calculator.product(x , y, z));
    System.out.println(Calculator.product(x , y));
    System.out.print(Calculator.product(a,b));
}
}

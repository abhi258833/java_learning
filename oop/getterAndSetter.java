package oop;

import java.util.Scanner;

class employee{
    private double salary;

    public void setSalary(double s){
        salary = s;
    }

    public double getSalary(){
        return salary;
    }
}
public class getterAndSetter {
public static void main (String [] args){
    employee emp = new employee();
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the Salary: ");

    double sal = scan.nextDouble();
    emp.setSalary(sal);
    System.out.println("Salary is: " + emp.getSalary());

    scan.close();
}

}


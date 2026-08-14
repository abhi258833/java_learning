package oop;

class student {
    private int age;

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }
}
public class getterAndSetter1 {

    public static void main (String []args){

        student Student = new student();
        Student.setAge(32);
        System.out.print(Student.getAge());
    }
}

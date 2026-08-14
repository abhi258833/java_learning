class Car1{
private int speed;

public void setSpeed(int x){
	speed = x;
}

public int getSpeed(){
	 return speed;
}

}
class geterAndSeter1{

public static void main(String [] args){

Car1 car = new Car1();

car.setSpeed(100);

System.out.print(car.getSpeed());

}

}


class Car{
private int speed;

public void setSpeed(int x){
	speed = x;
}

public int getSpeed(){
	 return speed;
}

}
class geterAndSeter{

public static void main(String [] args){

Car car = new Car();

car.setSpeed(100);

System.out.print(car.getSpeed());

}

}


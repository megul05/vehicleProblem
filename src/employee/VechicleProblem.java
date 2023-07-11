package employee;

abstract class vehicle
{
	abstract void start();
	abstract public void stop();
	
}

class Car extends vehicle
{
	public void start()
	{
		System.out.println("Car Started");
	}
	public void stop()
	{
		System.out.println("Car Stoped");
	}
}

class MotorCycle
{
	public void start()
	{
		System.out.println("Motor Started");
	}
	public void stop()
	{
		System.out.println("Motor Stoped");
	}
}

public class VechicleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCycle motor = new MotorCycle();
		Car car = new Car();
		car.start();
		motor.stop();
		
		

	}

}

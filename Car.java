package javacity;

class Car extends Vehicle{
	@Override
	public void move() {
		System.out.println("Driving at "+speed+" km/hr"); //for different behaviour we use ovverride and hieracchical inheritance
	}
	@Override
	public void soundhorn() {
		System.out.println("Beep Beep");
	}
}
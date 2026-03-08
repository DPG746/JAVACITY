package javacity;

class Bicycle extends Vehicle{
	@Override
	public void move() {
		System.out.println("Pedalling at:" +speed+ " km/hr");
	}
}

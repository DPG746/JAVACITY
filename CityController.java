package javacity;

public class CityController {
	public static void main(String[] args) {
		//Phase 1
		Citizen c=new Citizen("Durgesh",29,"1234");
		c.display();
		
		
		// Phase 2
		Car v =new Car();
		Bicycle b = new Bicycle();
		b.speed=89;
		v.speed =80;
		b.move();
		v.move();
		v.soundhorn();
		
		//Phase 3
		
		PowerConsumer p =new ShoppingMall();//upcasting
		p.consumeEnergy(1500);
		System.out.println(((ShoppingMall) p).address="MG Road");
		
		PowerConsumer l =new TInyHouse();//upcasting
		l.consumeEnergy(200);
		
		
		//Phase 4
		Animal[] animals=new Animal[4];
		animals[0]=new Dog();
		animals[1]=new Dog();
		animals[2]=new Cat();
		animals[3]=new Cat();
		
		for(Animal a:animals) {
			a.makeSound();
			
		}
		
		//Phase 5
		SmartRoom room = new SmartRoom();
		room.pressWallSwitch();
		room.partyMode();
		
	}

}

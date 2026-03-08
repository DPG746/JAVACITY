package javacity;

public class SmartRoom {
	private LightBulb roomlight; //has a realtionship
	private Speaker speaker; //  Speaker has a speaker
	
	public SmartRoom() {
		roomlight= new LightBulb();//constructor created the device
		speaker = new Speaker();
	}
	
	public void pressWallSwitch() {
		roomlight.toggle();
	}
	
	public void partyMode() {
		roomlight.toggle();
		speaker.playMusic();
	}
}

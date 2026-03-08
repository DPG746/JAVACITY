package javacity;

public class LightBulb {

		boolean isOn =false;
		public void toggle() {
			isOn = !isOn;
			System.out.println("Light "+(isOn ? "ON" : "OFF"));
		}
}

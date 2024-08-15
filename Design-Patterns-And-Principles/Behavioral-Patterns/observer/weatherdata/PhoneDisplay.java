package observer.weatherdata;

/**
 * 
 * "PhoneDisplay" is a concrete observer implementing the “Observer" interface.
 *
 */
public class PhoneDisplay implements Observer {
	private String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	private void display() {
		System.out.println("Phone Display: Weather updated - " + weather);
	}

}

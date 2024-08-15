package observer.weatherdata;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * "WeatherStation" is the concrete subject implementing the
 * “Observable" interface.
 *
 */
public class WeatherStation implements Observable {
	private List<Observer> observers = new ArrayList<>();
	private String weather;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(weather);
		}
	}
	public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }

}

package Subject;
import java.util.ArrayList;
import Interface.Observer;

import Interface.Subject;
import Observers.Observer1;
import Observers.Observer2;


public class MainSubject implements Subject {
	private float temp;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observers;
	
	public static void main(String[] args) {
		MainSubject mainSubject=new MainSubject();
		Observer1 observer1=new Observer1(mainSubject);
		Observer2 observer2=new Observer2(mainSubject);
		mainSubject.setValues(10, 20, 30);
		mainSubject.setValues(44, 44, 44);
	}
	
	public MainSubject(){
		observers=new ArrayList<Observer>();
	}
	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer observer=observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	
	public void setValues(float temp,float humidity,float pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		nodifyObservers();
	}

}

package Subject;

import java.util.Observable;

import Observers.Observer3;
import Observers.Observer4;

public class JavaSubject extends Observable{
//注册删除通知等方法直接使用父类即可，不需重写
	private float temp;
	private float humidity;
	private float pressure;
	public void setValues(float temp,float humidity,float pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		//要使观察者update必须先调用setChanged方法，要使其失效调用clearChanged方法
		setChanged();
		notifyObservers();
	}
	
	public static void main(String[] args) {
		JavaSubject subject=new JavaSubject();
		Observer3 observer3=new Observer3(subject);
		Observer4 observer4=new Observer4(subject);
		subject.setValues(111, 111, 111);
		subject.setValues(333, 333, 333);
	}
	
	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	
	


}

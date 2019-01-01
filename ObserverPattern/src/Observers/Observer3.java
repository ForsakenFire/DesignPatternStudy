package Observers;

import java.util.Observable;
import java.util.Observer;

import Subject.JavaSubject;

public class Observer3 implements Observer{

	public Observer3(Observable o){
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof JavaSubject) {
			JavaSubject subject=(JavaSubject) o;
			System.out.println("观察者3输出：");
			System.out.println("温度3："+subject.getTemp());
			System.out.println("湿度3："+subject.getHumidity());
			System.out.println("气压3："+subject.getPressure());
		}
	}

}

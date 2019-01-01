package Observers;

import java.util.Observable;
import java.util.Observer;

import Subject.JavaSubject;

public class Observer4 implements Observer{

	
	//构造方法中对观察者进行注册
	public Observer4(Observable observable){
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof JavaSubject) {
			JavaSubject subject=(JavaSubject) o;
			System.out.println("观察者4输出：");
			System.out.println("温度3："+subject.getTemp());
			System.out.println("湿度3："+subject.getHumidity());
			System.out.println("气压3："+subject.getPressure());
		}
	}

}

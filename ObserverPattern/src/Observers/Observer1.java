package Observers;

import Interface.DisplayElement;
import Interface.Observer;
import Interface.Subject;
/**
 * 
 * @author 田冬
 *
 */
public class Observer1 implements Observer,DisplayElement{
	/**
	 * javadoc注释测试TEMP
	 */
	private float temp;
	private float humidity;
	private float pressure;
	
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("观察者1测试输出");
		System.out.println("温度1："+temp);
		System.out.println("湿度1："+humidity);
		System.out.println("气压1："+pressure);
	}
	
	//注册写入构造器，实例化时直接注册
	public Observer1(Subject subject){
		subject.registerObserver(this);
	}

}

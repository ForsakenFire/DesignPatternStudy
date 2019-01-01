package model;

import abstractclass.Beverage;
import abstractclass.Condiment;

public class DecoratorA extends Condiment{
	/*
	 *使用一个实例变量记录被装饰者 (声明为父类Beverage)
	 *变量赋值在构造方法中完成 
	 */
	Beverage beverage;
	public DecoratorA(Beverage beverage){
		this.beverage=beverage;
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return beverage.getDes()+"已经加入A调料";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.10;
	}

}

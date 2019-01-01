package model;

import abstractclass.Beverage;

public class CoffeeA extends Beverage{
	/**
	 * 构造方法中对description赋值
	 */
	
	public CoffeeA(){
		this.description="咖啡A   ";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5;
	}

}

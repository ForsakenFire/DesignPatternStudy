package model;

import abstractclass.Beverage;

public class CoffeeB extends Beverage{
	public CoffeeB(){
		this.description="咖啡B   ";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3;
	}

}

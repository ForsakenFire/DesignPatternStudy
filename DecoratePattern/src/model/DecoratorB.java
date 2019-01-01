package model;

import abstractclass.Beverage;
import abstractclass.Condiment;

public class DecoratorB extends Condiment{

	Beverage beverage;
	public DecoratorB(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return beverage.getDes()+" 已经加入B调料";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.20;
	}

}

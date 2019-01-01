package model;

import abstractclass.Beverage;

public class CoffeeTest {
public static void main(String[] args) {
	Beverage coffee=new CoffeeA(); 
	System.out.println("描述："+coffee.getDes()+" "+"cost为："+coffee.cost());
	
	Beverage coffee2=new CoffeeB();
	//开始装饰
	coffee2=new DecoratorA(coffee2);
	coffee2=new DecoratorB(coffee2);
	System.out.println("描述："+coffee2.getDes()+" "+"cost为："+coffee2.cost());
}
}

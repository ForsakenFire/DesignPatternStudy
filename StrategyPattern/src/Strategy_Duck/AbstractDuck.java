package Strategy_Duck;

 public abstract class AbstractDuck {

	Fly flybehavior;
	public void ShowFly(){
		flybehavior.fly();
	};
}

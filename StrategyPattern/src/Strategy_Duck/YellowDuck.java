package Strategy_Duck;

public class YellowDuck extends AbstractDuck{

public YellowDuck(){
	flybehavior=new SlowFly();
}
@Override
	public void ShowFly() {
		// TODO Auto-generated method stub
		super.ShowFly();
		
}
public static void main(String[] args) {
	AbstractDuck duck=new YellowDuck();
	duck.ShowFly();
}

}

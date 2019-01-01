
public class single {
int singleid=1;
private single(){
	
}

static single single=new single();
public static single getInstance(){
	
	return single;
}
public void setSingleID(int i){
	single.singleid=i;
}
}

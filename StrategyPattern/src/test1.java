import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * author:aaa
 * exception:bbb
 */


public class test1 {
int a,b,c;



public static void main(String[] args){
	System.out.println(single.getInstance().singleid);
	single.getInstance().setSingleID(2);
	System.out.println(single.getInstance().singleid);
	
	Map<String, String> map=new HashMap<String, String>();
	map.put("key1", "value1");
	map.put("key2", "value2");
	Iterator iterator=map.entrySet().iterator();
	while (iterator.hasNext()){
	Map.Entry<String, String> entry =(Map.Entry<String, String>) iterator.next();
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
	}
		
	};
	
}




 	
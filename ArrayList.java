import java.util.*;

public class ArrayList{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		//—v‘f‚Ì’Ç‰Á
		list.add("abc");
		list.add("def");
		list.add(1,"ghi");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
package pack_inherit;

import java.util.HashMap;
import java.util.Map;

public class Mappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<>();
        m.put(1,"Sum");
        m.put(2,"mus");
        m.put(3,"Hin");
        m.put(4,"temba");
		/*
		 * for(Integer k:m.keySet()) { System.out.println(k+" "+m.get(k)); }
		 * System.out.println(m.get(1));
		 */   
       System.out.println(m.get(1).substring(0,1));
        
	}

}

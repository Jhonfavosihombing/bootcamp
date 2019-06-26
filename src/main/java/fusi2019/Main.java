package fusi2019;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.event.ListSelectionEvent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list;
		
		list.add("jhon");
		list.add("favo");
		list.get (0);
		
		ArrayList<String> al = new ArrayList<String>();
		
		List<String> l = new ArrayList<String>();
		
		int [][] array = new int [10] [10];
		array [0][1] = 1;
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("nama", "Jhon favo");
		map.get("nama");
		
		Set<String> set = new HashSet<>();
		set.add("jhon");
		
		Collection<String> collection = null;
		System.out.println(list.toString());
	}
	

}

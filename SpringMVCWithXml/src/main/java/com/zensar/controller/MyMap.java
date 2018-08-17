package com.zensar.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String,String>();
		/*map.put("AA", "Akhilesh");
		map.put("AA", "Kamlesh");
		map.put("BB", "ABC");*/
		
		/*String s1=new String("ABC");
		String s2=new String("ABC");*/
		
		
		Object o1=new Object();
		Object o2=new Object();
		/*map.put(, "123");
		System.out.println(map.get(s2));*/
		System.out.println(o1.equals(o2));
		
		/*System.out.println(map.toString());
		System.out.println(map.get("AA"));
		System.out.println(map.get("BB"));*/
	}
	
	@Override
	public String toString() {
		return "MyMap [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

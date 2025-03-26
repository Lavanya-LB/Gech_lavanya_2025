package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Map
		 * ===
		 * when u represent a group of individuals object as a single entity
		 * in the form of key value then we shoulld for map  interface
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(10, "ten");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(map);
		map.remove(2);
		System.out.println(map);
		System.out.println(map.containsValue(1));
		System.out.println(map.containsKey("ten"));
		
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer,String>((a,b)->a-b);
		treemap.put(1, "la");
		treemap.put(2, "lav");
		treemap.put(3, "lava");
		
		
		
		System.out.println(treemap);
		

	}

}

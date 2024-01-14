package com.archcorner.core.set;

import java.util.LinkedHashSet;


public class LinkedHashSetExample {


	public static void main(String[] args)
	{


		LinkedHashSet<String> linkedset
			= new LinkedHashSet<String>();


		linkedset.add("Apple");
		linkedset.add("Bat");
		linkedset.add("Cat");
		linkedset.add("Dog");


		linkedset.add("Apple");
		linkedset.add("Egg");


		System.out.println("Size  = "
						+ linkedset.size());

		System.out.println("Initial LinkedHashSet:"
						+ linkedset);


		System.out.println("Removing Dog: "
						+ linkedset.remove("Dog"));


		System.out.println(
			"Remove Zebra "
			 + linkedset.remove("Zebra"));


		System.out.println("Checking if Apple is there="
						+ linkedset.contains("Apple"));


		System.out.println("Updated: "
						+ linkedset);
	}
}


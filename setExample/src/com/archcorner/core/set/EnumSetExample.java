package com.archcorner.core.set;

import java.util.EnumSet;


enum Activities { PLAY, LEARN, CONTRIBUTE, QUIZ, SCRABBLE };


public class EnumSetExample {


	public static void main(String[] args) {


		EnumSet<Activities> set1, set2, set3, set4;


		set1 = EnumSet.of(Activities.QUIZ, Activities.CONTRIBUTE,
						Activities.LEARN, Activities.PLAY);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(Activities.class);
		set4 = EnumSet.range(Activities.PLAY, Activities.CONTRIBUTE);


		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
	}
}


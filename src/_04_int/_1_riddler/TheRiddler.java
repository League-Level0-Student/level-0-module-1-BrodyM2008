package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;

String Piano =	JOptionPane.showInputDialog("What has many keys, but can't open a single lock?");

		if (Piano.equals("piano")){
			JOptionPane.showInputDialog("Correct!");
			score ++;
			
			
			
		}
		else {
			JOptionPane.showInputDialog("Wrong, It's Piano!");
		}

		
	String Fence = JOptionPane.showInputDialog("What runs all the way around the backyard, but doens't move?");
		
	if (Fence.equals("fence")) {
		JOptionPane.showInputDialog("Correct!");
		score ++;
	}
	else {
		JOptionPane.showInputDialog("Wrong, It's fence!");
	}
	}
}
			


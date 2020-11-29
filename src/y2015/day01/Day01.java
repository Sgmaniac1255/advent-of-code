package y2015.day01;

import framework.Day;
import framework.Input;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day01 extends Day {

	private String instructions;

	public Day01() {
		input = Input.getScanner(2015,1);
		instructions = input.nextLine();
	}

	@Override
	public void part1() {
		int floor = 0;
		for (int i = 0; i < instructions.length(); i++) {
			char nextChar = instructions.charAt(i);
			if (nextChar == '('){
				floor++;
			} else if (nextChar == ')'){
				floor--;
			}
		}

		System.out.println(floor);
	}

	@Override
	public void part2() {
		int floor = 0;
		int pos;
		for (pos = 1; pos <= instructions.length(); pos++) {
			char nextChar = instructions.charAt(pos-1);
			if (nextChar == '('){
				floor++;
			} else if (nextChar == ')'){
				floor--;
			}
			if (floor<0){
				break;
			}
		}
		System.out.println(pos);
	}
}

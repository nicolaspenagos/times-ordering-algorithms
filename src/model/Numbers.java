package model;

import java.util.ArrayList;

public class Numbers {
	private int[] numbers;
	private ArrayList<Integer> usedNumbers;
	
	public Numbers() {
		numbers=generateNumbers(100);
		usedNumbers = new ArrayList<>();
	}
	
	public void setNumbers(int[] x) {
		numbers=x;
	}
	public int[] generateNumbers(int size) {

		int[] newArray = new int[size];
		for(int i=0; i<size; i++) {
			int numberToAdd=0;
			boolean finish=false;
			while(!finish) {
				numberToAdd=(int) (Math.random() * (size*10));
				if(!isUsed(numberToAdd)) {
					finish=true;
				}
			}
			newArray[i]=numberToAdd;
		}
		
		setNumbers(newArray);
		
		return newArray;
	}
	
	public boolean isUsed(int x) {
		boolean isUsed = false;
		if(usedNumbers==null) {
			isUsed=false;
		}else {
			for (int i = 0; i < usedNumbers.size()&&!isUsed; i++) {
				if(x==usedNumbers.get(i)) {
					isUsed=true;
				}
			}
		}
		return isUsed;
	}
	
	public String printArray() {
		String msg="";
		for (int i = 0; i < numbers.length-1; i++) {
			msg += numbers[i]+", "; 
			if(i%10==0&&i!=0) {
				msg+="\n";
			}
		}
		msg+=numbers[numbers.length-1];
		return msg;
	}
}

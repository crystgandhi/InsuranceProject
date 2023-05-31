package examples;

import java.util.Arrays;

public class DistinctNumbers {
	int[] numberArray={1,3,4,2,3,4,1,5};
	
	public static void main(String args[]) {
		DistinctNumbers distinct=new DistinctNumbers();
		System.out.println(distinct.getDistinctNumbers());
	}
	
   public int[] getDistinctNumbers(){
		
		int arraylength=numberArray.length;
		int n=1;
		for(int i=1; i<arraylength;i++){
		if(numberArray[i] !=numberArray[i-1]){
		numberArray[n]=numberArray[i];
		n++;
		}
		}
		return numberArray;
		
		
	}
}

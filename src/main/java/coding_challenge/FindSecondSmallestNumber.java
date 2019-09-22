/*
 
* Question 3:

 * ------------------------------------------------------------------------------------
 * Generate 500 random numbers and create a method to print the nth smallest number 
 * in a programming language of your choice. 
 *  //nth smallest number is is determine by the value of int "n"
 *  @authour : pranav joshi
 * ------------------------------------------------------------------------------------
 */
package coding_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class FindSecondSmallestNumber {

 public static void main(String[] args) {
	 //nth smallest number is is determine by the value of int "n"
	int n=2; 
	 //List numList = new ArrayList<>(500);
	 int[] numList = new int[500];
	 System.out.println("Lsit of Random Numbers");
	 System.out.println(Arrays.toString(FindSecondSmallestNumber.random(numList)));
	 System.out.println("Lsit of Sorted Random Numbers");
	 System.out.println(Arrays.toString(FindSecondSmallestNumber.arraySort(numList)));
	 System.out.println("Nth smallest number is: "+(FindSecondSmallestNumber.getNthSmallestNumber(n, numList)));
 }

 /*--------------------------------
  * Sorting randomly generated list
  * -------------------------------
  */
public static int[] arraySort(int[] numList) {
	 int temp;
	 for(int j=0;j<numList.length-1;j++) {
		 for(int m=j+1; m<numList.length;m++) {
			 if(numList[j]>numList[m]) {
				 temp = numList[j];
				 numList[j]=numList[m];
				 numList[m]=temp;	 
			 }	
		 }	 
	 }
	//System.out.println(Arrays.toString(numList));
	return numList;
 }


/*--------------------------------
 * random number generator
 * --------------------------------
 */
public static int[] random(int[] numList) {
	 for(int i = 0; i<numList.length; i++) {
			numList[i]= (int)(Math.random()*5000);
		}
		//System.out.println(Arrays.toString(numList));
		return numList;
	}

/*-----------------------------------------------------------------
 * Getting the nth smallest number with respect to the value of 'n'
 * ----------------------------------------------------------------
 */
public static int getNthSmallestNumber(int n,int[] numList){
    return numList[n-1];
	}
}

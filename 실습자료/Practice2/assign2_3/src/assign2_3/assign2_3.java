package assign2_3;

import java.util.Scanner;

public class assign2_3 {

	public assign2_3() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=3;
		boolean isPrime=false;
		while(a!=0) {
			int num=scn.nextInt();
			
		
	        for (int i = 2; i < num; i++) {
	         
	            if (num % i 2w== 0) {
	               
	                isPrime = true;
	               
	                break;
	            }
	        }
	
	        if (isPrime) {
	            System.out.println(num + "은(는) 소수가 아닙니다.");
	        } else {
	            System.out.println(num + "은(는) 소수입니다.");
	        }
			a--;
		}
		
	}

}

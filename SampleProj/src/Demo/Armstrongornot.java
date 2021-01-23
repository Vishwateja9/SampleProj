package Demo;
import java.util.Scanner;

class Armstrongornot{
	
	static void armstrongcheck(int n){
		
		int r,sum=0;
		int temp = n;
		while(n>0){
			r = n%10;
			sum=(sum)+r*r*r;
			n=n/10;
			
		}
		if(temp == sum){
			System.out.println("armstrong");
		}else{
			System.out.println("not armstrong");
		}
		
	}
	
	public static void main (String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to check");
		int num =s.nextInt();
		
		armstrongcheck(num);
		s.close();
	}
		
}


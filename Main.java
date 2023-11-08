import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
    	int s=0;
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>0) {
        
        	s+=n%10;
        	n=n/10;
        }
        System.out.println("Addition of given number is "+s);
	}

}

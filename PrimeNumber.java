package week1day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A Number which is divisible by 1 and itself - PRIME NUMBER
		//It has 2 factors
		int a= 25;
		int digit= 0;
		
		for (int i=1;i<a;i++)
		{
		
		if(a %i ==0)
			digit=  + 1;
		}
		if (digit==2)
		{ 
		System.out.println("PRIME NUMBER" +  a);
		}
		else 
		
			System.out.println("NOT A PRIME NUMBER:" +  a);}
	
}
	

		
		
			
			
		
		

	



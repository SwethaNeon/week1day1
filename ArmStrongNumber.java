package week1day1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 1634;
		int quotient, remainder, result= 0;
		int OriginalNum= 0;
		OriginalNum= number;
		 int count = 0;
		 
		 while (number>0)
		 {
			 System.out.println(  "number before process:" + number );
		 
		 remainder = number%10;
		 quotient = number/10;
		System.out.println( count+ ":result before process :" + number);
		 result = result + (int)Math.pow(remainder,4);
		 number = quotient;
		 count++;
		 System.out.println(  count + ":remainder:" + remainder);
		 System.out.println(  count + ":Quotient:" + quotient);
		 System.out.println( count  + ": result:" + result);
		 System.out.println(  count +  ":number after process:" + number);
		 System.out.println("*****");
		 }
		 System.out.println(result);
		 System.out.println(number);
		 System.out.println(OriginalNum);
		 if (result == OriginalNum)
		 {
			 System.out.println("It is an Armstrong Number:");
			 
		 }
		 else
		 {
			 System.out.println(" it is not an Armstrong Number:");
		 }
	}
		 
		 
		 
		 
		 
		 
		 
				 
		 
		  
		 
		 
		


	}



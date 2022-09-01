package assigment3;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		int i, number, count; 
		
		// print prime numbers from 100 - 200

		System.out.println(" Prime Numbers from 100 to 200 are : ");
		
		for(number = 100; number <= 200; number++)
		{
			count = 0;
			
			//An optimized to check if a number is prime or not.

		
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}

}





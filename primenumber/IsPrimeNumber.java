package primenumber;

public class IsPrimeNumber
{
	public static boolean isPrime(int num)
	{
		boolean prime = true;
		for(int i = 2 ; i <= num/2 ; i++ )
		{
			if(num%i==0)
			{
				prime = false;
			}
		}
		return prime;
	}
	public static void main(String[] args)
	{
		int num = 17;
	    System.out.println(isPrime(num) ? "It Is Prime Number":"It Is Not A Prime Number");
	}

}

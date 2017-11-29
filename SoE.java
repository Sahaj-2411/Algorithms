import java.util.*;
class SoE 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sieveOfEratosthenes(a);
	}
	void sieveOfEratosthenes(int a)
    {   
        boolean isPrime[] = new boolean[a+1];
        for(int i=0;i<n;i++)
            isPrime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(isPrime[p] == true)
                for(int i = p*2; i <= n; i += p)
                    isPrime[i] = false;
        }
        for(int i = 2; i <= n; i++)
        {
            if(isPrime[i] == true)
                System.out.print(i + " ");
        }
    }
}

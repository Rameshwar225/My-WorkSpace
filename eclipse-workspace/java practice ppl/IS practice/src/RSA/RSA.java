package RSA;

public class RSA {

	public static void main(String[] args) {
		
		int p=3;
		int q=7;
		
		double n = p*q;
		double fi = (p-1) * (q-1);
		
		double e=2;
		while(e<fi)
		{
			if(gcd(e,fi)==1)
			{
				break;
			}
			else
			{
				e++;
			}
		}
		System.out.println(e);
		
		int K =2;
		double d = (1+(K*fi)/e);
		
		int msg = 12;
		
		System.out.println("Encryption");
		double c = Math.pow(msg, e)%n;
		
		
		System.out.println(c);

	}
	
	static double gcd(double e, double h)
	{
		double temp;
		while(true)
		{
			temp = e%h;
			if(temp==0)
			{
				return h;
			}
			e=h;
			h=temp;
		}
	}

}

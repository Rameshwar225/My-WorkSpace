package RSA;

public class RSA1 {

	public static void main(String[] args) {
		int p=3;
		int q=21;
		
		double n = p*q;
		double fi = (p-1)* (q-1);
		
		double e=2;
		
		while(e<fi)
		{
			if(ged(e,fi)==1)
			{
				break;
			}
			else
			{
				e++;
			}
		}
		
		int k=2;
		
		double d = (1+(k*fi)/e);
		
		System.out.println("encryption");
		
		int msg = 12;
		double c = Math.pow(msg, e);
		c= c%n;
		
		System.out.println(c);
		

	}
	
	static double ged(double e, double h)
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

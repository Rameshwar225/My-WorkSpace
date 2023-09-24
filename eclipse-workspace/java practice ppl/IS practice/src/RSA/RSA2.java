package RSA;

public class RSA2 {

	public static void main(String[] args) {
		
		int p=3;
		int q = 7;
		
		int n= p*q;
		int fi = (p-1)*(q-1);
		
		int e=2;
		
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
		
		int k=2;
		int d = (1+(k*fi)/e);
		
		int msg = 12;
		double c = Math.pow(msg, e);
		c= c%n;
		System.out.println(c);
		
		
		double des = Math.pow(c, d);
		des = des%n;
		System.out.println(des);
		

	}
	
	
	static int gcd(int e, int h)
	{
		int temp;
		
		while(true)
		{
		 temp = e%h;
		 if(temp==0)
		 {
			 return h;
		 }
		 e = h;
		 h=temp;
		}
	}

}

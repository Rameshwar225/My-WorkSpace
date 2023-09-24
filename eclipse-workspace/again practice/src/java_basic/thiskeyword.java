package java_basic;
class a
{
	int a,b;
	void fun1(int p,int q)
	{
		this.a=p;
		this.b=q;
		System.out.println(p+q);
		System.out.println(a);
	}
	void fun(int d,int f)
	{
		System.out.println(d+f);
		System.out.println(a);
	}
	
}
public class thiskeyword {

	public static void main(String[] args) {
	   a a1 =new a();
	   a1.fun(2, 3);
	   a1.fun1(2, 3);

	}

}

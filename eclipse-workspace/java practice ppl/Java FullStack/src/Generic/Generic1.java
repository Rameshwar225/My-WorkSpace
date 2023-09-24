package Generic;

// below is a regular class 
class Data
{
	private Object obj;

	public Data(Object obj) {
	
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
}

//Below is a generic class
class genericlass<y>
{
	private y var;
	
	public genericlass(y var1)
	{
		this.var=var1;
	}
	
	public y getvar()
	{
		return var;
	}
}

public class Generic1 {

	public static void main(String[] args) {
		System.out.println("**********Without using gereniric class**********");
		Data d1 = new Data("Some String");
		String text = (String)d1.getObj();
		System.out.println(text);
		
		System.out.println("**********By using Generic class**********");
		
		genericlass<String> obj = new genericlass<String>("Generic"); 
		String s1 = obj.getvar();
		System.out.println(s1);
	}

}

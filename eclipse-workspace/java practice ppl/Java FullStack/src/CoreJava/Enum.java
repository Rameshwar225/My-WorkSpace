package CoreJava;

enum learning
{
	COREJAVA,MULTITHREDING,JSP,SERVLET,SPRING;
}

public class Enum {

	public static void main(String[] args) {
		
		learning l1 = learning.SPRING;
		
		switch(l1)
		{
		case COREJAVA:
			System.out.println("this is corejava");
			break;
		case JSP:
			System.out.println("this is JSP");
			break;
		case MULTITHREDING:
			System.out.println("this is multithreding");
			break;
		case SERVLET:
			System.out.println("this is sevlet");
			break;
		case SPRING:
			System.out.println("this is spring");
			break;
		default:
			System.out.println("choose correct optioon ");
			break;
		
		}

	}

}

package threding;
//threading means do both work at a time
class mythread extends Thread //here we import thread class which is already declared in java compiler
{ //this type is call by extending the tread class method  
	public void run() //here we create a method
	{
		int i=0;
		while(i<=4)
		{
			System.out.println("i am in class mythreads");
			System.out.println("i am cooking now ");
			i++;
		}
	}
}
class mythread1 extends Thread //here again we extends class thread
{
	public void run()
	{
		int i=0;
		while(i<=4)
		{
			System.out.println("i am in class mythread1");
			System.out.println("i am now chatting ");
			i++;
		}
	}
}

public class intro_threding {

	public static void main(String[] args) {
		//here we create a object of 1st class
		mythread t1 = new mythread();
		t1.start(); //here we call start  method which is we not declared in our implementation
		//but when we use threading that time we need to call start method cause of starting
		//of that program it is atomatic call our method run() which is we create 
		//if here we directly call run method that time theading is  not possible
		
		
		//here we create a object of 2nd class
		mythread1 t11 = new mythread1();
		t11.start(); //here we call start  method which is we not declared in our implementation
		//but when we use threading that time we need to call start method cause of starting
		//of that program it is atomatic call our method run() which is we create 
		
	}

}

//output:-
//i am in class mythreads
//i am cooking now 
//i am in class mythreads
//i am cooking now 
//i am in class mythreads
//i am cooking now 
//i am in class mythreads
//i am cooking now 
//i am in class mythreads
//i am cooking now 
//i am in class mythread1
//i am now chatting 
//i am in class mythread1
//i am now chatting 
//i am in class mythread1
//i am now chatting 
//i am in class mythread1
//i am now chatting 
//i am in class mythread1
//i am now chatting 
//

/*here we can see our compiler some time exicute our 1st class and somtime
execute our 2nd class simontaniously*/
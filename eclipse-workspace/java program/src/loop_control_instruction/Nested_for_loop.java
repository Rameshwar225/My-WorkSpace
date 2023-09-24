package loop_control_instruction;

public class Nested_for_loop {

	public static void main(String[] args) {
          int i,j;
          for(i=1;i<=5;i++)  //this loop is used for how many time you want to exicute the loop
          {
        	  for(j=0;j<=10;j++) //this for what data you want to print
        	  {
        		  System.out.print(j);
        	  }
        	  System.out.println();
          }
	}

}

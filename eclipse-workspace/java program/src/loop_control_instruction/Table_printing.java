package loop_control_instruction;

public class Table_printing {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=20;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}

	}

}

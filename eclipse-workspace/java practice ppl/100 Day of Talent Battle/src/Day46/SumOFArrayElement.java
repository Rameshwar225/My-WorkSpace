package Day46;

public class SumOFArrayElement {

	public static void main(String[] args) {
		
		int n[] = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<=n.length-1;i++)
		{
			sum= sum+n[i];
		}
		System.out.println(sum);

	}

}

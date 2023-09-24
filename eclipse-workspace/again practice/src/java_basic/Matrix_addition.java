package java_basic;

public class Matrix_addition {

	public static void main(String[] args) {
		
		int a[][]= { {1,2, 3  },
				   { 1, 2, 3  },
		           { 1, 2, 3  }   };
		
		int b[][]= { {1,2, 3  },
				   { 1, 2, 3  },
		           { 1, 2, 3  }   };
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+b[i][j] +" ");
			}
			System.out.println();
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(i==j)
				{
					(a[i][j]+b[i][j])=0;
				}
			}
			
		}
		
	}

}

package sorting;
//selection sort:
//in selection sort we choese a samllest element in array and we swap it with position 1
//and like this we done our selection sort



public class selection_sort {

	public static void main(String[] args) {
		int a[] = { 45, 25, 15, 5, 10 };
		int n = a.length;
		int i, j;
		for (i = 0; i < n - 1; i++)
		{
			int min = i;//firstely we declare minimum value is i 
			for (j = i; j < n; j++) 
			{
				if (a[j] < a[min]) //here we compare minimum value with all array for finding less number
				{
					min = j; //if we got less value then we store it in min veriable
				}
			}
			//and again swap them
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		for (int item : a) //here we print our sorted array
		{
			System.out.print(item + " ");
		}

	}

}

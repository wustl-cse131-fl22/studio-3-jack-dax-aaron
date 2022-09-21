package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pick a number:");
		int n = scan.nextInt();
		
		boolean[] array = new boolean[n - 1];
		
		for(int i=0; i<n-1; i++)
		{
		array[i]=true;
		}
		
		int m = 2;
		
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-1; j++)
			{
				if ((j+2) % (m) == 0)
				{
					if (j+m < n-1)
					{
					array[j+m] = false;
				}
					
				}
					
	
			}		
			m++; 
		}
		//for(int i=0; i<n-1; i++)
		//{
		//System.out.println(array[i]);
		//}
		for (int i=0; i<n-1; i++)
		{
			if(array[i]==true)
			{
				System.out.println(i+2);
			}
		}
	}
	
	

}

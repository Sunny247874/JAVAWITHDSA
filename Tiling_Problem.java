package backtracking;

import java.util.Scanner;

public class Tiling_Problem {

	public static int getWay(int n)
	{
		if(n<=3)
		{
			return n;
		}
		
		return getWay(n-1)+getWay(n-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Entet the how many tiling:");
         int n=sc.nextInt();
         
        	 for(int i=1;i<=n;i++)
        	 {
        		System.out.println(" For n="+i+" for Total ways="+getWay(i));
        	 }
	}

}

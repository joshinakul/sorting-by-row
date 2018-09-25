import java.util.Scanner;
class RowSorting
{
	public static void main(String args[])
	{
		Scanner q=new Scanner(System.in);
		System.out.println("enter no. of rows ");
		int r=q.nextInt();
		System.out.println("enter no. of column ");
		int c=q.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{	for(int j=0;j<c;j++)
			{	System.out.print("array element"+(i+1)+","+(j+1)+":");
		        a[i][j]=q.nextInt();
			}
		}
		for(int k=0;k<r;k++)
		{
			for(int i=0;i<c-1;i++)
				for(int j=i+1;j<c;j++)
					if(a[k][i]>a[k][j])
					{	int t=a[k][i];
						a[k][i]=a[k][j];
						a[k][j]=t;
					}
		}
		for(int e[]:a)
		{	for(int w:e)
				System.out.print(w+"\t");
				
			System.out.println();
		}	
	}
	
}
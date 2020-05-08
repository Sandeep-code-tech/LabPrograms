import java.util.Scanner;

class Prims{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6*6 Matrices");
		int[][] matrix=new int[6][6];
		int[] visited=new int[6];
		int min;
		int u=0;
		int v=0;
		int total=0;
		
		for(int i=0;i<6;i++)
		{	
			visited[i]=0;
			for(int j=0;j<6;j++)
			{
				matrix[i][j]=sc.nextInt();
				if(matrix[i][j]==0)
				{
					matrix[i][j]=99;
				}
			}
}
	
		visited[0]=1;
		for(int count=0;count<5;count++)
		{
			min=99;
			for(int i=0;i<6;i++)
			{
				if(visited[i]==1)
				{
					for(int j=0;j<6;j++)
					{
						if(visited[j]!=1)
						{
							if(min>matrix[i][j])
							{
								min=matrix[i][j];
								u=i;	v=j;
							}
						}
					}	
				}
			}
				visited[v]=1;
				total+=min;
				System.out.println("Edge found:"+u+"--->"+v+":Weight"+min);
			}
				System.out.println("Weight of minimum spanning tree:"+total);
	}
}
	

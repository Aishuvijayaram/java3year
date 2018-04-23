import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {

		Scanner sr=new Scanner(System.in);
		
		int sum=sr.nextInt();
		int[] number=new int[sum];
		int temp=0;
		for(int i=0;i<sum;i++)
		{
		    number[i]=sr.nextInt();
		}
		for(int i=0;i<sum;i++)
		{
			for(int j=i+1;j<sum;j++)
			{
				if(number[i]<number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		for(int i=0;i<sum;i++)
		{
			System.out.print(" "+number[i]);
		}
		
		
	}

}

import java.util.Scanner;
class TablePrint
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();

		System.out.println("___________");

		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}

		
	}
}

import java.util.Scanner;
class Whileloop1{
	public static void main(String args[]){
		int i=1;
		int c=1;
		String a;
		String b;
		Scanner acc=new Scanner(System.in);
		while(i==1){
			System.out.println("Enter name of the student"+c);
			a=acc.nextLine();
			System.out.println("Enter Roll number of the student"+c);
			b=acc.nextLine();
			System.out.println("Name:"+a);
			System.out.println("Roll no:"+b);
			c=c+1;
			System.out.println("Press 2 to stop the loop,1 to continue");
			i=acc.nextInt();
		}		
	}
}
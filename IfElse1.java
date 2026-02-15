import java.util.Scanner;
class IfElse1{
	public static void main(String args[]){
		Scanner lex=new Scanner(System.in);
		System.out.println("Please enter your age to verify eligibility for voting");
		int age=lex.nextInt();
		if(age<18){
			System.out.println("Not Eligible to vote");
		}	
		else{
			System.out.println("Eligible to vote");
		}
		

	}
}
	
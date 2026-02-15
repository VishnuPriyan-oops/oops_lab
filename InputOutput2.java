import java.util.Scanner;
class InputOutput2{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=inp.nextLine();
		
		System.out.println("Please enter your age");
		int age=inp.nextInt();
		
		System.out.println("Name of the person:"+(name));
		System.out.println("Age of the person:"+(age));
}
}
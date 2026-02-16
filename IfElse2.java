import java.util.Scanner;
class IfElse2{
	public static void main(String args[]){
		Scanner ann=new Scanner(System.in);
		System.out.println("Enter your choice between Avengers and SHIELD");
		String otp=ann.nextLine();
		
		if(otp.equalsIgnoreCase("Avengers")){
			System.out.println("You chose to side with avengers");
		}

		 else if(otp.equalsIgnoreCase("SHIELD")){
			System.out.println("You chose to side with SHIELD");
		 }
		else{
			System.out.println("Invalid choice");
		}
	}

}
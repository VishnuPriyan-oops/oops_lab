package result;
import student.Student;	
public class CalculateGrades extends Student{
	
	double sum;
	double avg;
	public CalculateGrades(String name,int mark1,int mark2,int mark3){
		super(name,mark1,mark2,mark3);
		
		sum=mark1+mark2+mark3;	
		avg=sum/3.0;
	}
	
	public void Grade(){
		if(avg>85){
			System.out.println("A");
		}
		else if(avg>80 && avg<85){
			System.out.println("B+");
		}
	}
}
		
	
package flowControlStaements;

public class GradingSystem {

	public static void main(String[] args) {

		int maths=51, Physics=36, Chemistry=90;
		int Average= (maths+Physics+Chemistry)/3;
		System.out.println("The Average of student is: "+Average);
		
		if(maths<35|| Physics<35 || Chemistry<35) {
			System.out.println("The student is failed in examinition");
			
		}
		else if(Average>35 && Average<=59) {
			System.out.println("C Grade");
		}
		else if(Average>59 && Average<=69) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("A Grade");
		}
	}

}

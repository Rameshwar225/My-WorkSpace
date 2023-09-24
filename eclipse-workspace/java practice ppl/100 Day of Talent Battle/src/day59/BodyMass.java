package day59;

public class BodyMass {

	public static void main(String[] args) {
		
		int m = 90;
		float h = 5.7f;
		int bmi = (int) (m/(h*h));
		
		if(bmi<=18)
		{
			System.out.println("Underweight ");
		}
		else if(bmi>=19 && bmi <= 24)
		{
			System.out.println("Normal weight ");
		}
		else if(bmi >= 25 && bmi <=29)
		{
			System.out.println("Overweight ");
		}
		else
		{
			System.out.println("Obesity ");
		}
		 

	}

}

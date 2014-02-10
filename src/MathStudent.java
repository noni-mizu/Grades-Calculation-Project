import javax.swing.JOptionPane;



public class MathStudent extends Student{
		private final double MATH_MIDTERM_PERCENTAGE = .50;
		private final double MATH_FINALEXAM_PERCENTAGE = .50;
		
		public MathStudent() {
			System.out.println("MathStudent's Constructor");
		}
		
		public void calculate( int midterm, int finalExamGrade) {
			finalNumericGrade = (midterm * MATH_MIDTERM_PERCENTAGE) + 
				(finalExamGrade * MATH_FINALEXAM_PERCENTAGE);
			if (finalNumericGrade >= 90) 
				finalLetterGrade = "A";
			else 
				if (( finalNumericGrade >= 83) & (finalNumericGrade < 90)) 
					finalLetterGrade = "B"; 
			else 
				if (( finalNumericGrade >= 76) & (finalNumericGrade < 83))
					finalLetterGrade = "C"; 
			else 
				if (( finalNumericGrade >= 65) & (finalNumericGrade < 76)) 
					finalLetterGrade = "D"; 
			else 
				if (finalNumericGrade < 65) 
					finalLetterGrade = "F";
		}

		public void calculate(){
			midterm = Integer.parseInt(JOptionPane.showInputDialog
					(" Enter the Midterm Grade"));
			finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog
					("Enter the Final Examination Grade"));
			finalNumericGrade = (midterm * MATH_MIDTERM_PERCENTAGE) + 
					(finalExamGrade * MATH_FINALEXAM_PERCENTAGE);
			
			if(finalNumericGrade >= 90)
				finalLetterGrade = "A";
			else 
				if((finalNumericGrade >= 83) && (finalNumericGrade < 90))
					finalLetterGrade = "B";
			else
				if((finalNumericGrade >= 76) && (finalNumericGrade < 83))
					finalLetterGrade = "C";
			else
				if((finalNumericGrade >= 65) && (finalNumericGrade < 76))
					finalLetterGrade = "D";
			else
				if(finalNumericGrade < 65)
					finalLetterGrade = "F";

		}
}



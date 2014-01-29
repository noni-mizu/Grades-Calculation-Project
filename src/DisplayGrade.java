import javax.swing.JOptionPane;



public class DisplayGrade {
	
	public DisplayGrade(int midterm, int finalExamGrade, int research, 
			int presentation, double finalNumericGrade, 
			String finalLetterGrade){
				JOptionPane.showMessageDialog(null, "***ENGLISH STUDENT***\n\n" +
					"Midterm grade is: " + midterm + "\n" +
					"Final Exam is: " + finalExamGrade +"\n" +
					"Research grade is: " + research + "\n" +
					"Presentation grade is: " + presentation + "\n\n" +
					"Final Numeric Grade is: " + finalNumericGrade + "\n" +
					"Final Letter Grade is: " + finalLetterGrade);
			} //end of displayGrade method with 6 parameters
	
	public DisplayGrade(int midterm, int finalExamGrade, 
			double finalNumericGrade, String finalLetterGrade) {
				JOptionPane.showMessageDialog(null, "***MATH STUDENT***\n\n" +
					"Midterm grade is: " + midterm + "\n" +
					"Final Exam is: " + finalExamGrade + "\n\n" +
					"Final Numeric Grade is: " + finalNumericGrade + "\n" +
					"Final Letter Grade is: " + finalLetterGrade);
			} //end of displayGrade method with 4 parameters
	
	public DisplayGrade(int midterm, int finalExamGrade, int research, 
			double finalNumericGrade, String finalLetterGrade) {
				JOptionPane.showMessageDialog(null, "***SCIENCE STUDENT***\n\n" +
					"Midterm grade is: " + midterm + "\n" +
					"Final Exam is: " + finalExamGrade + "\n" +
					"Research grade is: " + research + "\n\n" +
					"Final Numeric Grade is: " + finalNumericGrade + "\n" +
					"Final Letter Grade is " + finalLetterGrade);						
			} //end of displayGrade with 5 parameters

} //end of DisplayGrade class

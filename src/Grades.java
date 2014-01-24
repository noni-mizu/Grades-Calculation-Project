import javax.swing.JOptionPane;


public class Grades {
	
	static final double ENGLISH_MIDTERM_PERCENTAGE = .25;
	static final double ENGLISH_FINALEXAM_PERCENTAGE = .25;
	static final double ENGLISH_RESEARCH_PERCENTAGE = .30;
	static final double ENGLISH_PRESENTATION_PERCENTAGE = .20;
	
	static final double MATH_MIDTERM_PERCENTAGE = .50;
	static final double MATH_FINALEXAM_PERCENTAGE = .50;
	
	static final double SCIENCE_MIDTERM_PERCENTAGE = .40;
	static final double SCIENCE_FINALEXAM_PERCENTAGE = .40;
	static final double SCIENCE_RESEARCH_PERCENTAGE = .20;
	
	static int midterm = 0;
	static int finalExamGrade = 0;
	static int research = 0;
	static int presentation = 0;
	static double finalNumericGrade = 0;
	static String finalLetterGrade = "";
	
	public static void main(String[] args) {
			
		String response;
		String moreGradesToCalculate;
			
		moreGradesToCalculate = JOptionPane.showInputDialog("Do you want to calculate a grade?");
		moreGradesToCalculate = moreGradesToCalculate.toUpperCase();
			
		while(moreGradesToCalculate.equals("YES")){
			response = whatKindOfStudent();
			
			switch(Integer.parseInt(response)){
				case 1:
					calculateEnglishGrade();
					displayGrade(midterm, finalExamGrade, research, presentation, finalNumericGrade, finalLetterGrade);
					break;
				case 2:
					calculateMathGrade();
					displayGrade(midterm, finalExamGrade, finalNumericGrade, finalLetterGrade);
					break;
				case 3:
					calculateScienceGrade();
					displayGrade(midterm, finalExamGrade, research, finalNumericGrade, finalLetterGrade);
					break;
				default:
					JOptionPane.showMessageDialog(null, response + " - is not a valid student type");
					System.exit(0);
			}//end of switch
			
			moreGradesToCalculate = JOptionPane.showInputDialog("Do you have another grade to calculate?");
			moreGradesToCalculate = moreGradesToCalculate.toUpperCase();
		}//end of while
		JOptionPane.showMessageDialog(null, "Thanks for using the Grades Calculation program!");
		System.exit(0);	
	} //end of main

	public static String whatKindOfStudent(){
		String response;
		response = JOptionPane.showInputDialog("Enter student type (1=English, 2=Math, 3=Science)");
			
		if(response == null){
			JOptionPane.showMessageDialog(null, "You clicked on the Cancel button");
			System.exit(0);
		}
		else if(response.equals("")){
			JOptionPane.showMessageDialog(null, "You must make an entry in the InputBox");
			System.exit(0);
		}
		else if(Integer.parseInt(response) < 1 || Integer.parseInt(response) > 3) {
			JOptionPane.showMessageDialog(null, response + " - is not a valid student type");
			System.exit(0);
		}	
		return response;
	}//end of whatKindOfStudent method
	
	public static void calculateEnglishGrade(){
		midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Examination Grade"));
		research = Integer.parseInt(JOptionPane.showInputDialog("Enter the Research Grade"));
		presentation = Integer.parseInt(JOptionPane.showInputDialog("Enter the Presentation Grade"));
		
		finalNumericGrade = (midterm * ENGLISH_MIDTERM_PERCENTAGE) + 
				(finalExamGrade * ENGLISH_FINALEXAM_PERCENTAGE) + 
				(research * ENGLISH_RESEARCH_PERCENTAGE) + 
				(presentation * ENGLISH_PRESENTATION_PERCENTAGE);
		
		if(finalNumericGrade >=93)
			finalLetterGrade = "A";
		else 
			if((finalNumericGrade >= 85) && (finalNumericGrade < 93))
				finalLetterGrade = "B";
		else 
			if((finalNumericGrade >= 78) && (finalNumericGrade < 85))
				finalLetterGrade = "C";
		else 
			if((finalNumericGrade >= 70) && (finalNumericGrade < 78))
				finalLetterGrade = "D";
		else 
			if (finalNumericGrade < 70)
				finalLetterGrade = "F";
	} //end of calculateEnglishGrade method
	
	public static void calculateMathGrade(){
		midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Examination Grade"));
		
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
			if((finalNumericGrade >=65) & (finalNumericGrade < 76))
				finalLetterGrade = "D";
		else
			if(finalNumericGrade <65)
				finalLetterGrade = "F";
	} //end of calculateMathGrade method
	
	public static void calculateScienceGrade(){
		midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Examination Grade"));
		research = Integer.parseInt(JOptionPane.showInputDialog("Enter the Research Grade"));
		
		finalNumericGrade = (midterm * SCIENCE_MIDTERM_PERCENTAGE) +
				(finalExamGrade * SCIENCE_FINALEXAM_PERCENTAGE) +
				(research * SCIENCE_RESEARCH_PERCENTAGE);
		
		if(finalNumericGrade >= 90)
			finalLetterGrade = "A";
		else
			if((finalNumericGrade >= 80) && (finalNumericGrade < 90))
				finalLetterGrade = "B";
		else
			if((finalNumericGrade >= 70) && (finalNumericGrade < 80))
				finalLetterGrade = "C";
		else
			if((finalNumericGrade >= 60) && (finalNumericGrade <70))
				finalLetterGrade = "D";
		else
			if(finalNumericGrade < 60)
				finalLetterGrade = "F";
	}//end of calculateScienceGrade method
	
	public static void displayGrade(int midterm, int finalExamGrade, int research, int presentation,
									double finalNumericGrade, String finalLetterGrade){
		JOptionPane.showMessageDialog(null, "***ENGLISH STUDENT***\n\n" +
				"Mideterm grade is: " + midterm + "\n" +
				"Final Exam is: " + finalExamGrade + "\n" +
				"Research grade is: " + research + "\n" +
				"Presentation grade is: " + presentation + "\n\n" +
				"Final Numeric Grade is: " + finalNumericGrade + "\n" +
				"Final Letter Grade is: " + finalLetterGrade);
	}//end displayGrade method with 6 parameters
	
	public static void displayGrade(int midterm, int finalExamGrade, 
									double finalNumericGrade, String finalLetterGrade){
		JOptionPane.showMessageDialog(null, "***MATH STUDENT***\n\n" +
				"Midterm grade is: " + midterm + "\n" +
				"Final Exam is: " + finalExamGrade + "\n\n" +
				"Final Numeric Grade is: " + finalNumericGrade + "\n" +
				"Final Letter Grade is: " + finalLetterGrade);
	}//end of displayGrade method with 4 parameters
	
	public static void displayGrade(int midterm, int finalExamGrade, int research, 
									double finalNumericGrade, String finalLetterGrade){
		JOptionPane.showMessageDialog(null, "***SCIENCE STUDENT***\n\n" +
				"Midterm grade is: " + midterm + "\n" +
				"Final Exam is: " + finalExamGrade + "\n" +
				"Research grade is: " + research + "\n\n" +
				"Final Numeric Grade is: " + finalNumericGrade + "\n" +
				"Final Letter Grade is: " + finalLetterGrade);
	}//end displayGrade method with 5 parameters
	
}//end of class
									

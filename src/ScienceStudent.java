import javax.swing.JOptionPane;




public class ScienceStudent extends Student{
	private final double SCIENCE_MIDTERM_PERCENTAGE = .40;
	private final double SCIENCE_FINALEXAM_PERCENTAGE = .40;
	private final double SCIENCE_RESEARCH_PERCENTAGE = .20;
	
	public ScienceStudent(){
		System.out.println("ScienceStudent's Constructor");
	}
	
	public void calculate( int midterm, int finalExamGrade, int research) { 
		finalNumericGrade = (midterm * SCIENCE_MIDTERM_PERCENTAGE) + 
			(finalExamGrade * SCIENCE_FINALEXAM_PERCENTAGE) + 
			(research * SCIENCE_RESEARCH_PERCENTAGE); 
		if (finalNumericGrade >= 90) 
			finalLetterGrade = "A"; 
		else 
			if (( finalNumericGrade >= 80) & (finalNumericGrade < 90)) 
				finalLetterGrade = "B";
		else 
			if (( finalNumericGrade >= 70) & (finalNumericGrade < 80)) 
				finalLetterGrade = "C"; 
		else 
			if (( finalNumericGrade >= 60) & (finalNumericGrade < 70)) 
				finalLetterGrade = "D"; 
		else 
			if (finalNumericGrade < 60) 
				finalLetterGrade = "F";
	}
	
	public void calculate() {
		
		midterm = Integer.parseInt(JOptionPane.showInputDialog
				("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog
				("Enter the Final Examination Grade"));
		research = Integer.parseInt(JOptionPane.showInputDialog
				("Enter the Research Grade"));
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
			if((finalNumericGrade >= 60) && (finalNumericGrade) < 70)
			finalLetterGrade = "D";
		else
			if(finalNumericGrade < 60)
				finalLetterGrade = "F";
					
	}
}

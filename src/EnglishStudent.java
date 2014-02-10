import javax.swing.JOptionPane;


public class EnglishStudent extends Student {
	private final double ENGLISH_MIDTERM_PERCENTAGE = .25;
	private final double ENGLISH_FINALEXAM_PERCENTAGE = .25;
	private final double ENGLISH_RESEARCH_PERCENTAGE = .30;
	private final double ENGLISH_PRESENTATION_PERCENTAGE = .20;
	
	public EnglishStudent(){
		System.out.println("EnglishStudent's Constructor");
	}
	
	public void calculate( int midterm, int finalExamGrade, 
			int research, int presentation) {
		finalNumericGrade = (midterm * ENGLISH_MIDTERM_PERCENTAGE) + 
		(finalExamGrade * ENGLISH_FINALEXAM_PERCENTAGE) + 
		(research * ENGLISH_RESEARCH_PERCENTAGE) + 
		(presentation * ENGLISH_PRESENTATION_PERCENTAGE); 
		if (finalNumericGrade >= 93) 
			finalLetterGrade = "A"; 
		else 
			if (( finalNumericGrade >= 85) & (finalNumericGrade < 93))
				finalLetterGrade = "B"; 
			else 
				if (( finalNumericGrade >= 78) & (finalNumericGrade < 85)) 
					finalLetterGrade = "C"; 
			else 
				if (( finalNumericGrade >= 70) & (finalNumericGrade < 78)) 
					finalLetterGrade = "D"; 
			else 
				if (finalNumericGrade < 70) 
					finalLetterGrade = "F";
	}
	
	public void calculate(){
		
		midterm = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the Final Examination Grade"));
		research = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the Research Grade"));
		presentation = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the Presentation Grade"));
		
		finalNumericGrade = (midterm * ENGLISH_MIDTERM_PERCENTAGE) + 
				(finalExamGrade * ENGLISH_FINALEXAM_PERCENTAGE) +
				(research * ENGLISH_RESEARCH_PERCENTAGE) + 
				(presentation * ENGLISH_PRESENTATION_PERCENTAGE);
			
			if(finalNumericGrade >= 93)
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
				if(finalNumericGrade < 70)
					finalLetterGrade = "F";
		
	}

}

import javax.swing.JOptionPane;


public abstract class Student {
	
	protected int midterm = 0;
	protected int finalExamGrade = 0;
	protected int research = 0;
	protected int presentation = 0;
	protected double finalNumericGrade = 0;
	protected String finalLetterGrade = "";
	
	protected void setMidterm(int temp){
		
		if(temp < 0 || temp > 100){
			JOptionPane.showMessageDialog(null, 
				"Invalid Midterm Grade" + temp +
				"Program Terminating");
			System.exit(0);
		}
		else
			midterm = temp;
	}
	
	protected int getMidterm(){
		return midterm;
	}
	
	protected void setFinalExamGrade(int temp){
		if(temp < 0 || temp > 100){
			JOptionPane.showMessageDialog(null, 
				"Invalid Final Exam Grade" + temp +
				"Program Terminating");
			System.exit(0);
		}
		else
			finalExamGrade = temp;
	}
	
	protected int getFinalExamGrade(){
		return finalExamGrade;
	}
	
	protected void setResearch(int temp){
		if(temp < 0 || temp > 100){
			JOptionPane.showMessageDialog(null, 
				"Invalid Research Grade" + temp +
			    "Program Terminating");
			System.exit(0);
		}
		else
			research = temp;
	}
	
	protected int getResearch(){
		return research;
	}
	
	protected void setPresentation(int temp){
		if(temp < 0 || temp > 100){
			JOptionPane.showMessageDialog(null, 
				"Invlaid Presentation Grade" + temp +
				"Program Terminating");
			System.exit(0);
		}
		else 
			presentation = temp;
	}
	
	protected int getPresentation(){
		return presentation;
	}
	
	protected double getFinalNumericGrade(){
		return finalNumericGrade;
	}
	
	protected String getFinalLetterGrade(){
		return finalLetterGrade;
	}
	
	abstract void calculate();
}

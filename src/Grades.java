import javax.swing.JOptionPane;


public class Grades {
	
	public static void main(String[] args) {
			
		String moreGradesToCalculate;
		String response;
			
		moreGradesToCalculate = JOptionPane.showInputDialog("Do you want to calculate a grade?");
		moreGradesToCalculate = moreGradesToCalculate.toUpperCase();
			
		while(moreGradesToCalculate.equals("YES")){
			response = whatKindOfStudent();
			
			switch(Integer.parseInt(response)){
				case 1:
					EnglishStudent eStudent = new EnglishStudent();
					eStudent.calculate();
					DisplayGrade x = new DisplayGrade(eStudent.midterm, 
						eStudent.finalExamGrade,
						eStudent.research,
						eStudent.presentation,
						eStudent.finalNumericGrade,
						eStudent.finalLetterGrade);
					break;
				case 2:
					MathStudent mStudent = new MathStudent();
					mStudent.calculate();
					DisplayGrade y = new DisplayGrade(mStudent.midterm,
						mStudent.finalExamGrade,
						mStudent.finalNumericGrade, 
						mStudent.finalLetterGrade);
					break;
				case 3:
					ScienceStudent sStudent = new ScienceStudent();
					sStudent.calculate();
					DisplayGrade z = new DisplayGrade(sStudent.midterm, 
						sStudent.finalExamGrade, 
						sStudent.research, 
						sStudent.finalNumericGrade, 
						sStudent.finalLetterGrade);
					break;
				default:
					JOptionPane.showMessageDialog(null, response + 
							" - is not a valid student type");
					System.exit(0);
			}//end of switch
			
			moreGradesToCalculate = JOptionPane.showInputDialog
					("Do you have another grade to calculate?");
			moreGradesToCalculate = moreGradesToCalculate.toUpperCase();
		}//end of while
		
		JOptionPane.showMessageDialog(null, 
				"Thanks for using the Grades Calculation program!");
		
		System.exit(0);	
	} //end of main

	public static String whatKindOfStudent(){
		String response;
		response = JOptionPane.showInputDialog
				("Enter student type (1=English, 2=Math, 3=Science)");
			
		if(response == null){
			JOptionPane.showMessageDialog
			(null, "You clicked on the Cancel button");
			System.exit(0);
		}
		else if(response.equals("")){
			JOptionPane.showMessageDialog
			(null, "You must make an entry in the InputBox");
			System.exit(0);
		}
		else if(Integer.parseInt(response) < 1 || 
				Integer.parseInt(response) > 3) {
			JOptionPane.showMessageDialog
			(null, response + " - is not a valid student type");
			System.exit(0);
		}	
		return response;
	}//end of whatKindOfStudent method
	
}//end of class
									

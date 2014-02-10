import javax.swing.JOptionPane;


public class Grades {
	
	public static void main(String[] args) {
			
		String moreGradesToCalculate;
		String response;
		double grades[] = new double[1000];
		double accumulator = 0;
		int counter = 0;
		double average = 0;
			
		moreGradesToCalculate = JOptionPane.showInputDialog("Do you want to calculate a grade?");
		moreGradesToCalculate = moreGradesToCalculate.toUpperCase();
			
		while(moreGradesToCalculate.equals("YES")){
			response = whatKindOfStudent();
			
			switch(Integer.parseInt(response)){
				case 1:
					EnglishStudent eStudent = new EnglishStudent();
					eStudent.calculate();
					grades[counter] = eStudent.getFinalNumericGrade();
					counter++;
					
					DisplayGrade x = new DisplayGrade(eStudent.getMidterm(), 
						eStudent.getFinalExamGrade(),
						eStudent.getResearch(),
						eStudent.getPresentation(),
						eStudent.getFinalNumericGrade(),
						eStudent.getFinalLetterGrade());
					break;
				case 2:
					MathStudent mStudent = new MathStudent();
					mStudent.calculate();
					grades[counter] = mStudent.getFinalNumericGrade();
					counter++;
					
					DisplayGrade y = new DisplayGrade(mStudent.getMidterm(),
						mStudent.getFinalExamGrade(),
						mStudent.getFinalNumericGrade(), 
						mStudent.getFinalLetterGrade());
					break;
				case 3:
					ScienceStudent sStudent = new ScienceStudent();
					sStudent.calculate();
					grades[counter] = sStudent.getFinalNumericGrade();
					counter++;
					
					DisplayGrade z = new DisplayGrade(sStudent.getMidterm(), 
						sStudent.getFinalExamGrade(), 
						sStudent.getResearch(), 
						sStudent.getFinalNumericGrade(), 
						sStudent.getFinalLetterGrade());
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
		
		for (int row = 0; row < counter; row++){
			System.out.println(grades[row]);
			accumulator = accumulator + grades[row];
		}
		average = accumulator / counter;
		JOptionPane.showMessageDialog(null, "The class average is " + average);
		
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
									

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ResetButtonListener implements ActionListener{
	DrawGUI x;
	ResetButtonListener(DrawGUI a){
	x = a;
	}
	
	public void actionPerformed(ActionEvent e) {
		x.radEnglish.doClick(); 
		x.txtMidterm.setVisible(true);
		x.txtFinalExam.setVisible(true);
		x.txtResearch.setVisible(true);
		x.txtPresentation.setVisible(true); 
		x.txtMidterm.setText("");
		x.txtFinalExam.setText("");
		x.txtResearch.setText("");
		x.txtPresentation.setText("");
		x.lblFinalGrade.setText("");
		x.lblStudentType.setText(" ENGLISH STUDENT");
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RadioButtonListener implements ActionListener {
	
	DrawGUI x;
	RadioButtonListener(DrawGUI a){
		x = a;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("English Student")){
			x.txtMidterm.setVisible(true);
			x.txtFinalExam.setVisible(true);
			x.txtResearch.setVisible(true);
			x.txtPresentation.setVisible(true);
			x.lblStudentType.setText("ENGLISH STUDENT");
		}
		if(e.getActionCommand().equals("Math Student")){
			x.txtMidterm.setVisible(true);
			x.txtFinalExam.setVisible(true);
			x.txtResearch.setVisible(false);
			x.txtPresentation.setVisible(false);
			x.lblStudentType.setText("MATH STUDENT");
		}
		if(e.getActionCommand().equals("Science Student")){
			x.txtMidterm.setVisible(true);
			x.txtFinalExam.setVisible(true);
			x.txtResearch.setVisible(true);
			x.txtPresentation.setVisible(false);
			x.lblStudentType.setText("SCIENCE STUDENT");
		}
	}

}

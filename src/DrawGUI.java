import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class DrawGUI extends JFrame {

	JButton btnCalculate = new JButton("Calculate Grade");
	JButton btnReset = new JButton("Reset");
	JRadioButton radEnglish = new JRadioButton("English Student", true);
	JRadioButton radMath = new JRadioButton("Math Student", false);
	JRadioButton radScience = new JRadioButton("Science Student", false);
	
	JLabel lblMidterm = new JLabel("Midterm", JLabel.CENTER);
	JLabel lblFinalExam = new JLabel("Final Exam", JLabel.CENTER);
	JLabel lblResearch = new JLabel("Research Paper", JLabel.CENTER);
	JLabel lblPresentation = new JLabel("Research Paper", JLabel.CENTER);
	JLabel lblTypes = new JLabel("Student Types", JLabel.CENTER);
	JLabel lblGrades = new JLabel("Grades", JLabel.CENTER);
	JLabel lblStudentType = new JLabel("ENGLISH STUDENT", JLabel.CENTER);
	JLabel lblFinalGrade = new JLabel("", JLabel.CENTER);
	
	JTextField txtMidterm = new JTextField();
	JTextField txtFinalExam = new JTextField();
	JTextField txtResearch = new JTextField();
	JTextField txtPresentation = new JTextField();
	
	ButtonGroup radioGroup = new ButtonGroup();
	
	RadioButtonListener rbListener = new RadioButtonListener(this);
	CalculateButtonListener cbListener = new CalculateButtonListener(this);
	ResetButtonListener resetListener = new ResetButtonListener(this);
	FrameListener fListener = new FrameListener();
	
	DrawGUI(){
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(txtMidterm);
		c.add(txtFinalExam);
		c.add(txtResearch);
		c.add(txtPresentation);
		
		c.add(lblTypes);
		c.add(lblMidterm);
		c.add(lblFinalExam);
		c.add(lblResearch);
		c.add(lblPresentation);
		c.add(lblStudentType);
		c.add(lblGrades);
		c.add(lblFinalGrade);
		c.add(lblStudentType);
		c.add(btnCalculate);
		c.add(btnReset);
		
		c.add(radEnglish);
		c.add(radMath);
		c.add(radScience);
		
		radioGroup.add(radEnglish);
		radioGroup.add(radMath);
		radioGroup.add(radScience);
		
		radEnglish.addActionListener(rbListener);
		radMath.addActionListener(rbListener);
		radScience.addActionListener(rbListener);
		btnCalculate.addActionListener(cbListener);
		btnReset.addActionListener(resetListener);
		this.addWindowListener(fListener);
		
		radEnglish.setBounds(1,50,150,40);
		radMath.setBounds(1,100,150,40);
		radScience.setBounds(1,150,150,40);
		
		lblTypes.setBounds(0,0,200,40);
		lblGrades.setBounds(150,0,100,40);
		lblStudentType.setBounds(250,0,200,40);
		lblMidterm.setBounds(150,50,100,40);
		lblFinalExam.setBounds(150,100,100,40);
		lblResearch.setBounds(150,150,100,40);
		lblPresentation.setBounds(150,200,100,40);
		lblFinalGrade.setBounds(225,250,250,40);
		
		txtMidterm.setBounds(300,50,50,40);
		txtFinalExam.setBounds(300,100,50,40);
		txtResearch.setBounds(300,150,50,40);
		txtPresentation.setBounds(300,200,50,40);
		
		btnCalculate.setBounds(50,250,160,40);
		btnReset.setBounds(50,300,160,40);
		
		setSize(500,450);
		setTitle("Grade Calculator");
		setVisible(true);
		setResizable(false);
		
	}
	
}

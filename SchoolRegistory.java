//Created by Adnan Moinul Haq
//Date : 01.10.2021 10:00PM

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class SchoolRegistory {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolRegistory window = new SchoolRegistory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SchoolRegistory() {
		initialize();
	}
	private String[] header = {"Name","Age","Gender","Grade","Salary","Type"};
	private DefaultTableModel dtm = new DefaultTableModel(null, header);
	private JTextField TeacherName;
	private JTextField TeacherAge;
	private JTextField TeacherSalary;
	private JTextField StudentName;
	private JTextField StudentAge;
	private JTextField StudentGrade;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTable table = new JTable(dtm);
		table.setBorder(new LineBorder(Color.BLACK));
		table.setShowGrid(false);
		table.setBackground(Color.WHITE);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		
		JLabel TeacherLabel = new JLabel("Teacher Information");
		TeacherLabel.setForeground(Color.BLUE);
		TeacherLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("NAME :");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		TeacherName = new JTextField();
		TeacherName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("AGE :");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		TeacherAge = new JTextField();
		TeacherAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SALARY :");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		TeacherSalary = new JTextField();
		TeacherSalary.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER :");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JRadioButton TeacherMale = new JRadioButton("MALE");
		
		JRadioButton TeacherFemale = new JRadioButton("FEMALE");
		
		JButton TeacherBtn = new JButton("ADD");
		TeacherBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TeacherMale.isSelected()) {
					addTeacher("Male");
				}else if(TeacherFemale.isSelected()) {
					addTeacher("Female");
				}
			}
		});
		
		JLabel StudentLabel = new JLabel("Student Information");
		StudentLabel.setForeground(Color.BLUE);
		StudentLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		JLabel lblNewLabel_4 = new JLabel("NAME :");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_1 = new JLabel("AGE :");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_1 = new JLabel("GRADE :");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("GENDER :");
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		StudentName = new JTextField();
		StudentName.setColumns(10);
		
		StudentAge = new JTextField();
		StudentAge.setColumns(10);
		
		StudentGrade = new JTextField();
		StudentGrade.setColumns(10);
		
		JRadioButton StudentMale = new JRadioButton("MALE");
		
		JRadioButton StudentFemale = new JRadioButton("FEMALE");
		
		JButton StudentBtn = new JButton("ADD");
		StudentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(StudentMale.isSelected()) {
					addStudent("Male");
				}else if(StudentFemale.isSelected()) {
					addStudent("Female");
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(TeacherLabel)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
									.addComponent(TeacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
									.addComponent(TeacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
									.addComponent(TeacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(29)
											.addComponent(TeacherBtn))
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addComponent(StudentLabel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(TeacherMale)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(TeacherFemale))
											.addComponent(StudentName, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
											.addComponent(StudentAge, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
											.addComponent(StudentGrade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))))
							.addGap(68))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(256, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(268, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1)
							.addContainerGap(243, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(StudentMale, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(StudentFemale, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(71, Short.MAX_VALUE))))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(106)
					.addComponent(StudentBtn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(129, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(TeacherLabel)
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(TeacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(TeacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(TeacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(TeacherMale)
						.addComponent(TeacherFemale))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(TeacherBtn)
					.addGap(18)
					.addComponent(StudentLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(StudentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(StudentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(StudentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(StudentMale)
						.addComponent(StudentFemale))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(StudentBtn)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	
	public void addTeacher(String gender) {
		Teacher teacher = new Teacher();
		teacher.setName(TeacherName.getText());
		teacher.setAge(Integer.parseInt(TeacherAge.getText()));
		teacher.setSalary(Integer.parseInt(TeacherSalary.getText()));
		teacher.setGender(gender);
		
		dtm.addRow(new Object[] {
				teacher.getName(),
				teacher.getAge(),
				teacher.getGender(),
				"N/A",
				teacher.getSalary(),
				teacher.myType()
		});
	}
	
	public void addStudent(String gender) {
		Student student = new Student();
		student.setName(StudentName.getText());
		student.setAge(Integer.parseInt(StudentAge.getText()));
		student.setGrade(Float.parseFloat(StudentGrade.getText()));
		student.setGender(gender);
		
		dtm.addRow(new Object[] {
				student.getName(),
				student.getAge(),
				student.getGender(),
				student.getGrade(),
				"N/A",
				student.myType()
		});
	}
	
}

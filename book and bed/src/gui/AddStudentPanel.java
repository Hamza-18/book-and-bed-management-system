package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Date;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.Student;

public class AddStudentPanel extends JPanel {

	private JPanel panel;

	private JLabel lblFatherName_1;
	private JLabel lblNewLabel_1;
	private JLabel lblGender;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel residentLabel;

	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private ButtonGroup gender;

	private JTextField studentName;
	private JTextField fatherName;
	private JTextField studentId;
	private JTextField studentNumber;
	private JTextField guardianNumber;
	private JTextField studentEmail;
	private JTextField studentBlood;
	private JTextField address;
	private JTextField city;
	private JComboBox employmentType;
	private JTextField university;
	private JTextField semester;
	private JDatePickerImpl admissionDate;
	private JTextField rent;
	private JTextField securityFee;
	private JTextField roomNumber;
	private JTextField department;
	private JComboBox resident;

	private UtilDateModel model;

	private boolean updateStudent;

	public AddStudentPanel() {
		updateStudent = false;
		createPanel();
	}

	public AddStudentPanel(Student student) {
		updateStudent = true;
		createPanel();
		studentId.setText(student.getId());
		studentName.setText(student.getName());
		fatherName.setText(student.getFatherName());

		if (student.getGender().equals("Male")) {
			maleRadioBtn.setSelected(true);
		} else {
			femaleRadioBtn.setSelected(true);
		}

		studentNumber.setText(student.getStudentNumber());
		guardianNumber.setText(student.getGuardianNumber());
		studentEmail.setText(student.getStudentEmail());
		studentBlood.setText(student.getBloodGroup());
		address.setText(student.getAddress());
		city.setText(student.getCity());

		if (student.getEmployment().equals("Employed")) {
			employmentType.setSelectedIndex(0);
		} else {
			employmentType.setSelectedIndex(1);
		}

		university.setText(student.getUniversity());
		semester.setText(student.getSemester());
		department.setText(student.getDepartment());
		java.util.Date date = student.getAdmissionDate();
		model.setValue(date);
		rent.setText(student.getRent());
		securityFee.setText(student.getSecurityFee());
		roomNumber.setText(student.getRoomNumber());

		if (student.getResident().equals("Yes")) {
			resident.setSelectedIndex(0);
		} else {
			resident.setSelectedIndex(1);
		}

	}

	public void createPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));

		panel = new JPanel();
		add(new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER),
				BorderLayout.CENTER);

		panel.setBackground(new Color(255, 255, 255));
		panel.setMaximumSize(new Dimension(640, 650));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 113, 163, 154, 154, 0 };
		gbl_panel.rowHeights = new int[] { 80, 56, 40, 80, 81, 85, 73, 80, 72, 90, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		gbc_lblNewLabel.anchor = GridBagConstraints.LINE_END;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		studentName = new JTextField();
		studentName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		studentName.setFont(new Font("Dialog", Font.PLAIN, 14));
		GridBagConstraints gbc_studentName = new GridBagConstraints();
		gbc_studentName.insets = new Insets(0, 0, 5, 5);
		gbc_studentName.gridx = 1;
		gbc_studentName.gridy = 0;
		gbc_studentName.anchor = GridBagConstraints.WEST;
		panel.add(studentName, gbc_studentName);
		studentName.setColumns(10);

		JLabel lblFatherName = new JLabel("Father Name:");
		lblFatherName.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFatherName = new GridBagConstraints();
		gbc_lblFatherName.fill = GridBagConstraints.VERTICAL;
		gbc_lblFatherName.insets = new Insets(0, 0, 10, 10);
		gbc_lblFatherName.gridx = 2;
		gbc_lblFatherName.gridy = 0;
		gbc_lblFatherName.anchor = GridBagConstraints.LINE_END;
		panel.add(lblFatherName, gbc_lblFatherName);

		fatherName = new JTextField();
		fatherName.setFont(new Font("Dialog", Font.PLAIN, 14));
		fatherName.setColumns(10);
		fatherName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_fatherName = new GridBagConstraints();
		gbc_fatherName.anchor = GridBagConstraints.WEST;
		gbc_fatherName.insets = new Insets(0, 0, 5, 10);
		gbc_fatherName.gridx = 3;
		gbc_fatherName.gridy = 0;
		panel.add(fatherName, gbc_fatherName);
		fatherName.setColumns(10);

		lblNewLabel_1 = new JLabel("CNIC:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		studentId = new JTextField();
		studentId.setFont(new Font("Dialog", Font.PLAIN, 14));
		studentId.setColumns(10);
		studentId.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_studentId = new GridBagConstraints();
		gbc_studentId.insets = new Insets(0, 0, 5, 5);
		gbc_studentId.gridx = 1;
		gbc_studentId.gridy = 1;
		gbc_studentId.anchor = GridBagConstraints.WEST;
		panel.add(studentId, gbc_studentId);

		lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 2;
		gbc_lblGender.gridy = 1;
		gbc_lblGender.anchor = GridBagConstraints.LINE_END;
		panel.add(lblGender, gbc_lblGender);

		maleRadioBtn = new JRadioButton("Male");
		GridBagConstraints gbc_maleRadioBtn = new GridBagConstraints();
		gbc_maleRadioBtn.anchor = GridBagConstraints.WEST;
		gbc_maleRadioBtn.insets = new Insets(0, 0, 5, 0);
		gbc_maleRadioBtn.gridx = 3;
		gbc_maleRadioBtn.gridy = 1;
		panel.add(maleRadioBtn, gbc_maleRadioBtn);

		femaleRadioBtn = new JRadioButton("Female");
		GridBagConstraints gbc_femaleRadioBtn = new GridBagConstraints();
		gbc_femaleRadioBtn.anchor = GridBagConstraints.WEST;
		gbc_femaleRadioBtn.insets = new Insets(0, 0, 5, 0);
		gbc_femaleRadioBtn.gridx = 3;
		gbc_femaleRadioBtn.gridy = 2;
		panel.add(femaleRadioBtn, gbc_femaleRadioBtn);

		maleRadioBtn.setPreferredSize(femaleRadioBtn.getPreferredSize());
		maleRadioBtn.setSelected(true);
		maleRadioBtn.setActionCommand("Male");
		femaleRadioBtn.setActionCommand("Female");
		gender = new ButtonGroup();
		gender.add(maleRadioBtn);
		gender.add(femaleRadioBtn);

		lblNewLabel_2 = new JLabel(" Number:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		studentNumber = new JTextField();
		studentNumber.setFont(new Font("Dialog", Font.PLAIN, 14));
		studentNumber.setColumns(10);
		studentNumber.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_studentNumber = new GridBagConstraints();
		gbc_studentNumber.anchor = GridBagConstraints.WEST;
		gbc_studentNumber.insets = new Insets(0, 0, 5, 5);
		gbc_studentNumber.gridx = 1;
		gbc_studentNumber.gridy = 3;
		panel.add(studentNumber, gbc_studentNumber);

		lblNewLabel_3 = new JLabel("Guardian Number:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		guardianNumber = new JTextField();
		guardianNumber.setFont(new Font("Dialog", Font.PLAIN, 14));
		guardianNumber.setColumns(10);
		guardianNumber.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_guardianNumber = new GridBagConstraints();
		gbc_guardianNumber.anchor = GridBagConstraints.WEST;
		gbc_guardianNumber.insets = new Insets(0, 0, 5, 0);
		gbc_guardianNumber.gridx = 3;
		gbc_guardianNumber.gridy = 3;
		panel.add(guardianNumber, gbc_guardianNumber);

		lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		studentEmail = new JTextField();
		studentEmail.setFont(new Font("Dialog", Font.PLAIN, 14));
		studentEmail.setColumns(10);
		studentEmail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_studentEmail = new GridBagConstraints();
		gbc_studentEmail.anchor = GridBagConstraints.WEST;
		gbc_studentEmail.insets = new Insets(0, 0, 5, 5);
		gbc_studentEmail.gridx = 1;
		gbc_studentEmail.gridy = 4;
		panel.add(studentEmail, gbc_studentEmail);

		lblNewLabel_5 = new JLabel("Blood Group:");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.BELOW_BASELINE_TRAILING;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 4;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		studentBlood = new JTextField();
		studentBlood.setFont(new Font("Dialog", Font.PLAIN, 14));
		studentBlood.setColumns(10);
		studentBlood.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_studentBlood = new GridBagConstraints();
		gbc_studentBlood.anchor = GridBagConstraints.WEST;
		gbc_studentBlood.insets = new Insets(0, 0, 5, 0);
		gbc_studentBlood.gridx = 3;
		gbc_studentBlood.gridy = 4;
		panel.add(studentBlood, gbc_studentBlood);

		lblNewLabel_6 = new JLabel("Address:");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);

		address = new JTextField();
		address.setFont(new Font("Dialog", Font.PLAIN, 14));
		address.setColumns(10);
		address.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_address = new GridBagConstraints();
		gbc_address.insets = new Insets(0, 0, 5, 5);
		gbc_address.fill = GridBagConstraints.HORIZONTAL;
		gbc_address.gridx = 1;
		gbc_address.gridy = 5;
		panel.add(address, gbc_address);

		lblNewLabel_7 = new JLabel("City:");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 5;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);

		city = new JTextField();
		city.setFont(new Font("Dialog", Font.PLAIN, 14));
		city.setColumns(10);
		city.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_city = new GridBagConstraints();
		gbc_city.insets = new Insets(0, 0, 5, 0);
		gbc_city.anchor = GridBagConstraints.WEST;
		gbc_city.gridx = 3;
		gbc_city.gridy = 5;
		panel.add(city, gbc_city);

		lblNewLabel_8 = new JLabel("Employment:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 6;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);

		employmentType = new JComboBox();
		DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
		comboModel.addElement("Employed");
		comboModel.addElement("Unemployed");
		employmentType.setModel(comboModel);
		employmentType.setFont(new Font("Dialog", Font.PLAIN, 14));
		employmentType.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_employmentType = new GridBagConstraints();
		gbc_employmentType.insets = new Insets(0, 0, 5, 5);
		gbc_employmentType.fill = GridBagConstraints.HORIZONTAL;
		gbc_employmentType.gridx = 1;
		gbc_employmentType.gridy = 6;
		panel.add(employmentType, gbc_employmentType);

		lblNewLabel_9 = new JLabel("University:");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 6;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);

		university = new JTextField();
		university.setFont(new Font("Dialog", Font.PLAIN, 14));
		university.setColumns(10);
		university.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_university = new GridBagConstraints();
		gbc_university.insets = new Insets(0, 0, 5, 0);
		gbc_university.anchor = GridBagConstraints.WEST;
		gbc_university.gridx = 3;
		gbc_university.gridy = 6;
		panel.add(university, gbc_university);

		lblNewLabel_10 = new JLabel("Semester:");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 7;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);

		semester = new JTextField();
		semester.setFont(new Font("Dialog", Font.PLAIN, 14));
		semester.setColumns(10);
		semester.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_semester = new GridBagConstraints();
		gbc_semester.insets = new Insets(0, 0, 5, 5);
		gbc_semester.fill = GridBagConstraints.HORIZONTAL;
		gbc_semester.gridx = 1;
		gbc_semester.gridy = 7;
		panel.add(semester, gbc_semester);

		lblNewLabel_15 = new JLabel("Department:");
		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 2;
		gbc_lblNewLabel_15.gridy = 7;
		panel.add(lblNewLabel_15, gbc_lblNewLabel_15);

		department = new JTextField();
		department.setFont(new Font("Dialog", Font.PLAIN, 14));
		department.setColumns(10);
		department.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_department = new GridBagConstraints();
		gbc_department.anchor = GridBagConstraints.WEST;
		gbc_department.insets = new Insets(0, 0, 5, 0);
		gbc_department.gridx = 3;
		gbc_department.gridy = 7;
		panel.add(department, gbc_department);

		lblNewLabel_11 = new JLabel("Date:");
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 8;
		panel.add(lblNewLabel_11, gbc_lblNewLabel_11);

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		model = new UtilDateModel();
		model.setSelected(true);
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		admissionDate = new JDatePickerImpl(datePanel, new DateLabelFormatter());

		GridBagConstraints gbc_admissionDate = new GridBagConstraints();
		gbc_admissionDate.insets = new Insets(0, 0, 5, 5);
		gbc_admissionDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_admissionDate.gridx = 1;
		gbc_admissionDate.gridy = 8;
		panel.add(admissionDate, gbc_admissionDate);

		lblNewLabel_12 = new JLabel("Rent:");
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 2;
		gbc_lblNewLabel_12.gridy = 8;
		panel.add(lblNewLabel_12, gbc_lblNewLabel_12);

		rent = new JTextField();
		rent.setFont(new Font("Dialog", Font.PLAIN, 14));
		rent.setColumns(10);
		rent.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_rent = new GridBagConstraints();
		gbc_rent.anchor = GridBagConstraints.WEST;
		gbc_rent.insets = new Insets(0, 0, 5, 0);
		gbc_rent.gridx = 3;
		gbc_rent.gridy = 8;
		panel.add(rent, gbc_rent);

		lblNewLabel_13 = new JLabel("Security:");
		lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 10, 0, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 9;
		panel.add(lblNewLabel_13, gbc_lblNewLabel_13);

		securityFee = new JTextField();
		securityFee.setFont(new Font("Dialog", Font.PLAIN, 14));
		securityFee.setColumns(10);
		securityFee.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_securityFee = new GridBagConstraints();
		gbc_securityFee.insets = new Insets(0, 10, 0, 5);
		gbc_securityFee.fill = GridBagConstraints.HORIZONTAL;
		gbc_securityFee.gridx = 1;
		gbc_securityFee.gridy = 9;
		panel.add(securityFee, gbc_securityFee);

		lblNewLabel_14 = new JLabel("Room:");
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 10, 0, 5);
		gbc_lblNewLabel_14.gridx = 2;
		gbc_lblNewLabel_14.gridy = 9;
		panel.add(lblNewLabel_14, gbc_lblNewLabel_14);

		roomNumber = new JTextField();
		roomNumber.setFont(new Font("Dialog", Font.PLAIN, 14));
		roomNumber.setColumns(10);
		roomNumber.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_roomNumber = new GridBagConstraints();
		gbc_roomNumber.anchor = GridBagConstraints.WEST;
		gbc_roomNumber.gridx = 3;
		gbc_roomNumber.gridy = 9;
		panel.add(roomNumber, gbc_roomNumber);

		if (updateStudent) {
			residentLabel = new JLabel("Resident:");
			residentLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
			GridBagConstraints gbc_residentLabel = new GridBagConstraints();
			gbc_residentLabel.anchor = GridBagConstraints.EAST;
			gbc_residentLabel.insets = new Insets(0, 10, 0, 5);
			gbc_residentLabel.gridx = 0;
			gbc_residentLabel.gridy = 10;
			panel.add(residentLabel, gbc_residentLabel);

			resident = new JComboBox();
			DefaultComboBoxModel residentModel = new DefaultComboBoxModel();
			residentModel.addElement("Yes");
			residentModel.addElement("No");
			resident.setModel(residentModel);
			resident.setFont(new Font("Dialog", Font.PLAIN, 14));
			resident.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			GridBagConstraints gbc_resident = new GridBagConstraints();
			gbc_resident.anchor = GridBagConstraints.WEST;
			gbc_resident.gridx = 1;
			gbc_resident.gridy = 10;
			panel.add(resident, gbc_resident);
		}
		setVisible(true);

	}

	public Student getData() {
		Student student;

		String id = studentId.getText();
		String name = studentName.getText();
		String father = this.fatherName.getText();
		String studentGender = gender.getSelection().getActionCommand();
		String studentPhone = this.studentNumber.getText();
		String guardianPhone = this.guardianNumber.getText();
		String email = this.studentEmail.getText();
		String bloodGroup = this.studentBlood.getText();
		String studentAddresss = this.address.getText();
		String studentCity = this.city.getText();
		String employement = (String) employmentType.getSelectedItem();
		String studentUniversity = this.university.getText();
		String studentSemester = this.semester.getText();
		String studentDepartment = this.department.getText();
		Date studentAdmissionDate = getDate();
		String studentRent = this.rent.getText();
		String studentSecurityFee = this.securityFee.getText();
		String room = this.roomNumber.getText();
		if (id.equals("")) {
			student = new Student(name, father, studentGender, studentPhone, guardianPhone, email, bloodGroup,
					studentAddresss, studentCity, employement, studentUniversity, studentSemester, studentDepartment,
					studentAdmissionDate, studentRent, studentSecurityFee, room);
		} else {
			student = new Student(id, name, father, studentGender, studentPhone, guardianPhone, email, bloodGroup,
					studentAddresss, studentCity, employement, studentUniversity, studentSemester, studentDepartment,
					studentAdmissionDate, studentRent, studentSecurityFee, room);
		}
		return student;
	}

	public Date getDate() {
		String month = (admissionDate.getModel().getMonth() + 1) + "";
		String day = admissionDate.getModel().getDay() + "";
		String year = admissionDate.getModel().getYear() + "";
		if (month.length() == 1) {
			month = "0" + month;
		}
		if (day.length() == 1) {
			day = "0" + day;
		}

		return Date.valueOf(year + "-" + month + "-" + day);

	}

	public void Reset() {
		studentName.setText("");
		fatherName.setText("");
		studentId.setText("");
		studentNumber.setText("");
		guardianNumber.setText("");
		studentEmail.setText("");
		studentBlood.setText("");
		address.setText("");
		city.setText("");
		university.setText("");
		semester.setText("");
		rent.setText("");
		securityFee.setText("");
		roomNumber.setText("");
		department.setText("");

	}

}

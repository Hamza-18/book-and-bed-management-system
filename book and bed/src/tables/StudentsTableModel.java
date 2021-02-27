package tables;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Student;

public class StudentsTableModel extends AbstractTableModel {
	private ArrayList<Student> studentsList;
	private String[] columnNames = { "StudentId", "StudentName", "StudentNumber", "RoomNumber", "Rent", "SecurityFee",
			"RentPaid", "RentDate", "University", "Department", "Semester", "AdmissionDate", "Gender", "FatherName",
			"GuardianNumber", "Address", "City", "Email", "BloodGroup", "Employment", "Resident" };

	public StudentsTableModel() {
		studentsList = new ArrayList<>();
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public void setList(ArrayList<Student> list) {
		studentsList = list;
	}

	public ArrayList<Student> getList() {
		return studentsList;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return studentsList.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Student student = studentsList.get(row);
		String[] columnNames = { "StudentId", "StudentName", "StudentNumber", "RoomNumber", "Rent", "SecurityFee",
				"University", "Department", "Semester", "AdmissionDate", "Gender", "FatherName", "GuardianNumber",
				"Address", "City", "Email", "BloodGroup", "Employment", "Resident" };
		switch (col) {
		case 0:
			return student.getId();

		case 1:
			return student.getName();
		case 2:
			return student.getStudentNumber();
		case 3:
			return student.getRoomNumber();
		case 4:
			return student.getRent();
		case 5:
			return student.getSecurityFee();
		case 6:
			return student.getRentPaid();
		case 7:
			return student.getRentDate();
		case 8:
			return student.getUniversity();
		case 9:
			return student.getDepartment();
		case 10:
			return student.getSemester();
		case 11:
			return student.getAdmissionDate();
		case 12:
			return student.getGender();
		case 13:
			return student.getFatherName();
		case 14:
			return student.getGuardianNumber();
		case 15:
			return student.getAddress();
		case 16:
			return student.getCity();
		case 17:
			return student.getStudentEmail();
		case 18:
			return student.getBloodGroup();
		case 19:
			return student.getEmployment();
		case 20:
			return student.getResident();
		}

		return null;
	}

}

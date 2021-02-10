package model;

import java.util.Date;

public class Student {
	private String Id;
	private String name;
	private String fatherName;
	private String gender;
	private String studentNumber;
	private String guardianNumber;
	private String emergencyNumber;
	private String studentEmail;
	private String bloodGroup;
	private String address;
	private String city;
	private String employment;
	private String university;
	private String semester;
	private String department;
	private Date admissionDate;
	private String rent;
	private String securityFee;
	private String roomNumber;
	private static int count = 0;

	public Student(String Id, String studentName, String fatherName, String gender, String studentNumber,

			String guardianNumber, String studentEmail, String bloodGroup, String address, String city,
			String employment, String university, String semester, String department, Date admissiondate, String rent,
			String securityFee, String roomNumber) {

		setId(Id);
		setName(studentName);
		setFatherName(fatherName);
		setGender(gender);
		setStudentNumber(studentNumber);
		setGuardianNumber(guardianNumber);
		setEmergencyNumber(emergencyNumber);
		setStudentEmail(studentEmail);
		setBloodGroup(bloodGroup);
		setAddress(address);
		setCity(city);
		setEmployment(employment);
		setUniversity(university);
		setSemester(semester);
		setDepartment(department);
		setAdmissionDate(admissiondate);
		setRent(rent);
		setSecurityFee(securityFee);
		setRoomNumber(roomNumber);
	}

	public Student(String studentName, String fatherName, String gender, String studentNumber, String guardianNumber,
			String studentEmail, String bloodGroup, String address, String city, String employment, String university,
			String semester, String department, Date admissiondate, String rent, String securityFee,
			String roomNumber) {

		this(count + "", studentName, fatherName, gender, studentNumber, guardianNumber, studentEmail, bloodGroup,
				address, city, employment, university, semester, department, admissiondate, rent, securityFee,
				roomNumber);
		this.count++;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		if (studentNumber.length() > 10)
			this.studentNumber = studentNumber;
	}

	public String getGuardianNumber() {
		return guardianNumber;
	}

	public void setGuardianNumber(String guardianNumber) {
//		if (guardianNumber.length() > 10)
		this.guardianNumber = guardianNumber;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(String emergencyNumber) {
//		if (emergencyNumber.length() > 10)
		this.emergencyNumber = emergencyNumber;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmployment() {
		return employment;
	}

	public void setEmployment(String employment) {
		this.employment = employment;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getSecurityFee() {
		return securityFee;
	}

	public void setSecurityFee(String securityFee) {
		this.securityFee = securityFee;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

}

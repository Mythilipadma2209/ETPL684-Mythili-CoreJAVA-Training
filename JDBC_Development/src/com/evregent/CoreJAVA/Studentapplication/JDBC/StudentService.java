package com.evregent.CoreJAVA.Studentapplication.JDBC;
public class StudentService {
	public int addStudentService(int studentId, String studentName, float studentMarks)
	{
		String remarks = "";

		if (studentMarks <= 40) {
			remarks = "Bad";
		} else if (studentMarks <= 60) {
			remarks = "Average";
		} else if (studentMarks <= 80) {
			remarks = "Good";
		} else {
			remarks = "Excellent";
		}

		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentId(studentId);
		studentBean.setStudentName(studentName);
		studentBean.setStudentmarks(studentMarks);
		studentBean.setRemark(remarks);

		int updateResult = studentDAO.addStudent(studentBean);
		return updateResult;
	}
}

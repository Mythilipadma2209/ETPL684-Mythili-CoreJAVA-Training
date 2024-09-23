package com.evregent.CoreJAVA.Studentapplication.JDBC;
import java.io.Serializable;

public class StudentBean implements Serializable {
	private int studentId;
	private String studentName;
	private float studentmarks;
	private String remark;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getStudentmarks() {
		return studentmarks;
	}
	public void setStudentmarks(float studentmarks) {
		this.studentmarks = studentmarks;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}	
}

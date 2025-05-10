package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;
    private String email;
    private String firstNme;
    private String lastName;
    private String address;
    private String lectureContact;
    private String lectureEmpId;
    private String studentRoleNumber;
    private String department;
    private String branchName;
    private String branchCode;
    private String roleName;
    private Integer otp;

    // Constructors
    public User() {
    }

    public User(String username, String password, String email, String firstNme, String lastName,
                String address, String lectureContact, String lectureEmpId, String studentRoleNumber,
                String department, String branchName, String branchCode, String roleName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstNme = firstNme;
        this.lastName = lastName;
        this.address = address;
        this.lectureContact = lectureContact;
        this.lectureEmpId = lectureEmpId;
        this.studentRoleNumber = studentRoleNumber;
        this.department = department;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.roleName = roleName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstNme() {
        return firstNme;
    }

    public void setFirstNme(String firstNme) {
        this.firstNme = firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLectureContact() {
        return lectureContact;
    }

    public void setLectureContact(String lectureContact) {
        this.lectureContact = lectureContact;
    }

    public String getLectureEmpId() {
        return lectureEmpId;
    }

    public void setLectureEmpId(String lectureEmpId) {
        this.lectureEmpId = lectureEmpId;
    }

    public String getStudentRoleNumber() {
        return studentRoleNumber;
    }

    public void setStudentRoleNumber(String studentRoleNumber) {
        this.studentRoleNumber = studentRoleNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}
}

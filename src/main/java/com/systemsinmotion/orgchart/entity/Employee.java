package com.systemsinmotion.orgchart.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1676017339639047503L;
	
	private Integer id;
	
	@NotNull
	@NotEmpty
	@Size(min = 1,max = 20)
	private String firstName;
	
	@NotNull
	@NotEmpty
	@Size(min = 1, max = 50)
	private String lastName;
	
	@Size(min = 1, max = 100)
	private String email;
	private String skypeName;
	
	private Boolean isManager;
	private Integer jobTitleId;
	private Integer departmentId;
	private Integer managerId;
	private Set<Employee> employees = new HashSet<Employee>(0);
	
//	getters and setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "FIRST_NAME", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "SKYPE_NAME", length = 100)
	public String getSkypeName() {
		return this.skypeName;
	}
	
	public void setSkypeName(String skypeName) {
		this.skypeName = skypeName;
	}
	
	@Column(name = "IS_MANAGER")
	public Boolean getIsManager() {
		return this.isManager;
	}
	
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	
	@Column(name = "JOB_TITLE_ID")
	public Integer getJobTitleId() {
		return this.jobTitleId;
	}
	
	public void setJobTitleId(Integer jobTitleId) {
		this.jobTitleId = jobTitleId;
	}
	
	@Column(name = "DEPARTMENT_ID")
	public Integer getDepartmentId() {
		return this.departmentId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	@Column(name = "MANAGER_ID")
	public Integer getManagerId() {
		return this.managerId;
	}
	
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	
	public Set<Employee> getEmployees() {
		return this.employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}

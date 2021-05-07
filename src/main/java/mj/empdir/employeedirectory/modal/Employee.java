package mj.empdir.employeedirectory.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_emp")
public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column
	 private Integer id;
	
	 @Column
	 private String first_name;
	
	 @Column
	 private String last_name;
	
	 @Column
	 private String email;

	 @Override
	 public String toString() {
	  return "Employee [id= " + id + ", first name=" + first_name + ", last name=" + last_name + ", email="
	    + email + "]";
	  
	 }
 
	public Integer getId() {
	  return id;
	 }
	
	public void setId(Integer id) {
	  this.id = id;
	 }
	
	public String getFirstName() {
	  return first_name;
	 }
	
	public void setFirstName(String first_name) {
	  this.first_name = first_name;
	 }
	
	public String getLastName() {
	  return last_name;
	 }
	
	public void setLastName(String last_name) {
	  this.last_name = last_name;
	 }
	
	public String getEmail() {
	  return email;
	 }
	
	public void setEmail(String email) {
	  this.email = email;
	 }


}
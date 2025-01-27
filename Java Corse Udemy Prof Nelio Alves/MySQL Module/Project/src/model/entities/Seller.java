package model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Seller implements Serializable {

	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private LocalDate birthDate;
	private Double baseSalary;

	private Department department;

	public Seller() {

	}

	public Seller(Integer id, String name, String email, LocalDate birthDate, Double baseSalary, Department department) {
		this.id         = id;
		this.name       = name;
		this.email      = email;
		this.birthDate  = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String convertDate(LocalDate birthDate) {
		return birthDate.format(dateFormatter);
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, birthDate, dateFormatter, department, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Seller other = (Seller) obj;
		return Objects.equals(baseSalary, other.baseSalary) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(dateFormatter, other.dateFormatter) && Objects.equals(department, other.department)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + convertDate(birthDate)
				+ ", baseSalary=" + baseSalary + ", department=" + department + "]";
	}

}

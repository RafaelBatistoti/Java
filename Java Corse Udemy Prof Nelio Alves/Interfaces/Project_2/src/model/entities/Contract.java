package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValue;

	private List<Installment> installmentList = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number     = number;
		this.date       = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallmentList() {
		return installmentList;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	

}

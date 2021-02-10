package model;

import java.util.Date;

public class Kitchen {
	private String month;
	private String expense;
	private Date date;

	public Kitchen(String month, String expense, Date date) {
		setDate(date);
		setExpense(expense);
		setMonth(month);
	}

	public Kitchen(String expense, Date date) {
		setDate(date);
		setExpense(expense);
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

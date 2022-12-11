// -------------------------------------------------------
// Assignment {4}
// Written by: {Mustafa Ahmad 40196075}
// For COMP 248 Section {EC} – Fall 2022
// --------------------------------------------------------
/* This class called Expense has attributes for the type of expense, the amount, 
 * the name of the business, and the due date. The class has several methods, 
 * including constructors, accessors and mutator methods for the attributes, 
 * a method for formatting the due date as a string, 
 * and a method for comparing two Expense objects for equality.
 */
package ass4;

public class Expense {
	
	    // attributes
	    private String expenseType;
	    private double amount;
	    private String businessName;
	    private int dueMonth;
	    private int dueDay;

	    // constructors
	    public Expense() {
	        this.expenseType = "";
	        this.amount = 0.0;
	        this.businessName = "";
	        this.dueMonth = 0;
	        this.dueDay = 0;
	    }

	    public Expense(String expenseType, double amount, String businessName, int dueMonth, int dueDay) {
	        this.expenseType = expenseType;
	        this.amount = amount;
	        this.businessName = businessName;
	        this.dueMonth = dueMonth;
	        this.dueDay = dueDay;
	    }

	    public Expense(Expense other) {
	        this.expenseType = other.expenseType;
	        this.amount = other.amount;
	        this.businessName = other.businessName;
	        this.dueMonth = other.dueMonth;
	        this.dueDay = other.dueDay;
	    }

	    // accessor methods
	    public String getexpenseType() {
	        return this.expenseType;
	    }

	    public double getAmount() {
	        return this.amount;
	    }

	    public String getBusinessName() {
	        return this.businessName;
	    }

	    public int getDueMonth() {
	        return this.dueMonth;
	    }

	    public int getDueDay() {
	        return this.dueDay;
	    }

	    // mutator methods
	    
	    public void setDueMonth(int dueMonth) {
	        if (dueMonth >= 1 && dueMonth <= 12) {
	            this.dueMonth = dueMonth;
	        } else {
	            this.dueMonth = 0;
	        }
	    }

		public void setExpenseType(String expenseType) {
			this.expenseType = expenseType;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public void setDueDay(int dueDay) {
	        if (dueDay >= 1 && dueDay <= 31) {
	            this.dueDay = dueDay;
	        } else {
	            this.dueDay = 0;
	        }
	    }

	    // toString method
	    public String toString() {
	        String dueDate = String.format("%02d/%02d", this.dueDay, this.dueMonth);
	        return "Expense Type: " + this.expenseType + ", Business Name: " + this.businessName + ", Due Date: " + dueDate;
	    }

	    // equals method
	    public boolean equals(Expense other) {
	        return this.expenseType.equals(other.expenseType)
	            && this.amount == other.amount
	            && this.businessName.equals(other.businessName)
	            && this.dueMonth == other.dueMonth
	            && this.dueDay == other.dueDay;
	    }
	}
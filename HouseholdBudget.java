// -------------------------------------------------------
// Assignment {4}
// Written by: {Mustafa Ahmad 40196075}
// For COMP 248 Section {EC} – Fall 2022
// --------------------------------------------------------
/*The class has several methods, including constructors, methods for comparing two household budgets, 
 * a method for adding an expense to a household budget, a method for removing an expense, 
 * and a method for updating the due date of an expense. The class does not have a copy constructor.
 */
package ass4;


public class HouseholdBudget {

	private Fund fund;
	private Expense[] expenses;

	// Default constructor
	public HouseholdBudget() {
		this.fund = new Fund();
		this.expenses = null;
	}

	// Constructor with 2 parameters
	public HouseholdBudget(Fund fund, Expense[] expenses) {
		this.fund = fund;
		this.expenses = expenses;
	}

	// Getter for Fund attribute
	public Fund getFund() {
		return this.fund;
	}

	// Setter for Fund attribute
	public void setFund(Fund fund) {
		this.fund = fund;
	}

	// Getter for Expenses attribute
	public Expense[] getExpenses() {
		return this.expenses;
	}

	// Setter for Expenses attribute
	public void setExpenses(Expense[] expenses) {
		this.expenses = expenses;
	}

	// Method that returns true if the total value of the fund of two HouseholdBudget objects are equal, and false otherwise
	public boolean compareFundValues(HouseholdBudget other) {
		return this.fund.fundTotal() == other.fund.fundTotal();
	}

	// Method that returns true if the number of each fund type of two HouseholdBudget objects are equal, and false otherwise
	public boolean compareFundTypes(HouseholdBudget other) {

		return this.fund.equals(other);
	}

	// Method that returns the total value of the fund of a HouseholdBudget object @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public double getTotalFundValue() {
		return this.fund.fundTotal();
	}

	// Method that returns the number of expenses of a HouseholdBudget object
	public int getNumOfExpenses() {
		return this.expenses.length;
	}

	// Method that adds a new expense to the HouseholdBudget object
	public int addExpense(Expense expense) {
		if (this.expenses == null) {
			// If the HouseholdBudget object does not have any expenses yet, initialize the expenses array with a single element
			this.expenses = new Expense[1];
			this.expenses[0] = expense;
		} else {
			// If the HouseholdBudget object already has expenses, create a new array with one more element than the existing array
			Expense[] newExpenses = new Expense[this.expenses.length + 1];
			// Copy the existing expenses into the new array
			for (int i = 0; i < this.expenses.length; i++) {
				newExpenses[i] = this.expenses[i];
			}
			// Add the new expense to the end of the new array
			newExpenses[newExpenses.length - 1] = expense;
			// Set the expenses array of the HouseholdBudget object to the new array with the added expense
			this.expenses = newExpenses;
		}
		// Return the number of expenses in the HouseholdBudget object
		return this.expenses.length;
	}

	public boolean removeExpense(int expenseIndex) {
		if (this.expenses == null) {
			// If the HouseholdBudget object does not have any expenses, return false
			return false;
		} else {
			// If the HouseholdBudget object has expenses, create a new array with one fewer element than the existing array
			Expense[] newExpenses = new Expense[this.expenses.length - 1];

			// If the expense to be removed is found in the array, copy the existing expenses into the new array, excluding the expense to be removed
			for (int i = 0; i < newExpenses.length; i++) {
				if (i < expenseIndex) {
					// Copy the expense at the current index in the existing array to the same index in the new array
					newExpenses[i] = this.expenses[i];
				} else {
					// Skip the expense to be removed and copy the expense at the next index in the existing array to the current index in the new array
					newExpenses[i] = this.expenses[i + 1];
				}
			}
			// Set the expenses array of the HouseholdBudget object to the new array with the removed expense
			this.expenses = newExpenses;
			// Return true to indicate that the expense was successfully removed
			return true;   
		}
	}

	// Method that updates the due date day and month of an expense
	public void updateExpenseDueDate(Expense expense, int day, int month) {
		if (this.expenses == null) {
			// If the HouseholdBudget object does not have any expenses, return
			return;
		} else {
			// If the HouseholdBudget object has expenses, find the expense to be updated in the array
			for (int i = 0; i < this.expenses.length; i++) {
				if (this.expenses[i].equals(expense)) {
					// If the expense is found, update the due date day and month of the expense
					this.expenses[i].setDueDay(day);
					this.expenses[i].setDueMonth(month);
					break;
				}
			}
		}
	}

	public String toString() {
		String sentence="";
		sentence=this.fund.toString()+'\n';
		if (expenses.length == 0) 
			sentence+="No expenses";

		else
			for (int i = 0 ; i < expenses.length; i++) 
				sentence=sentence+expenses[i].toString()+'\n';

		return sentence;
	}
	public boolean equals(HouseholdBudget other) {
		if( this.fund.equals(other.fund))
		{
			if (expenses.length == other.expenses.length)
			{
				for(int i=0;i<expenses.length;i++)
					if(!(expenses[i].equals(other.expenses[i])))
						return false;
				return true;
			}
			else
				return false;
		}

		else
			return false;

	}


}

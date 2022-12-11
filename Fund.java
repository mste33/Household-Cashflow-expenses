// -------------------------------------------------------
// Assignment {4}
// Written by: {Mustafa Ahmad 40196075}
// For COMP 248 Section {EC} – Fall 2022
// --------------------------------------------------------
/*  The class called Fund has attributes for different types of cash,
 *  such as loonies and toonies etc. The class has several methods, 
 *  including constructors, accessor and mutator methods, 
 *  a method for adding funds, a method for calculating the total value of the funds, 
 *  a method for formatting the fund information as a string, 
 *  and a method for comparing two Fund objects for equality.
 */

package ass4;

public class Fund {

	// Static constants for the values of each fund type
	public static final int LOONIES = 1;
	public static final int TOONIES = 2;
	public static final int FIVE_BILLS = 5;
	public static final int TEN_BILLS = 10;
	public static final int TWENTY_BILLS = 20;

	// Attributes
	private int loonies;
	private int toonies;
	private int fiveBills;
	private int tenBills;
	private int twentyBills;

	// Constructors
	public Fund() {
		// Set all attributes to 0
		this.loonies = 0;
		this.toonies = 0;
		this.fiveBills = 0;
		this.tenBills = 0;
		this.twentyBills = 0;
	}

	public Fund(int loonies, int toonies, int fiveBills, int tenBills, int twentyBills) {
		this.loonies = loonies;
		this.toonies = toonies;
		this.fiveBills = fiveBills;
		this.tenBills = tenBills;
		this.twentyBills = twentyBills;
	}

	public Fund(Fund other) {
		this.loonies = other.loonies;
		this.toonies = other.toonies;
		this.fiveBills = other.fiveBills;
		this.tenBills = other.tenBills;
		this.twentyBills = other.twentyBills;
	}

	// Accessor and mutator methods for all attributes
	public int getLoonies() {
		return this.loonies;
	}

	public void setLoonies(int loonies) {
		this.loonies = loonies;
	}

	public int getToonies() {
		return this.toonies;
	}

	public void setToonies(int toonies) {
		this.toonies = toonies;
	}

	public int getFiveBills() {
		return this.fiveBills;
	}

	public void setFiveBills(int fiveBills) {
		this.fiveBills = fiveBills;
	}

	public int getTenBills() {
		return this.tenBills;
	}

	public void setTenBills(int tenBills) {
		this.tenBills = tenBills;
	}

	public int getTwentyBills() {
		return this.twentyBills;
	}

	public void setTwentyBills(int twentyBills) {
		this.twentyBills = twentyBills;
	}

	// addFund method
	public void addFund(int loonies, int toonies, int fiveBills, int tenBills, int twentyBills) {
		this.loonies += loonies;
		this.toonies += toonies;
		this.fiveBills += fiveBills;
		this.tenBills += tenBills;
		this.twentyBills += twentyBills;
	}

	// fundTotal method
	public int fundTotal() {
		return this.loonies * LOONIES + this.toonies * TOONIES + this.fiveBills * FIVE_BILLS + this.tenBills * TEN_BILLS + this.twentyBills * TWENTY_BILLS;
	}



	public String toString() {
		return "Loonies: " + this.loonies + ", Toonies: " + this.toonies + ", $5 Bills: " + this.fiveBills + ", $10 Bills: " + this.tenBills + ", $20 Bills: " + this.twentyBills;
	}


	public boolean equals(Fund other) {
		return this.loonies == other.loonies && this.toonies == other.toonies && this.fiveBills == other.fiveBills && this.tenBills == other.tenBills && this.twentyBills == other.twentyBills;
	}
}

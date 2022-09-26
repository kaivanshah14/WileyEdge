# Day 4 Assignment

**1. Create a class BankAccount with following details:**

	1. Attributes: accountId, accountHolderName, openingBalance, currentBalance, totalBalance.
	2. Methods: 
		- depositAmount(double amount) 
		- withdrawAmount(double amount)
		- getCurrentBalance()
		- displayTotalBalance()
	3. Create atleast 3 bank accounts using parameterized constructor. 
	4. Invoke the withdraAmount() and depositAmount() method randomly for different accounts. 
	5. Display the details of the each account after transaction.
	6. Also show the current cash available in the bank. (Use the totalBalance to know the current cash available in the bank)
	7. Apply the validations for openingBalance and withDrawAmount:
		- openingBalance should be positive number
		- You should not be able to withdraw the amount more than current balance. 

		
**2. Modify the above BankAccount by adding the accountType:** 

	1. The accountType should be controlled by using the enum which should contain two values: savings and current account. 
	2. If the accounttype is saving, the min balance should be 500, and if the accounttype is current account the min balance should be 1000. 
	3. Validations:
		- Opening balance should be greate than or equal to the min balance required.
		- You cannot withdraw the amount, which makes your balance less than the min required balance. 



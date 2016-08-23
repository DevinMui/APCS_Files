
/**
 * This example provides a template for a Java Class File
 * Use it as an example to create a new class called BankAccount
 * Your BankAccount class should contain the following:
 * 1) Instance variables for "balance" and "acctNumber"
 * 2) Two constructors (special methods) 
 *      a) A default constructor that sets the balance to 0.0 and  acctNumber to -1
 *      b) A constructor that allows you to set both the balance and acctNumber to values passed in
 *         as parameters.
 * 3) Two sets of special methods (called getters and setters) that set/get the value of each of the 
 *    instance variables (balance and acctNumber).  Call these getBalance, setBalance, and getAcctNumber
 *    and setAcctNumber. Other types of methods, that change state of an object (by changing values of
 *    instance variables) are called "mutators".  Can you think of a method that we may want to add
 *    to the BankAccount class that would be considered a mutator?
 *    
 *    NOTES/QUESTIONS:
 *    1) In Java, both instance variables and methods can be public or private. This designates their
 *    access by other objects.  This feature of Java is known as encapsulation. Should we declare our
 *    instance variables as public or private? What about our methods?  Why/Why not?
 */
public class JavaStructure
{
    // instance variables - replace the example below with your own
    public double balance;
    public int acctNumber;

    /**
     * Constructor for objects of class JavaStructure
     */
    public JavaStructure()
    {
        // initialise instance variables based on parameter list, or by using default values
        // You can create multiple constructors with different parameter lists. This is called
        // "method overriding"
        balance = 0.0;
        acctNumber = -1;
    }
    
    public JavaStructure(double balance, int acctNumber)
    {
        // initialise instance variables based on parameter list, or by using default values
        // You can create multiple constructors with different parameter lists. This is called
        // "method overriding"
        balance = balance;
        acctNumber = acctNumber;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  money as a float
     * @return     the sum of the balance and money
     * 
     * For instance, in your BankAccount class that you will make, you may want to write
     * a method called "deposit".  What would that look like?
     */
    public double deposit(double money)
    {
        // put your code here
        balance = balance + money;
        return balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getAcctNumber(){
        return acctNumber;
    }
    
    public double setBalance(double money){
        balance = money;
        return balance;
    }
    
    public int setAcctNumber(int acctNumber){
        acctNumber = acctNumber;
        return acctNumber;
    }
}

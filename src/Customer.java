/* Class for customer */



public class Customer {

    // Instance variables to hold customer's name and account number
    private String name;
    private int accountNumber;

    //
    // ToDo:
    //
    // Provide another instance variable to hold customer's status

    private char customerStatus;

    //
    // ToDo:
    //
    // Provide a class variable for last-used account number
    private int lastaccount_no;

    //
    // Constructor that takes a String to initialise the instance variable for the customer's
    // name, and sets the status automatically to 'A' as a default value
    //
    public Customer(String name) {
        this.name = name;
        this.customerStatus = 'A';

        //
        // ToDo:
        //
        //
        // Initialise status to  'A'


    }

    // ToDo: set the account number automatically, by incrementing the class variable
    // holding the last used account number. BOTH constructors must do this. Remember one
    // constructor can invoke the other using "this"...For an elegant solution, feel free
    // to change the contents of the first constructor that's been provided here...
    //
    Customer() {
        this.accountNumber = lastaccount_no + 1;
    }

    //
    // ToDo:
    //
    //
    // Provide a second constructor that takes a String and a char, the customer's name and status
    //
    public Customer(String customerName, char status) {
        this.customerStatus=status;
        this.name=customerName;

    }

    //
    // The getName method returns the name
    //
    public String getName() {
        return name;
    }


    //
    // The getAccountNumber method returns the accountNumber
    //
    public int getAccountNumber() {
        return accountNumber;
    }


    //
    // ToDo:
    //
    // Provide a getStatus method to return the status
    //
    public char getStatus() {
        return customerStatus;
    }


    //
    // ToDo:
    //
    // Provide a isHeld method that returns a boolean: true if the customer is status 'H' for on-hold,
    // otherwise it returns false
    //
    public boolean isHeld() {
        if (customerStatus == 'H') {
            System.out.println("Customer Status:" + customerStatus);
            return true;
        } else {
            System.out.println("Customer Status:" + customerStatus);
            return false;
        }

    }

    //
    // This changeDetails method changes the name
    //
    public void changeDetails(String name) {
        this.name = name;
        System.out.println(this.name);
    }


    //
    // ToDo:
    //
    // Provide a second changeDetails method that changes the name and status
    //
    public void changeDetails(String name, char status) {
        this.name = name;
        this.customerStatus = status;
        System.out.println("Name-->" + this.name + "Customer status-->" + this.customerStatus);
    }


    //
    // ToDo:
    //
    // Provide a class method, setLastUsedAccountNumber(), to reset the class variable
    //
    public void setLastUsedAccountNumber() {
        this.name = null;
        this.customerStatus = 'A';
        System.out.println("Reset:" + this.name);
        System.out.println(this.customerStatus);

    }


    public static void main( String[] args){
        Customer customer=new Customer("test",'H');
        System.out.println("Customer status-->"+customer.isHeld());

    }
}
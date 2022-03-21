//INSTRUCTIONS

//

public class VopCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VopCustomer(){
        this("default name", 0.00, "defualt@email.com" );
        System.out.println("default constructor");
    }

    public VopCustomer(String name, double creditLimit){
        this(name, creditLimit, "default@gmail.com");
    }

    public VopCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



    public static void main(String[] args) {
        VopCustomer dylan = new VopCustomer("dylan", 1000);
        System.out.println(dylan.getEmailAddress());
    }


}

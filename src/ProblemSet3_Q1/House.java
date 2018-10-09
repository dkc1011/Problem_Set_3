//House.java by Daragh Carroll t00201097
/*
This instanceable class contains the attributes address, type, price and owner
(a type of Person).
 */

package ProblemSet3_Q1;

public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    // Mutator Methods

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    // Accessor Methods

    public String getAddress()
    {
        return this.address;
    }

    public String getType()
    {
        return this.type;
    }

    public double getPrice()
    {
        return this.price;
    }

    public Person getOwner()
    {
        return this.owner;
    }

    //Constructors

    //No Argument Constructor
    public House(){
        setAddress("Unknown Address");
        setType("Unknown Type");
        setPrice(0.0);
        setOwner(null);
    }

    public House(String address, )
    {

    }
}

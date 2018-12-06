import java.util.ArrayList;
import java.util.Date;

/**
 * Author: Andrews, Hannah
 * Description: Here lies a class for all Products
 */

public abstract class Product implements Item, Comparable<Product> {

    private int serialNumber;
    private Date manufacturedOn;
    private String name;
    private String manufacturer = Item.MANUFACTURER;

    private static int currentProductionNumber = 1;

//  constructor is added that will take in the name of the product and set this to the field variable name. it
//  will also assign a serial number from the currentProductionNumber. The currentProductionNumber
//  will be incremented in readiness for the next instance.
//  manufacturedOn as the current date and time.
    Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();

    }

    //method to print an array list that will only print the
    //type of product given
    static <T> void printType(ArrayList<T> arrayList, Class c) {
        for (T element: arrayList){
            if (element.getClass() == c)
                System.out.println(element);
        }

    }

    public void setProductionNumber(int number) {
        serialNumber = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return "Manufacturer : " + manufacturer + "\n"
                + "Serial Number : " + serialNumber + "\n"
                + "Date : " + manufacturedOn + "\n"
                + "Name : " + name + "\n";
    }

    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }

}

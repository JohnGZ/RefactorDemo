package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder();
        result.append(PrintTool.printNameLine(getName()));
        while(rentals.hasMoreElements()){
            double thisAmount;
            Rental each = (Rental) rentals.nextElement();
            thisAmount = each.getMovie().getAmount(each.getDayRented());
            frequentRenterPoints += each.getMovie().getPoint();
            //show figures for this rental
            result.append(PrintTool.printRecordLine(each.getMovie().getTitle(),thisAmount));
            totalAmount += thisAmount;
        }

        //add footer lines
        result.append(PrintTool.printOweLine(totalAmount));
        result.append(PrintTool.printEarnedLine(frequentRenterPoints));
        return result.toString();
    }

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }
}

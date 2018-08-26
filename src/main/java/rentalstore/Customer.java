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
        String result = CONST.NAME_LINE_BEGIN + getName() + CONST.NAME_LINE_END;
        while(rentals.hasMoreElements()){
            double thisAmount;
            Rental each = (Rental) rentals.nextElement();
            thisAmount = each.getMovie().getAmount(each.getDayRented());
            frequentRenterPoints += each.getMovie().getPoint();
            //show figures for this rental
            result += CONST.RECORD_BEGIN + each.getMovie().getTitle() + CONST.EQUAL + String.valueOf(thisAmount) + CONST.RECORD_END;
            totalAmount += thisAmount;
        }

        //add footer lines
        result += CONST.OWE_LINE_BEGIN + String.valueOf(totalAmount) + CONST.OWE_LINE_END;
        result += CONST.EARNED_LINE_BEGIN + String.valueOf(frequentRenterPoints) + CONST.EARNED_LINE_END;
        return result;
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

package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void should_return_correct_rental_message_when_making_customer_order(){
        //given
        Movie movie1 = new Movie("Titanic", Movie.REGULAR);
        Movie movie2 = new Movie("LittlePig", Movie.CHILDRENS);
        Movie movie3 = new Movie("FlashMan", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1,1);
        Rental rental2 = new Rental(movie2,2);
        Rental rental3 = new Rental(movie3,3);
        Customer customer = new Customer("John");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        //when
        String order = customer.statement();
        //then
        Assert.assertEquals("<H1>Rental Record for <EM>John</EM></H1><P>\n" +
                "\tTitanic:2.0<BR>\n" +
                "\tLittlePig:1.5<BR>\n" +
                "\tFlashMan:9.0<BR>\n" +
                "<P>You owe<EM>12.5</EM><P>\n" +
                "On this rental you earned <EM>4</EM> frequent renter points<P>",order);
    }
}

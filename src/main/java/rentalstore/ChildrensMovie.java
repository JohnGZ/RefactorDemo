package rentalstore;

public class ChildrensMovie extends Movie {
    public ChildrensMovie(String title) {
        super(title);
    }

    @Override
    public Double getAmount(Integer rentalDay) {
        double amount = 0;
        amount+=1.5;
        if(rentalDay > 3){
            amount += (rentalDay -3)*1.5;
        }
        return amount;
    }
}

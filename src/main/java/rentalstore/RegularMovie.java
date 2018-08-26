package rentalstore;

public class RegularMovie extends Movie{
    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public Double getAmount(Integer rentalDay) {
        double amount = 0;
        amount += 2;
        if(rentalDay > 2){
            amount += (rentalDay - 2) * 1.5;
        }
        return amount;
    }
}

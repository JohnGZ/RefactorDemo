package rentalstore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public Double getAmount(Integer rentalDay) {
        double amount = 0;
        amount += rentalDay*3;
        if(amount > 1){
            point ++;
        }
        return amount;
    }
}

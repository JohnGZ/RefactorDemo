package rentalstore;

public class ArtMovie extends Movie {
    private double mAmount;
    public ArtMovie(String title) {
        super(title);
        mAmount = 6;
        point = 1.5;
    }

    @Override
    public Double getAmount(Integer rentalDay) {
        return mAmount;
    }
}

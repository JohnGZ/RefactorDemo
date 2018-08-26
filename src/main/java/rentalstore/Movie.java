package rentalstore;

public abstract class Movie {

    protected String title;
    protected Double point = 1.0;

    public Movie(String title) {
        this.title = title;
    }

    public abstract Double getAmount(Integer rentalDay);

    public String getTitle() {
        return title;
    }

    public Double getPoint() {
        return point;
    }
}

package rentalstore;

public abstract class Movie {

    protected String title;
    protected Integer point = 1;

    public Movie(String title) {
        this.title = title;
    }

    public abstract Double getAmount(Integer rentalDay);

    public String getTitle() {
        return title;
    }

    public Integer getPoint() {
        return point;
    }
}

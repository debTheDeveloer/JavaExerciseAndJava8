package Java8Practice.Consumer;

public class Movie {
    String name;
    int businessAmount;
    boolean isHit;

    public Movie(String name, int businessAmount, boolean isHit) {
        this.name = name;
        this.businessAmount = businessAmount;
        this.isHit = isHit;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", businessAmount=" + businessAmount +
                ", isHit=" + isHit +
                '}';
    }
}

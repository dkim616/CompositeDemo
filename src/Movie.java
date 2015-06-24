public class Movie extends MovieComponent {

    String movieName;
    int movieYear;
    int movieGrossingAmount;

    public Movie(String movieName,
                 int movieYear,
                 int movieGrossingAmount) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieGrossingAmount = movieGrossingAmount;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public int getMovieGrossingAmount() {
        return movieGrossingAmount;
    }

    public void displayMovieInfo() {
        System.out.println(getMovieName() + ", " +
                          getMovieYear() + ", " +
                          getMovieGrossingAmount() + "\n");
    }
}

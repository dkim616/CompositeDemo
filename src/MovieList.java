public class MovieList {

    MovieComponent movieList;

    public MovieList(MovieComponent movieList) {
        this.movieList = movieList;
    }

    public void getMovieList() {
        movieList.displayMovieInfo();
    }

}

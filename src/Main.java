public class Main {

    public static void main(String[] args) {
        MovieComponent allMovies
                = new MovieGroup("Movie List (Name, Year, Grossing)");

        MovieComponent actionMovies = new MovieGroup("Action");
        MovieComponent horrorMovies = new MovieGroup("Horror");
        MovieComponent dramaMovies = new MovieGroup("Drama");
        MovieComponent independentMovies = new MovieGroup("\tIndependent");

        allMovies.add(actionMovies);
        actionMovies.add(new Movie("Enter the Dragon", 1973, 25000000));

        allMovies.add(horrorMovies);
        horrorMovies.add(new Movie("The Exorcist", 1973, 204565000));

        horrorMovies.add(independentMovies);
        independentMovies.add(new Movie("\tParanormal Activity",
                                        2007, 107918810));

        allMovies.add(dramaMovies);
        dramaMovies.add(new Movie("Pulp Fiction", 1994, 107928762));

        MovieList movieList = new MovieList(allMovies);
        movieList.getMovieList();
    }

}

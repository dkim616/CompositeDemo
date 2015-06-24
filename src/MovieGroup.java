import java.util.ArrayList;
import java.util.Iterator;

public class MovieGroup extends MovieComponent {

    String groupName;

    ArrayList<MovieComponent> movieComponentList
            = new ArrayList<MovieComponent>();

    public MovieGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void add(MovieComponent movieComponent) {
        movieComponentList.add(movieComponent);
    }

    public void remove(MovieComponent movieComponent) {
        movieComponentList.remove( movieComponent );
    }

    public MovieComponent getMovieComponent(int index) {
        return movieComponentList.get(index);
    }

    public void displayMovieInfo() {
        System.out.println(getGroupName() + " " + "\n");

        Iterator<MovieComponent> iterator
                = movieComponentList.iterator();

        while (iterator.hasNext()) {
            MovieComponent movieInfo = iterator.next();
            movieInfo.displayMovieInfo();
        }
    }

}

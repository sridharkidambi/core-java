import Model.movies;

import java.util.Comparator;

public class ratingsComparator implements Comparator<movies> {
    @Override
    public int compare(movies o1, movies o2) {
        if((o1.getRating()<o2.getRating())){
            return 1;
        }
        if((o1.getRating()>o2.getRating())){
            return -1;
        }
        return 0;
    }
}

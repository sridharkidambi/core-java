import Model.movies;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableTest {
    public  static  void  main(String[] str) {

        List<movies> moviesList=new ArrayList<movies>();

        moviesList.add(new movies("pnqr",8.8F,2975));
        moviesList.add(new movies("stru",3.8F,1075));
        moviesList.add(new movies("abcd",4.8F,1975));

        //comparable
        Collections.sort(moviesList);

        for (movies movie: moviesList){
            System.out.println("movie name: "+ movie.getName() + "movie year: "+ movie.getYear());
        }

        //comparator
        Collections.sort(moviesList, new ratingsComparator());

        for (movies movie: moviesList){
            System.out.println("movie name: "+ movie.getName() + "movie ratings: "+ movie.getRating());
        }
    }
    }




package Strings;

import Model.movies;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class comparatorCustom {

    static final Comparator<movies> MV_LST;


    List<movies> moviesList=new ArrayList<movies>();

    static {
        MV_LST = new Comparator<movies>() {
            @Override
            public int compare(movies o1, movies o2) {
                return 0;
            }
        };

    }

    public comparatorCustom(){
        moviesList.add(new movies("pnqr",8.8F,2975));
        moviesList.add(new movies("stru",3.8F,1075));
        moviesList.add(new movies("abcd",4.8F,1975));

        for (movies item:moviesList
        ) {
            System.out.println("printMovies before :"+item.getName());
        }
        Collections.reverse(moviesList);


        }

        public  void printMovies(){
            for (movies item:moviesList
                 ) {
                System.out.println("printMovies:"+item.getName());

//                Predicate<movies> _pred=new Predicate() {
//                    @Override
//                    public boolean evaluate(RowSet rs) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean evaluate(Object value, int column) throws SQLException {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean evaluate(Object value, String columnName) throws SQLException {
//                        return false;
//                    }
//                };


            }



            moviesList= moviesList.stream().filter(x->x.getName().startsWith("a")).collect(Collectors.<movies>toList());

        }

    }




/**
 * GenreFilter can be used to extract movies in specified genre in the method parameter.
 * 
 * @ billuri varun
 * @ Version: 30-07-2023
 */

public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}
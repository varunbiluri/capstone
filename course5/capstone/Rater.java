
/**
 * Rater is an interface for PlainRater and EfficientRater classes.
 * 
 * @ billuri varun
 * @ 23-07-2023
 */

import java.util.*;

public interface Rater {
    public void addRating(String item, double rating);

    public boolean hasRating(String item);

    public String getID();

    public double getRating(String item);

    public int numRatings();

    public ArrayList<String> getItemsRated();
}
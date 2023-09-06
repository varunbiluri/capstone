
/**
 * Used to add multiple filters to one array list and to apply them to a dataset 
 * simultaneously.
 * 
 * 
 * @ varun billuri 
 * @ Version : 10-July-2023
 */

import java.util.*;
import edu.duke.*;

public class MatchAllFilter implements Filter {
    private ArrayList<Filter> filters;
    
    public MatchAllFilter () {
        filters = new ArrayList<Filter> ();
    }
    
    public void addFilter (Filter f) {
        filters.add(f);
    }
    
    public boolean satisfies (QuakeEntry qe) {
        for (Filter f : filters) {
            if (! f.satisfies(qe)) {
                return false;
            }
        }
        return true;
    }
    
    public String getName() {
        String names = "";
        
        for (Filter f : filters) {
            String filterName = f.getName() + " ";
            names += filterName;
        }
        
        return names;
    }
}

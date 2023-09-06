
/**
 * 
 * @ varun billuri 
 * @ Version : 10-July-2023
 */

public interface Filter {
    
    public boolean satisfies(QuakeEntry qe);
    
    public String getName();
}

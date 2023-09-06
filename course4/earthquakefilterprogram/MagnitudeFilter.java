
/**
 * Returns quake entries that are between indicated minimum and maximum magnitude.
 * 
 * @ varun billuri 
 * @ Version : 10-July-2023
 */

public class MagnitudeFilter implements Filter {
    private double magMin;
    private double magMax;
    private String name;
    
    public MagnitudeFilter (double min, double max, String filterName) {
        magMin = min;
        magMax = max;
        name = filterName;
    }
    
    public boolean satisfies (QuakeEntry qe) {
        return qe.getMagnitude() >= magMin && qe.getMagnitude() <= magMax;
    }
    
    public String getName() {
        return name;
    }
}

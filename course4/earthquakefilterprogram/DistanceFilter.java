
/**
 * Returns quake entries that have distance to the location under maximal distance.
 * 
 * @ varun billuri 
 * @ Version : 10-July-2023
 */

public class DistanceFilter implements Filter {
    private Location location;
    private float distMax;
    private String name;
    
    public DistanceFilter (Location loc, float max, String filterName) {
        location = loc;
        distMax = max;
        name = filterName;
    }
    
    public boolean satisfies (QuakeEntry qe) {
        return qe.getLocation().distanceTo(location) / 1000.0 < distMax;
    }
    
    public String getName() {
       return name;
    }
}

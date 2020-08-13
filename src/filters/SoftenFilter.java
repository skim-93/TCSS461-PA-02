/*
 * TCSS 305 - SnapShop
 */

package filters;

/**
 * A filter that makes the image less sharp.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class SoftenFilter extends AbstractWeightedFilter {
    
	//Seungku Kim: added constant String for constructor
	private static final String SOFTEN = "Soften";
	
	//Stella: extracting a constant changing the -1 into min_int
    //        4 into max_int and 1 
    private static final int MIN_INT = 1;
    /**
     * A 3x3 grid of weights to use for the weighted filter algorithm.
     */
    private static final int[][] theWEIGTH = {{MIN_INT, 2, 1}, {2, 4, 2}, {1, 2, 1}};

    /**
     * Constructs a new softening filter.
     */
    public SoftenFilter() {
        super(SOFTEN, theWEIGTH);
    }

}

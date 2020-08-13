/*
 * TCSS 305 - SnapShop
 */

package filters;

import image.PixelImage;

/**
 * A filter that detects edges in the image.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class EdgeDetectFilter extends AbstractFilter {
    
	//Seungku Kim: added missing constant
	private static final int MIN_INT = -1;
	
	//Seungku Kim: added constant String for constructor
	private static final String EDGE_DETECT = "Edge Detect";
	
	//Stella: extracting a constant changing the -1 into min_int
    private static final int[][] WEIGHTS = {{MIN_INT, MIN_INT, MIN_INT}, {MIN_INT, 8, MIN_INT}, {MIN_INT, MIN_INT, MIN_INT}};

    /**
     * Constructs a new edge detection filter.
     */
    public EdgeDetectFilter() {
    	//Seungku Kim: used final string field instead of string
        super(EDGE_DETECT);
    }

    /**
     * Filters the specified image.
     * 
     * @param theImage The image.
     */
    //Refactor Change Function Declaration (Seungku Kim)
    @Override
    public void filter(final PixelImage theImage) {
        weight(theImage, WEIGHTS);
    }
}

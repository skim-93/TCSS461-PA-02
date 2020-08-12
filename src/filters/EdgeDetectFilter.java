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
    //Stella: extracting a constant changing the -1 into min_int
    private static final int[][] WEIGHTS = {{MIN_INT, MIN_INT, MIN_INT}, {MIN_INT, 8, MIN_INT}, {MIN_INT, MIN_INT, MIN_INT}};

    /**
     * Constructs a new edge detection filter.
     */
    public EdgeDetectFilter() {
        super("Edge Detect");
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

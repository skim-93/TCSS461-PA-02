/*
 * TCSS 305 - SnapShop
 */

package filters;

/**
 * A filter that makes the image sharper.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class SharpenFilter extends AbstractWeightedFilter {
    //Stella: extracting a constant changing the -1 into min_int
    private static final int MIN_INT = -1;
    /**
     * A 3x3 grid of weights to use for the weighted filter algorithm.
     */
    private static final int[][] WEIGHTS = {{MIN_INT, -2, MIN_INT}, {-2, 28, -2}, {MIN_INT, -2, MIN_INT}};

    /**
     * Constructs a new sharpening filter.
     */
    public SharpenFilter() {
        super("Sharpen", WEIGHTS);
    }
}

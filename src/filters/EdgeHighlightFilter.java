/*
 * TCSS 305 - SnapShop
 */

package filters;

/**
 * A filter that highlights edges in the image.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class EdgeHighlightFilter extends AbstractWeightedFilter {
 //Stella: extracting a constant changing the -1 into min_int
    private static final int MIN_INT = -1;
    /**
     * A 3x3 matrix of weights to use in the filtering algorithm.
     */
    private static final int[][] WEIGHTS = {{MIN_INT, MIN_INT, MIN_INT}, {MIN_INT, 9, MIN_INT}, {MIN_INT, MIN_INT, MIN_INT}};

    /**
     * Constructs a new edge highlighting filter.
     */
    public EdgeHighlightFilter() {
        super("Edge Highlight", WEIGHTS);
    }

}

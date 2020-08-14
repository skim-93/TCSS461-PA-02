/*
 * TCSS 305 - SnapShop
 */

package filters;

import image.Pixel;
import image.PixelImage;

/**
 * A filter that flips the image vertically.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class FlipVerticalFilter extends AbstractFilter {
    
	//Seungku Kim: added constant String for constructor
	private static final String FLIP_VERTICAL = "Flip Vertical";
	
	/**
     * Constructs a new flip vertical filter.
     */
    public FlipVerticalFilter() {
        super(FLIP_VERTICAL);
    }

    /**
     * Filters the specified image.
     * 
     * @param theImage The image.
     */
    @Override
    public void filter(final PixelImage theImage) {
        final Pixel[][] data = theImage.getPixelData();
        for (int row = 0; row < theImage.getHeight() / 2; row++) {
            for (int col = 0; col < theImage.getWidth(); col++) {
                swapPixels(data, row, col, theImage.getHeight() - row - 1, col);
            }
        }
        theImage.setPixelData(data);
    }
}

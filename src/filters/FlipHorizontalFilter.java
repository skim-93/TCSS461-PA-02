/*
 * TCSS 305 - SnapShop
 */

package filters;

import image.Pixel;
import image.PixelImage;

/**
 * A filter that flips the image horizontally.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class FlipHorizontalFilter extends AbstractFilter {
    
	//Seungku Kim: added constant String for constructor
	private static final String FLIP_HORIZONTAL = "Flip Horizontal";
	
	/**
     * Constructs a new flip horizontal filter.
     */
    public FlipHorizontalFilter() {
        super(FLIP_HORIZONTAL);
    }

    /**
     * Filters the specified image.
     * 
     * @param theImage The image.
     */
    // Stella: rename fields data as NewImage and row as NewRow
    @Override
    public void filter(final PixelImage theImage) {
        final Pixel[][] NewImage = theImage.getPixelData();
        for (int NewRow = 0; NewRow < theImage.getHeight(); NewRow++) {
            for (int col = 0; col < theImage.getWidth() / 2; col++) {
                pixelSwap(NewImage, NewRow, col, NewRow, theImage.getWidth() - col - 1);
            }
        }
        theImage.setPixelData(NewImage);
    }
}

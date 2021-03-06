package graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Image {

    private int width, height;
    private int[] pixel;

    public Image(String Path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(Image.class.getResourceAsStream(Path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        width = image.getWidth();
        height = image.getHeight();
        pixel = image.getRGB(0, 0, width, height, null, 0, width);

        image.flush();
    }

    public void rotateImage(int degree) {
        
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPixel(int[] pixel) {
        this.pixel = pixel;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[] getPixel() {
        return pixel;
    }
}

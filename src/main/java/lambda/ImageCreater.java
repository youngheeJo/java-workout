package lambda;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageCreater {
    public static BufferedImage createImage(int width, int height, PixelFunction pixelFunction) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = pixelFunction.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        }

        return image;
    }

    public static void main(String[] args) {
        BufferedImage frenchFlag = ImageCreater.createImage(150, 100,
                (x, y) -> x < 50 ? Color.BLUE : x < 100 ? Color.WHITE : Color.BLACK);

        File file = new File("createdimage.png");

        try {
            ImageIO.write(frenchFlag, "png", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package main;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Imager {
    private BufferedImage image;

    public Imager(String fileName) throws IOException {
        this.image = ImageIO.read(new File(fileName));
    }

    public Color getPixelColor(int x, int y) {
        int rgb = this.image.getRGB(x, y);
        return new Color(rgb);
    }

    public void setPixelColor(int x, int y, Color color) {
        this.image.setRGB(x, y, color.getRGB());
    }

    public static void main(String[] args) throws IOException {
       Imager imager = new Imager("main\\imgsrc\\minceraft\\bedrock.png");
       System.out.println("Hello");
       Color color = imager.getPixelColor(1, 1);
       imager.setPixelColor(1, 1, new Color(255, 0, 0)); // set pixel to red 
    }
}


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
    
    public void writeImage(String fileName) throws IOException{
        ImageIO.write(this.image, "png", new File(fileName));
    }

    public void writeImage(String fileName, String saveName) throws IOException{
        ImageIO.write(this.image, "png", new File(saveName));
    }


    public static void main(String[] args) throws IOException {
        String fileName = "main\\imgsrc\\minceraft\\bedrock.png";
        Imager imager = new Imager(fileName);
        Color color = imager.getPixelColor(0, 0);
        System.out.println(color);
        imager.setPixelColor(0, 0, new Color(255, 0, 0)); // set pixel value Obj imager to red 
        imager.writeImage(fileName, "test-kg.png");
    }
}


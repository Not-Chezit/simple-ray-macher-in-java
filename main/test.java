package main;
import main.rayMarcher;
import main.Imager;
import java.awt.Color;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        rayMarcher worker1 = new rayMarcher();
        
        String filename = "main\\imgsrc\\minceraft\\bedrock.png";
        Imager image1 = new Imager(filename); //Object to be created per image file
        Color color = image1.getPixelColor(0,0); //Example getPixelColor call
        image1.setPixelColor(0,0, new Color(255, 0, 0)); //Example setPixelColor call
        image1.writeImage(filename, "test-EK.png");



        double[] temp = {0,0,0,0,0,0,0};
        double[] screenpos = {0,0};
        
        for (double i = 0; i < 16; i++) {
            for (double j = 0; j < 16; j++) {
                screenpos[0] = (i/8)-0.5;
                screenpos[1] = (j/8)-0.5;
                worker1.getPixel(temp, screenpos);
                System.out.print("e");




            }
            System.out.println();
        }
    

    }
}
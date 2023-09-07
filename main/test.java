package main;
//import main.rayMarcher;
import main.Imager;
import java.awt.Color;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        //rayMarcher worker1 = new rayMarcher();
        
        String filename = "main\\imgsrc\\360p.png";
        Imager image1 = new Imager(filename); //Object to be created per image file
        Color color = image1.getPixelColor(0,0); //Example getPixelColor call
       // image1.setPixelColor(0,0, new Color(255, 0, 0)); //Example setPixelColor call
      //  



        double[] temp = {0,30,-10,-30,0,90};
        double[] screenpos = {0,0};
        double[] tempOutput = {0,0,0,0};

        for (double i = 0; i < 640; i++) {
            for (double j = 0; j < 360; j++) {
                screenpos[0] = (i/320)-0.5;
                screenpos[1] = (j/320)-0.5;
                screenpos[1] *= -1;
                tempOutput = rayMarcher.getPixel(temp, screenpos);
               // System.out.print(tempOutput[0] + " ");
                image1.setPixelColor((int)i, (int)j, new Color((int)tempOutput[1], (int)tempOutput[2], (int)tempOutput[3]));

            }
            System.out.println();
        }
    
        image1.writeImage(filename, "test-EK.png");
    }
}
package main.objectTypes;

import main.Imager;
import java.awt.Color;

public class simpleShape{
    
    public static double[] cube(double[] worldData, double[] pos, double size, String texture){
        double[] output = {0,0,0,0};
        double rx = worldData[0];
        double ry = worldData[1];
        double rz = worldData[2];
        if (((pos[0] - size) <= rx) && (rx <= (pos[0] + size))&&((pos[1] - size) <= ry )&&( ry <= (pos[1] + size))&&((pos[2] - size) <= rz )&&( rz <= (pos[2] + size))) {


            output[0] = 6.9;
            output[1] = 200;
            output[2] = 0;
            output[3] = 0;
        }    
        
        return output;
     }
    }

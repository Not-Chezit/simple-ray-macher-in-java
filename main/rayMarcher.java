package main;

import main.objectTypes.simpleShape;

public class rayMarcher {

   public double[] getPixel(double[] worldData, double[] screenPixel)
   {
      double rx = worldData[0]; //import world data and set up vars
      double ry = worldData[1];
      double rz = worldData[2];
      double[] colorStorge = {0,0,0,0};
      double xyRotation = worldData[3];
      double zRotation = worldData[4];
      double fov = (worldData[5]/2);
      boolean isWorking = true;
      double rayAge = 0;
      double stepSize = 1;


      double tempRotation = xyRotation + (screenPixel[0] * fov); //set up xyz velocitys/rotation
      double rzv = Math.sin(Math.toRadians(zRotation + (screenPixel[1] * fov)));
      double rxv = Math.cos(Math.toRadians(tempRotation));
      double ryv = Math.sin(Math.toRadians(tempRotation));
      
      simpleShape tempShape = new simpleShape();
      

      colorStorge[1] = 1; 
      while(isWorking);
         {
            if(rayAge > 100){isWorking = false;}
            stepSize = 1;


            rx += rxv;
            ry += ryv;
            rz += rzv;
            rayAge = rayAge + stepSize;
         }


      colorStorge[0] = rx;
      return colorStorge;
   }
}  
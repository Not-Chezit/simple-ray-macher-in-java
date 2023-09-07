package main;

import main.objectTypes.simpleShape;

public class rayMarcher {

   public static double[] getPixel(double[] worldData, double[] screenPixel)
   {
      double rx = worldData[0]; //import world data and set up vars
      double ry = worldData[1];
      double rz = worldData[2];
      double[] colorStorge = null;
      double xyRotation = worldData[3];
      double zRotation = worldData[4];
      double fov = (worldData[5]/2);
     
      boolean isWorking = true;
      boolean isSearching = true;
      double rayAge = 0;
      double stepSize = 1;


      double tempRotation = xyRotation + (screenPixel[0] * fov); //set up xyz velocitys/rotation
      double rzv = Math.sin(Math.toRadians(zRotation + (screenPixel[1] * fov)));
      double rxv = Math.cos(Math.toRadians(tempRotation));
      double ryv = Math.sin(Math.toRadians(tempRotation));
      
      //simpleShape tempShape = new simpleShape();//temp stuff
      double tempWorldData[] = worldData.clone();
      double tempPos[] = {50,0,0};
      double tempSize = 20;
      String tempTex = "";

      while(isWorking)
         {
            
            
            stepSize = 1;
            tempWorldData[0] = rx;
            tempWorldData[1] = ry;
            tempWorldData[2] = rz;

            isSearching = true;
            while(isSearching){
               stepSize++;
               colorStorge = simpleShape.cube(tempWorldData, tempPos, (tempSize+stepSize), tempTex);
               if(colorStorge[0] == 6.9){isSearching = false;}
               if(stepSize > 10){isSearching = false;}


            }
            stepSize += -1.0;
            if(stepSize < 1){stepSize = 1;}
            rx = rx + (rxv * stepSize);
            ry = ry + (ryv * stepSize);
            rz = rz + (rzv * stepSize);
            rayAge = rayAge + stepSize;
            
            tempWorldData[0] = rx;
            tempWorldData[1] = ry;
            tempWorldData[2] = rz;
            colorStorge =  simpleShape.cube(tempWorldData, tempPos, tempSize, tempTex);
            
            if(colorStorge[0] == 6.9){isWorking = false;}
            if(rayAge >= 100){isWorking = false;}
         }


      
      return colorStorge;
   }
}  
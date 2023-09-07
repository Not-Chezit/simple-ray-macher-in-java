# simple-ray-macher-in-java
This is a repo for me and my friends to use java and make tools to make a functional ray marcher.  



TODO:
    -a class that simplifies graphics, and displays to a window
        -draw spesific pixels rgb
        -optional: being able to draw shapes
    -a class that returns what keys on the keyboard are being pressed
        -just have a method that returns the char given.
    -a class that can make sets of 3 text files 
        -one is a list of double arrays (data) (double[])
        -one that stores string arrays(Meta) (string[])
        -one that stores just strings(ID) (string)
        -it should be able to create new files. ex: testData.txt, testMeta.txt, testID.txt  
        -you should be able to use a method to get a spesific item from one of the txts
            ex. getData("test", index); and a double[] should be returned
                -optional have those kind of methods return the whole file when given just the name 
                ex. getData("test"); a double[][] gets returned  
        -you should be able to add an item to the txts
            ex. addThing("test", double[] data, string[] meta, string id);
    
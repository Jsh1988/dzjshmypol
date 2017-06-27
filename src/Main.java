import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main extends JApplet {

    //Random number function
    private static int[] generateRandomIntArray(int arrayLength, int upperBound){
        int[] array = new int[arrayLength];
        Random random = new Random();
        for(int i=0; i<array.length;i++){
            //Populating an array with random numbers
            array[i] = random.nextInt(upperBound);
        }
        return array;
    }

    public void paint(Graphics graphics){
        super.paint(graphics);

        //Array of coordinates x
        int[] x = generateRandomIntArray(25, 100);
        //Array sorting X
        Bubble bubbleX = new Bubble(x);
        x = bubbleX.bubbleSortL();
        System.out.println(Arrays.toString(x));
        //Array of coordinates y
        int[] y = generateRandomIntArray(25, 100);
        //Array sorting Y
        Bubble bubbleY = new Bubble(y);
        y = bubbleY.bubbleSortR();
        System.out.println(Arrays.toString(y));

        //The coordinates are written manually
        /*Polygon polygon = new Polygon();
        polygon.addPoint(10,20);
        polygon.addPoint(20,30);
        polygon.addPoint(40,10);
        polygon.addPoint(50,10);
        polygon.addPoint(40,70);*/

        graphics.setColor(Color.RED);
        //Drawing polygon
        graphics.drawPolygon(x,y,25);
        //graphics.drawPolyline(x,y,5);
        //graphics.drawPolygon(x,y,5);
        //graphics.drawPolygon(polygon);
    }
}

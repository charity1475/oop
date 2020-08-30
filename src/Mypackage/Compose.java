package Mypackage;

public class Compose {
    public static void main(String[] args){
        Dimension dimensions = new Dimension(12,10,2);
        Resolution nativeResolution = new Resolution(12,10);
        Case theCase = new Case("2020","Medium","240",dimensions);
        Monitor theMonitor = new Monitor("2019","Dell","Medium",nativeResolution);
        MotherBoard theMotherBoard = new MotherBoard("2020","Dell",4);
        /* we now construct our pc */
        PC thePc = new PC(theCase,theMonitor,theMotherBoard);
        // accessing methods in monitor class
        thePc.getTheCase().pressPowerButton();
        thePc.getMonitor().drawPixel(4,5,"Blue");
        thePc.getMotherboard().load("FireFox ");
    }
}

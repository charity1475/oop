package Mypackage;

public class Fish extends Animal{
    public int gills;
    public int eyes;

    //creating the constructor for Fish class
    public Fish(String name, int brain, int height, int weight, int gills, int eyes) {
        super(name, brain, height, weight);
        this.gills = gills;
        this.eyes = eyes;
    }
    private void swimming(){
        System.out.println("Fish moves by Swimming ");
    }

    @Override
    public void move(String motion) {
        swimming();
        // below i call the super class version
        super.move(motion);
    }
}

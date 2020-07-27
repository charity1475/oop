package Mypackage;

public class Monitor {
    private String model;
    private String manufacturer;
    private String size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, String size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+" ,"+y+" colored"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

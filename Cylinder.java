

public class Cylinder {
    public float volume (int radius, int height){
        float volume;
        // cast volume and non-floats to a float
        volume = (float) Math.PI * radius * radius * height;
        return volume;
    }
    public float surfaceArea(int radius, int height){
        float surfaceArea;
        surfaceArea = (float) ((2*Math.PI * radius * height) + (2* Math.PI * radius * radius));
        return surfaceArea;
    }
    public float lateralSurfaceArea(int radius, int height){

        float lateralSurfaceArea;
        lateralSurfaceArea = (float) Math.PI * 2 * radius * height;
        return lateralSurfaceArea;
    }
    public float topBottomSurfaceArea(int radius){
        float topBottomSurfaceArea;
        topBottomSurfaceArea = (float) Math.PI * radius * radius;
        return topBottomSurfaceArea;
    }
}

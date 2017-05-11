package bridge;

public class Printer implements DrawShape {
    @Override
    public void drawCircle(int r, int x, int y){
    	System.out.println("[PRINTER]This is circle with radius: "+r+", X: "+x+" and Y: "+y);
    }

    @Override
    public void drawRectangle(int h, int w){
    	System.out.println("[PRINTER]This is rectangle with H: "+h+", W: "+w);
    }
}

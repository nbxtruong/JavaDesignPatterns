package bridge;

import javax.swing.JFrame;
import java.awt.*;

public class Screen extends JFrame implements DrawShape {
	private static final long serialVersionUID=1L;
	private static int width=700, hight=500;

	public Screen(){
		setBounds(100,100,width,hight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0,0,width,hight);

		g.setColor(Color.white);
		g.fillRect(50,60,190,70);

		g.setColor(Color.red);
		g.fillOval(200, 200, 88, 88);
	}

    @Override
    public void drawCircle(int r, int x, int y){
    	System.out.println("[SCREEN]This is circle with radius: "+r+", X: "+x+" and Y: "+y);
    }

    @Override
    public void drawRectangle(int h, int w){
    	System.out.println("[SCREEN]This is rectangle with H: "+h+", W: "+w);
    }
}

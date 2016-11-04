package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Gradient extends Applet {

	public void paint(Graphics g) {

		int h = getHeight();
		int w = getWidth();

		//GradientPaint()
		
		for (int y = 0; y < h; y++) {
			double concentrate = 1 - (double) y / h;
			int a = (int) (concentrate * 255);

			Color color = new Color(a, a, a);
			g.setColor(color);
			g.drawLine(0, y, w, y);

		}

	}

}

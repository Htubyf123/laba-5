package Laba2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent {
	BufferedImage image;
	
	public Image() {
		try {
			image = ImageIO.read(new File("src/ÀÓ„ÓÚËÔ ”√¿“”.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void paintComponent(Graphics g) {
		if(image == null) return;
		g.drawImage(image, 20, 20, null);
	}
}
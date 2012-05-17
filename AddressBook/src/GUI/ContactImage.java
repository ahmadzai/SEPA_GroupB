package GUI;

import java.awt.Graphics2D;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import java.awt.image.*;

import javax.imageio.ImageIO;


public class ContactImage {
	
	private BufferedImage img;
	private ImageIcon icon;
	
	
	/***
	 * @author wazir
	 * @param imagePath
	 */
	public ContactImage(URL imagePath) {
		
		img = null;
		try {
			img = ImageIO.read(imagePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/***
	 * @author wazir
	 * @return ImageIcon
	 */
	public ImageIcon loadImage() {
		
		if(img != null) {
			int width = 100;
			int height = 100;
			BufferedImage tmpImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = tmpImage.createGraphics();
			g.drawImage(img, 0, 0, null);
	
			icon = new ImageIcon(img);
			return icon;
		}
		return null;
		
	
	}
	
	/***
	 * @author wazir
	 * @param width
	 * @param height
	 * @return ImageIcon
	 */
	public ImageIcon loadImage(int width, int height) {
		
		if(img != null) {
			BufferedImage tmpImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = tmpImage.createGraphics();
			g.drawImage(img, 0, 0, null);
	
			//return image;
			icon = new ImageIcon(img);
			return icon;
		}
		return null;
	}
	
	

}

package Helper;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import java.awt.image.*;

import javax.imageio.ImageIO;


public class ContactImage {
	
	private BufferedImage img;
	private ImageIcon icon;
	private File imgFile;
	
	
	/***
	 * @author wazir
	 * @param imagePath
	 */
	public ContactImage(File imgFile) {
		
		img = null;
		//imgFile = new File(path);
		try {
			img = ImageIO.read(imgFile);
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
			int width = 150;
			int height = 160;
			BufferedImage tmpImage = resizeImage(img, width, height);
			
			try {
				ImageIO.write(tmpImage, "png", new File("images/saved.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			imgFile = new File("images/saved.png");
			try {
				img = ImageIO.read(imgFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				img = null;
			}
			icon = new ImageIcon(img);
			return icon;
		}
		return null;
		
	
	}
	
	
	
	/***
	 * @author wazir khan
	 * @param image
	 * @param width
	 * @param height
	 * @return BufferedImage
	 */
	private BufferedImage resizeImage(BufferedImage image, int width, int height) {
		int type = image.getType() == 0? BufferedImage.TYPE_INT_ARGB : image.getType();
		BufferedImage resizedImage = new BufferedImage(width, height, type);
		Graphics2D g = resizedImage.createGraphics();
		g.setComposite(AlphaComposite.Src);

		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		RenderingHints.VALUE_INTERPOLATION_BILINEAR);

		g.setRenderingHint(RenderingHints.KEY_RENDERING,
		RenderingHints.VALUE_RENDER_QUALITY);

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(image, 0, 0, width, height, null);
		g.dispose();
		return resizedImage;
		
	}
	

}

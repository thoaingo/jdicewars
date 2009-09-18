package util;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;

public class ImageUtils {

	private static final Logger log = Logger.getLogger(ImageUtils.class.getName());
	
	public static ImageIcon createImageIcon(String path) {
		return createImageIcon(path, path);
	}
	
	public static ImageIcon createImageIcon(String path, String description) {
		URL imgURL = ImageUtils.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			log.log(Level.WARNING, "Couldn't find file: " + path);
			return null;
		}
	}
}

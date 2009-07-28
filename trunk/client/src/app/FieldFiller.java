package app;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import model.Area;

public class FieldFiller {

	private static Logger log = Logger.getLogger(FieldDrawer.class.getName());
	private int width;
	private int height;
	private Set<Area> areas = new HashSet<Area>();

	public FieldFiller(Dimension size) {
		this(size.width, size.height);
	}
	
	public FieldFiller(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void fill(Graphics2D g2d, int playersCount) {
		log.info("fill");
	}
}

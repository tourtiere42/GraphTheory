package object;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import java.util.ArrayList;

public class Node extends Object implements Serializable{
	private final int radius = 20;
	private final Color color = Color.cyan;
	private static int counter = 0;
	private ArrayList<Path> paths = new ArrayList<Path>();
	private boolean isSelected = false;
	
	public int nodeNum = counter;
	

	
	public Node() {
		
	}
	
	public Node(Node selectedNode) {
		this.position = selectedNode.getPostion();
	}
	
	public Node(Point p) {
		position.setPosition(p.getX(), p.getY());
		shape = new Ellipse2D.Double(position.getX(), position.getY(), radius, radius);
		counter++;
	}
	
	public Node(int x, int y) {
		this.position.setX(x);
		this.position.setX(y);
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(color);
		shape = new Ellipse2D.Double(position.getX()-radius/2, position.getY()-radius/2, radius, radius);
		g2d.fill(shape);
		
		if(isSelected) {
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(new Color(7, 101, 252));
			g2d.draw(shape);
		}
	}
	
	public void addPath(Path path) {
		paths.add(path);
	}
	
	public ArrayList<Path> getPaths() {
		return paths;
	}

	public int getDegree() {
		
		return paths.size();
	}
	
	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
}

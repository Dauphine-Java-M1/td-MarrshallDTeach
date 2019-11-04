package fr.dauphine.ja.mouhoubiabdelouheb.shapes.view;

import javax.swing.*;

import fr.dauphine.ja.mouhoubiabdelouheb.shapes.model.World;
import fr.dauphine.ja.mouhoubiabdelouheb.shapes.model.Circle;
import fr.dauphine.ja.mouhoubiabdelouheb.shapes.model.Point;
import fr.dauphine.ja.mouhoubiabdelouheb.shapes.model.Shapes;

import java.awt.*;

public class View extends JPanel{
	private World world;
	
	public View(World w) {
		world=w;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		for (Shapes s : this.world.getShapes()) {
			s.getDrawer().draw(g);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avanc ́e - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		View d = new View(new World());
		d.world.add(new Circle(new Point(200, 300), 500));
		frame.add(d);
		frame.setVisible(true);

	}

}
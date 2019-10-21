package fr.dauphine.ja.mouhoubiabdelouheb.shapes.view;

import javax.swing.*;
import java.awt.*;

public class MyDisplay extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		g.drawLine(0 , 0, width, height);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avanc ́e - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);

	}

}
package lpoo_game;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setTitle("Blueberry Storm");
		
		//create and add panel to the window
		JPanel gamePanel = new JPanel();
		window.add(gamePanel);
		gamePanel.setPreferredSize(new Dimension (800, 600));
		gamePanel.setBackground(Color.getHSBColor(0, 61, 62));
		
		//load custom font
		Font romans_story = null;
		try {
			romans_story = Font.createFont(Font.TRUETYPE_FONT, new File("/testing/resources/Romans Story.otf"));
			romans_story = romans_story.deriveFont(Font.PLAIN, 24f);
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
			//romans_story = new Font("Serif", Font.PLAIN, 24f);
		}
		
		//create button
		JButton buttonStart = new JButton("Start");
		buttonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//define what happens when button is pressed
				System.out.println("Game started!");
			}
		});
		//buttonStart.setSize(1750, 400);
		buttonStart.setFont(romans_story);
		
		//add the button to the window
		gamePanel.add(buttonStart);
		
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
		}

}



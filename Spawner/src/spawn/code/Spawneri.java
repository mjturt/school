package spawn.code;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Spawneri {
	private JFrame main;
	private JLabel header;
	private JLabel pallo;
	private JPanel control;
	public Spawneri() {
		main = new JFrame("Demo 4 T4"); 
		main.setSize(400, 200);
		main.setLayout(new GridLayout(3, 1));
        header = new JLabel("", JLabel.CENTER);
		pallo = new JLabel("", JLabel.CENTER);
		pallo.setSize(100, 100);

		control = new JPanel();
		control.setLayout(new FlowLayout());

		main.add(header);
		main.add(control);
		main.add(pallo);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Spawneri sp = new Spawneri();
		sp.showEventDemo();
	}

	private void showEventDemo() {
		header.setText("Demo 4 Tehtävä 4, GUI -ja projektinhallintaharjoitus");
		JButton button = new JButton("Luo ympyrä");
		button.setActionCommand("piirra");
		button.addActionListener(new click());
		control.add(button);
		main.setVisible(true);
	}

	private class click implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			if (command.equals("piirra")) {
pallo.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/res/pallo.png")));
			}
		}
	}
}

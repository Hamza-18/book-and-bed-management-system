package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TitlePanel extends JPanel {
	private Image icon;

	public TitlePanel() {
		setBackground(new Color(32, 30, 30));
		setMinimumSize(new Dimension(600, 90));
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel label = new JLabel("");
		add(label);
		icon = new ImageIcon(TitlePanel.class.getResource("/res/book and bed Logo.png")).getImage()
				.getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(icon));

		JLabel lblBookBed = new JLabel("Book & Bed");
		lblBookBed.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBookBed.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblBookBed.setHorizontalTextPosition(SwingConstants.LEADING);
		lblBookBed.setFont(new Font("Dialog", Font.BOLD, 55));
		lblBookBed.setForeground(new Color(255, 255, 255));
		lblBookBed.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookBed.setLocation(new Point(300, 0));
		add(lblBookBed);
	}
}

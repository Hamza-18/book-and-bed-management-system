package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class StudentPanel extends JPanel {

	private JPanel titlePanel;
	private JLabel titleLabel;
	private JPanel componentsPanel;
	private JPanel viewStudentPanel;
	private JPanel addStudentPanel;
	private JPanel updateStudentPanel;
	private JPanel deleteStudentPanel;
	private Image icon;
	private Image deleteStudentIcon;
	private Image updateStudentIcon;
	private Image viewStudentIcon;
	private SidePanelInterface sidePanelInterface;

	private static int BASIC_RED = 178;
	private static int BASIC_GREEN = 176;
	private static int BASIC_BLUE = 152;
	private static int SELECTED_RED = 255;
	private static int SELECTED_GREEN = 255;
	private static int SELECTED_BLUE = 255;

	private Dimension dim;

	public StudentPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));
		setComponents();
		setColor(null);
		viewStudentPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(viewStudentPanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		addStudentPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(addStudentPanel);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		updateStudentPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(updateStudentPanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		deleteStudentPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(deleteStudentPanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		componentsPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println(e.getComponent().getSize().width);
				if (e.getComponent().getSize().width != 719) {
					addStudentPanel.setBounds(600, 55, 296, 65);
					deleteStudentPanel.setBounds(600, 160, 296, 65);
					viewStudentPanel.setBounds(30, 55, 301, 65);
					updateStudentPanel.setBounds(30, 160, 301, 65);
				}
			}

			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("Moved to " + e.getComponent().getLocation());
			}
		});

	}

	public void setComponents() {
		titlePanel = new JPanel();
		titlePanel.setBackground(new Color(227, 187, 58));
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(titlePanel, BorderLayout.NORTH);
		titleLabel = new JLabel("Students");
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(titleLabel);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		viewStudentPanel = new JPanel();
		viewStudentPanel.setBounds(12, 55, 301, 65);
		componentsPanel.add(viewStudentPanel);

		JLabel lblViewStudents = new JLabel("View Students");
		lblViewStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		viewStudentPanel.add(lblViewStudents);

		addStudentPanel = new JPanel();
		addStudentPanel.setBounds(385, 55, 296, 65);
		componentsPanel.add(addStudentPanel);

		JLabel lblAddStudents = new JLabel("Add Student");
		lblAddStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		addStudentPanel.add(lblAddStudents);

		updateStudentPanel = new JPanel();
		updateStudentPanel.setBounds(12, 160, 301, 65);
		componentsPanel.add(updateStudentPanel);

		JLabel lblUpdateStudents = new JLabel("Update Student");
		lblUpdateStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		updateStudentPanel.add(lblUpdateStudents);

		deleteStudentPanel = new JPanel();
		deleteStudentPanel.setBounds(385, 160, 296, 65);
		componentsPanel.add(deleteStudentPanel);

		JLabel lblDeleteStudents = new JLabel("Delete Student");
		lblDeleteStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		deleteStudentPanel.add(lblDeleteStudents);

		icon = new ImageIcon(StudentPanel.class.getResource("/res/adduser.png")).getImage().getScaledInstance(50, 50,
				Image.SCALE_SMOOTH);
		lblAddStudents.setIcon(new ImageIcon(icon));

		deleteStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/deleteuser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblDeleteStudents.setIcon(new ImageIcon(deleteStudentIcon));

		updateStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/update.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblUpdateStudents.setIcon(new ImageIcon(updateStudentIcon));

		viewStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/viewdata.jpeg")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblViewStudents.setIcon(new ImageIcon(viewStudentIcon));

	}

	public void setColor(JPanel panel) {
		JPanel[] panels = { addStudentPanel, deleteStudentPanel, updateStudentPanel, viewStudentPanel };
		if (panel != null) {
			for (JPanel jPanel : panels) {
				if (jPanel != panel) {
					jPanel.setBackground(new Color(BASIC_RED, BASIC_GREEN, BASIC_BLUE));
					jPanel.setBorder(null);
				}
				panel.setBackground(new Color(SELECTED_RED, SELECTED_GREEN, SELECTED_BLUE));
				panel.setBorder(new LineBorder(new Color(0, 255, 255)));
			}
		} else {
			for (JPanel jPanel : panels) {
				jPanel.setBackground(new Color(BASIC_RED, BASIC_GREEN, BASIC_BLUE));
				jPanel.setBorder(null);
			}
		}

	}
}

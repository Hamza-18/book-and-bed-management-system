package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SidePanel extends JPanel {

	private JPanel homePanel;
	private JPanel studentPanel;
	private JPanel employeePanel;
	private JPanel kitchenPanel;

	private JLabel homeLabel;
	private JLabel studentsLabel;
	private JLabel employeeLabel;
	private JLabel kitchenLabel;

	private static final int BASIC_RED = 87;
	private static final int BASiC_GREEN = 132;
	private static final int BASIC_BLUE = 117;
	private static final int SELECTED_RED = 69;
	private static final int SELECTED_GREEN = 76;
	private static final int SELECTED_BLUE = 176;

	private SidePanelInterface sidePanelInterface;

	public SidePanel() {

		setBackground(new Color(48, 61, 98));
		setBorder(new LineBorder(getBackground()));
		GridBagLayout gridBagLayout = new GridBagLayout();
		Dimension dimension = getPreferredSize();
		dimension.width = 300;
		dimension.height = 200;
		setPreferredSize(new Dimension(200, 239));
		setPanelLayout(gridBagLayout);
		setMinimumSize(dimension);

		homePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setPanelColor(homePanel);
				sidePanelInterface.setPanel("homePanel");
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
		studentPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setPanelColor(studentPanel);
				sidePanelInterface.setPanel("studentPanel");
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
		employeePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setPanelColor(employeePanel);
				sidePanelInterface.setPanel("employeePanel");
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
		kitchenPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setPanelColor(kitchenPanel);

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
	}

	public void setPanelLayout(GridBagLayout gridBagLayout) {
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 46, 46, 49, 49, 31, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		homePanel = new JPanel();
		homePanel.setBackground(new Color(BASIC_RED, BASiC_GREEN, BASIC_BLUE));
		homePanel.setLayout(new FlowLayout(new FlowLayout().LEFT));
		GridBagConstraints gbc_homePanel = new GridBagConstraints();
		gbc_homePanel.insets = new Insets(0, 0, 5, 0);
		gbc_homePanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_homePanel.anchor = GridBagConstraints.NORTH;
		gbc_homePanel.gridx = 0;
		gbc_homePanel.gridy = 1;
		add(homePanel, gbc_homePanel);

		homeLabel = new JLabel("Home");
		homePanel.add(homeLabel);

		studentPanel = new JPanel();
		studentPanel.setBackground(new Color(BASIC_RED, BASiC_GREEN, BASIC_BLUE));
		studentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		GridBagConstraints gbc_studentsPanel = new GridBagConstraints();
		gbc_studentsPanel.anchor = GridBagConstraints.NORTH;
		gbc_studentsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_studentsPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_studentsPanel.gridx = 0;
		gbc_studentsPanel.gridy = 2;
		add(studentPanel, gbc_studentsPanel);

		studentsLabel = new JLabel("Students");
		studentPanel.add(studentsLabel);

		employeePanel = new JPanel();
		employeePanel.setBackground(new Color(BASIC_RED, BASiC_GREEN, BASIC_BLUE));
		employeePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		GridBagConstraints gbc_employeePanel = new GridBagConstraints();
		gbc_employeePanel.anchor = GridBagConstraints.NORTH;
		gbc_employeePanel.insets = new Insets(0, 0, 5, 0);
		gbc_employeePanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_employeePanel.gridx = 0;
		gbc_employeePanel.gridy = 3;
		add(employeePanel, gbc_employeePanel);

		employeeLabel = new JLabel("Employees");
		employeePanel.add(employeeLabel);

		kitchenPanel = new JPanel();
		kitchenPanel.setBackground(new Color(BASIC_RED, BASiC_GREEN, BASIC_BLUE));
		kitchenPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		GridBagConstraints gbc_kitchenPanel = new GridBagConstraints();
		gbc_kitchenPanel.fill = GridBagConstraints.BOTH;
		gbc_kitchenPanel.gridx = 0;
		gbc_kitchenPanel.gridy = 4;
		add(kitchenPanel, gbc_kitchenPanel);

		kitchenLabel = new JLabel("Kitchen");
		kitchenPanel.add(kitchenLabel);

	}

	public void setPanelColor(JPanel panel) {
		JPanel[] panels = { homePanel, studentPanel, employeePanel, kitchenPanel };
		panel.setBackground(new Color(SELECTED_RED, SELECTED_GREEN, SELECTED_BLUE));
		panel.setBorder(new LineBorder(Color.BLACK));
		for (JPanel jPanel : panels) {
			if (jPanel != panel) {
				jPanel.setBackground(new Color(BASIC_RED, BASiC_GREEN, BASIC_BLUE));
				jPanel.setBorder(null);
			}
		}
	}

	public void addPanel(SidePanelInterface sidePanelInterface) {
		this.sidePanelInterface = sidePanelInterface;
	}

}

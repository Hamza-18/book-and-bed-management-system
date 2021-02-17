package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class KitchenPanel extends JPanel {
	private JPanel titlePanel;
	private JPanel componenetsPanel;
	private JPanel monthlyExpense;
	private JPanel viewDailyExpense;
	private JPanel dailyExpense;
	private JPanel viewMonthPanel;

	private static int BASIC_RED = 178;
	private static int BASIC_GREEN = 176;
	private static int BASIC_BLUE = 152;

	private static int SELECTED_RED = 255;
	private static int SELECTED_GREEN = 255;
	private static int SELECTED_BLUE = 255;

	private MonthlyKitchenDialog monthlyKitchenDialog;
	private DailyExpenseDialog dailyExpenseDialog;
	private ViewMonthlyExpenseDialog viewMonthlyExpenseDialog;

	public KitchenPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));
		setComponents();
		setColor(null);

		monthlyKitchenDialog = new MonthlyKitchenDialog();
		dailyExpenseDialog = new DailyExpenseDialog();

		dailyExpense.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(dailyExpense);
				dailyExpenseDialog.setVisible(true);
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

		monthlyExpense.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(monthlyExpense);
				monthlyKitchenDialog.setVisible(true);
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

		viewDailyExpense.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(viewDailyExpense);
				viewMonthlyExpenseDialog = new ViewMonthlyExpenseDialog(null, "Daily");
				viewMonthlyExpenseDialog.setDailyData();
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

		viewMonthPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(viewMonthPanel);
				viewMonthlyExpenseDialog = new ViewMonthlyExpenseDialog(null, "Monthly");
				viewMonthlyExpenseDialog.setMonthlyData();
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

	public void setComponents() {
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		titlePanel.setBackground(new Color(227, 187, 58));
		add(titlePanel, BorderLayout.NORTH);

		JLabel lblKitchen = new JLabel("Kitchen");
		lblKitchen.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblKitchen);

		componenetsPanel = new JPanel();
		componenetsPanel.setLayout(null);
		componenetsPanel.setBackground(new Color(255, 255, 255));
		add(componenetsPanel, BorderLayout.CENTER);

		monthlyExpense = new JPanel();
		monthlyExpense.setBounds(12, 201, 329, 61);
		componenetsPanel.add(monthlyExpense);

		JLabel lblMonthlyExpence = new JLabel("Monthly Expense");
		lblMonthlyExpence.setFont(new Font("Dialog", Font.BOLD, 25));
		monthlyExpense.add(lblMonthlyExpence);

		viewDailyExpense = new JPanel();
		viewDailyExpense.setBounds(376, 69, 294, 67);
		componenetsPanel.add(viewDailyExpense);

		JLabel lblDailyExpence = new JLabel("View Daily Expense");
		lblDailyExpence.setFont(new Font("Dialog", Font.BOLD, 25));
		viewDailyExpense.add(lblDailyExpence);

		viewMonthPanel = new JPanel();
		viewMonthPanel.setBounds(12, 69, 329, 67);
		componenetsPanel.add(viewMonthPanel);

		JLabel viewMonthlyExpense = new JLabel("View Monthly Expense");
		viewMonthlyExpense.setFont(new Font("Dialog", Font.BOLD, 25));
		viewMonthPanel.add(viewMonthlyExpense);

		dailyExpense = new JPanel();
		dailyExpense.setBounds(376, 201, 294, 61);
		componenetsPanel.add(dailyExpense);

		JLabel lblDailyExpense = new JLabel("Daily Expense");
		lblDailyExpense.setFont(new Font("Dialog", Font.BOLD, 25));
		dailyExpense.add(lblDailyExpense);
	}

	public void setColor(JPanel panel) {

		JPanel[] panels = { monthlyExpense, viewDailyExpense, dailyExpense, viewMonthPanel };
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

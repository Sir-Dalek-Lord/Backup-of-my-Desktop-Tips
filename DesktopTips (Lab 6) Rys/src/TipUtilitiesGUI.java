import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This program uses a GUI interface to calcuate a tip
 * 
 * @author Isaac M Rys
 * @version 02/20/17
 * 
 */

public class TipUtilitiesGUI implements ActionListener {

	private JFrame frame;
	private JButton first;
	private JTextField textOne;
	private JTextField textTwo;
	private JTextField textThree;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipUtilitiesGUI window = new TipUtilitiesGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TipUtilitiesGUI() {
	

		frame = new JFrame("Calculator");
		frame.setBounds(200, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel billNTax = new JLabel("Input Bill with tax:");
		textOne = new JTextField("0");
		textOne.setPreferredSize(new Dimension(50, 20));
		textOne.setHorizontalAlignment(JTextField.CENTER);
		textOne.addActionListener(this);
		JPanel billNTaxPanel = new JPanel();
		billNTaxPanel.setBounds(140, 0, 100, 160);
		billNTaxPanel.add(billNTax);
		billNTaxPanel.add(textOne);
		frame.getContentPane().add(billNTaxPanel);
		
		JLabel tipPrecent = new JLabel("Tip (%):");
		textTwo = new JTextField("0");
		textTwo.setPreferredSize(new Dimension(50, 50));
		textTwo.setHorizontalAlignment(JTextField.CENTER);
		textTwo.addActionListener(this);
		JPanel tipPrecentPanel = new JPanel();
		tipPrecentPanel.setBounds(140, 150, 120, 180);
		tipPrecentPanel.add(tipPrecent);
		tipPrecentPanel.add(textTwo);
		frame.getContentPane().add(tipPrecentPanel);
		
		first = new JButton("Calculate Tip");
		first.setBounds(140, 250, 100, 50);
		first.setBackground(Color.black);
		first.setActionCommand("click");
		frame.getContentPane().add(first);
		first.addActionListener(this);
		
		JLabel finalTip = new JLabel("Result: Tip you should pay: ");
		textThree = new JTextField("0");
		textThree.setPreferredSize(new Dimension(50, 50));
		textThree.setHorizontalAlignment(JTextField.CENTER);
		textThree.addActionListener(this);
		JPanel finalTipPanel = new JPanel();
		finalTipPanel.setBounds(0, 0, 0, 0);
		finalTipPanel.add(finalTip);
		finalTipPanel.add(textThree);
		frame.getContentPane().add(finalTipPanel);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
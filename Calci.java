import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Calci extends JFrame implements ActionListener {

	private JPanel contentPane;
	JLabel display;
	String op="null",s1="",s2="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci frame = new Calci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 555);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(0, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("|||");
		mnNewMenu.setForeground(new Color(244, 129, 0));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Currency Convertor");
		mntmNewMenuItem.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Currency_Convertor cc=new Currency_Convertor();
				setContentPane(cc);
				validate();
				repaint();			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Calculator");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(contentPane);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_1.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_1.setForeground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_1);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Length Convertor");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Length_Convertor lc=new Length_Convertor();
				setContentPane(lc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_2.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_2.setBackground(new Color(0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Area Convertor");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Area_Convertor ac=new Area_Convertor();
				setContentPane(ac);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_3.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_3.setForeground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Volume Convertor");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volume_Convertor vc=new Volume_Convertor();
				setContentPane(vc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_4.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_4.setBackground(new Color(0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Speed Convertor");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Speed_Convertor sc=new Speed_Convertor();
				setContentPane(sc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_5.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_5.setBackground(new Color(0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Weight Conversion");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Weight_Convertor wc=new Weight_Convertor();
				setContentPane(wc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_6.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_6.setForeground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Temperature Convertor");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperature_Convertor tc=new Temperature_Convertor();
				setContentPane(tc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_7.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_7.setBackground(new Color(0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Power Convertor");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Power_Convertor poc=new Power_Convertor();
				setContentPane(poc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_8.setBackground(new Color(0, 0, 0));
		mntmNewMenuItem_8.setForeground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Pressure Convertor");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pressure_Convertor prc=new Pressure_Convertor();
				setContentPane(prc);
				validate();
				repaint();
			}
		});
		mntmNewMenuItem_9.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_9.setBackground(new Color(0, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBounds(new Rectangle(0, 0, 408, 559));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(42, 42, 42));
		panel.setBounds(0, 135, 362, 371);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton b0 = new JButton("0");
		b0.setForeground(new Color(255, 255, 255));
		b0.setFont(new Font("Arial", Font.BOLD, 28));
		b0.setBorderPainted(false);
		b0.setBackground(new Color(90, 90, 90));
		b0.setBounds(10, 300, 160, 50);
		b0.addActionListener(this);
		panel.add(b0);
		
		JButton bpoint = new JButton(".");
		bpoint.setForeground(new Color(255, 255, 255));
		bpoint.setFont(new Font("Arial", Font.BOLD, 28));
		bpoint.setBorderPainted(false);
		bpoint.setBackground(new Color(90, 90, 90));
		bpoint.setBounds(190, 300, 70, 50);
		bpoint.addActionListener(this);
		panel.add(bpoint);
		
		JButton bequals = new JButton("=");
		bequals.setForeground(new Color(255, 255, 255));
		bequals.setFont(new Font("Arial", Font.BOLD, 28));
		bequals.setBorderPainted(false);
		bequals.setBackground(new Color(90, 90, 90));
		bequals.setBounds(280, 300, 70, 50);
		bequals.addActionListener(this);
		panel.add(bequals);
		
		JButton b1 = new JButton("1");
		b1.setForeground(new Color(255, 255, 255));
		b1.setFont(new Font("Arial", Font.BOLD, 28));
		b1.setBorderPainted(false);
		b1.setBackground(new Color(90, 90, 90));
		b1.setBounds(10, 230, 70, 50);
		b1.addActionListener(this);
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Arial", Font.BOLD, 28));
		b2.setBackground(new Color(90, 90, 90));
		b2.setBorderPainted(false);
		b2.setBounds(100, 230, 70, 50);
		b2.addActionListener(this);
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setForeground(new Color(255, 255, 255));
		b3.setFont(new Font("Arial", Font.BOLD, 28));
		b3.setBorderPainted(false);
		b3.setBackground(new Color(90, 90, 90));
		b3.setBounds(190, 230, 70, 50);
		b3.addActionListener(this);
		panel.add(b3);
		
		JButton bplus = new JButton("+");
		bplus.setForeground(new Color(255, 255, 255));
		bplus.setFont(new Font("Arial", Font.BOLD, 28));
		bplus.setBorderPainted(false);
		bplus.setBackground(new Color(90, 90, 90));
		bplus.setBounds(280, 230, 70, 50);
		bplus.addActionListener(this);
		panel.add(bplus);
		
		JButton b4 = new JButton("4");
		b4.setForeground(new Color(255, 255, 255));
		b4.setFont(new Font("Arial", Font.BOLD, 28));
		b4.setBorderPainted(false);
		b4.setBackground(new Color(90, 90, 90));
		b4.setBounds(10, 160, 70, 50);
		b4.addActionListener(this);
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setForeground(new Color(255, 255, 255));
		b5.setFont(new Font("Arial", Font.BOLD, 28));
		b5.setBorderPainted(false);
		b5.setBackground(new Color(90, 90, 90));
		b5.setBounds(100, 160, 70, 50);
		b5.addActionListener(this);
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setForeground(new Color(255, 255, 255));
		b6.setFont(new Font("Arial", Font.BOLD, 28));
		b6.setBorderPainted(false);
		b6.setBackground(new Color(90, 90, 90));
		b6.setBounds(190, 160, 70, 50);
		b6.addActionListener(this);
		panel.add(b6);
		
		JButton bminus = new JButton("-");
		bminus.setForeground(new Color(255, 255, 255));
		bminus.setFont(new Font("Arial", Font.BOLD, 28));
		bminus.setBorderPainted(false);
		bminus.setBackground(new Color(90, 90, 90));
		bminus.setBounds(280, 160, 70, 50);
		bminus.addActionListener(this);
		panel.add(bminus);
		
		JButton b7 = new JButton("7");
		b7.setForeground(new Color(255, 255, 255));
		b7.setFont(new Font("Arial", Font.BOLD, 28));
		b7.setBorderPainted(false);
		b7.setBackground(new Color(90, 90, 90));
		b7.setBounds(10, 90, 70, 50);
		b7.addActionListener(this);
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setForeground(new Color(255, 255, 255));
		b8.setFont(new Font("Arial", Font.BOLD, 28));
		b8.setBorderPainted(false);
		b8.setBackground(new Color(90, 90, 90));
		b8.setBounds(100, 90, 70, 50);
		b8.addActionListener(this);
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setForeground(new Color(255, 255, 255));
		b9.setFont(new Font("Arial", Font.BOLD, 28));
		b9.setBorderPainted(false);
		b9.setBackground(new Color(90, 90, 90));
		b9.setBounds(190, 90, 70, 50);
		b9.addActionListener(this);
		panel.add(b9);
		
		JButton bmul = new JButton("*");
		bmul.setForeground(new Color(255, 255, 255));
		bmul.setFont(new Font("Arial", Font.BOLD, 28));
		bmul.setBorderPainted(false);
		bmul.setBackground(new Color(90, 90, 90));
		bmul.setBounds(280, 90, 70, 50);
		bmul.addActionListener(this);
		panel.add(bmul);
		
		JButton ballclear = new JButton("AC");
		ballclear.setForeground(new Color(255, 255, 255));
		ballclear.setFont(new Font("Arial", Font.BOLD, 28));
		ballclear.setBackground(new Color(90, 90, 90));
		ballclear.setBorderPainted(false);
		ballclear.setBounds(10, 20, 160, 50);
		ballclear.addActionListener(this);
		panel.add(ballclear);
		
		JButton bclear = new JButton("X");
		bclear.setFont(new Font("Arial", Font.BOLD, 28));
		bclear.setForeground(new Color(255, 255, 255));
		bclear.setBackground(new Color(90, 90, 90));
		bclear.setBorderPainted(false);
		bclear.setBounds(190, 20, 70, 50);
		bclear.addActionListener(this);
		panel.add(bclear);
		
		JButton bdiv = new JButton("/");
		bdiv.setForeground(new Color(255, 255, 255));
		bdiv.setFont(new Font("Arial", Font.BOLD, 28));
		bdiv.setBorderPainted(false);
		bdiv.setBackground(new Color(90, 90, 90));
		bdiv.setBounds(280, 20, 70, 50);
		bdiv.addActionListener(this);
		panel.add(bdiv);
		
		display = new JLabel("0");
		display.setVerticalAlignment(SwingConstants.BOTTOM);
		display.setHorizontalAlignment(SwingConstants.TRAILING);
		display.setFont(new Font("Arial", Font.BOLD, 54));
		display.setForeground(new Color(255, 255, 255));
		display.setBounds(10, 50, 342, 84);
		contentPane.add(display);
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String cmd=ae.getActionCommand();
		if(cmd.equals("AC"))
		{
			display.setText("0");
			s1="";
			s2="";
			op="null";
		}
		if(cmd.equals("+"))
		{
			if(s2.equals("")) 
			{
			}
			else
			{
				display.setText("");
				display.setText(String.valueOf(equalTo()));
				s1=String.valueOf(equalTo());
				s2="";
			}
			op="+";
			display.setText(display.getText()+"+");
		}
		if(cmd.equals("-"))
		{
			if(s2.equals("")) 
			{
			}
			else
			{
				display.setText("");
				display.setText(String.valueOf(equalTo()));
				s1=String.valueOf(equalTo());
				s2="";
			}
			op="-";
			display.setText(display.getText()+"-");
		}
		if(cmd.equals("*"))
		{
			if(s2.equals("")) 
			{
			}
			else
			{
				display.setText("");
				display.setText(String.valueOf(equalTo()));
				s1=String.valueOf(equalTo());
				s2="";
			}
			op="*";
			display.setText(display.getText()+"*");
		}
		if(cmd.equals("/"))
		{
			if(s2.equals("")) 
			{
			}
			else
			{
				display.setText("");
				display.setText(String.valueOf(equalTo()));
				s1=String.valueOf(equalTo());
				s2="";
			}
			op="/";
			display.setText(display.getText()+"/");
		}
		if(cmd.charAt(0)>='0'&&cmd.charAt(0)<='9'||cmd.equals("."))
		{
			if(display.getText().equals("0"))
				display.setText("");
			display.setText(display.getText()+cmd);
			if(op.equals("null"))
			{
				s1=s1+cmd;
			}
			else
			{
				s2=s2+cmd;
			}
		}
		if(cmd.equals("="))
		{
			display.setText(String.valueOf(equalTo()));
		}
		if(cmd.equals("X"))
		{
			
			if(op.equals("null"))
			{
				s1=s1.substring(0, (s1.length()-1));
			}
			else if(display.getText().charAt((display.getText().length()-1))=='+'||display.getText().charAt((display.getText().length()-1))=='-'||display.getText().charAt((display.getText().length()-1))=='*'||display.getText().charAt((display.getText().length()-1))=='/')
			{
				op="null";
			}
			else
			{
				if(s2.length()>0)
				s2=s2.substring(0, (s2.length()-1));
			}
			display.setText(display.getText().substring(0, (display.getText().length()-1)));
		}
	}
	public double equalTo() {
		switch(op)
		{
		case "+":
			return (Double.parseDouble(s1)+Double.parseDouble(s2));
		case "-":
			return (Double.parseDouble(s1)-Double.parseDouble(s2));
		case "*":
			return (Double.parseDouble(s1)*Double.parseDouble(s2));
		case "/":
			return (Double.parseDouble(s1)/Double.parseDouble(s2));
		default:
			return 0;
		}
	}
}

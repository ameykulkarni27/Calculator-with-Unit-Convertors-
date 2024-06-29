import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Currency_Convertor extends JPanel implements ActionListener {
	JLabel l1,l2;
	JComboBox cb1,cb2;
	double a,inr;
	/**
	 * Create the panel.
	 */
	public Currency_Convertor() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(42, 42, 42));
		panel.setBounds(0, 160, 362, 346);
		add(panel);
		panel.setLayout(null);
		
		JButton b0 = new JButton("0");
		b0.setForeground(new Color(255, 255, 255));
		b0.setFont(new Font("Arial", Font.BOLD, 28));
		b0.setBorderPainted(false);
		b0.setBackground(new Color(90, 90, 90));
		b0.setBounds(10, 260, 160, 60);
		b0.addActionListener(this);
		panel.add(b0);
		
		JButton bpoint = new JButton(".");
		bpoint.setForeground(new Color(255, 255, 255));
		bpoint.setFont(new Font("Arial", Font.BOLD, 28));
		bpoint.setBackground(new Color(90, 90, 90));
		bpoint.setBorderPainted(false);
		bpoint.setBounds(190, 260, 70, 60);
		bpoint.addActionListener(this);
		panel.add(bpoint);
		
		JButton bequals = new JButton("=");
		bequals.setForeground(new Color(255, 255, 255));
		bequals.setFont(new Font("Arial", Font.BOLD, 28));
		bequals.setBorderPainted(false);
		bequals.setBackground(new Color(90, 90, 90));
		bequals.setBounds(280, 260, 70, 60);
		bequals.addActionListener(this);
		panel.add(bequals);
		
		JButton b7 = new JButton("7");
		b7.setForeground(new Color(255, 255, 255));
		b7.setFont(new Font("Arial", Font.BOLD, 28));
		b7.setBackground(new Color(90, 90, 90));
		b7.setBorderPainted(false);
		b7.setBackground(new Color(90, 90, 90));
		b7.setBounds(10, 20, 70, 60);
		b7.addActionListener(this);
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setForeground(new Color(255, 255, 255));
		b8.setFont(new Font("Arial", Font.BOLD, 28));
		b8.setBackground(new Color(90, 90, 90));
		b8.setBorderPainted(false);
		b8.setBackground(new Color(90, 90, 90));
		b8.setBounds(100, 20, 70, 60);
		b8.addActionListener(this);
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setForeground(new Color(255, 255, 255));
		b9.setFont(new Font("Arial", Font.BOLD, 28));
		b9.setBackground(new Color(90, 90, 90));
		b9.setBackground(new Color(90, 90, 90));
		b9.setBorderPainted(false);
		b9.setBounds(190, 20, 70, 60);
		b9.addActionListener(this);
		panel.add(b9);
		
		JButton ballclear = new JButton("AC");
		ballclear.setForeground(new Color(255, 255, 255));
		ballclear.setFont(new Font("Arial", Font.BOLD, 28));
		ballclear.setBackground(new Color(90, 90, 90));
		ballclear.setBorderPainted(false);
		ballclear.setBackground(new Color(90, 90, 90));
		ballclear.setBounds(280, 20, 70, 140);
		ballclear.addActionListener(this);
		panel.add(ballclear);
		
		JButton b4 = new JButton("4");
		b4.setForeground(new Color(255, 255, 255));
		b4.setFont(new Font("Arial", Font.BOLD, 28));
		b4.setBorderPainted(false);
		b4.setBackground(new Color(90, 90, 90));
		b4.setBounds(10, 100, 70, 60);
		b4.addActionListener(this);
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Arial", Font.BOLD, 28));
		b5.setForeground(new Color(255, 255, 255));
		b5.setBackground(new Color(90, 90, 90));
		b5.setBorderPainted(false);
		b5.setBounds(100, 100, 70, 60);
		b5.addActionListener(this);
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Arial", Font.BOLD, 28));
		b6.setForeground(new Color(255, 255, 255));
		b6.setBackground(new Color(90, 90, 90));
		b6.setBorderPainted(false);
		b6.setBackground(new Color(90, 90, 90));
		b6.setBounds(190, 100, 70, 60);
		b6.addActionListener(this);
		panel.add(b6);
		
		JButton b1 = new JButton("1");
		b1.setFont(new Font("Arial", Font.BOLD, 28));
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(90, 90, 90));
		b1.setBorderPainted(false);
		b1.setBounds(10, 180, 70, 60);
		b1.addActionListener(this);
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Arial", Font.BOLD, 28));
		b2.setBorderPainted(false);
		b2.setBackground(new Color(90, 90, 90));
		b2.setBounds(100, 180, 70, 60);
		b2.addActionListener(this);
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Arial", Font.BOLD, 28));
		b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(90, 90, 90));
		b3.setBorderPainted(false);
		b3.setBounds(190, 180, 70, 60);
		b3.addActionListener(this);
		panel.add(b3);
		
		JButton bclear = new JButton("X");
		bclear.setForeground(new Color(255, 255, 255));
		bclear.setFont(new Font("Arial", Font.BOLD, 28));
		bclear.setBorderPainted(false);
		bclear.setBackground(new Color(90, 90, 90));
		bclear.setBounds(280, 180, 70, 60);
		bclear.addActionListener(this);
		panel.add(bclear);
		
		JLabel lblNewLabel = new JLabel("Currency Convertor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(51, 10, 255, 32);
		add(lblNewLabel);
		
		l1 = new JLabel("0");
		l1.setHorizontalAlignment(SwingConstants.TRAILING);
		l1.setFont(new Font("Arial", Font.BOLD, 21));
		l1.setForeground(new Color(255, 255, 255));
		l1.setBounds(191, 60, 161, 32);
		add(l1);
		
		l2 = new JLabel("0");
		l2.setHorizontalAlignment(SwingConstants.TRAILING);
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Arial", Font.BOLD, 21));
		l2.setBounds(191, 112, 161, 37);
		add(l2);
		
		cb1 = new JComboBox();
		cb1.setFont(new Font("Arial", Font.PLAIN, 16));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"US Dollar", "Pounds", "Indian Rupees", "Candian Dollar", "Yen", "Euro", "Aus Dollar"}));
		cb1.setForeground(new Color(255, 255, 255));
		cb1.setBackground(new Color(0, 0, 0));
		cb1.setBounds(10, 60, 171, 44);
		add(cb1);
		
		cb2 = new JComboBox();
		cb2.setFont(new Font("Arial", Font.PLAIN, 16));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupees", "US Dollar", "Pounds", "Candian Dollar", "Yen", "Euro", "Aus Dollar"}));
		cb2.setForeground(new Color(255, 255, 255));
		cb2.setBackground(new Color(0, 0, 0));
		cb2.setBounds(10, 112, 171, 38);
		add(cb2);
	}
	public void actionPerformed(ActionEvent ae) {
		String cmd=ae.getActionCommand();
		if(cmd.equals("AC"))
		{
			l1.setText("0");
			l2.setText("0");
		}
		if(cmd.equals("0"))
		{
			if(l1.getText().equals("0"))
				l1.setText("0");
			else
				l1.setText(l1.getText()+"0");
		}
		if(cmd.equals("1"))
		{
			if(l1.getText().equals("0"))
				l1.setText("1");
			else
				l1.setText(l1.getText()+"1");
		}
		if(cmd.equals("2"))
		{
			if(l1.getText().equals("0"))
				l1.setText("2");
			else
				l1.setText(l1.getText()+"2");
		}
		if(cmd.equals("3"))
		{
			if(l1.getText().equals("0"))
				l1.setText("3");
			else
				l1.setText(l1.getText()+"3");
		}
		if(cmd.equals("4"))
		{
			if(l1.getText().equals("0"))
				l1.setText("4");
			else
				l1.setText(l1.getText()+"4");
		}
		if(cmd.equals("5"))
		{
			if(l1.getText().equals("5"))
				l1.setText("0");
			else
				l1.setText(l1.getText()+"5");
		}
		if(cmd.equals("6"))
		{
			if(l1.getText().equals("0"))
				l1.setText("6");
			else
				l1.setText(l1.getText()+"6");
		}
		if(cmd.equals("7"))
		{
			if(l1.getText().equals("0"))
				l1.setText("7");
			else
				l1.setText(l1.getText()+"7");
		}
		if(cmd.equals("8"))
		{
			if(l1.getText().equals("0"))
				l1.setText("8");
			else
				l1.setText(l1.getText()+"8");
		}
		if(cmd.equals("9"))
		{
			if(l1.getText().equals("0"))
				l1.setText("9");
			else
				l1.setText(l1.getText()+"9");
		}
		if(cmd.equals("."))
		{
			if(l1.getText().equals("0"))
				l1.setText("0.");
			else
				l1.setText(l1.getText()+".");
		}
		if(cmd.equals("X"))
		{
			l1.setText(l1.getText().substring(0, (l1.getText().length()-1)));
		}
		if(cmd.equals("="))
		{
			a=Double.parseDouble(l1.getText());
			if(cb1.getSelectedItem().equals("Indian Rupees"))
				inr=a;
			if(cb1.getSelectedItem().equals("US Dollar"))
				inr=a*82.2;
			if(cb1.getSelectedItem().equals("Pounds"))
				inr=a*102.42;
			if(cb1.getSelectedItem().equals("Canadian Dollar"))
				inr=a*60.66;
			if(cb1.getSelectedItem().equals("Yen"))
				inr=a*0.6;
			if(cb1.getSelectedItem().equals("Euro"))
				inr=a*89.2;
			if(cb1.getSelectedItem().equals("Aus Dollar"))
				inr=a*54.64;
			if(cb2.getSelectedItem().equals("Indian Rupees"))
				l2.setText(String.valueOf(inr));
			if(cb2.getSelectedItem().equals("US Dollar"))
				l2.setText(String.valueOf(inr*0.0122));
			if(cb2.getSelectedItem().equals("Pounds"))
				l2.setText(String.valueOf(inr*0.0098));
			if(cb2.getSelectedItem().equals("Canadian Dollar"))
				l2.setText(String.valueOf(inr*0.0165));
			if(cb2.getSelectedItem().equals("Yen"))
				l2.setText(String.valueOf(inr*1.6512));
			if(cb2.getSelectedItem().equals("Aus Dollar"))
				l2.setText(String.valueOf(inr*0.0183));
			if(cb2.getSelectedItem().equals("Euro"))
				l2.setText(String.valueOf(inr*0.0112));
			
		}
	}
}

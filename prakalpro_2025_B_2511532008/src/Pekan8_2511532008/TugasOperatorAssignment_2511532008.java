package Pekan8_2511532008;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasOperatorAssignment_2511532008 extends JFrame {
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Input1;
	private JTextField OutputHasil;
	double Hasil=0;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.ERROR_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasOperatorAssignment_2511532008 frame = new TugasOperatorAssignment_2511532008();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TugasOperatorAssignment_2511532008() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TxtLabel1 = new JLabel("Bilangan 1");
		TxtLabel1.setForeground(new Color(255, 255, 255));
		TxtLabel1.setFont(new Font("Unispace", Font.PLAIN, 13));
		TxtLabel1.setBounds(23, 80, 104, 43);
		contentPane.add(TxtLabel1);
		
		Input1 = new JTextField();
		Input1.setBounds(118, 93, 96, 19);
		contentPane.add(Input1);
		Input1.setColumns(10);
		
		JLabel TxtLabel2 = new JLabel("Assignment");
		TxtLabel2.setForeground(Color.WHITE);
		TxtLabel2.setFont(new Font("Unispace", Font.PLAIN, 13));
		TxtLabel2.setBounds(23, 133, 104, 43);
		contentPane.add(TxtLabel2);
		
		JComboBox Operator = new JComboBox();
		Operator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		Operator.setBounds(118, 145, 96, 21);
		contentPane.add(Operator);
		
		OutputHasil = new JTextField();
		OutputHasil.setColumns(10);
		OutputHasil.setBounds(118, 199, 96, 19);
		contentPane.add(OutputHasil);
		
		JLabel TxtHasil = new JLabel("Hasil");
		TxtHasil.setForeground(Color.WHITE);
		TxtHasil.setFont(new Font("Unispace", Font.PLAIN, 13));
		TxtHasil.setBounds(23, 186, 104, 43);
		contentPane.add(TxtHasil);
		
		JLabel JUDUL = new JLabel("OPERATOR ASSIGNMENT");
		JUDUL.setForeground(Color.WHITE);
		JUDUL.setFont(new Font("Unispace", Font.PLAIN, 15));
		JUDUL.setBounds(118, 25, 198, 43);
		contentPane.add(JUDUL);
		
		JButton Proses = new JButton("Execute");
		Proses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (Input1.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan Harus Di Isi");
				} else {
					try {int a = Integer.parseInt(Input1.getText());
						 int c = Operator.getSelectedIndex();
					
						 if (c==0) {
							Hasil+=a;}
						 else if (c==1) {
							Hasil-=a;}
						 else if (c==2) {
							Hasil*=a;}
						 else if (c==3) {
							Hasil/=a;}
						 else if (c==4) {
							Hasil%=a;}
					} catch (NumberFormatException ex) {
						pesanEror ("Bilangan 1 harus diisi angka");
					} OutputHasil.setText(String.valueOf(Hasil));
				}
			}
		});
		Proses.setBackground(new Color(255, 255, 255));
		Proses.setBounds(242, 146, 104, 19);
		contentPane.add(Proses);
		
		

	}
}

package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JButton btnOdustani;
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 390, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_1_1());
		contentPane.add(getTextField_2_1());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getBtnOdustani());
		contentPane.add(getBtnObrisi());
		contentPane.add(getChckbxZaistaObrisiKurs());
		
		addWindowListener(new WindowAdapter() { 
			@Override 
			public void windowClosing(WindowEvent e) { 
				GUIKontroler.zatvoriProzorObrisiKursGUI(); 
			} 
		}); 
		
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("\u0160ifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSifra.setBounds(10, 24, 175, 24);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNaziv.setBounds(203, 24, 175, 24);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblProdajniKurs.setBounds(10, 99, 175, 24);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs.setBounds(203, 99, 175, 24);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEditable(false);
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 59, 175, 20);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setEditable(false);
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(203, 59, 175, 20);
		}
		return textFieldNaziv;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSrednjiKurs.setBounds(10, 167, 175, 24);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSkraceniNaziv.setBounds(203, 167, 175, 24);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_2() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setColumns(10);
			textFieldKupovniKurs.setBounds(203, 125, 175, 20);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextField_1_1() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setColumns(10);
			textFieldProdajniKurs.setBounds(10, 125, 175, 20);
		}
		return textFieldProdajniKurs;
	}
	private JTextField getTextField_2_1() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setEditable(false);
			textFieldSrednjiKurs.setColumns(10);
			textFieldSrednjiKurs.setBounds(10, 195, 175, 20);
		}
		return textFieldSrednjiKurs;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setEditable(false);
			textFieldSkraceniNaziv.setColumns(10);
			textFieldSkraceniNaziv.setBounds(203, 195, 175, 20);
		}
		return textFieldSkraceniNaziv;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriProzorObrisiKursGUI();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(60, 30));
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnOdustani.setBounds(203, 261, 171, 33);
		}
		return btnOdustani;
	}
	JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obri\u0161i");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Obrisan kurs \n \u0160ifra: " + textFieldSifra.getText()
									+ " Naziv: " + textFieldNaziv.getText() 
									+ "; Prodajni kurs: " + textFieldProdajniKurs.getText()
									+ "; Kupovni kurs: " + textFieldKupovniKurs.getText()
									+ "; Srednji kurs: " + textFieldSrednjiKurs.getText()
									+ "; Skra\u0107eni naziv " + textFieldSkraceniNaziv.getText()
									+ ";" ;
					GUIKontroler.dodajTekstUMenjacnicaGui(kurs);
				}
			});
			btnObrisi.setPreferredSize(new Dimension(60, 30));
			btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 261, 175, 33);
		}
		return btnObrisi;
	}
	JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obri\u0161i kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.cekiranoZaistaObrisi();
				}
			});
			chckbxZaistaObrisiKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxZaistaObrisiKurs.setBounds(6, 231, 179, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
}

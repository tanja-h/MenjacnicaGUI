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
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JLabel lblValuta;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JComboBox<String> valutaComboBox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 430, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getValutaComboBox());
		setLocationRelativeTo(null);
		
		ButtonGroup vrstaTransakcije = new ButtonGroup();
		vrstaTransakcije.add(getRdbtnKupovina());
		vrstaTransakcije.add(getRdbtnProdaja());
		
		addWindowListener(new WindowAdapter() { 
			@Override 
			public void windowClosing(WindowEvent e) { 
				GUIKontroler.zatvoriProzorIzvrsiZamenuGUI(); 
			} 
		});
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs.setBounds(10, 23, 117, 25);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblProdajniKurs.setBounds(256, 23, 132, 25);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblValuta.setBounds(175, 23, 50, 25);
		}
		return lblValuta;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setBounds(10, 59, 155, 20);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setBounds(256, 59, 155, 20);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblIznos.setBounds(10, 101, 46, 19);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(10, 131, 155, 20);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVrstaTransakcije.setBounds(243, 98, 117, 25);
		}
		return lblVrstaTransakcije;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tr;
					if(rdbtnKupovina.isSelected()){
						tr = "Kupovina;";
					} else {
						tr = "Prodaja;";
					}
					String zamena = "Izvrsena zamena Valuta: "
									+ valutaComboBox.getSelectedItem().toString()				
									+ "; Iznos: " + textFieldIznos.getText()
									+ "; Vrsta transakcije: " + tr;
					
					GUIKontroler.dodajTekstUMenjacnicaGui(zamena);
				}
			});
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnIzvrsiZamenu.setBounds(54, 254, 132, 36);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriProzorIzvrsiZamenuGUI();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnOdustani.setBounds(251, 255, 132, 35);
		}
		return btnOdustani;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setSelected(true);
			rdbtnKupovina.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtnKupovina.setBounds(251, 128, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtnProdaja.setBounds(251, 154, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int iznos = slider.getValue();
					textFieldIznos.setText("" + iznos);
				}
			});
			slider.setSnapToTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
			slider.setBounds(10, 193, 401, 50);
		}
		return slider;
	}
	private JComboBox<String> getValutaComboBox() {
		if (valutaComboBox == null) {
			valutaComboBox = new JComboBox<String>();
			valutaComboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			valutaComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"EUR", "USD", "CHF"}));
			valutaComboBox.setBounds(175, 59, 71, 20);
		}
		return valutaComboBox;
	}
}

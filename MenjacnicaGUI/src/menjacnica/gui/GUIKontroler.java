package menjacnica.gui;

import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIKontroler {
	private static MenjacnicaGUI menjacnicaGUI;
	private static DodajKursGUI dodajKursGUI;
	private static ObrisiKursGUI obrisiKursGUI;
	
	public static String izaberiFajl(){
		JFileChooser fc = new JFileChooser();
		int a = fc.showOpenDialog(menjacnicaGUI);
	
		if (a == JFileChooser.APPROVE_OPTION) { 
			return fc.getSelectedFile().getAbsolutePath();
		}
		return "";
	}
	
	
	public static void upisiText(String text, Object mesto) { 
		if (mesto instanceof JTextArea) { 
			((JTextArea) mesto).setText(text); 
		} 
		if (mesto instanceof JTextField) { 
			((JTextField) mesto).setText(text); 
		} 
	} 

	public static String sacuvajFajl(){
		JFileChooser fc = new JFileChooser();
		int a = fc.showSaveDialog(menjacnicaGUI);
		if(a == JFileChooser.APPROVE_OPTION){
			return fc.getSelectedFile().getAbsolutePath();
		}
		return "";
	}
	
	public static void izadji(){
		int odg = JOptionPane.showConfirmDialog(menjacnicaGUI,
				"Da li zelite da izadjete iz programa?",
						"Izlaz", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(odg == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	public static void podaciOAutoru(){
		JOptionPane.showMessageDialog(menjacnicaGUI, "@author:Tanja Hromin - FON");
	}
	
	public static void otvoriProzorDodajKursGUI(){
		GUIKontroler.dodajKursGUI = new DodajKursGUI();
		dodajKursGUI.setVisible(true);
	}
	
	public static void zatvoriProzorDodajKursGUI(){
		dodajKursGUI.dispose();
		dodajKursGUI = null;
	}
	
	public static void dodajTekstUMenjacnicaGui(String kurs){
		String noviTekst = menjacnicaGUI.getSouthTextArea().getText() + "\n" + kurs;
		GUIKontroler.upisiText(noviTekst, menjacnicaGUI.getSouthTextArea());
	}
	
	public static void otvoriProzorObrisiKursGUI(){
		GUIKontroler.obrisiKursGUI = new ObrisiKursGUI();
		obrisiKursGUI.setVisible(true);
	}
	
	public static void zatvoriProzorObrisiKursGUI(){
		obrisiKursGUI.dispose();
		obrisiKursGUI = null;
	}
	
	public static void cekiranoZaistaObrisi(){
		if(obrisiKursGUI.getChckbxZaistaObrisiKurs().isSelected()){
			obrisiKursGUI.getBtnObrisi().setEnabled(true);
		} else {
			obrisiKursGUI.getBtnObrisi().setEnabled(false);
		}
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.menjacnicaGUI = new MenjacnicaGUI();
					menjacnicaGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

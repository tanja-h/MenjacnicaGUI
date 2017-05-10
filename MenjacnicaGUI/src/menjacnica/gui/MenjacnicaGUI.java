package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel_East;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JPanel panel_Center;
	private JPanel panel_South;
	private JTable table;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JScrollPane tabelScrollPane;
	private JScrollPane sScrollPane;
	private JTextArea textArea;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_East(), BorderLayout.EAST);
		contentPane.add(getPanel_Center(), BorderLayout.CENTER);
		contentPane.add(getPanel_South(), BorderLayout.SOUTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/ikonica.png")));
		setLocationRelativeTo(null);
		
		addWindowListener(new WindowAdapter() { 
			@Override 
			public void windowClosing(WindowEvent arg0) { 
				GUIKontroler.izadji(); 
			} 
		}); 

	}
	private JPanel getPanel_East() {
		if (panel_East == null) {
			panel_East = new JPanel();
			panel_East.setPreferredSize(new Dimension(135, 10));
			panel_East.add(getBtnDodajKurs());
			panel_East.add(getBtnObrisiKurs());
			panel_East.add(getBtnIzvrsiZamenu());
		}
		return panel_East;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.setPreferredSize(new Dimension(120, 23));
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obri\u0161i kurs");
			btnObrisiKurs.setPreferredSize(new Dimension(120, 23));
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzvrsiZamenu;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JPanel getPanel_Center() {
		if (panel_Center == null) {
			panel_Center = new JPanel();
			panel_Center.setLayout(new BorderLayout(0, 0));
			panel_Center.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel_Center;
	}
	private JPanel getPanel_South() {
		if (panel_South == null) {
			panel_South = new JPanel();
			panel_South.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "STATUS", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_South.setPreferredSize(new Dimension(10, 70));
			panel_South.setLayout(new BorderLayout(0, 0));
			panel_South.add(getSScrollPane(), BorderLayout.CENTER);
		}
		return panel_South;
	}
	/**
	 * @return
	 */
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFillsViewportHeight(true);
			table.setName("");
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"}
			));
				
			table.setFillsViewportHeight(true); 
			addPopup(table, getPopupMenu());

		}
		return table;
	}
	
	private JScrollPane getScrollPane_1() {
		if (tabelScrollPane == null) {
			tabelScrollPane = new JScrollPane(table);
			tabelScrollPane.setViewportView(getTable()); 

		}
		return tabelScrollPane;
	}
	
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.izaberiFajl();
					if(!putanja.isEmpty()){
						GUIKontroler.upisiText(textArea.getText() + "Ucitan fajl: " + putanja+"\n", textArea);
					}
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.sacuvajFajl();
					if(!putanja.isEmpty()){
						GUIKontroler.upisiText(textArea.getText() + "Sacuvan fajl: " + putanja+"\n", textArea);
					}
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.izadji();
				}
			});
			mntmExit.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.podaciOAutoru();
				}
			});
			mntmAbout.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/motif/icons/Inform.gif")));
		}
		return mntmAbout;
	}
	private JScrollPane getSScrollPane() {
		if (sScrollPane == null) {
			sScrollPane = new JScrollPane();
			sScrollPane.setViewportView(getTextArea());
		}
		return sScrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obri\u0161i kurs");
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvr\u0161i zamenu");
		}
		return mntmIzvrsiZamenu;
	}
}

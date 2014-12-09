package ablm_abstem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JList;


public class IHMcuisson extends JFrame {
	
	private JPanel contentPane;
	private JTable tableCommandes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHMcuisson frame = new IHMcuisson();
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
	public IHMcuisson() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_Deconnecter = new JButton("D\u00E9connecter");
		btn_Deconnecter.setBounds(809, 11, 109, 23);
		contentPane.add(btn_Deconnecter);
		
		
		JLabel lblServiceCuisson = new JLabel("SERVICE CUISSON");
		lblServiceCuisson.setHorizontalAlignment(SwingConstants.CENTER);
		lblServiceCuisson.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblServiceCuisson.setBounds(115, 15, 579, 78);
		contentPane.add(lblServiceCuisson);
		
		
		JPanel pan_1 = new JPanel();                 //  premier panel
		pan_1.setBounds(50, 149, 821, 66);
		contentPane.add(pan_1);
		pan_1.setLayout(null);
		
		JButton btn_debut1 = new JButton ("D�but");				
		btn_debut1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_debut1.setBorderPainted(false);
		btn_debut1.setBackground(new Color(0, 204, 0));
		btn_debut1.setBounds(674, 11, 121, 43);                      // rajouter cette ligne pour tous les boutons (il leur faut leur taille)
		pan_1.add(btn_debut1);
		
		JButton btn_fini1 = new JButton ("Fini");
		btn_fini1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_fini1.setBorderPainted(false);
		btn_fini1.setBackground(SystemColor.activeCaptionBorder);
		pan_1.add(btn_fini1);
				
		JPanel pan_2 = new JPanel();             // deuxi�me panel
		pan_2.setBounds(50, 226, 821, 66);
		contentPane.add(pan_2);
		pan_2.setLayout(null);
		
		JButton btn_debut2 = new JButton ("D�but");				
		btn_debut2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_debut2.setBorderPainted(false);
		btn_debut2.setBackground(new Color(0, 204, 0));
		pan_2.add(btn_debut2);
		
		JButton btn_fini2 = new JButton ("Fini");
		btn_fini2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_fini2.setBorderPainted(false);
		btn_fini2.setBackground(SystemColor.activeCaptionBorder);
		pan_2.add(btn_fini2);
			
		JPanel pan_3 = new JPanel();                 //troisi�me panel
		pan_3.setBounds(50, 303, 821, 66);
		contentPane.add(pan_3);
		pan_3.setLayout(null);
		
		JButton btn_debut3 = new JButton ("D�but");
		btn_debut3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_debut3.setBorderPainted(false);
		btn_debut3.setBackground(new Color(0, 204, 0));
		pan_3.add(btn_debut3);
		
		JButton btn_fini3 = new JButton ("Fini");
		btn_fini3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_fini3.setBorderPainted(false);
		btn_fini3.setBackground(SystemColor.activeCaptionBorder);
		pan_3.add(btn_fini3);
		
		JPanel pan_4 = new JPanel();                 //quatri�me panel
		pan_4.setBounds(50, 380, 821, 66);
		contentPane.add(pan_4);
		pan_4.setLayout(null);
		
		JButton btn_debut4 = new JButton ("D�but");
		btn_debut4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_debut4.setBorderPainted(false);
		btn_debut4.setBackground(new Color(0, 204, 0));
		pan_4.add(btn_debut4);
		
		JButton btn_fini4 = new JButton ("Fini");
		btn_fini4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_fini4.setBorderPainted(false);
		btn_fini4.setBackground(SystemColor.activeCaptionBorder);
		pan_4.add(btn_fini4);
		
		JPanel pan_5 = new JPanel();         // cinqui�me panel
		pan_5.setBounds(50, 457, 821, 66);
		contentPane.add(pan_5);
		pan_5.setLayout(null);
		
		JButton btn_debut5 = new JButton ("D�but");
		btn_debut5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_debut5.setBorderPainted(false);
		btn_debut5.setBackground(new Color(0, 204, 0));
		pan_5.add(btn_debut5);
		
		JButton btn_fini5 = new JButton ("Fini");
		btn_fini5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_fini5.setBorderPainted(false);
		btn_fini5.setBackground(SystemColor.activeCaptionBorder);
		pan_5.add(btn_fini5);
		
	}
}
	
	        

	
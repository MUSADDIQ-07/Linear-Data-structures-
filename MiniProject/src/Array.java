import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertpos;
	private JTextField displaybox;
	private int arr[];
	
	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Welcome to array data structure.mp3";
	MP3Player arraypage= new MP3Player(new File(Home));
	
	{
		arraypage.play();
	}
	public static final String create="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\array of specified size is created.mp3";
	MP3Player createbutton= new MP3Player(new File(create));
	
	public static final String arrayinserted="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\element got inserted at Specified position.mp3";
	MP3Player arrayins= new MP3Player(new File(arrayinserted));
	
	public static final String arraydelete="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\element got Deleted at Specified position.mp3";
	MP3Player arraydeleted= new MP3Player(new File(arraydelete));
	
	public static final String arraydisplay="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\displaying array contents.mp3";
	MP3Player arraydisplaying= new MP3Player(new File(arraydisplay));
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setBounds(183, 20, 219, 26);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterArrayLength = new JLabel("Enter Array Length");
		lblEnterArrayLength.setBounds(10, 96, 175, 23);
		lblEnterArrayLength.setBackground(Color.WHITE);
		lblEnterArrayLength.setForeground(Color.BLACK);
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setFont(new Font("Consolas", Font.BOLD, 14));
		length.setBounds(183, 96, 140, 23);
		length.setForeground(Color.BLACK);
		length.setBackground(Color.WHITE);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton creat = new JButton("");
		creat.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\creatarray.png"));
		creat.setBounds(408, 83, 100, 49);
		creat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for creating array
				
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of Length "+len+" Created";
				createbutton.play();
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		creat.setFont(new Font("Constantia", Font.BOLD, 14));
		creat.setBackground(new Color(176, 196, 222));
		creat.setForeground(new Color(176, 196, 222));
		contentPane.add(creat);
		
		JLabel lblInsertAnInteger = new JLabel("Insert An Integer Element");
		lblInsertAnInteger.setBounds(10, 167, 234, 23);
		lblInsertAnInteger.setForeground(Color.BLACK);
		lblInsertAnInteger.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(lblInsertAnInteger);
		
		element = new JTextField();
		element.setFont(new Font("Consolas", Font.BOLD, 14));
		element.setBounds(237, 167, 64, 23);
		element.setForeground(Color.BLACK);
		element.setColumns(10);
		element.setBackground(Color.WHITE);
		contentPane.add(element);
		
		JButton insert = new JButton("");
		insert.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insert.png"));
		insert.setBounds(247, 200, 100, 49);
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos =Integer.valueOf(insertpos.getText());
				arr[pos]=elem;
				String message="Element "+elem+" Inserted @ Position "+pos;
				arrayins.play();
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertpos.setText("");
			}
		});
		insert.setForeground(new Color(176, 196, 222));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBackground(new Color(176, 196, 222));
		contentPane.add(insert);
		
		JLabel lblDeletePosition = new JLabel("Delete Position");
		lblDeletePosition.setBounds(10, 273, 140, 23);
		lblDeletePosition.setBackground(Color.WHITE);
		lblDeletePosition.setForeground(Color.BLACK);
		lblDeletePosition.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(lblDeletePosition);
		
		deletepos = new JTextField();
		deletepos.setFont(new Font("Consolas", Font.BOLD, 14));
		deletepos.setBounds(218, 273, 83, 23);
		deletepos.setForeground(new Color(0, 0, 139));
		deletepos.setColumns(10);
		deletepos.setBackground(Color.WHITE);
		contentPane.add(deletepos);
		
		insertpos = new JTextField();
		insertpos.setFont(new Font("Consolas", Font.BOLD, 14));
		insertpos.setBounds(408, 167, 64, 23);
		insertpos.setForeground(Color.BLACK);
		insertpos.setColumns(10);
		insertpos.setBackground(Color.WHITE);
		contentPane.add(insertpos);
		
		JLabel lblInsertPosition = new JLabel("Position");
		lblInsertPosition.setBounds(333, 167, 77, 23);
		lblInsertPosition.setForeground(Color.BLACK);
		lblInsertPosition.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(lblInsertPosition);
		
		JButton delete = new JButton("");
		delete.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\delete.png"));
		delete.setBounds(408, 258, 100, 49);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message="Element Deleted @ The Position "+pos;
				arraydeleted.play();
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
			}
		});
		delete.setForeground(new Color(176, 196, 222));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBackground(new Color(176, 196, 222));
		contentPane.add(delete);
		
		JButton display = new JButton("");
		display.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\display.png"));
		display.setBounds(408, 331, 100, 49);
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				arraydisplaying.play();
				String msg="";
				for (int i = 0; i < arr.length; i++) {
					msg=msg+" "+arr[i];
				}
				
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(176, 196, 222));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBackground(new Color(176, 196, 222));
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 14));
		displaybox.setBounds(92, 344, 278, 23);
		displaybox.setForeground(Color.BLACK);
		displaybox.setColumns(10);
		displaybox.setBackground(Color.WHITE);
		contentPane.add(displaybox);
		
		JButton home = new JButton("");
		home.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\HOME.png"));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Array Window Opening Code
				new Home().setVisible(true);
			}
		});
		home.setForeground(new Color(176, 196, 222));
		home.setFont(new Font("Calibri", Font.BOLD, 14));
		home.setBackground(new Color(176, 196, 222));
		home.setBounds(10, 20, 77, 37);
		contentPane.add(home);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\arrdata.png"));
		lblNewLabel_1.setBounds(0, 0, 574, 492);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(434, 100, -15, 2);
		contentPane.add(scrollPane);
		
		JButton button = new JButton("New button");
		button.setBounds(200, 395, 85, 21);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(237, 395, 85, 21);
		contentPane.add(btnNewButton);
	}
}

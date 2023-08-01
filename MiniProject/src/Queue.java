import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size1;
	private int r=-1;
	private int f=0;


	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\queuedata.mp3";
	MP3Player queu= new MP3Player(new File(Home));

	{
		queu.play();
	}

	public static final String Create1="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\queue of  specified size created.mp3";
	MP3Player queuCreate = new MP3Player(new File(Create1));
	
	public static final String queueinserted="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Inserted Successfully.mp3";
	MP3Player queueins= new MP3Player(new File(queueinserted));
	
	public static final String queueinsnot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Insertion is Not Possible!.mp3";
	MP3Player queuein= new MP3Player(new File(queueinsnot));
	
	public static final String delete="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Element Deleted.mp3";
	MP3Player queuedel= new MP3Player(new File(delete));
	
	public static final String deletenot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Deletion is not possible.mp3";
	MP3Player queuedelnot= new MP3Player(new File(deletenot));
	
	public static final String displayNot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Display is Not Possible.mp3";
	MP3Player displaynott= new MP3Player(new File(displayNot));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(Color.WHITE);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 584, 492);
		contentPane.add(contentPane_1);

		JLabel lblQueueDataStructure = new JLabel("Queue Data Structure");
		lblQueueDataStructure.setForeground(Color.BLUE);
		lblQueueDataStructure.setFont(new Font("Dialog", Font.BOLD, 20));
		lblQueueDataStructure.setBackground(Color.GREEN);
		lblQueueDataStructure.setBounds(168, 26, 257, 26);
		contentPane_1.add(lblQueueDataStructure);

		JLabel lblEnterStackSize = new JLabel("Enter Queue Size");
		lblEnterStackSize.setForeground(Color.BLACK);
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterStackSize.setBackground(Color.WHITE);
		lblEnterStackSize.setBounds(10, 97, 151, 23);
		contentPane_1.add(lblEnterStackSize);

		size = new JTextField();
		size.setFont(new Font("Consolas", Font.BOLD, 14));
		size.setForeground(Color.BLACK);
		size.setColumns(10);
		size.setBackground(Color.LIGHT_GRAY);
		size.setBounds(183, 96, 122, 23);
		contentPane_1.add(size);

		JButton creat = new JButton("");
		creat.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\cq.png"));
		creat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Queue creation
				
				size1=Integer.valueOf(size.getText());
				q=new int[size1];
				String message="Queue of Size "+size1+" Created";
				queuCreate.play();
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		creat.setForeground(Color.WHITE);
		creat.setFont(new Font("Constantia", Font.BOLD, 14));
		creat.setBackground(Color.WHITE);
		creat.setBounds(358, 82, 140, 43);
		contentPane_1.add(creat);

		JLabel lblEnterAnElement = new JLabel("Enter an  Element");
		lblEnterAnElement.setForeground(Color.BLACK);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 167, 168, 23);
		contentPane_1.add(lblEnterAnElement);

		element = new JTextField();
		element.setFont(new Font("Consolas", Font.BOLD, 14));
		element.setForeground(Color.BLACK);
		element.setColumns(10);
		element.setBackground(Color.LIGHT_GRAY);
		element.setBounds(183, 167, 122, 23);
		contentPane_1.add(element);

		JButton insert = new JButton("");
		insert.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertq.png"));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				if(r==size1-1) {
					queuein.play();
					JOptionPane.showMessageDialog(contentPane, "Insertion is Not Possible!");
					

				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					queueins.play();
					JOptionPane.showMessageDialog(contentPane, "Inserted Successfully:)");
					

				}
				element.setText("");
			}
		});
		insert.setForeground(Color.WHITE);
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBackground(Color.WHITE);
		insert.setBounds(358, 158, 103, 43);
		contentPane_1.add(insert);

		JButton display = new JButton("");
		display.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\displayq.png"));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(r==-1 ||f>r) {
					displaynott.play();
					JOptionPane.showMessageDialog(contentPane, "Display is Not Possible!");
				}else {

					for (int i =f; i <=r; i++) {
						msg=msg+" "+q[i];
					}
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(Color.WHITE);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBackground(Color.WHITE);
		display.setBounds(358, 264, 103, 43);
		contentPane_1.add(display);

		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 14));
		displaybox.setForeground(Color.BLACK);
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(56, 281, 278, 23);
		contentPane_1.add(displaybox);

		JButton home = new JButton("");
		home.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\HOME.png"));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for home
				new Home().setVisible(true);
			}
		});
		home.setForeground(Color.WHITE);
		home.setFont(new Font("Calibri", Font.BOLD, 14));
		home.setBackground(Color.WHITE);
		home.setBounds(10, 32, 77, 27);
		contentPane_1.add(home);

		JButton delete = new JButton("");
		delete.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\deleteq.png"));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(r==-1||f>r) {
					queuedelnot.play();
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible!");
				}else {
					queuedel.play();
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is :"+q[f]);
					++f;
				}
			}
		});
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBackground(Color.WHITE);
		delete.setBounds(358, 211, 103, 43);
		contentPane_1.add(delete);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\queue1.jpg"));
		lblNewLabel.setBounds(0, 346, 584, 146);
		contentPane_1.add(lblNewLabel);
	}
}

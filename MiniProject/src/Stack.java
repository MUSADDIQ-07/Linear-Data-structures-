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
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size1;
	private int top=-1;


	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Welcome to stack data structure.mp3";
	MP3Player stackpage= new MP3Player(new File(Home));
	{
		stackpage.play();
	}
	public static final String createstack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\stack of specified size is created.mp3";
	MP3Player stackcreating= new MP3Player(new File(createstack));

	public static final String pushstack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\element got pushed into the stack.mp3";
	MP3Player stackpush= new MP3Player(new File(pushstack));

	public static final String fullstack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Push Not Possible!  stack is full.mp3";
	MP3Player stackfull= new MP3Player(new File(fullstack));

	public static final String popstack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\element got poped.mp3";
	MP3Player stackpoped= new MP3Player(new File(popstack));

	public static final String emptystack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Pop Not Possible! stack is empty.mp3";
	MP3Player stackempty= new MP3Player(new File(emptystack));

	public static final String displaystack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\displaying stack contents.mp3";
	MP3Player stackdisplay= new MP3Player(new File(displaystack));

	public static final String displaynotstack="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\display not possible stack is empty.mp3";
	MP3Player stacknotdisplay= new MP3Player(new File(displaynotstack));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setForeground(SystemColor.textHighlight);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.BLUE);
		contentPane_1.setBounds(0, 0, 584, 502);
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);

		JLabel lblStackDataStructure = new JLabel("Stack Data Structure");
		lblStackDataStructure.setBounds(168, 26, 234, 26);
		lblStackDataStructure.setForeground(Color.RED);
		lblStackDataStructure.setFont(new Font("Dialog", Font.BOLD, 20));
		lblStackDataStructure.setBackground(Color.GREEN);
		contentPane_1.add(lblStackDataStructure);

		JLabel lblEnterStackSize = new JLabel("Enter Stack Size");
		lblEnterStackSize.setBounds(10, 147, 151, 23);
		lblEnterStackSize.setForeground(Color.MAGENTA);
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterStackSize.setBackground(Color.WHITE);
		contentPane_1.add(lblEnterStackSize);

		size = new JTextField();
		size.setFont(new Font("Consolas", Font.PLAIN, 14));
		size.setBounds(168, 147, 133, 23);
		size.setForeground(new Color(0, 0, 139));
		size.setColumns(10);
		size.setBackground(Color.WHITE);
		contentPane_1.add(size);

		JButton creat = new JButton("");
		creat.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\cstk.png"));
		creat.setBounds(168, 180, 139, 42);
		creat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Create stack
				size1=Integer.valueOf(size.getText());
				s=new int[size1];
				String message="Stack of Size "+size1+" Created";
				stackcreating.play();
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		creat.setForeground(Color.PINK);
		creat.setFont(new Font("Constantia", Font.BOLD, 14));
		creat.setBackground(Color.PINK);
		contentPane_1.add(creat);

		JLabel lblEnterAnElement = new JLabel("Enter an  Element");
		lblEnterAnElement.setBounds(10, 241, 168, 23);
		lblEnterAnElement.setForeground(Color.MAGENTA);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane_1.add(lblEnterAnElement);

		element = new JTextField();
		element.setFont(new Font("Consolas", Font.PLAIN, 14));
		element.setBounds(168, 241, 122, 23);
		element.setForeground(new Color(0, 0, 139));
		element.setColumns(10);
		element.setBackground(Color.WHITE);
		contentPane_1.add(element);

		JButton push = new JButton("");
		push.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\push.png"));
		push.setBounds(168, 274, 83, 27);
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size1-1) {
					stackfull.play();
					JOptionPane.showMessageDialog(contentPane, "Push Not Possible!");
				}else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					stackpush.play();
					JOptionPane.showMessageDialog(contentPane, "Push Successfull:)");
				}
				element.setText("");
			}
		});
		push.setForeground(Color.PINK);
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBackground(Color.PINK);
		contentPane_1.add(push);

		JButton display = new JButton("");
		display.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\disps.png"));
		display.setBounds(168, 374, 97, 27);
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(top==-1) {
					stacknotdisplay.play();
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}else {
					for (int i = top; i >=0; i--) {
						msg=msg+" "+s[i];
					}
					stackdisplay.play();
				}

				displaybox.setText(msg);
			}
		});
		display.setForeground(Color.MAGENTA);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBackground(Color.WHITE);
		contentPane_1.add(display);

		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.PLAIN, 14));
		displaybox.setBounds(10, 411, 278, 23);
		displaybox.setForeground(new Color(0, 0, 139));
		displaybox.setColumns(10);
		displaybox.setBackground(Color.WHITE);
		contentPane_1.add(displaybox);

		JButton home = new JButton("");
		home.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\HOME.png"));
		home.setBounds(10, 32, 77, 27);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//home page
				new Home().setVisible(true);
			}
		});
		home.setForeground(Color.PINK);
		home.setFont(new Font("Calibri", Font.BOLD, 14));
		home.setBackground(Color.PINK);
		contentPane_1.add(home);

		JButton pop = new JButton("");
		pop.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\pop.png"));
		pop.setBounds(168, 321, 83, 27);
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1) {
					stackempty.play();
					JOptionPane.showMessageDialog(contentPane, "Pop Not Possible!");
				}else {
					stackpoped.play();
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+s[top]);

					--top;
				}
			}
		});
		pop.setForeground(Color.PINK);
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBackground(Color.PINK);
		contentPane_1.add(pop);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\stc.png"));
		lblNewLabel.setBounds(0, 0, 584, 502);
		contentPane_1.add(lblNewLabel);
	}
}

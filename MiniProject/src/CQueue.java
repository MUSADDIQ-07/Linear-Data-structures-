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

public class CQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size1;
	private int r=-1;
	private int f=0;
	private int count=0;
	
	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\welcome to circular queue data structure.mp3";
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
	
	public static final String displayNot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Display is Not Possible.mp3";
	MP3Player displaynott= new MP3Player(new File(displayNot));
	
	public static final String deletenot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Deletion is not possible.mp3";
	MP3Player queuedelnot= new MP3Player(new File(deletenot));
	
	public static final String delete="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Element Deleted.mp3";
	MP3Player queuedel= new MP3Player(new File(delete));


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CQueue frame = new CQueue();
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
	public CQueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(SystemColor.textHighlight);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 584, 514);
		contentPane.add(contentPane_1);
		
		JLabel lblCircularQueueData = new JLabel("Circular Queue Data Structure");
		lblCircularQueueData.setForeground(Color.ORANGE);
		lblCircularQueueData.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCircularQueueData.setBackground(Color.GREEN);
		lblCircularQueueData.setBounds(144, 27, 314, 26);
		contentPane_1.add(lblCircularQueueData);
		
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
		size.setBounds(183, 97, 83, 23);
		contentPane_1.add(size);
		
		JButton creat = new JButton("");
		creat.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\cq.png"));
		creat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for queue creation
				size1=Integer.valueOf(size.getText());
				cq=new int[size1];
				queuCreate.play();
				JOptionPane.showMessageDialog(contentPane, "Queue of Size "+size1+" Created");
				
				
			}
		});
		creat.setForeground(Color.RED);
		creat.setFont(new Font("Constantia", Font.BOLD, 14));
		creat.setBackground(Color.LIGHT_GRAY);
		creat.setBounds(296, 97, 122, 35);
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
		element.setBounds(183, 167, 86, 23);
		contentPane_1.add(element);
		
		JButton insert = new JButton("");
		insert.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertq.png"));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				if(count==size1) {
					queuein.play();
					JOptionPane.showMessageDialog(contentPane, "Insertion not Possible!");
				}
				else {
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size1;
					cq[r]=elem;
					count++;
					queueins.play();
					JOptionPane.showMessageDialog(contentPane, "Insert Successfull:)");
				}
				element.setText("");
			}
		});
		insert.setForeground(Color.MAGENTA);
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBackground(Color.WHITE);
		insert.setBounds(296, 163, 83, 27);
		contentPane_1.add(insert);
		
		JButton display = new JButton("");
		display.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\displayq.png"));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				int f1=f;
				if(count==0) {
					displaynott.play();
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				}else {
					for (int i = 1; i <=count; i++) {
						msg=msg+cq[f1]+" ";
						f1=(f1+1)%size1;
					}
				}
				displaybox.setText(msg);

			}
		});
		display.setForeground(Color.MAGENTA);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBackground(Color.WHITE);
		display.setBounds(296, 237, 83, 27);
		contentPane_1.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 14));
		displaybox.setForeground(new Color(0, 0, 139));
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(180, 274, 278, 23);
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
				if (count==0) {
					queuedelnot.play();
					JOptionPane.showMessageDialog(contentPane, "deletion Not Possible!");
				} else {
					queuedel.play();
					JOptionPane.showMessageDialog(contentPane, "Element deleted is: "+cq[f]);
					f=(f+1)%size1;
					count--;

				}
			}
		});
		delete.setForeground(Color.MAGENTA);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBackground(Color.WHITE);
		delete.setBounds(296, 200, 83, 27);
		contentPane_1.add(delete);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\cqueueimages.jpeg"));
		lblNewLabel.setBounds(349, 297, 235, 215);
		contentPane_1.add(lblNewLabel);
	}
}

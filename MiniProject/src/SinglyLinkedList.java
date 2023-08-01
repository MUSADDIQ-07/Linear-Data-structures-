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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	Node first;

	class Node{
		int data;
		Node link;
	}
	
	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\welcome to Singly linked list data structure.mp3";
	MP3Player linkedlist= new MP3Player(new File(Home));

	{
		linkedlist.play();
	}
	
	public static final String insfront="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Element Inserted at Front Success Fully.mp3";
	MP3Player infront= new MP3Player(new File(insfront));
	
	public static final String inrear="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Element +elem+ Inserted at Rear Success Full.mp3";
	MP3Player inreare= new MP3Player(new File(inrear));
	
	public static final String displayNot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Display is Not Possible.mp3";
	MP3Player displaynott= new MP3Player(new File(displayNot));
	
	public static final String deletenot="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\Deletion is not possible.mp3";
	MP3Player queuedelnot= new MP3Player(new File(deletenot));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
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
		contentPane_1.setBackground(new Color(224, 255, 255));
		contentPane_1.setBounds(0, 0, 584, 492);
		contentPane.add(contentPane_1);

		JLabel lblQueueDataStructure = new JLabel("Singly Linked List Data Structure");
		lblQueueDataStructure.setForeground(Color.MAGENTA);
		lblQueueDataStructure.setFont(new Font("Dialog", Font.BOLD, 20));
		lblQueueDataStructure.setBackground(Color.GREEN);
		lblQueueDataStructure.setBounds(117, 32, 344, 26);
		contentPane_1.add(lblQueueDataStructure);

		JLabel lblEnterStackSize = new JLabel("Enter The Element");
		lblEnterStackSize.setForeground(Color.BLUE);
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterStackSize.setBackground(Color.WHITE);
		lblEnterStackSize.setBounds(10, 97, 168, 23);
		contentPane_1.add(lblEnterStackSize);

		element1 = new JTextField();
		element1.setFont(new Font("Consolas", Font.ITALIC, 14));
		element1.setForeground(Color.BLACK);
		element1.setColumns(10);
		element1.setBackground(Color.LIGHT_GRAY);
		element1.setBounds(183, 96, 110, 23);
		contentPane_1.add(element1);

		JButton insertresr = new JButton("");
		insertresr.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertrear.png"));
		insertresr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp;
				int elem=Integer.valueOf(element1.getText());
				Node newnode =new Node();
				newnode.data=elem;
				newnode.link=null;
				if (first==null) {
					first=newnode;
				} else {

					temp=first;
					while (temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
				}
				inreare.play();
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" Inserted @ Rear Success Full");
				element1.setText("");
			}
		});
		insertresr.setForeground(Color.RED);
		insertresr.setFont(new Font("Constantia", Font.BOLD, 14));
		insertresr.setBackground(Color.LIGHT_GRAY);
		insertresr.setBounds(334, 93, 97, 27);
		contentPane_1.add(insertresr);

		JLabel lblEnterAnElement = new JLabel("Enter The  Element");
		lblEnterAnElement.setForeground(Color.BLUE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 143, 168, 23);
		contentPane_1.add(lblEnterAnElement);

		element2 = new JTextField();
		element2.setFont(new Font("Consolas", Font.BOLD, 14));
		element2.setForeground(Color.BLACK);
		element2.setColumns(10);
		element2.setBackground(Color.LIGHT_GRAY);
		element2.setBounds(183, 142, 110, 23);
		contentPane_1.add(element2);

		JButton insertfront = new JButton("");
		insertfront.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertfront.png"));
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {

					first=newnode;
				}else {

					newnode.link=first;
					first=newnode;
				}
				infront.play();
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" Inserted @ Front Success Full");
				element2.setText("");
			}
		});
		insertfront.setForeground(Color.MAGENTA);
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setBackground(Color.WHITE);
		insertfront.setBounds(334, 139, 102, 27);
		contentPane_1.add(insertfront);

		JButton display = new JButton("");
		display.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\displayll.png"));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				Node temp;
				String msg="";
				if(first==null) {
					displaynott.play();
					JOptionPane.showMessageDialog(contentPane, "Display is Not Possible");
				}else if (first.link==null) {
					displaybox.setText(String.valueOf(first.data));
				}else {

					temp=first;
					while (temp!=null) {
						msg=msg+String.valueOf(temp.data+" ");
						temp=temp.link;
					}
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(Color.MAGENTA);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBackground(Color.WHITE);
		display.setBounds(152, 333, 97, 27);
		contentPane_1.add(display);

		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 14));
		displaybox.setForeground(new Color(0, 0, 139));
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(280, 337, 278, 23);
		contentPane_1.add(displaybox);

		JButton home = new JButton("");
		home.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\HOME.png"));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for home
				new Home().setVisible(true);
			}
		});
		home.setForeground(new Color(224, 255, 255));
		home.setFont(new Font("Calibri", Font.BOLD, 14));
		home.setBackground(new Color(224, 255, 255));
		home.setBounds(10, 32, 77, 27);
		contentPane_1.add(home);

		JButton deleterear = new JButton("");
		deleterear.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\deleterear.png"));
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp;
				if(first==null) {
					queuedelnot.play();
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible!");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is: "+first.data);
					first=null;
				}else {

					temp=first;
					while (temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is: "+temp.link.data);
					temp.link=null;

				}
			}
		});
		deleterear.setForeground(Color.MAGENTA);
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBackground(Color.WHITE);
		deleterear.setBounds(183, 175, 110, 27);
		contentPane_1.add(deleterear);

		JButton deletefront = new JButton("");
		deletefront.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\deletefront.png"));
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first==null) {
					queuedelnot.play();
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");

				}else if(first.link==null){
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}else {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(Color.MAGENTA);
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBackground(Color.WHITE);
		deletefront.setBounds(183, 212, 110, 27);
		contentPane_1.add(deletefront);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\singly-linked-list.png"));
		lblNewLabel.setBounds(0, 228, 587, 254);
		contentPane_1.add(lblNewLabel);
	}
}

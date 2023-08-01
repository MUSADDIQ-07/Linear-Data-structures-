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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	
	Node first;
	
	public static final String Home="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\welcome to doubly linked list data structure.mp3";
	MP3Player dlinkedlist= new MP3Player(new File(Home));

	{
		dlinkedlist.play();
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
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
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
		contentPane_1.setBackground(new Color(51, 51, 102));
		contentPane_1.setBounds(0, 0, 584, 492);
		contentPane.add(contentPane_1);
		
		JLabel lblQueueDataStructure = new JLabel("Doubly Linked List Data Structure");
		lblQueueDataStructure.setForeground(Color.GREEN);
		lblQueueDataStructure.setFont(new Font("Dialog", Font.BOLD, 20));
		lblQueueDataStructure.setBackground(Color.GREEN);
		lblQueueDataStructure.setBounds(138, 32, 360, 26);
		contentPane_1.add(lblQueueDataStructure);
		
		JLabel lblEnterStackSize = new JLabel("Enter The Element");
		lblEnterStackSize.setForeground(Color.WHITE);
		lblEnterStackSize.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterStackSize.setBackground(Color.WHITE);
		lblEnterStackSize.setBounds(10, 97, 168, 23);
		contentPane_1.add(lblEnterStackSize);
		
		element1 = new JTextField();
		element1.setFont(new Font("Consolas", Font.BOLD, 14));
		element1.setForeground(Color.BLACK);
		element1.setColumns(10);
		element1.setBackground(Color.LIGHT_GRAY);
		element1.setBounds(183, 96, 159, 23);
		contentPane_1.add(element1);
		
		JButton insertresr = new JButton("");
		insertresr.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertrear.png"));
		insertresr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp;
				int elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;

				if (first==null) {

					first=newnode;
				}else {
					temp=first;
					while (temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				inreare.play();
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" Inserted @ Rear Success Full");
				element1.setText("");
			}
		});
		insertresr.setForeground(Color.RED);
		insertresr.setFont(new Font("Constantia", Font.BOLD, 14));
		insertresr.setBackground(Color.LIGHT_GRAY);
		insertresr.setBounds(372, 96, 111, 27);
		contentPane_1.add(insertresr);
		
		JLabel lblEnterAnElement = new JLabel("Enter The  Element");
		lblEnterAnElement.setForeground(Color.WHITE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 143, 168, 23);
		contentPane_1.add(lblEnterAnElement);
		
		element2 = new JTextField();
		element2.setFont(new Font("Consolas", Font.BOLD, 14));
		element2.setForeground(Color.BLACK);
		element2.setColumns(10);
		element2.setBackground(Color.LIGHT_GRAY);
		element2.setBounds(183, 142, 159, 23);
		contentPane_1.add(element2);
		
		JButton insertfront = new JButton("");
		insertfront.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\insertfront.png"));
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if (first==null) {
					first=newnode;
				} else {
					newnode.nextlink=first;
					first.prelink=newnode;
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
		insertfront.setBounds(372, 133, 111, 27);
		contentPane_1.add(insertfront);
		
		JButton displayforward = new JButton("");
		displayforward.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\ds.png"));
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				Node temp;
				String msg="";
				if(first==null) {
					displaynott.play();
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible!");
				}else if (first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}else {
					temp=first;
					while (temp!=null) {
						msg=msg+String.valueOf(temp.data+" ");
						temp=temp.nextlink;
					}
				}
				displaybox.setText(msg);

			}
		});
		displayforward.setForeground(Color.MAGENTA);
		displayforward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayforward.setBackground(Color.WHITE);
		displayforward.setBounds(191, 249, 111, 27);
		contentPane_1.add(displayforward);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 14));
		displaybox.setForeground(new Color(0, 0, 139));
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(183, 286, 300, 23);
		contentPane_1.add(displaybox);
		
		JButton home = new JButton("");
		home.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\HOME.png"));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for home
				new Home().setVisible(true);
			}
		});
		home.setForeground(Color.BLACK);
		home.setFont(new Font("Calibri", Font.BOLD, 14));
		home.setBackground(SystemColor.textHighlight);
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
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				}else if (first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is: "+first.data);
					first=null;
				}else {
					temp=first;
					while (temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}

					JOptionPane.showMessageDialog(contentPane, "Element deleted is: "+temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setForeground(Color.MAGENTA);
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBackground(Color.WHITE);
		deleterear.setBounds(191, 197, 111, 27);
		contentPane_1.add(deleterear);
		
		JButton deletefront = new JButton("");
		deletefront.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\deletefront.png"));
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for delete front
				if(first==null) {
					queuedelnot.play();
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");				}

				else if (first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);					first=null;
				}else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;

				}
			}
		});
		deletefront.setForeground(Color.MAGENTA);
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBackground(Color.WHITE);
		deletefront.setBounds(340, 197, 111, 27);
		contentPane_1.add(deletefront);
		
		JButton displayReverse = new JButton("");
		displayReverse.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\dr.png"));
		displayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display reverse
				Node temp;
				if(first==null) {
					displaynott.play();
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				}else if (first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}else {
					temp=first;
					String msg="";
					while (temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while (temp!=null) {
						msg=msg+temp.data+" ";
						temp=temp.prelink;
					}
					displaybox.setText(msg);
				}
			}
		});
		displayReverse.setForeground(Color.MAGENTA);
		displayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		displayReverse.setBackground(Color.WHITE);
		displayReverse.setBounds(340, 249, 111, 27);
		contentPane_1.add(displayReverse);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\dll.jpg"));
		lblNewLabel.setBounds(-100, 234, 697, 275);
		contentPane_1.add(lblNewLabel);
	}

}

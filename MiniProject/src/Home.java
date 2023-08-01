import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import jaco.mp3.player.MP3Player;



import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	String Homepg="C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\VOICE COMMAND\\whpage.mp3";
	MP3Player Homep= new MP3Player(new File(Homepg));
	{
		Homep.play();
	}

	private JPanel contentPane;





	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Home() {
		setTitle("WELCOME TO HOME PAGE SELECT A CHOOSE DATASTRUCTURE");
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.focus"));
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setBounds(125, 10, 323, 42);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lblNewLabel);

		JButton array = new JButton("");
		array.setBounds(10, 117, 271, 42);
		array.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\ARR.png"));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				// Place Array Window Opening Code
				new Array().setVisible(true);

			}
		});
		array.setBackground(UIManager.getColor("CheckBox.light"));
		array.setForeground(UIManager.getColor("CheckBox.light"));
		array.setFont(new Font("Century", Font.BOLD, 14));
		contentPane.add(array);

		JButton stack = new JButton("");
		stack.setBounds(10, 190, 271, 42);
		stack.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\STA.png"));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Stack window opening code
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(UIManager.getColor("Button.light"));
		stack.setFont(new Font("Century", Font.BOLD, 14));
		stack.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(stack);

		JButton queue = new JButton("");
		queue.setBounds(10, 249, 271, 42);
		queue.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\QU.png"));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// queue window opening code
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(UIManager.getColor("Button.light"));
		queue.setFont(new Font("Century", Font.BOLD, 14));
		queue.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(queue);

		JButton cqueue = new JButton("");
		cqueue.setBounds(10, 316, 271, 42);
		cqueue.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\CQU.png"));
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// circular queue window opening code
				new CQueue().setVisible(true);
			}
		});
		cqueue.setForeground(UIManager.getColor("Button.light"));
		cqueue.setFont(new Font("Century", Font.BOLD, 14));
		cqueue.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(cqueue);

		JButton sll = new JButton("");
		sll.setBounds(10, 375, 271, 42);
		sll.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\SING.png"));
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Singly linked list window opening code
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(UIManager.getColor("Button.light"));
		sll.setFont(new Font("Century", Font.BOLD, 14));
		sll.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(sll);

		JButton dll = new JButton("");
		dll.setBounds(10, 427, 271, 49);
		dll.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\DOUB.png"));
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Doubly linked list window opening code
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(UIManager.getColor("Button.light"));
		dll.setFont(new Font("Century", Font.BOLD, 14));
		dll.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(dll);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(223, 52, 351, 424);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ACER\\eclipse-workspace\\MiniProject\\bin\\lable.png"));
		contentPane.add(lblNewLabel_1);
	}
}

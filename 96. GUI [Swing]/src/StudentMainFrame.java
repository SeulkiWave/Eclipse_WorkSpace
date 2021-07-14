import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMainFrame frame = new StudentMainFrame();
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
	public StudentMainFrame() {
		setTitle("허리아프다");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton studentListBTN = new JButton("Student");
		studentListBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("학생 리스트 버튼 클릭시 실행되는 메소드");
			}
		});
		
		studentListBTN.setFont(new Font("KoPubWorld바탕체 Medium", Font.PLAIN, 14));
		studentListBTN.setBounds(12, 10, 97, 23);
		contentPane.add(studentListBTN);
		
		JButton stuCalAverBTN = new JButton("학생 총점 평균 계산");
		stuCalAverBTN.setFont(new Font("KoPubWorld바탕체 Medium", Font.PLAIN, 14));
		stuCalAverBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("학생 총점 평균 계산 버튼 클릭시 실행되는 메소드..");
			}
		});
		stuCalAverBTN.setBounds(265, 10, 157, 23);
		contentPane.add(stuCalAverBTN);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class McqLamia extends JFrame implements ActionListener{
	
	final int TOTAL_NO_Q = 5; 
		int scorekeeper = 0;
	
		private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					McqLamia frame = new McqLamia();
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
	
	public McqLamia() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0)); 
		
		// Start Page
		JPanel panel = new JPanel(); 
		panel.setBackground(new Color(255, 228, 225));
		contentPane.add(panel); 
		panel.setLayout(null);
		
		
		JButton btn1 = new JButton("Start!"); 
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// NEW
				CardLayout cl = (CardLayout) contentPane.getLayout(); 
			cl.next(contentPane);
				
			}
			
		});
		btn1.setBounds(315,227,117,29);
		panel.add(btn1); 
		
		JLabel Title = new JLabel("ALGEBRA QUIZ!");
		Title.setBounds(174, 96, 122, 29);
		panel.add(Title);
		
		JLabel Subtitle = new JLabel("Click on start to begin your quiz.");
		Subtitle.setBounds(97, 232, 224, 16);
		panel.add(Subtitle);
		
		JLabel Name = new JLabel("Made by Lamia");
		Name.setBounds(174, 122, 160, 16);
		panel.add(Name);
		
		// Question 1
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JButton btn2 = new JButton("Next");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NEW
				CardLayout cl = (CardLayout) contentPane.getLayout();
		    cl.next(contentPane);
			}
		});
		btn2.setBounds(315, 225, 117, 29);
		panel_1.add(btn2);
		
		JLabel Q1 = new JLabel("1) What is the value of x when x+12 = 16?");
		Q1.setBounds(6, 6, 373, 16);
		panel_1.add(Q1);
		
		JButton Ans1 = new JButton("16");
		Ans1.setBounds(67, 36, 75, 29);
		panel_1.add(Ans1);
		
		JLabel A1 = new JLabel("A)");
		A1.setBounds(6, 41, 61, 16);
		panel_1.add(A1);
		
		JLabel A2 = new JLabel("B)");
		A2.setBounds(6, 83, 61, 16);
		panel_1.add(A2);
		
		JButton Ans2 = new JButton("4");
		Ans2.setBounds(67, 77, 75, 29);
		panel_1.add(Ans2); 
		
		JButton Ans3 = new JButton("8");
		Ans3.setBounds(67, 118, 75, 29);
		panel_1.add(Ans3);
	
		JLabel A3 = new JLabel("C)");
		A3.setBounds(6, 123, 61, 16);
		panel_1.add(A3);
		
		JLabel Score1 = new JLabel("Score =");
		Score1.setBounds(315, 83, 61, 16);
		panel_1.add(Score1);
		
		JLabel S1 = new JLabel("");
		S1.setBounds(373, 83, 61, 16);
		panel_1.add(S1);
			
			Ans1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S1.setText(String.valueOf(scorekeeper));
				Ans1.setEnabled(false);
				Ans2.setEnabled(false);
				Ans3.setEnabled(false);
			}
			
		});
		
		Ans2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorekeeper = scorekeeper+1;
				S1.setText(String.valueOf(scorekeeper));
				Ans1.setEnabled(false);
				Ans2.setEnabled(false);
				Ans3.setEnabled(false);
			}
			
		});
		Ans3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S1.setText(String.valueOf(scorekeeper));
				Ans1.setEnabled(false);
				Ans2.setEnabled(false);
				Ans3.setEnabled(false);
			}
			
		});
		
		// Question 2
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setLayout(null); 
		contentPane.add(panel_2);
		
		JButton btn3 = new JButton("Next");
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)contentPane.getLayout(); 
			cl.next(contentPane);
			}
			
		}); 
		btn3.setBounds(315, 225, 117, 29);
		panel_2.add(btn3);
		
		JLabel Q2 = new JLabel("2) Ben had 4 pizzas. Jen had x. There were 10 pizzas.");
		Q2.setBounds(6, 6, 341, 16);
		panel_2.add(Q2);
		
		JLabel Q22 = new JLabel("How many did Jen have?");
		Q22.setBounds(6, 26, 184, 16);
		panel_2.add(Q22);
		
		JButton Ans4 = new JButton("19");
		Ans4.setBounds(58, 54, 74, 29);
		panel_2.add(Ans4);
		
		JLabel A4 = new JLabel("A)");
		A4.setBounds(6, 59, 61, 16);
		panel_2.add(A4);
		
		JLabel A5 = new JLabel("B)");
		A5.setBounds(6, 101, 61, 16);
		panel_2.add(A5);
		
		JButton Ans5 = new JButton("10");
		Ans5.setBounds(58, 95, 74, 29);
		panel_2.add(Ans5);
		
		JLabel A6 = new JLabel("C)");
		A6.setBounds(6, 146, 61, 16);
		panel_2.add(A6);
		
		JButton Ans6 = new JButton("6");
		Ans6.setBounds(58, 141, 74, 29);
		panel_2.add(Ans6);
		
		JLabel Score2 = new JLabel("Score = ");
		Score2.setBounds(295, 101, 61, 16);
		panel_2.add(Score2);
		
		JLabel S2 = new JLabel("");
		S2.setBounds(355, 101, 61, 16);
		panel_2.add(S2);
		
		Ans4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S2.setText(String.valueOf(scorekeeper));
				Ans4.setEnabled(false);
				Ans5.setEnabled(false);
				Ans6.setEnabled(false);
			}
			
		});
		
		Ans6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorekeeper = scorekeeper+1;
				S2.setText(String.valueOf(scorekeeper));
				Ans4.setEnabled(false);
				Ans5.setEnabled(false);
				Ans6.setEnabled(false);
			}
			
		});
		Ans5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S2.setText(String.valueOf(scorekeeper));
				Ans4.setEnabled(false);
				Ans5.setEnabled(false);
				Ans6.setEnabled(false);
			}
			
		});
		
		//Question 3
		JPanel panel_3 = new JPanel(); 
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setLayout(null); 
		contentPane.add(panel_3); 
		
		JButton btn4 = new JButton("Next"); 
		btn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// NEW
				CardLayout cl = (CardLayout)contentPane.getLayout(); 
			cl.next(contentPane);
			}
			
		});
		btn4.setBounds(315,225,117,29);
		panel_3.add(btn4); 
		
		JLabel Q3 = new JLabel("3) x+15=20. x?");
		Q3.setBounds(6, 6, 122, 16);
		panel_3.add(Q3);
		
		JLabel A7 = new JLabel("A)");
		A7.setBounds(6, 34, 61, 16);
		panel_3.add(A7);
		
		JButton Ans7 = new JButton("5");
		Ans7.setBounds(57, 29, 66, 29);
		panel_3.add(Ans7); 
		
		JLabel A8 = new JLabel("B)");
		A8.setBounds(6, 70, 61, 16);
		panel_3.add(A8);
		
		JButton Ans8 = new JButton("10");
		Ans8.setBounds(57, 65, 66, 29);
		panel_3.add(Ans8);
		
		JLabel A9 = new JLabel("C)");
		A9.setBounds(6, 107, 61, 16);
		panel_3.add(A9);
		
		JButton Ans9 = new JButton("100");
		Ans9.setBounds(57, 98, 66, 29);
		panel_3.add(Ans9);
		
		JLabel Score3 = new JLabel("Score =");
		Score3.setBounds(285, 70, 61, 16);
		panel_3.add(Score3);
		
		JLabel S3 = new JLabel("");
		S3.setBounds(342, 70, 61, 16);
		panel_3.add(S3);
		
		Ans8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S3.setText(String.valueOf(scorekeeper));
				Ans7.setEnabled(false);
				Ans8.setEnabled(false);
				Ans9.setEnabled(false);
			}
			
		});
		
		Ans7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorekeeper = scorekeeper+1;
				S3.setText(String.valueOf(scorekeeper));
				Ans7.setEnabled(false);
				Ans8.setEnabled(false);
				Ans9.setEnabled(false);
			}
			
		});
		Ans9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S3.setText(String.valueOf(scorekeeper));
				Ans7.setEnabled(false);
				Ans8.setEnabled(false);
				Ans9.setEnabled(false);
			}
			
		});
		
		// Question 4
		JPanel panel_4 = new JPanel(); 
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setLayout(null); 
		contentPane.add(panel_4); 
		
		
		JButton btn5 = new JButton("Next"); 
		btn5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// NEW
				CardLayout cl = (CardLayout)contentPane.getLayout(); 
			cl.next(contentPane);
				
			}
		}); 
		btn5.setBounds(315,225,117,29);
		panel_4.add(btn5); 
		
		JLabel Q4 = new JLabel("4) Lamia is 2x years older than 8. What is her age?");
		Q4.setBounds(6, 6, 399, 16);
		panel_4.add(Q4);
		
		JLabel A10 = new JLabel("A) ");
		A10.setBounds(6, 34, 61, 16);
		panel_4.add(A10);
		
		JButton Ans10 = new JButton("100000");
		Ans10.setBounds(54, 29, 86, 29);
		panel_4.add(Ans10);
		
		JLabel A11 = new JLabel("B)");
		A11.setBounds(6, 70, 61, 16);
		panel_4.add(A11);
		
		JButton Ans11 = new JButton("4");
		Ans11.setBounds(54, 62, 86, 29);
		panel_4.add(Ans11);
		
		JLabel A12 = new JLabel("C)");
		A12.setBounds(6, 103, 61, 16);
		panel_4.add(A12);
		
		JButton Ans12 = new JButton("19");
		Ans12.setBounds(54, 98, 86, 29);
		panel_4.add(Ans12);
		
		JLabel Score4 = new JLabel("Score =");
		Score4.setBounds(274, 70, 61, 16);
		panel_4.add(Score4);
		
		JLabel S4 = new JLabel("");
		S4.setBounds(331, 70, 61, 16);
		panel_4.add(S4);
		
		Ans10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S4.setText(String.valueOf(scorekeeper));
				Ans10.setEnabled(false);
				Ans11.setEnabled(false);
				Ans12.setEnabled(false);
			}
			
		});
		
		Ans11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorekeeper = scorekeeper+1;
				S4.setText(String.valueOf(scorekeeper));
				Ans10.setEnabled(false);
				Ans11.setEnabled(false);
				Ans12.setEnabled(false);
			}
			
		});
		Ans12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S4.setText(String.valueOf(scorekeeper));
				Ans10.setEnabled(false);
				Ans11.setEnabled(false);
				Ans12.setEnabled(false);
			}
			
		});
		
		// Question 5
		JPanel panel_5 = new JPanel(); 
		panel_5.setBackground(new Color(255, 228, 225));
		panel_5.setLayout(null);
		contentPane.add(panel_5); 
		
		JButton btn6 = new JButton("Total Score"); 
		btn6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// NEW
				CardLayout cl = (CardLayout)contentPane.getLayout(); 
			cl.next(contentPane);
			}
		}); 
		
		btn6.setBounds(315,225,117,29); 
		panel_5.add(btn6); 
		
		JLabel Q5 = new JLabel("5) x-9=10. x?");
		Q5.setBounds(6, 6, 99, 16);
		panel_5.add(Q5);
		
		JLabel A13 = new JLabel("A)");
		A13.setBounds(6, 34, 61, 16);
		panel_5.add(A13);
		
		JButton Ans13 = new JButton("19");
		Ans13.setBounds(49, 29, 75, 29);
		panel_5.add(Ans13);
		
		JLabel A14 = new JLabel("B)");
		A14.setBounds(6, 73, 61, 16);
		panel_5.add(A14);
		
		JButton Ans14 = new JButton("idk");
		Ans14.setBounds(49, 68, 75, 29);
		panel_5.add(Ans14);
		
		JLabel A15 = new JLabel("C)");
		A15.setBounds(6, 109, 61, 16);
		panel_5.add(A15);
		
		JButton Ans15 = new JButton("18");
		Ans15.setBounds(49, 104, 75, 29);
		panel_5.add(Ans15);
		
		JLabel Check = new JLabel("Check Your Score!");
		Check.setBounds(197, 230, 156, 16);
		panel_5.add(Check);
		
		JLabel Score5 = new JLabel("Score =");
		Score5.setBounds(259, 73, 61, 16);
		panel_5.add(Score5);
		
		JLabel S5 = new JLabel("");
		S5.setBounds(315, 73, 61, 16);
		panel_5.add(S5);
		
		
		Ans14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S5.setText(String.valueOf(scorekeeper));
				Ans14.setEnabled(false);
				Ans15.setEnabled(false);
				Ans13.setEnabled(false);
			}
			
		});
		
		Ans13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scorekeeper = scorekeeper+1;
				S5.setText(String.valueOf(scorekeeper));
				Ans14.setEnabled(false);
				Ans15.setEnabled(false);
				Ans13.setEnabled(false);
			}
			
		});
		Ans15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S5.setText(String.valueOf(scorekeeper));
				Ans14.setEnabled(false);
				Ans15.setEnabled(false);
				Ans13.setEnabled(false);
			}
			
		});
		
		// Total Score
		JPanel panel_6 = new JPanel(); 
		panel_6.setBackground(new Color(255,228,225)); 
		panel_6.setLayout(null); 
		contentPane.add(panel_6); 
		
		JButton btn7 = new JButton("Bye"); 
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)contentPane.getLayout(); 
				cl.next(contentPane);
			}
			
		}); 
		btn7.setBounds(315,225,117,29);
		panel_6.add(btn7); 
		
		JLabel correct1 = new JLabel("CORRECT");
		correct1.setBounds(236, 11, 61, 16);
		panel_6.add(correct1);
		
		JLabel inputcorrect = new JLabel("");
		inputcorrect.setBounds(309, 11, 61, 16);
		panel_6.add(inputcorrect);
		
		JLabel incorrect1 = new JLabel("INCORRECT");
		incorrect1.setBounds(236, 63, 73, 16);
		panel_6.add(incorrect1);
		
		JLabel inputincorrect = new JLabel("");
		inputincorrect.setBounds(331, 63, 61, 16);
		panel_6.add(inputincorrect);
		
		JLabel score = new JLabel("");
		score.setBounds(145, 63, 61, 16);
		panel_6.add(score);
		
		JButton calculate = new JButton("CALCULATE");
		calculate.setBounds(6, 6, 117, 29);
		panel_6.add(calculate);
		
		JLabel TheirTotalScore = new JLabel("Your total score is...");
		TheirTotalScore.setBounds(6, 63, 168, 16);
		panel_6.add(TheirTotalScore);
		
		 
		calculate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				scorekeeper=scorekeeper+0; 
				inputcorrect.setText(String.valueOf(scorekeeper)); 
				inputincorrect.setText(String.valueOf(TOTAL_NO_Q - (scorekeeper)));
				score.setText(String.valueOf("%"+(scorekeeper*100)/TOTAL_NO_Q));
			}
			
		}); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
	}
		
}

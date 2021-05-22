import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
 *@author Nazer V. Malaguia 2/BSCS/A 
 */
	public class secretMission {
		public static void main(String[] args) {
			
		Font font = new Font("Times New Roman", Font.BOLD, 16);
			
			JFrame frame = new JFrame("FUNNY GAME!");
				frame.setLayout(null);
				frame.getContentPane().setBackground(Color.BLACK);
				frame.setVisible(true);
				frame.setSize(850, 500);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
				JLabel label = new JLabel("WELCOME!! PLEASE MOVE THE ARROW INSIDE THIS WINDOW TO HAVE FUN :) !!");
					label.setBounds(100, 100, 840, 20);
					label.setVisible(true);
					label.setForeground(Color.WHITE);
					label.setFont(font);
					frame.getContentPane().add(label);
					
				JLabel label2 = new JLabel("Click this -> {*.*} to force stop.")   ;
					label2.setBounds(100, 150, 840, 20);
					label2.setVisible(true);
					label2.setForeground(Color.WHITE);
					label2.setFont(font);
					frame.getContentPane().add(label2);
					
				frame.addMouseMotionListener(new MouseMotionListener() {

					@Override
					public void mouseDragged(MouseEvent me) {
						
						
					}

					@Override
					public void mouseMoved(MouseEvent me) {
						
					Random r1 = new Random();
					Random r2 = new Random();
						int x = r1.nextInt(1300);
						int y = r2.nextInt(700);
						
						JFrame frame2 = new JFrame("SURPRISE!!!");
							frame2.setLayout(null);
							frame2.setVisible(true);
							frame2.setSize(355, 200);
							frame2.setLocation(x, y);
							frame2.setResizable(false);
							frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
						
							JLabel label = new JLabel("HAHAHA!!! YOU'RE SO STUPID TO FALL INTO MY TRAP!!");
								label.setBounds(10, 20, 350, 20);
								frame2.getContentPane().add(label);
								
							JLabel label2 = new JLabel("Enter the secret message and press enter to stop this shit:");
								label2.setBounds(10, 60, 350, 20);
								frame2.getContentPane().add(label2);
								
							JPasswordField pf = new JPasswordField();
								pf.setBounds(70, 80, 200, 20);
								frame2.getContentPane().add(pf);
							
								pf.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent event) {
										String s = pf.getText();
											if(s.equals("coding is epic")) {
												JOptionPane.showMessageDialog(null, "Thank you! :)");
												System.exit(0);
											}
											else {
												JOptionPane.showMessageDialog(null, "Wrong!!", "ERROR", JOptionPane.ERROR_MESSAGE);
											}
									}
								});
								
							JButton b = new JButton("Hint");
								b.setBounds(120, 120, 100, 20);
								frame2.getContentPane().add(b);
								
								b.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent event) {
										pf.requestFocus();
										JOptionPane.showMessageDialog(null, "Three words. What can you say about coding?");
									}
								});
								
							}	
					
				});
				
				frame.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent me) {
						
					for(int i=1; i<=100; i++) {	
						Random r1 = new Random();
						Random r2 = new Random();
							int x = r1.nextInt(1300);
							int y = r2.nextInt(700);
							
							JFrame frame2 = new JFrame("SURPRISE!!!");
								frame2.setLayout(null);
								frame2.setVisible(true);
								frame2.getContentPane().setBackground(Color.BLACK);
								frame2.setSize(355, 200);
								frame2.setLocation(x, y);
								frame2.setResizable(false);
								frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							
								JLabel label = new JLabel("HAHAHA!!! JUST KIDDING!");
									label.setBounds(10, 20, 350, 20);
									label.setForeground(Color.WHITE);
									frame2.getContentPane().add(label);
									
								JLabel label2 = new JLabel("Enter the secret message and press enter to stop this shit:");
									label2.setBounds(10, 60, 350, 20);
									label2.setForeground(Color.WHITE);
									frame2.getContentPane().add(label2);
									
								JPasswordField pf = new JPasswordField();
									pf.setBounds(70, 80, 200, 20);
									frame2.getContentPane().add(pf);
								
									pf.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent event) {
											String s = pf.getText();
												if(s.equals("coding is epic")) {
													JOptionPane.showMessageDialog(null, "Thank you! :)");
													System.exit(0);
												}
												else {
													JOptionPane.showMessageDialog(null, "Wrong!!", "ERROR", JOptionPane.ERROR_MESSAGE);
												}
										}
									});
									
								JButton b = new JButton("Hint");
									b.setBounds(120, 120, 100, 20);
									frame2.getContentPane().add(b);
									
									b.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent event) {
											pf.requestFocus();
											JOptionPane.showMessageDialog(null, "Three words. What can you say about coding?");
										}
									}); }
						
					}

					@Override
					public void mouseEntered(MouseEvent me) {
						for(int i=1; i<=20; i++) {	
							Random r1 = new Random();
							Random r2 = new Random();
								int x = r1.nextInt(1300);
								int y = r2.nextInt(700);
								
								JFrame frame2 = new JFrame("SURPRISE!!!");
									frame2.setLayout(null);
									frame2.setVisible(true);
									frame2.getContentPane().setBackground(Color.BLACK);
									frame2.setSize(355, 200);
									frame2.setLocation(x, y);
									frame2.setResizable(false);
									frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
								
									JLabel label = new JLabel("HAHAHA!!! JUST KIDDING!");
										label.setBounds(10, 20, 350, 20);
										label.setForeground(Color.WHITE);
										frame2.getContentPane().add(label);
										
									JLabel label2 = new JLabel("Enter the secret message and press enter to stop this shit:");
										label2.setBounds(10, 60, 350, 20);
										label2.setForeground(Color.WHITE);
										frame2.getContentPane().add(label2);
										
									JPasswordField pf = new JPasswordField();
										pf.setBounds(70, 80, 200, 20);
										frame2.getContentPane().add(pf);
									
										pf.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent event) {
												String s = pf.getText();
													if(s.equals("coding is epic")) {
														JOptionPane.showMessageDialog(null, "Thank you! :)");
														System.exit(0);
													}
													else {
														JOptionPane.showMessageDialog(null, "Wrong!!", "ERROR", JOptionPane.ERROR_MESSAGE);
													}
											}
										});
										
									JButton b = new JButton("Hint");
										b.setBounds(120, 120, 100, 20);
										frame2.getContentPane().add(b);
										
										b.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent event) {
												pf.requestFocus();
												JOptionPane.showMessageDialog(null, "Three words. What can you say about coding?");
											}
										}); }
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						
					}
					
				});
				
		}
		
	}

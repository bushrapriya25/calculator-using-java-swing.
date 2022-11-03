package java;
	
	
	
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JPasswordField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Registration {
		JFrame  frame = new JFrame("Registration");
		DbConnect db = new DbConnect();
		
		    public Registration () {
			
			frame.setDefaultCloseOperation(3);
			frame.setSize(500,500);
			frame.setLocationRelativeTo(null);
			frame.setLayout(null);
			
			JLabel jlabel = new JLabel("Name");
			jlabel.setBounds(10,10,100,20);
			frame.add(jlabel);
			
			JTextField jtf = new JTextField();
			jtf.setBounds(120,10,100,20);
			frame.add(jtf);
			
			JLabel jlabel2 = new JLabel("Email");
			jlabel2.setBounds(10,40,100,20);
			frame.add(jlabel2);
			
			JTextField jtf2 = new JTextField();
			jtf2.setBounds(120,40,100,20);
			frame.add(jtf2);
			
			JLabel jlabel3 = new JLabel("Pass");
			jlabel3.setBounds(120,70,100,20);
			frame.add(jlabel3);
			
			JPasswordField jpf = new JPasswordField();
			jpf.setBounds(120,70,100,20);
			frame.add(jpf);
			
			JButton btn = new JButton("Register");
			btn.setBounds(120,100,100,20);
			frame.add(btn);
			
			btn.addActionListener(new ActionListener() {
				
				
				
		    public void actionPerformed(ActionEvent e) {
		    	String name = jtf.getText();
		    	String email = jtf2.getText();
		    	String pass =  jpf.getText();
					
		 
		    	
        String query =" INSERT INTO `student_info`( `Name`, `Email`, `Pass`) VALUES ( '"+ name+"', ' " +email+"','"+pass+"')";
        
        
  	     db.insert(query);
  	    
		    	
		    			
				}
				
			});
			 
			frame.setVisible(true);
			
		
		}
		

	}
	
	
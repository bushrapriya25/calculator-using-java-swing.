package java;
import java.sql.*;
import javax.swing.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JPanel {
	
	
    public JButton login;
    private JTextField email;
    private JPasswordField password;  
    private Connection con;
	
    
    public Login(){
    	
    	setLayout(null);
        setSize(500, 500);

        
        JLabel label1 = new JLabel("Email");
        add(label1);
        label1.setBounds(300, 100, 300, 20);

        email = new JTextField();
        add(email);
        email.setBounds(300, 140, 300, 40);

        JLabel label2 = new JLabel("Password");
        add(label2);
        label2.setBounds(300, 240, 300, 40);

        password = new JPasswordField();
        add(password);
        password.setBounds(300, 240, 300, 40);

        login = new JButton("Login");
        add(login);
        login.setBounds( 300, 320, 300, 32);

    	
    	
   }
        
    public boolean loginStudent(){
        String email = this.email.getText();
        String password = String.valueOf(this.password.getPassword());

        String query = "SELECT * FROM `student_info` WHERE `email` = '" + email + "'AND `password`= PASSWORD('" + password + "')";

        try {
            DbConnect db = new DbConnect();
            db.rs = db.st.executeQuery(query);
            if(db.rs.next()){
                return true;
            }
        } catch (Exception e){
            return false;
        }
        return false;
    }


}

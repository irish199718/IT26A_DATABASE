

 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class INSERT {
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());

    // Basic validation to save database resources
    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and password.");
        return;
    }

    try {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            new Dashboard().setVisible(true); // Ensure Dashboard class exists
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!");
        }
        
        // Clean up
        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        e.printStackTrace(); 
    }
}
}
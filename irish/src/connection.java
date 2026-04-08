
public class connection { 

    public void registerUser() { 
        String username = userfield.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Registered successfully!");
            new LoginForm().setVisible(true);
            this.dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace(); // Good for debugging!
        }
    }
}

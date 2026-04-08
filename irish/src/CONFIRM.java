


import javax.swing.JOptionPane;

public class CONFIRM {
public class Dashboard extends javax.swing.JFrame {

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            new LoginForm().setVisible(true);
            this.dispose();
        }
    }
}
}

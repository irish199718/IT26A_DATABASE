
public class DASHBOARD {
    
  private void loadTableData() {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        con = DBConnection.getConnection();
        String sql = "SELECT id, username, email FROM users";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
     
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        
        model.setRowCount(0); 

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"), 
                rs.getString("username"), 
                rs.getString("email")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Table Error: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Close Error: " + ex.getMessage());
        }
    }
}

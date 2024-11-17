package Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableDemo extends JFrame {
    JTable jtd = null;
    DefaultTableModel dtm = null;

    public static void main(String[] args) {
        JTableDemo jdv = new JTableDemo();
        jdv.setVisible(true);
        jdv.setSize(500, 500);
        jdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JTableDemo() {
        // Column headers for the JTable
        String header[] = {"Sid", "SName", "Marks", "Branch"};

        // Initialize DefaultTableModel with column headers (no data initially)
        dtm = new DefaultTableModel(header, 0); // '0' means no rows initially
        jtd = new JTable(dtm);
        jtd.setRowHeight(20); // Set row height for better readability
        JScrollPane jsp = new JScrollPane(jtd);
        add(jsp); // Add JScrollPane (containing JTable) to JFrame

        // JDBC connection variables
        String driver = "com.mysql.cj.jdbc.Driver"; // Updated driver class
        String url = "jdbc:mysql://localhost:3306/loginDB"; // Your database URL
        String user = "root"; // Your MySQL username
        String pass = "root"; // Your MySQL password

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sqlQuery = "SELECT Sid, SName, Marks, Branch FROM student"; // Your SQL query

        try {
            // Step 1: Load JDBC driver
            Class.forName(driver);

            // Step 2: Establish connection to the database
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to the database");

            // Step 3: Create a statement and execute the SQL query
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqlQuery);

            // Step 4: Process the ResultSet and add data to the table model
            while (rs.next()) {
                // Retrieve data from ResultSet
                int sid = rs.getInt("Sid");
                String sname = rs.getString("SName");
                float marks = rs.getFloat("Marks");
                String branch = rs.getString("Branch");

                // Add the row of data to the DefaultTableModel
                dtm.addRow(new Object[]{sid, sname, marks, branch});
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Step 5: Clean up resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/uploadServlet")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String date = request.getParameter("date");

        
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String dbPassword = "your_password";

        try (Connection conn = DriverManager.getConnection(url, username, dbPassword)) {
            String sql = "INSERT INTO your_table_name (first_name, last_name, password, date) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, password);
            statement.setString(4, date);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data successfully saved to the database.");
                
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }
}


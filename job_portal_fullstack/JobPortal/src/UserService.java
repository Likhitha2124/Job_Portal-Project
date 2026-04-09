import java.sql.*;

public class UserService {

    public static void register(User user) throws Exception {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(username, password) VALUES (?, ?)"
        );

        ps.setString(1, user.username);
        ps.setString(2, user.password);
        ps.executeUpdate();

        System.out.println("User Registered!");
    }

    public static boolean login(String username, String password) throws Exception {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
        );

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}
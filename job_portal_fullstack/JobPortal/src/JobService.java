import java.sql.*;
import java.util.*;

public class JobService {

    public static List<Job> getJobs() throws Exception {
        List<Job> list = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM jobs");

        while (rs.next()) {
            list.add(new Job(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("company")
            ));
        }
        return list;
    }
    public static void addJob(String title, String company) throws Exception {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO jobs(title, company) VALUES (?, ?)"
        );

        ps.setString(1, title);
        ps.setString(2, company);

        ps.executeUpdate();
    }
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    private String email;
    private String password;
    final String DB_URL = "jdbc:mysql://localhost:3306/users";
    final String USERNAME = "root";
    final String PASSWORD = "";

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String validateInput() {
        if (email.isEmpty()) {
            return "Please enter a valid email";
        }
        if (password.isEmpty()) {
            return "Please enter a password";
        }
        return "";
    }

    public boolean getUser() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            String DU = "'biruh@test.com'";
            String DP = "123456";
            String sql = "SELECT * from user WHERE email = " + DU + " AND password = " + DP;
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                if (email.equals(resultSet.getString(4)) && password.equals(resultSet.getString(5))) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


//                for (int i = 1; i <= 7; i++) {
//                    System.out.print(" | " + resultSet.getString(i) + " | ");
//                }
//                System.out.println(" ");
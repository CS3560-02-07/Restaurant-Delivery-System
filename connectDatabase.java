import java.sql.*;

public class connectDatabase {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/delivery_system";
        String username = "root";
        String password = "3560";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + 
                resultSet.getString(2) + " " + resultSet.getString(3));
            }

            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

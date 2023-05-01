import java.sql.*;

public class connectDatabase {

    public static int insertRestaurant(String name, String address, String phone, String user, String pass){
        //Connection conn = getConnection();
        int restID = -1; 
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            String query = "INSERT INTO restaurant VALUES (NULL, '" + name + "', '" + address + "', '" + 
                            phone + "', '" + user + "', '" + pass + "')";

            System.out.println(query);

            state.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet results = state.getGeneratedKeys();
            if (results.next()){
                restID = results.getInt(1);
            }
            //restID = results.getInt(1);

            System.out.println("added with id " + restID);

            state.close();
            conn.close();
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect.", e);
        }

        return restID;

    }

    public static void main(String[] args){
        //Login info for mysql
        String url = "jdbc:mysql://localhost:3306/delivery_system";
        String username = "root";
        String password = "3560";

        //establish connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            //retrieve data from database
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + 
                resultSet.getString(2) + " " + resultSet.getString(3));
            }

            connection.close();
        }
        //catch exceptions
        catch(Exception e){
            System.out.println(e);
        }
    }
    //breaking up the method
    private static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/delivery_system";
        String username = "root";
        String password = "3560";
        Connection connection;

        try{
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect.", e);
        }

        return connection;
    }
}

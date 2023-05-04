import java.sql.*;

public class connectDatabase {

    //Insert a new entry into restaurant table
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

    //Insert a new entry into driver table
    public static int insertDriver(String name, String car, String license, String user, String pass){
        //Connection conn = getConnection();
        int DriveID = -1; 
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            String query = "INSERT INTO driver VALUES (NULL, '" + name + "', '" + car + "', '" + 
                            license + "', '" + user + "', '" + pass + "')";

            System.out.println(query);

            state.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet results = state.getGeneratedKeys();
            if (results.next()){
                DriveID = results.getInt(1);
            }
            //restID = results.getInt(1);

            System.out.println("added with id " + DriveID);

            state.close();
            conn.close();
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect.", e);
        }

        return DriveID;

    }

    //Check if login information is valid and exists within the database
    public static String checkLogin(String user, String pass){
        //boolean valid = false;
        //String status;
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet restResults = state.executeQuery("SELECT username FROM restaurant");

            //Check restaurant table
            while(restResults.next()){
                if (restResults.getString(1).equals(user)){
                    System.out.println(restResults.getString(1));
                    ResultSet restPassResults = state.executeQuery("SELECT pass FROM restaurant WHERE username = '" + user + "'");
                    if (restPassResults.next()){
                        System.out.println(restPassResults.getString(1));
                        if (restPassResults.getString(1).equals(pass)){
                            //return true;
                            return "Restaurant";
                        }
                    }
                }
            }

            ResultSet driveResults = state.executeQuery("SELECT username FROM driver");

            //Check driver table
            while(driveResults.next()){
                if (driveResults.getString(1).equals(user)){
                    ResultSet drivePassResults = state.executeQuery("SELECT pass FROM driver WHERE username = '" + user + "'");
                    if (drivePassResults.next()){
                        if(drivePassResults.getString(1).equals(pass)){
                            return "Driver";
                        }
                    }
                }
            }

            state.close();
            conn.close();

            return "None";
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect.", e);
        }
    }
    
    //gets driverInfo for viewInfo for the DriverInfoGUI
    public static String[] getDriver(String user){
        try{
            String[] driverInf = new String[3]; //returns array with name, car info, license
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            //gets username from driver table
            ResultSet driveResults = state.executeQuery("SELECT username FROM driver WHERE username = '" + user + "'"); 

            while(driveResults.next()){ //iterates through usernames until correct one is found
                if (driveResults.getString(1).equals(user)){
                    //gets the driver's name from the correct column in table
                    ResultSet drivePassResults = state.executeQuery("SELECT driver_name FROM driver WHERE username = '" + user + "'");
                    //sets array[0] equal to the driver's name
                    if(drivePassResults.next()){
                        driverInf[0]=(drivePassResults.getString(1));      
                    }
                    //gets the driver's car info from the correct column in table
                    drivePassResults = state.executeQuery("SELECT car_info FROM driver WHERE username = '" + user + "'");
                    //sets array[1] equal to the driver's car info
                    if(drivePassResults.next()){
                        driverInf[1]=(drivePassResults.getString(1));     
                    }
                    //gets the driver's license number from the correct column in table
                    drivePassResults = state.executeQuery("SELECT license_num FROM driver WHERE username = '" + user + "'");
                    //sets array[2] equal to the driver's license num
                    if(drivePassResults.next()){
                        driverInf[2]=(drivePassResults.getString(1));    
                    }                
                }
                state.close();
                conn.close();
                return driverInf; //returns array with results   
            }
            return driverInf;   //returns array with results if empty         

        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect.", e);
        }
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

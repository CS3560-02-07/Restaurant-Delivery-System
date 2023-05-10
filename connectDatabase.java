import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connectDatabase {
    //Variables to keep track of user 
    public static String userStatus;
    public static int ID;

    // Insert a new entry into restaurant table
    public static int insertRestaurant(String name, String address, String phone, String user, String pass) {
        // Connection conn = getConnection();
        int restID = -1;
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            String query = "INSERT INTO restaurant VALUES (NULL, '" + name + "', '" + address + "', '" +
                    phone + "', '" + user + "', '" + pass + "')";

            System.out.println(query);

            state.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet results = state.getGeneratedKeys();
            if (results.next()) {
                restID = results.getInt(1);
            }
            // restID = results.getInt(1);

            System.out.println("added with id " + restID);

            state.close();
            conn.close();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }

        return restID;

    }

    // Insert a new entry into driver table
    public static int insertDriver(String name, String license, String car,  String user, String pass) {
        // Connection conn = getConnection();
        int DriveID = -1;
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            String query = "INSERT INTO driver VALUES (NULL, '" + name + "', '" + car + "', '" +
                    license + "', '" + user + "', '" + pass + "')";

            System.out.println(query);

            state.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet results = state.getGeneratedKeys();
            if (results.next()) {
                DriveID = results.getInt(1);
            }
            // restID = results.getInt(1);

            System.out.println("added with id " + DriveID);

            state.close();
            conn.close();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }

        return DriveID;

    }

    // Check if login information is valid and exists within the database
    public static String checkLogin(String user, String pass) {
        // boolean valid = false;
        // String status;
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet restResults = state.executeQuery("SELECT username FROM restaurant");

            // Check restaurant table
            while (restResults.next()) {
                if (restResults.getString(1).equals(user)) {
                    System.out.println(restResults.getString(1));
                    ResultSet restPassResults = state
                            .executeQuery("SELECT pass, restaurantID FROM restaurant WHERE username = '" + user + "'");
                    if (restPassResults.next()) {
                        System.out.println(restPassResults.getString(1));
                        if (restPassResults.getString(1).equals(pass)) {
                            // return true;
                            setID(restPassResults.getInt(2));
                            System.out.println(ID);
                            return "Restaurant";
                        }
                    }
                }
            }

            ResultSet driveResults = state.executeQuery("SELECT username FROM driver");

            // Check driver table
            while (driveResults.next()) {
                if (driveResults.getString(1).equals(user)) {
                    ResultSet drivePassResults = state
                            .executeQuery("SELECT pass, driverID FROM driver WHERE username = '" + user + "'");
                    if (drivePassResults.next()) {
                        if (drivePassResults.getString(1).equals(pass)) {
                            setID(drivePassResults.getInt(2));
                            System.out.println(ID);
                            return "Driver";
                        }
                    }
                }
            }

            state.close();
            conn.close();

            return "None";
        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }
    }

    // gets driverInfo for viewInfo for the DriverInfoGUI
    public static String[] getDriver(int DriveID) {
        try {
            String[] driverInf = new String[3]; // returns array with name, car info, license
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            // gets username from driver table
            ResultSet driveResults = state.executeQuery("SELECT driverID FROM driver WHERE driverID = '" + DriveID + "'");

            while (driveResults.next()) { // iterates through usernames until correct one is found
                if (driveResults.getInt(1) == DriveID) {
                    // gets the driver's name from the correct column in table
                    ResultSet drivePassResults = state
                            .executeQuery("SELECT driver_name FROM driver WHERE driverID = '" + DriveID + "'");
                    // sets array[0] equal to the driver's name
                    if (drivePassResults.next()) {
                        driverInf[0] = (drivePassResults.getString(1));
                    }
                    // gets the driver's car info from the correct column in table
                    drivePassResults = state
                            .executeQuery("SELECT car_info FROM driver WHERE driverID = '" + DriveID + "'");
                    // sets array[1] equal to the driver's car info
                    if (drivePassResults.next()) {
                        driverInf[1] = (drivePassResults.getString(1));
                    }
                    // gets the driver's license number from the correct column in table
                    drivePassResults = state
                            .executeQuery("SELECT license_num FROM driver WHERE driverID = '" + DriveID + "'");
                    // sets array[2] equal to the driver's license num
                    if (drivePassResults.next()) {
                        driverInf[2] = (drivePassResults.getString(1));
                    }
                }
                state.close();
                conn.close();
                return driverInf; // returns array with results
            }
            return driverInf; // returns array with results if empty

        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }
    }

    // gets restInfo for viewInfo for the RestaurantInfoGUI
    public static String[] getRest(int restID) {
        try {
            String[] driverInf = new String[3]; // returns array with name, address, phone number
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            // gets username from driver table
            ResultSet driveResults = state
                    .executeQuery("SELECT restaurantID FROM restaurant WHERE restaurantID = '" + restID + "'");

            while (driveResults.next()) { // iterates through usernames until correct one is found
                if (driveResults.getInt(1) == restID) {
                    // gets the driver's name from the correct column in table
                    ResultSet drivePassResults = state
                            .executeQuery("SELECT restaurant_name FROM restaurant WHERE restaurantID = '" + restID + "'");
                    // sets array[0] equal to the driver's name
                    if (drivePassResults.next()) {
                        driverInf[0] = (drivePassResults.getString(1));
                    }
                    // gets the driver's car info from the correct column in table
                    drivePassResults = state
                            .executeQuery("SELECT restaurant_address FROM restaurant WHERE restaurantID = '" + restID + "'");
                    // sets array[1] equal to the driver's car info
                    if (drivePassResults.next()) {
                        driverInf[1] = (drivePassResults.getString(1));
                    }
                    // gets the driver's license number from the correct column in table
                    drivePassResults = state
                            .executeQuery("SELECT restaurant_phone FROM restaurant WHERE restaurantID = '" + restID + "'");
                    // sets array[2] equal to the driver's license num
                    if (drivePassResults.next()) {
                        driverInf[2] = (drivePassResults.getString(1));
                    }
                }
                state.close();
                conn.close();
                return driverInf; // returns array with results
            }
            return driverInf; // returns array with results if empty

        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }
    }

    // gets custInfo for the driverInfoGUI
    public static String[] getRestUsingKey(int restaurantID) {
        try {
            String[] driverInf = new String[3]; // returns array with name, address, phone number
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            // gets restaurantID from rest table
             ResultSet driveResults = state
                    .executeQuery("SELECT restaurantID FROM restaurant WHERE restaurantID = " + restaurantID);

            while (driveResults.next()) { 
                if (driveResults.getInt(1) == restaurantID) {
                    ResultSet drivePassResults = state
                            .executeQuery("SELECT restaurant_name FROM restaurant WHERE restaurantID = " + restaurantID);
                    // sets array[0] equal to the rest's name
                    if (drivePassResults.next()) {
                        driverInf[0] = (drivePassResults.getString(1));
                    }
                    drivePassResults = state
                            .executeQuery("SELECT restaurant_address FROM restaurant WHERE restaurantID = " + restaurantID);
                    // sets array[1] equal to the rest's address
                    if (drivePassResults.next()) {
                        driverInf[1] = (drivePassResults.getString(1));
                    }
                    drivePassResults = state
                            .executeQuery("SELECT restaurant_phone FROM restaurant WHERE restaurantID = " + restaurantID);
                    // sets array[2] equal to the rest's phone
                    if (drivePassResults.next()) {
                        driverInf[2] = (drivePassResults.getString(1));
                    }
                }
                state.close();
                conn.close();
                return driverInf; // returns array with results
            }
            return driverInf; // returns array with results if empty

        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }
    }

    // gets custInfo for the driverInfoGUI
    public static String[] getCust(int customerID) {    
        try {
            String[] driverInf = new String[5]; // returns array with f_name, l_name, address, credit_card, phone_number
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            // gets customerID from driver table
            ResultSet driveResults = state
                    .executeQuery("SELECT customerID FROM customer WHERE customerID = " + customerID);

            while (driveResults.next()) { 
                if (driveResults.getInt(1) == customerID) {
                    ResultSet drivePassResults = state
                            .executeQuery("SELECT f_name FROM customer WHERE customerID = " + customerID);
                    // sets array[0] equal to the f_name
                    if (drivePassResults.next()) {
                        driverInf[0] = (drivePassResults.getString(1));
                    }
                    drivePassResults = state
                            .executeQuery("SELECT l_name FROM customer WHERE customerID = " + customerID);
                    // sets array[1] equal to the l_name
                    if (drivePassResults.next()) {
                        driverInf[1] = (drivePassResults.getString(1));
                    }
                    drivePassResults = state
                            .executeQuery("SELECT address FROM customer WHERE customerID = " + customerID);
                    // sets array[2] equal to the address
                    if (drivePassResults.next()) {
                        driverInf[2] = (drivePassResults.getString(1));
                    }
                    // gets the driver's license number from the correct column in table
                    drivePassResults = state
                            .executeQuery("SELECT credit_card FROM customer WHERE customerID = " + customerID);
                    // sets array[3] equal to the credit_card
                    if (drivePassResults.next()) {
                        driverInf[3] = (drivePassResults.getString(1));
                    }
                    drivePassResults = state
                            .executeQuery("SELECT phone_number FROM customer WHERE customerID = " + customerID);
                    // sets array[4] equal to the phone_number
                    if (drivePassResults.next()) {
                        driverInf[4] = (drivePassResults.getString(1));
                    }
                }
                state.close();
                conn.close();
                return driverInf; // returns array with results
            }
            return driverInf; // returns array with results if empty

        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }
    }

    // gets confirmed order for the DriverInfoGUI
    //whether we want the confirmed orders to be pending (true) or non-pending (False)
    public static int[][] getConfirmedOrders(boolean pendingStatus) {    //returns order_num, customerID, restaurantID
        List<int[]> rows = new ArrayList<>();
        int results[][];
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            //gets all rows that have been confirmed by restaurant
            //no driver, confirmed but not completed
            ResultSet rs = state.executeQuery
            ("SELECT order_num, customerID, restaurantID, driverID FROM orders WHERE confirmed = TRUE AND driverID is NULL AND completed = FALSE");
            if(pendingStatus==true){
                rs = state.executeQuery("SELECT order_num, customerID, restaurantID, driverID FROM orders WHERE confirmed = TRUE AND completed = FALSE");
            }
            ResultSetMetaData rsmd = rs.getMetaData();
            //gets numer of columns
            int numColumns = rsmd.getColumnCount();
            //converts the returned columns into arraylist rows
            while (rs.next()) {
                int[] row = new int[numColumns];
                for (int col = 1; col <= numColumns; col++) {
                    row[col - 1] = rs.getInt(col);
                }
                rows.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //converts from arraylist to 2d array and returns in each row: order_num, customerID, restaurantID
        if(rows.size()==0){
            return null;
        }
        int numRows = rows.size();
        int numColumns = rows.get(0).length;
        results = new int[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                results[i][j] = rows.get(i)[j];
            }
        }

        return results;
    }

    public static boolean driverValidateUser(String userInput) throws SQLException {
        Connection conn = getConnection();
        boolean exists = false;
        
        // Create a statement object to execute SQL queries
        Statement stmt = conn.createStatement();
        
        // Build the SQL query to check if the field exists in the table
        String query = "SELECT username FROM driver WHERE username = '" + userInput + "'";
        // Execute the query and get the results
        ResultSet rs = stmt.executeQuery(query);
        
        // Check if the field exists in the table
        if (rs.next()) {
            exists = true;
        }
        
        // Close the statement and result set
        rs.close();
        stmt.close();
        
        // Return the result
        return exists;
    }

    public static boolean restaurantValidateUser(String userInput) throws SQLException {
        Connection conn = getConnection();
        boolean exists = false;
        
        // Create a statement object to execute SQL queries
        Statement stmt = conn.createStatement();
        
        // Build the SQL query to check if the field exists in the table
        String query = "SELECT username FROM restaurant WHERE username = '" + userInput + "'";
        // Execute the query and get the results
        ResultSet rs = stmt.executeQuery(query);
        
        // Check if the field exists in the table
        if (rs.next()) {
            exists = true;
        }
        
        // Close the statement and result set
        rs.close();
        stmt.close();
        
        // Return the result
        return exists;
    }


    public static String[][] getRestOrders(int restID){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            String[] tableInfo;

            ResultSet results = state.executeQuery("SELECT customerID FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 0");
            ResultSetMetaData info = results.getMetaData();
            int columnNum = info.getColumnCount();

            List<Integer> custIDs = new ArrayList<Integer>();
            while (results.next()){
                custIDs.add(results.getInt(1));
            }

            if (custIDs.size() == 0){
                return new String[][] {{""}};
            }

            String answer[][] = new String[custIDs.size()][6];

            results = state.executeQuery("SELECT order_num, total_cost FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 0");

            int j = 0;
            while (results.next()){
                answer[j][0] = String.valueOf(results.getInt(1));
                answer[j][4] = String.valueOf(results.getDouble(2));
                answer[j][5] = String.valueOf(results.getDouble(2));
                j++;
            }

            for (int i = 0; i < custIDs.size(); i++){
                results = state.executeQuery("SELECT f_name, l_name, address, phone_number FROM customer WHERE customerID = " + String.valueOf(custIDs.get(i)));
                
                while (results.next()){
                    answer[i][1] = results.getString(1);
                    answer[i][2] = results.getString(2);
                    answer[i][3] = results.getString(3);
                    answer[i][4] = results.getString(4);

                }
            }
            state.close();
            conn.close();
            return answer;
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect. ", e);
        }
    }

    //Get the current confirmed orders for the restaurant
    public static String[][] getRestPending(int restID){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet results = state.executeQuery("SELECT customerID FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 1 AND completed = 0");

            List<Integer> custIDs = new ArrayList<Integer>();
            while (results.next()){
                custIDs.add(results.getInt(1));
            }

            if (custIDs.size() == 0){
                return new String[][] {{""}};
            }

            String answer[][] = new String[custIDs.size()][6];

            results = state.executeQuery("SELECT order_num, driverID, total_cost FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 1 AND completed = 0");

            int j = 0;
            while (results.next()){
                answer[j][0] = String.valueOf(results.getInt(1));
                answer[j][1] = String.valueOf(results.getInt(2));
                answer[j][5] = String.valueOf(results.getDouble(3));
                j++;
            }

            for (int i = 0; i < custIDs.size(); i++){
                results = state.executeQuery("SELECT f_name, address, phone_number FROM customer WHERE customerID = " + String.valueOf(custIDs.get(i)));
                
                while (results.next()){
                    answer[i][2] = results.getString(1);
                    answer[i][3] = results.getString(2);
                    answer[i][4] = results.getString(3);
                }
            }
            state.close();
            conn.close();
            return answer;
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect. ", e);
        }
    }

    //Get the current completed orders for the restaurant
    public static String[][] getRestCompleted(int restID){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet results = state.executeQuery("SELECT customerID FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 1 AND completed = 1");

            List<Integer> custIDs = new ArrayList<Integer>();
            while (results.next()){
                custIDs.add(results.getInt(1));
            }

            if (custIDs.size() == 0){
                return new String[][] {{""}};
            }

            String answer[][] = new String[custIDs.size()][6];

            results = state.executeQuery("SELECT order_num, customerID, driverID, total_cost FROM orders WHERE restaurantID = " + String.valueOf(restID) + " AND confirmed = 1 AND completed = 1");

            int j = 0;
            while (results.next()){
                answer[j][0] = String.valueOf(results.getInt(1));
                answer[j][1] = String.valueOf(results.getInt(2));
                answer[j][2] = String.valueOf(results.getInt(3));
                answer[j][5] = String.valueOf(results.getDouble(4));
                j++;
            }

            for (int i = 0; i < custIDs.size(); i++){
                results = state.executeQuery("SELECT address, phone_number FROM customer WHERE customerID = " + String.valueOf(custIDs.get(i)));
                
                while (results.next()){
                    answer[i][3] = results.getString(1);
                    answer[i][4] = results.getString(2);
                }
            }
            state.close();
            conn.close();
            return answer;
        }
        catch(Exception e){
            throw new IllegalStateException("Failed to connect. ", e);
        }
    }

    public static String[][] getDeliveryHist(int driverID) {    //returns driverID, delivery_num, estimated_time, actual_time, distance
        
        List<int[]> rows = new ArrayList<>();
        String results[][];
        try {
            Connection conn = getConnection();
            Statement state = conn.createStatement();
            //gets all rows that have been confirmed by restaurant
            ResultSet rs = state.executeQuery("SELECT driverID, delivery_num, estimated_time, actual_time, distance FROM delivery WHERE driverID = "+driverID+";");
            ResultSetMetaData rsmd = rs.getMetaData();
            //gets numer of columnsd
            int numColumns = rsmd.getColumnCount();
            //converts the returned columns into arraylist rows
            while (rs.next()) {
                int[] row = new int[numColumns];
                for (int col = 1; col <= numColumns; col++) {
                    row[col - 1] = rs.getInt(col);
                }
                rows.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(rows.size()==0){
            return null;
        }
        int numRows = rows.size();
        int numColumns = rows.get(0).length + 1;
        results = new String[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if(j!=5){
                    results[i][j] = String.valueOf(rows.get(i)[j]);
                }
                else{
                    results[i][j] = null;
                }
            }
        }

        return results;
    }

    //confirms orders in database
    public static boolean setOrderConf(int ID){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet results = state.executeQuery("SELECT confirmed FROM orders WHERE order_num = " + ID);
            if (results.next()){
                state.executeUpdate("UPDATE orders SET confirmed = 1 WHERE order_num = " + ID);
                state.close();
                conn.close();
                return true;
            }

            state.close();
            conn.close();
            return false;
        }
        catch(Exception e){
            throw new IllegalStateException("failed to connect. ", e);
        }
    }
    
    //updating order according to driverID such that driver_ID is equal to whatever value
    public static boolean setOrderDriver(int driverID, int order_num){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            ResultSet results = state.executeQuery("SELECT driverID FROM orders WHERE order_num = " + order_num);
            if (results.next()){
                state.executeUpdate("UPDATE orders SET driverID = " + driverID + " WHERE order_num = " + order_num);
                return true;
            }

            return false;
        }
        catch(Exception e){
            throw new IllegalStateException("failed to connect. ", e);
        }
    }

    public static boolean createDelivery(int driverID, int estimated_time, int actual_time, int distance){
        try{
            Connection conn = getConnection();
            Statement state = conn.createStatement();

            int results = state.executeUpdate
            ("INSERT INTO delivery VALUES (" + driverID + ", NULL, " + estimated_time + ", " + actual_time + ", " + distance + "1);");
            if(results!=0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            throw new IllegalStateException("failed to connect. ", e);
        }
    }
    /*driverID INT,
    delivery_num INT AUTO_INCREMENT,
    estimated_time INT, 
    actual_time INT,
	distance INT(4),
    FOREIGN KEY(driverID) REFERENCES driver(driverID),
    PRIMARY KEY(delivery_num) */

    public static String getStatus(){
        return userStatus;
    }

    public static int getID(){
        return ID;
    }

    public static void setStatus(String newStatus){
        userStatus = newStatus;
    }

    public static void setID(int newID){
        ID = newID;
    }

    public static void main(String[] args) {
        // Login info for mysql
        String url = "jdbc:mysql://localhost:3306/delivery_system";
        String username = "root";
        String password = "3560";

        // establish connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            // retrieve data from database
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getString(2) + " " + resultSet.getString(3));
            }

            connection.close();
        }
        // catch exceptions
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // breaking up the method
    private static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/delivery_system";
        String username = "root";
        String password = "3560";
        Connection connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to connect.", e);
        }

        return connection;
    }
}
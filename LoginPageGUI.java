import javax.swing.*;

public class LoginPageGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPageGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        //create labels (text on screen)
        loginLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        //create text box for user input
        userInput = new javax.swing.JTextField();
        //create text box for password input
        passInput = new javax.swing.JPasswordField();
        //create buttons
        loginButton = new javax.swing.JButton();
        regButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //sets background color
        setResizable(false); //doesn't allow user to change window size

        //set font style and size for each label
        loginLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24));
        loginLabel.setText("Login");

        userLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        userLabel.setText("Username:");

        passLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        passLabel.setText("Password:");

        //action set by user (input text boxes)
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        passInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passInputActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        //for horizontal and vertical layouts of labels, text boxes, buttons, etc.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(loginLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userInput, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(passInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        .addComponent(regButton)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLabel)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(regButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }                        

    //actions for login button
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(userInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(passInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        /*
        else if(connectDatabase.checkLogin(userInput.getText(), passInput.getText())){
            RestaurantInfoGUI restaurant = new RestaurantInfoGUI();
            restaurant.setVisible(true);
            setVisible(false);
        }
        */
        else if(userInput.getText().equals("abcRestaurant") && passInput.getText().equals("lmaoxd")){
            RestaurantInfoGUI restaurant = new RestaurantInfoGUI(userInput.getText());
            restaurant.setVisible(true);
            setVisible(false);
        }
        else if(userInput.getText().equals("abcRestDriver") && passInput.getText().equals("lolgg")){
            DriverInfoGUI driver = new DriverInfoGUI(userInput.getText());
            driver.setVisible(true);
            setVisible(false);
        }
        else {
            //Check if inputted username and password is in the database, as well as if they are a restaurant or driver
            String status = connectDatabase.checkLogin(userInput.getText(), passInput.getText());
            if (status.equals("Restaurant")){
                connectDatabase.setStatus(status);
                RestaurantInfoGUI restaurant = new RestaurantInfoGUI(userInput.getText());
                restaurant.setVisible(true);
                setVisible(false);
            }
            else if (status.equals("Driver")){
                connectDatabase.setStatus(status);
                DriverInfoGUI driver = new DriverInfoGUI(userInput.getText());  //gets username input and uses it as argument into DriverInfoGUI
                driver.setVisible(true);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            }
        }
        try{
            //open connection
        } catch(Exception e){
            System.out.println(e.getMessage());

        }
        
    }                                           

    private void passInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {                          
    }                                         

    //actions for register button
    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        RegisterFormGUI register = new RegisterFormGUI();
        register.setVisible(true);
        setVisible(false);
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton regButton;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration                   
}
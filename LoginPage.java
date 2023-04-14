
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        passInput = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 216, 233));
        setResizable(false);

        loginLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        loginLabel.setText("Login");

        userLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        userLabel.setText("Username:");

        passLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passLabel.setText("Password:");

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
                        .addGap(87, 87, 87)
                        .addComponent(loginButton)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(userInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(passInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else if(userInput.getText().equals("abcRestaurant") && passInput.getText().equals("lmaoxd")){
            RestaurantInfo restaurant = new RestaurantInfo();
            restaurant.setVisible(true);
            setVisible(false);
        }
    }                                           

    private void passInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
             new LoginPage().setVisible(true);
         }
     });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration                   
}


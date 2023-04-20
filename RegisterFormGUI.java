import javax.swing.JOptionPane;

public class RegisterFormGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFormGUI
     */
    public RegisterFormGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        registerFormTabs = new javax.swing.JTabbedPane();
        newRestTab = new javax.swing.JPanel();
        restNamePrompt = new javax.swing.JLabel();
        restAddyPrompt = new javax.swing.JLabel();
        restNumPrompt = new javax.swing.JLabel();
        restUserPrompt = new javax.swing.JLabel();
        restPassPrompt = new javax.swing.JLabel();
        restNameInput = new javax.swing.JTextField();
        addyInput = new javax.swing.JTextField();
        restNumInput = new javax.swing.JTextField();
        restUserInput = new javax.swing.JTextField();
        restPassInput = new javax.swing.JTextField();
        restRegButton = new javax.swing.JButton();
        restBackToLoginButton = new javax.swing.JButton();
        newDriverTab = new javax.swing.JPanel();
        driverNamePrompt = new javax.swing.JLabel();
        driverLicPrompt = new javax.swing.JLabel();
        carInfoPrompt = new javax.swing.JLabel();
        driverUserPrompt = new javax.swing.JLabel();
        driverPassPrompt = new javax.swing.JLabel();
        driverNameInput = new javax.swing.JTextField();
        driverLicInput = new javax.swing.JTextField();
        carInfoInput = new javax.swing.JTextField();
        driverUserInput = new javax.swing.JTextField();
        driverPassInput = new javax.swing.JTextField();
        driverRegButton = new javax.swing.JButton();
        driverBackToLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerFormTabs.setBackground(new java.awt.Color(166, 216, 233));

        newRestTab.setBackground(new java.awt.Color(199, 234, 245));

        restNamePrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        restNamePrompt.setText("Restaurant Name:");

        restAddyPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        restAddyPrompt.setText("Address:");

        restNumPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        restNumPrompt.setText("Number:");

        restUserPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        restUserPrompt.setText("Username:");

        restPassPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        restPassPrompt.setText("Password:");

        restNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restNameInputActionPerformed(evt);
            }
        });

        addyInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addyInputActionPerformed(evt);
            }
        });

        restNumInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restNumInputActionPerformed(evt);
            }
        });

        restUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restUserInputActionPerformed(evt);
            }
        });

        restPassInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restPassInputActionPerformed(evt);
            }
        });

        restRegButton.setText("Register");
        restRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restRegButtonActionPerformed(evt);
            }
        });

        restBackToLoginButton.setText("Back to Login");
        restBackToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBackToLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newRestTabLayout = new javax.swing.GroupLayout(newRestTab);
        newRestTab.setLayout(newRestTabLayout);
        newRestTabLayout.setHorizontalGroup(
            newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newRestTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newRestTabLayout.createSequentialGroup()
                        .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restAddyPrompt)
                            .addComponent(restNamePrompt)
                            .addComponent(restNumPrompt)
                            .addComponent(restUserPrompt)
                            .addComponent(restPassPrompt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newRestTabLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(restRegButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(restBackToLoginButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        newRestTabLayout.setVerticalGroup(
            newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newRestTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restNamePrompt)
                    .addComponent(restNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(restAddyPrompt)
                    .addComponent(addyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(restNumPrompt)
                    .addComponent(restNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restUserPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restPassPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newRestTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restRegButton)
                    .addComponent(restBackToLoginButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        registerFormTabs.addTab("New Restaurant", newRestTab);

        newDriverTab.setBackground(new java.awt.Color(199, 234, 245));

        driverNamePrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        driverNamePrompt.setText("Driver Name;");

        driverLicPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        driverLicPrompt.setText("Driver License:");

        carInfoPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        carInfoPrompt.setText("Car Information:");

        driverUserPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        driverUserPrompt.setText("Username:");

        driverPassPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        driverPassPrompt.setText("Password:");

        driverNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverNameInputActionPerformed(evt);
            }
        });

        driverLicInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLicInputActionPerformed(evt);
            }
        });

        carInfoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carInfoInputActionPerformed(evt);
            }
        });

        driverUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverUserInputActionPerformed(evt);
            }
        });

        driverPassInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverPassInputActionPerformed(evt);
            }
        });

        driverRegButton.setText("Register");
        driverRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverRegButtonActionPerformed(evt);
            }
        });

        driverBackToLoginButton.setText("Back to Login");
        driverBackToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverBackToLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newDriverTabLayout = new javax.swing.GroupLayout(newDriverTab);
        newDriverTab.setLayout(newDriverTabLayout);
        newDriverTabLayout.setHorizontalGroup(
            newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDriverTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newDriverTabLayout.createSequentialGroup()
                        .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(driverLicPrompt)
                            .addComponent(driverNamePrompt)
                            .addComponent(carInfoPrompt)
                            .addComponent(driverUserPrompt)
                            .addComponent(driverPassPrompt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carInfoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driverNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driverLicInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driverUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driverPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newDriverTabLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(driverRegButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(driverBackToLoginButton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        newDriverTabLayout.setVerticalGroup(
            newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDriverTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverNamePrompt)
                    .addComponent(driverNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(driverLicPrompt)
                    .addComponent(driverLicInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carInfoPrompt)
                    .addComponent(carInfoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverUserPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverPassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverPassPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newDriverTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverRegButton)
                    .addComponent(driverBackToLoginButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        registerFormTabs.addTab("New Driver", newDriverTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(registerFormTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(registerFormTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }                        

    
    //variable delcaration to save user input
    public String restName, restAddy, restNum, restUser, restPass;
    public String driverName, driverLic, carInfo, driverUser, driverPass;
    
    private void restNameInputActionPerformed(java.awt.event.ActionEvent evt) {                                              
        restName = restNameInput.getText();
    }                                             

    private void addyInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        restAddy = addyInput.getText();
    }                                         

    private void restNumInputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        restNum = restNumInput.getText();
    }                                            

    private void restUserInputActionPerformed(java.awt.event.ActionEvent evt) {                                              
        restUser = restUserInput.getText();
    }                                             

    private void restPassInputActionPerformed(java.awt.event.ActionEvent evt) {                                              
        restPass = restPassInput.getText();
    }                                             

    private void driverNameInputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        driverName = driverNameInput.getText();
    }                                               

    private void driverLicInputActionPerformed(java.awt.event.ActionEvent evt) {                                               
        driverLic = driverLicInput.getText();
    }                                              

    private void carInfoInputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        carInfo = carInfoInput.getText();
    }                                            

    private void driverUserInputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        driverUser = driverUserInput.getText();
    }                                               

    private void driverPassInputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        driverPass = driverPassInput.getText();
    }                                               
  
    private void driverBackToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        LoginPageGUI login = new LoginPageGUI();
        login.setVisible(true);
        setVisible(false);
    }                                                       

    private void restBackToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        LoginPageGUI login = new LoginPageGUI();
        login.setVisible(true);
        setVisible(false);
    }                                                     

    private void driverRegButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(driverNameInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out name");
        }
        else if(driverLicInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out drivers license");
        }
        else if(carInfoInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out car information");
        }
        else if(driverUserInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(driverPassInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else{
            JOptionPane.showMessageDialog(null, "New Driver registered");
        }
    }                                               

    private void restRegButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(restNameInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out restaurant name");
        }
        else if(addyInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out address");
        }
        else if(restNumInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out number");
        }
        else if(restUserInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(restPassInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else{
            JOptionPane.showMessageDialog(null, "New Restaurant registered");
        }
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField addyInput;
    private javax.swing.JTextField carInfoInput;
    private javax.swing.JLabel carInfoPrompt;
    private javax.swing.JButton driverBackToLoginButton;
    private javax.swing.JTextField driverLicInput;
    private javax.swing.JLabel driverLicPrompt;
    private javax.swing.JTextField driverNameInput;
    private javax.swing.JLabel driverNamePrompt;
    private javax.swing.JTextField driverPassInput;
    private javax.swing.JLabel driverPassPrompt;
    private javax.swing.JButton driverRegButton;
    private javax.swing.JTextField driverUserInput;
    private javax.swing.JLabel driverUserPrompt;
    private javax.swing.JPanel newDriverTab;
    private javax.swing.JPanel newRestTab;
    private javax.swing.JTabbedPane registerFormTabs;
    private javax.swing.JLabel restAddyPrompt;
    private javax.swing.JButton restBackToLoginButton;
    private javax.swing.JTextField restNameInput;
    private javax.swing.JLabel restNamePrompt;
    private javax.swing.JTextField restNumInput;
    private javax.swing.JLabel restNumPrompt;
    private javax.swing.JTextField restPassInput;
    private javax.swing.JLabel restPassPrompt;
    private javax.swing.JButton restRegButton;
    private javax.swing.JTextField restUserInput;
    private javax.swing.JLabel restUserPrompt;
    // End of variables declaration                   
}

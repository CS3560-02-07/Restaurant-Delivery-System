import javax.swing.JOptionPane;

public class DriverInfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantInfo
     */
    public DriverInfoGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        //create tabs
        driverInfoTab = new javax.swing.JTabbedPane();
        driverOptionTabs = new javax.swing.JTabbedPane();
        //tabs for driver to view
        viewInfo = new javax.swing.JPanel();
        pickUpConfirm = new javax.swing.JPanel();
        recordDelivery = new javax.swing.JPanel();
        //record delivery labels (text on screen), text boxes for user input, and buttons
        estTimePrompt = new javax.swing.JLabel();
        actualTimePrompt = new javax.swing.JLabel();
        distTravPrompt = new javax.swing.JLabel();
        estTimeInput = new javax.swing.JTextField();
        actualTimeInput = new javax.swing.JTextField();
        distTravInput = new javax.swing.JTextField();
        recordDeliveryButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        pickUpButtonY = new javax.swing.JButton();
        pickUpButtonN = new javax.swing.JButton();
        pickUpPrompt = new javax.swing.JLabel();
        pickUpInput = new javax.swing.JTextField();
        //other tabs for driver to view
        deliveryHist = new javax.swing.JPanel();
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        //log out button for driver
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //set background color of window

        driverOptionTabs.setBackground(new java.awt.Color(166, 216, 233)); //set background color of driver option tab

        viewInfo.setBackground(new java.awt.Color(199, 234, 245)); //set background color of view info tab

        //horizontal and vertical layouts of view info tab
        javax.swing.GroupLayout viewInfoLayout = new javax.swing.GroupLayout(viewInfo);
        viewInfo.setLayout(viewInfoLayout);
        viewInfoLayout.setHorizontalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        viewInfoLayout.setVerticalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        driverOptionTabs.addTab("View Info", viewInfo); //names the tab "view info"

        //pickUpConfirm UI

        pickUpButtonY.setText("Yes");
        pickUpButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpButtonYActionPerformed(evt);
            }
        });

        pickUpButtonN.setText("No");
        pickUpButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpButtonNActionPerformed(evt);
            }
        });

        pickUpConfirm.setBackground(new java.awt.Color(199, 234, 245)); //set background color of pick-up confirmation tab

        //font and txt size of record delivery
        pickUpPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        pickUpPrompt.setText("Has the order been picked up?");

        //horizontal and vertical layouts of pick-up confirmation tab
        javax.swing.GroupLayout pickUpLayout = new javax.swing.GroupLayout(pickUpConfirm);
        pickUpConfirm.setLayout(pickUpLayout);
        pickUpLayout.setHorizontalGroup(
            pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickUpLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pickUpLayout.createSequentialGroup()
                        .addComponent(pickUpPrompt)
                        )
                        .addGroup(pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickUpLayout.createSequentialGroup()
                                .addComponent(pickUpButtonY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pickUpButtonN)))))
                .addGap(149, 149, 149))
        ;
        pickUpLayout.setVerticalGroup(
            pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickUpLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickUpPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                
                .addGap(12, 12, 12)
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickUpButtonY)
                    .addComponent(pickUpButtonN))
                .addContainerGap(143, Short.MAX_VALUE))
        );


        // end of pickupconfirm ui

        driverOptionTabs.addTab("Pick-up Confirmation", pickUpConfirm); //names the tab "pick-up confirmation"

        recordDelivery.setBackground(new java.awt.Color(199, 234, 245)); //set background color of record delivery tab

        //set font style and size for each label
        estTimePrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        estTimePrompt.setText("Estimated Time:");

        actualTimePrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        actualTimePrompt.setText("Actual Time:");

        distTravPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        distTravPrompt.setText("Distance Travelled:");

        //action set by user(input text boxes and buttons)
        estTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estTimeInputActionPerformed(evt);
            }
        });

        actualTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualTimeInputActionPerformed(evt);
            }
        });

        distTravInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distTravInputActionPerformed(evt);
            }
        });

        recordDeliveryButton.setText("Record Delivery");
        recordDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordDeliveryButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        //horizontal and vertical layouts for record delivery tab
        javax.swing.GroupLayout recordDeliveryLayout = new javax.swing.GroupLayout(recordDelivery);
        recordDelivery.setLayout(recordDeliveryLayout);
        recordDeliveryLayout.setHorizontalGroup(
            recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordDeliveryLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(recordDeliveryLayout.createSequentialGroup()
                        .addComponent(estTimePrompt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recordDeliveryLayout.createSequentialGroup()
                        .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(recordDeliveryLayout.createSequentialGroup()
                                .addComponent(actualTimePrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, recordDeliveryLayout.createSequentialGroup()
                                .addComponent(distTravPrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                        .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actualTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distTravInput, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordDeliveryLayout.createSequentialGroup()
                                .addComponent(recordDeliveryButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearButton)))))
                .addGap(149, 149, 149))
        );
        recordDeliveryLayout.setVerticalGroup(
            recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordDeliveryLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estTimePrompt))
                .addGap(12, 12, 12)
                .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualTimePrompt)
                    .addComponent(actualTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distTravInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distTravPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordDeliveryButton)
                    .addComponent(clearButton))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        driverOptionTabs.addTab("Record Delivery", recordDelivery); //names the tab "record delivery"

        deliveryHist.setBackground(new java.awt.Color(199, 234, 245)); //set background color for delivery history tab
        deliveryHist.setBackground(new java.awt.Color(199, 234, 245)); //set background color for delivery history tab

        //horizontal and vertical layouts for delivery history tab
        javax.swing.GroupLayout deliveryHistLayout = new javax.swing.GroupLayout(deliveryHist);
        deliveryHist.setLayout(deliveryHistLayout);
        deliveryHistLayout.setHorizontalGroup(
            deliveryHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        deliveryHistLayout.setVerticalGroup(
            deliveryHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        driverOptionTabs.addTab("Delivery History", deliveryHist); //names tab "delivery history"

        logOut.setBackground(new java.awt.Color(199, 234, 245)); //set background for log out tab

        //set font style and size for labels on log out tab
        logOutPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); 
        logOutPrompt.setText("Would you like to log-out?");

        //action set by user(button)
        logOutButton.setText("Log-out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        //horizontal and vertical layouts of log out tab
        javax.swing.GroupLayout logOutLayout = new javax.swing.GroupLayout(logOut);
        logOut.setLayout(logOutLayout);
        logOutLayout.setHorizontalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(logOutPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logOutButton)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        logOutLayout.setVerticalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutPrompt)
                    .addComponent(logOutButton))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        driverOptionTabs.addTab("Log-out", logOut); //names tab "log out"

        driverInfoTab.addTab("Driver Information", driverOptionTabs); //names top tab "driver information"

        //horizontal and vertical layout for driver information tab
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(driverInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(driverInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }                        

    //actions for buttons and input text boxes
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        LoginPageGUI login = new LoginPageGUI();
        setVisible(false);
        login.setVisible(true);
    }                                            

    public String actualTime, distTravelled, estTime;
    
    private void recordDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        if(actualTimeInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out actual time");
        }
        else if(distTravInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out distance travelled");
        }
        else if(estTimeInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out estimated time");
        }
        else{
            actualTime = actualTimeInput.getText();
            distTravelled = distTravInput.getText();
            estTime = estTimeInput.getText();
            actualTimeInput.setText("");
            distTravInput.setText("");
            estTimeInput.setText("");
            JOptionPane.showMessageDialog(null, "New Delivery Recorded");
        }
    }
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt){
        actualTimeInput.setText("");
        distTravInput.setText("");
        estTimeInput.setText("");
    }

    private void pickUpButtonYActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(null, "Pick up confirmed.");
    }

    private void pickUpButtonNActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(null, "Non pick up confirmed.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverInfoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField actualTimeInput;
    private javax.swing.JLabel actualTimePrompt;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel deliveryHist;
    private javax.swing.JTextField distTravInput;
    private javax.swing.JLabel distTravPrompt;
    private javax.swing.JTabbedPane driverInfoTab;
    private javax.swing.JTabbedPane driverOptionTabs;
    private javax.swing.JTextField estTimeInput;
    private javax.swing.JLabel estTimePrompt;
    private javax.swing.JPanel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOutPrompt;
    private javax.swing.JPanel pickUpConfirm;
    private javax.swing.JButton pickUpButtonY;
    private javax.swing.JButton pickUpButtonN;
    private javax.swing.JLabel pickUpPrompt;
    private javax.swing.JTextField pickUpInput;
    private javax.swing.JPanel recordDelivery;
    private javax.swing.JButton recordDeliveryButton;
    private javax.swing.JPanel viewInfo;
    // End of variables declaration                   
}

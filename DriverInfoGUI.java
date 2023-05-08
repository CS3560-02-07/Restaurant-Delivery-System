import javax.swing.JOptionPane;

public class DriverInfoGUI extends javax.swing.JFrame {

    //variables to save user input
    public String actual;
    public String estimate;
    public int dist;
    private String userName;

    /**
     * Creates new form RestaurantInfo
     */
    public DriverInfoGUI(String userName) {
        this.userName=userName;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        //create tabs
        driverInfoTab = new javax.swing.JTabbedPane();
        driverOptionTabs = new javax.swing.JTabbedPane();
        //driver view info tab + table
        viewInfo = new javax.swing.JPanel();
        driverViewInfoScrollPane = new javax.swing.JScrollPane();
        driverViewInfoTable = new javax.swing.JTable();
        //pending orders tab
        pendingOrders = new javax.swing.JPanel();
        pendingOrderScrollPanel = new javax.swing.JScrollPane();
        pendingOrderTable = new javax.swing.JTable();      
        //pickup tab
        pickup = new javax.swing.JPanel();
        pickupScrollPanel = new javax.swing.JScrollPane();
        pickupTable = new javax.swing.JTable();     
        //record delivery labels (text on screen), text boxes for user input, and buttons
        recordDelivery = new javax.swing.JPanel();
        estTimePrompt = new javax.swing.JLabel();
        actualTimePrompt = new javax.swing.JLabel();
        distTravPrompt = new javax.swing.JLabel();
        estTimeInput = new javax.swing.JTextField();
        actualTimeInput = new javax.swing.JTextField();
        distTravInput = new javax.swing.JTextField();
        recordDeliveryButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        //delivery history tab + table
        deliveryHist = new javax.swing.JPanel();
        delHistScrollPane = new javax.swing.JScrollPane();
        delHistTable = new javax.swing.JTable();
        //log-out
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //set background color of window

        driverOptionTabs.setBackground(new java.awt.Color(166, 216, 233)); //set background color of driver option tab

        viewInfo.setBackground(new java.awt.Color(199, 234, 245)); //set background color of view info tab

        //database connection to show driver info
        String[] driverInf = connectDatabase.getDriver(userName);
        //adds driver view info JTable 
        if (!driverInf[0].equals("")){ //if name string is not empty
            driverViewInfoTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {driverInf[0], driverInf[1], driverInf[2]},
            {null, null, null}
        },
        new String [] {
            "Driver Name", "Car Info", "License Number"
        }
        ));
        }  
        driverViewInfoScrollPane.setViewportView(driverViewInfoTable);
        
        ///////////////////////////////////////
        //horizontal and vertical layouts of view info tab
        pickup.setBackground(new java.awt.Color(199, 234, 245));

        int[][] confirmedOrders = connectDatabase.getConfirmedOrders(); //restaurant info array
        //adds restaurant view info JTable 
        if (confirmedOrders != null){ //if name string is not empty
            //confirms will hold all necessary information from respective customer/restaurant
            String[][] confirms = new String[confirmedOrders.length][6]; //although arrays are bigger, only need these 5 items
            String[] tempArr = new String[6];   //returns order_num, f_name, l_name, address, credit_card, phone_number
            String[] tempArr2 = new String[3];  //returns resname, address, phone
            for(int i=0; i<confirmedOrders.length; i++){    //places all necessary strings into confirms
                tempArr = connectDatabase.getCust(confirmedOrders[i][1]);
                tempArr2 = connectDatabase.getRestUsingKey(confirmedOrders[i][2]);  
                confirms[i][0]=String.valueOf(confirmedOrders[i][0]);
                for(int j=0; j<5; j++){ //onlyconfirmed orders will only return 2 columns with ID's of rest and cust
                if(j==0){
                    confirms[i][1] = tempArr2[0];
                }
                if(j==1){
                    confirms[i][2] = tempArr[0];
                }
                if(j==2){
                    confirms[i][3] = tempArr2[1];
                }
                if(j==3){
                    confirms[i][4] = tempArr[2];
                }
                if(j==4){
                    confirms[i][5] = tempArr[4];
                }
                }
            }
            
            //display table with rest, customer, from, to, phone
        pickupTable.setModel(new javax.swing.table.DefaultTableModel(
            confirms,   //displays confirms array with all confirmed orders
            new String [] {
                "Order #","Restaurant", "Customer", "From", "To", "Phone Number"
            }
        ));
        }
        else{
            pickupTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"", "", "", null, null},
                    {null, null, null, null, null}
                },
                new String [] {
                    "Restaurant", "Customer", "From", "To", "Phone Number"
                }
            ));
        }
        pickupScrollPanel.setViewportView(pickupTable);

        javax.swing.GroupLayout pickUpLayout = new javax.swing.GroupLayout(pickup);
        pickup.setLayout(pickUpLayout);
        pickUpLayout.setHorizontalGroup(
            pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickUpLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(pickupScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pickUpLayout.setVerticalGroup(
            pickUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickUpLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(pickupScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        driverOptionTabs.addTab("Pickup Confirmation", pickup);
        //names the tab "pick-up confirmation"
        ///////////////////////////////////////

        pendingOrders.setBackground(new java.awt.Color(199, 234, 245));

        pendingOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant", "Order Number", "Customer", "Address", "Phone Number"
            }
        ));
        pendingOrderScrollPanel.setViewportView(pendingOrderTable);

        javax.swing.GroupLayout pendingOrdersLayout = new javax.swing.GroupLayout(pendingOrders);
        pendingOrders.setLayout(pendingOrdersLayout);
        pendingOrdersLayout.setHorizontalGroup(
            pendingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingOrdersLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(pendingOrderScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pendingOrdersLayout.setVerticalGroup(
            pendingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingOrdersLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(pendingOrderScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        driverOptionTabs.addTab("Pending Order", pendingOrders);

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

        //adds delivery history JTable
        delHistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"111", "10", "15", "20"},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Number", "Est. Time (mins)", "Actual Time (mins)", "Distance (miles)"
            }
        ));
        delHistScrollPane.setViewportView(delHistTable);

        //horizontal and vertical layouts for delivery history tab
        javax.swing.GroupLayout deliveryHistLayout = new javax.swing.GroupLayout(deliveryHist);
        deliveryHist.setLayout(deliveryHistLayout);
        deliveryHistLayout.setHorizontalGroup(
            deliveryHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryHistLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(delHistScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        deliveryHistLayout.setVerticalGroup(
            deliveryHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryHistLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(delHistScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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
    
    private void actualTimeInputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        actualTime = actualTimeInput.getText();
    }                                               

    private void distTravInputActionPerformed(java.awt.event.ActionEvent evt) {                                              
        distTravelled = distTravInput.getText();
    }                                             

    private void estTimeInputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        estTime = estTimeInput.getText();
    }                                            

    //action for clear button
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        actualTimeInput.setText("");
        distTravInput.setText("");
        estTimeInput.setText("");
    }                                           

    //actions for record delivery button
    private void recordDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        if(actualTimeInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out actual time");
        }
        else if(!actualTimeInput.getText().matches("[1-9]")){
            JOptionPane.showMessageDialog(null, "Invalid actual time");
        }
        else if(distTravInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out distance travelled");
        }
        else if(!distTravInput.getText().matches("[1-9]")){
            JOptionPane.showMessageDialog(null, "Invalid distance travelled");
        }
        else if(estTimeInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out estimated time");
        }
        else if(!estTimeInput.getText().matches("[1-9]")){
            JOptionPane.showMessageDialog(null, "Invalid estimated time");
        }
        else{
            //save user input
            actual = actualTimeInput.getText();
            estimate = estTimeInput.getText();
            dist = Integer.parseInt(distTravInput.getText());
            //print user input
            System.out.println(actual + " " + estimate + " " + dist);
            JOptionPane.showMessageDialog(null, "New Delivery Recorded");
        }
    }                
    
    public Boolean pickUpStatus;

    private void pickUpButtonYActionPerformed(java.awt.event.ActionEvent evt){
        pickUpStatus = true;
        JOptionPane.showMessageDialog(null, "Pick up confirmed.");
    }

    private void pickUpButtonNActionPerformed(java.awt.event.ActionEvent evt){
        pickUpStatus = false;
        JOptionPane.showMessageDialog(null, "Non pick up confirmed.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverInfoGUI("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField actualTimeInput;
    private javax.swing.JLabel actualTimePrompt;
    private javax.swing.JButton clearButton;
    private javax.swing.JScrollPane delHistScrollPane;
    private javax.swing.JTable delHistTable;
    private javax.swing.JPanel deliveryHist;
    private javax.swing.JTextField distTravInput;
    private javax.swing.JLabel distTravPrompt;
    private javax.swing.JTabbedPane driverInfoTab;
    private javax.swing.JTabbedPane driverOptionTabs;
    private javax.swing.JScrollPane driverViewInfoScrollPane;
    private javax.swing.JTable driverViewInfoTable;
    private javax.swing.JTextField estTimeInput;
    private javax.swing.JLabel estTimePrompt;
    private javax.swing.JPanel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOutPrompt;
    private javax.swing.JScrollPane pendingOrderScrollPanel;
    private javax.swing.JTable pendingOrderTable;
    private javax.swing.JPanel pendingOrders;
    private javax.swing.JScrollPane pickupScrollPanel;
    private javax.swing.JTable pickupTable;
    private javax.swing.JPanel pickup;
    private javax.swing.JPanel recordDelivery;
    private javax.swing.JButton recordDeliveryButton;
    private javax.swing.JPanel viewInfo;
    // End of variables declaration                   
}
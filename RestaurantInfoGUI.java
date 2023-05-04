import javax.swing.JOptionPane;

public class RestaurantInfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantInfo
     */
    public RestaurantInfoGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        //create tabs
        restInfoTab = new javax.swing.JTabbedPane();
        restOptionTabs = new javax.swing.JTabbedPane();
        //restaurant view info tab + table
        viewInfo = new javax.swing.JPanel();
        restViewInfoScrollPane = new javax.swing.JScrollPane();
        restViewInfoTable = new javax.swing.JTable();
        //customer order tab
        custOrder = new javax.swing.JPanel();    
        //request delivery labels (text on screen), text boxes, and button
        reqDelivery = new javax.swing.JPanel();
        custOrderNumPrompt = new javax.swing.JLabel();
        timeDelReqPrompt = new javax.swing.JLabel();
        driverIDPrompt = new javax.swing.JLabel();
        custOrderNumInput = new javax.swing.JTextField();
        timeDelReqInput = new javax.swing.JTextField();
        driverIDInput = new javax.swing.JTextField();
        reqDelButton = new javax.swing.JButton();
        //logout tab
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        //logout button for restaurant
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //set background color of window

        restOptionTabs.setBackground(new java.awt.Color(166, 216, 233)); //set background color of restaurant option tab

        viewInfo.setBackground(new java.awt.Color(199, 234, 245)); //set background color for view info tab

        //adds JTable
        restViewInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"JJ Boba", "3560 West Temple St. Pomona, CA", "9098968318"},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Address", "Phone Number"
            }
        ));
        restViewInfoScrollPane.setViewportView(restViewInfoTable); 

        //horizontal and vertical layouts of view info tab
        javax.swing.GroupLayout viewInfoLayout = new javax.swing.GroupLayout(viewInfo);
        viewInfo.setLayout(viewInfoLayout);
        viewInfoLayout.setHorizontalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(restViewInfoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        viewInfoLayout.setVerticalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewInfoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(restViewInfoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        restOptionTabs.addTab("View Info", viewInfo); //names the tab "view info"

        custOrder.setBackground(new java.awt.Color(199, 234, 245)); //set background color of "customer order" tab

        //horizontal and vertical layouts of customer order tab
        javax.swing.GroupLayout custOrderLayout = new javax.swing.GroupLayout(custOrder);
        custOrder.setLayout(custOrderLayout);
        custOrderLayout.setHorizontalGroup(
            custOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        custOrderLayout.setVerticalGroup(
            custOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        restOptionTabs.addTab("Customer Order", custOrder); //names the tab "customer order"

        reqDelivery.setBackground(new java.awt.Color(199, 234, 245)); //set background color of request delivery tab

        //set font style and size for labels on request delivery tab
        custOrderNumPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        custOrderNumPrompt.setText("Customer Order Number:");

        timeDelReqPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        timeDelReqPrompt.setText("Time of Delivery Request:");

        driverIDPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        driverIDPrompt.setText("Driver ID:");

        reqDelButton.setText("Request Delivery");
        reqDelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqDelButtonActionPerformed(evt);
            }
        });

        //horizontal and vertical layouts of request delivery tab
        javax.swing.GroupLayout reqDeliveryLayout = new javax.swing.GroupLayout(reqDelivery);
        reqDelivery.setLayout(reqDeliveryLayout);
        reqDeliveryLayout.setHorizontalGroup(
            reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reqDeliveryLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custOrderNumPrompt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeDelReqPrompt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(driverIDPrompt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reqDelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(custOrderNumInput)
                    .addComponent(timeDelReqInput)
                    .addComponent(driverIDInput))
                .addGap(204, 204, 204))
        );
        reqDeliveryLayout.setVerticalGroup(
            reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqDeliveryLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custOrderNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custOrderNumPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeDelReqInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeDelReqPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverIDPrompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reqDelButton)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        restOptionTabs.addTab("Request Delivery", reqDelivery); //names the tab "request delivery"

        logOut.setBackground(new java.awt.Color(199, 234, 245)); //sets background color of log out tab

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
                .addContainerGap(214, Short.MAX_VALUE))
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

        restOptionTabs.addTab("Log-out", logOut); //names tab "log out"

        restInfoTab.addTab("Restaurant Information", restOptionTabs); //names top tab "restaurant information"

        //horizontal and vertical layouts for restaurant information tab
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(restInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(restInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }                       

    //action for log out button
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        LoginPageGUI login = new LoginPageGUI();
        setVisible(false);
        login.setVisible(true);
    }
    
    //action for request delivery button
    private void reqDelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(custOrderNumInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out customer order number");
        }
        else if(timeDelReqInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out time of delivery request");
        }
        else if(driverIDInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out driver ID");
        }
        else{
            JOptionPane.showMessageDialog(null, "New Delivery Requested");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantInfoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel custOrder;
    private javax.swing.JTextField custOrderNumInput;
    private javax.swing.JLabel custOrderNumPrompt;
    private javax.swing.JTextField driverIDInput;
    private javax.swing.JLabel driverIDPrompt;
    private javax.swing.JPanel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOutPrompt;
    private javax.swing.JButton reqDelButton;
    private javax.swing.JPanel reqDelivery;
    private javax.swing.JTabbedPane restInfoTab;
    private javax.swing.JTabbedPane restOptionTabs;
    private javax.swing.JScrollPane restViewInfoScrollPane;
    private javax.swing.JTable restViewInfoTable;
    private javax.swing.JTextField timeDelReqInput;
    private javax.swing.JLabel timeDelReqPrompt;
    private javax.swing.JPanel viewInfo;
    // End of variables declaration                   
}

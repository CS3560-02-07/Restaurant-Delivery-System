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
        viewInfo = new javax.swing.JPanel();
        reqDelivery = new javax.swing.JPanel();
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        //log out button for restaurant
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //set background color of window

        restOptionTabs.setBackground(new java.awt.Color(166, 216, 233)); //set background color of restaurant option tab

        viewInfo.setBackground(new java.awt.Color(199, 234, 245)); //set background color for view info tab

        //horizontal and vertical layouts of view info tab
        javax.swing.GroupLayout viewInfoLayout = new javax.swing.GroupLayout(viewInfo);
        viewInfo.setLayout(viewInfoLayout);
        viewInfoLayout.setHorizontalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        viewInfoLayout.setVerticalGroup(
            viewInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        restOptionTabs.addTab("View Info", viewInfo); //names the tab "view info"

        reqDelivery.setBackground(new java.awt.Color(199, 234, 245)); //set background color of request delivery tab

        //horizontal and vertical layouts of request delivery tab
        javax.swing.GroupLayout reqDeliveryLayout = new javax.swing.GroupLayout(reqDelivery);
        reqDelivery.setLayout(reqDeliveryLayout);
        reqDeliveryLayout.setHorizontalGroup(
            reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        reqDeliveryLayout.setVerticalGroup(
            reqDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
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
    private javax.swing.JPanel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOutPrompt;
    private javax.swing.JPanel reqDelivery;
    private javax.swing.JTabbedPane restInfoTab;
    private javax.swing.JTabbedPane restOptionTabs;
    private javax.swing.JPanel viewInfo;
    // End of variables declaration                   
}

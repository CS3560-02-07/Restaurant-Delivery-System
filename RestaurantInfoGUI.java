public class RestaurantInfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantInfo
     */
    public RestaurantInfoGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        restInfoTab = new javax.swing.JTabbedPane();
        restOptionTabs = new javax.swing.JTabbedPane();
        viewInfo = new javax.swing.JPanel();
        reqDelivery = new javax.swing.JPanel();
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 216, 233));

        restOptionTabs.setBackground(new java.awt.Color(166, 216, 233));

        viewInfo.setBackground(new java.awt.Color(199, 234, 245));

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

        restOptionTabs.addTab("View Info", viewInfo);

        reqDelivery.setBackground(new java.awt.Color(199, 234, 245));

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

        restOptionTabs.addTab("Request Delivery", reqDelivery);

        logOut.setBackground(new java.awt.Color(199, 234, 245));

        logOutPrompt.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        logOutPrompt.setText("Would you like to log-out?");

        logOutButton.setText("Log-out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

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

        restOptionTabs.addTab("Log-out", logOut);

        restInfoTab.addTab("Restaurant Information", restOptionTabs);

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

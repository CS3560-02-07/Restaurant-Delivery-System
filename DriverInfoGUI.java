public class DriverInfoGUI extends javax.swing.JFrame {

   /**
    * Creates new form RestaurantInfo
    */
   public DriverInfoGUI() {
       initComponents();
   }
   
   @SuppressWarnings("unchecked")
   private void initComponents() {

       driverInfoTab = new javax.swing.JTabbedPane();
       driverOptionTabs = new javax.swing.JTabbedPane();
       viewInfo = new javax.swing.JPanel();
       pickUpConfirm = new javax.swing.JPanel();
       recordDelivery = new javax.swing.JPanel();
       deliveryHIst = new javax.swing.JPanel();
       logOut = new javax.swing.JPanel();
       logOutPrompt = new javax.swing.JLabel();
       logOutButton = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       setBackground(new java.awt.Color(166, 216, 233));

       driverOptionTabs.setBackground(new java.awt.Color(166, 216, 233));

       viewInfo.setBackground(new java.awt.Color(199, 234, 245));

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

       driverOptionTabs.addTab("View Info", viewInfo);

       pickUpConfirm.setBackground(new java.awt.Color(199, 234, 245));

       javax.swing.GroupLayout pickUpConfirmLayout = new javax.swing.GroupLayout(pickUpConfirm);
       pickUpConfirm.setLayout(pickUpConfirmLayout);
       pickUpConfirmLayout.setHorizontalGroup(
           pickUpConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 643, Short.MAX_VALUE)
       );
       pickUpConfirmLayout.setVerticalGroup(
           pickUpConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 317, Short.MAX_VALUE)
       );

       driverOptionTabs.addTab("Pick-up Confirmation", pickUpConfirm);

       recordDelivery.setBackground(new java.awt.Color(199, 234, 245));

       javax.swing.GroupLayout recordDeliveryLayout = new javax.swing.GroupLayout(recordDelivery);
       recordDelivery.setLayout(recordDeliveryLayout);
       recordDeliveryLayout.setHorizontalGroup(
           recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 643, Short.MAX_VALUE)
       );
       recordDeliveryLayout.setVerticalGroup(
           recordDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 317, Short.MAX_VALUE)
       );

       driverOptionTabs.addTab("Record Delivery", recordDelivery);

       deliveryHIst.setBackground(new java.awt.Color(199, 234, 245));

       javax.swing.GroupLayout deliveryHIstLayout = new javax.swing.GroupLayout(deliveryHIst);
       deliveryHIst.setLayout(deliveryHIstLayout);
       deliveryHIstLayout.setHorizontalGroup(
           deliveryHIstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 643, Short.MAX_VALUE)
       );
       deliveryHIstLayout.setVerticalGroup(
           deliveryHIstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 317, Short.MAX_VALUE)
       );

       driverOptionTabs.addTab("Delivery History", deliveryHIst);

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

       driverOptionTabs.addTab("Log-out", logOut);

       driverInfoTab.addTab("Driver Information", driverOptionTabs);

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
               new DriverInfoGUI().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JPanel deliveryHIst;
   private javax.swing.JTabbedPane driverInfoTab;
   private javax.swing.JTabbedPane driverOptionTabs;
   private javax.swing.JPanel logOut;
   private javax.swing.JButton logOutButton;
   private javax.swing.JLabel logOutPrompt;
   private javax.swing.JPanel pickUpConfirm;
   private javax.swing.JPanel recordDelivery;
   private javax.swing.JPanel viewInfo;
   // End of variables declaration                   
}

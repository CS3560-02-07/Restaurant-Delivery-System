import javax.swing.JOptionPane;

public class RestaurantInfoGUI extends javax.swing.JFrame {

    //variable to save login session
    private String userName;


    /**
     * Creates new form RestaurantInfo
     */
       public RestaurantInfoGUI(String userName) {
        this.userName=userName;
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
        custOrderScrollPane = new javax.swing.JScrollPane();
        custOrderTable = new javax.swing.JTable();
        custOrder = new javax.swing.JPanel();    
        //logout tab
        logOut = new javax.swing.JPanel();
        logOutPrompt = new javax.swing.JLabel();
        //logout button for restaurant
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //close window application
        setBackground(new java.awt.Color(166, 216, 233)); //set background color of window

        restOptionTabs.setBackground(new java.awt.Color(166, 216, 233)); //set background color of restaurant option tab

        viewInfo.setBackground(new java.awt.Color(199, 234, 245)); //set background color for view info tab

        //database connection to show driver info
        String[] restInfo = connectDatabase.getRest(userName); //restaurant info array

        //adds restaurant view info JTable 
        if (!restInfo[0].equals("")){ //if name string is not empty
            restViewInfoTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {restInfo[0], restInfo[1], restInfo[2]},
            {null, null, null}
        },
        new String [] {
            "Restaurant Name", "Address", "Phone Number"
        }
        ));
        }  
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

        //adds customer order JTable
        custOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Test", "Test", "Test", "Test", "Test"},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Select", "Restaurant", "Order Number", "From", "Destination", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        custOrderScrollPane.setViewportView(custOrderTable);

        //creates confirm order button
        confirmOrderButton.setText("Confirm Order");
        confirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderButtonActionPerformed(evt);
            }
        });

        //horizontal and vertical layouts of customer order tab
        javax.swing.GroupLayout custOrderLayout = new javax.swing.GroupLayout(custOrder);
        custOrder.setLayout(custOrderLayout);
        custOrderLayout.setHorizontalGroup(
            custOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custOrderLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(custOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmOrderButton)
                    .addComponent(custOrderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        custOrderLayout.setVerticalGroup(
            custOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custOrderLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(custOrderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmOrderButton)
                .addGap(23, 23, 23))
        );

        restOptionTabs.addTab("Customer Order", custOrder); //names the tab "customer order"

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

    //action for confirm order button
    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        //this doesn't do anything yet 
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantInfoGUI("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel custOrder;
    private javax.swing.JPanel custOrder;
    private javax.swing.JScrollPane custOrderScrollPane;
    private javax.swing.JTable custOrderTable;
    private javax.swing.JPanel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOutPrompt;
    private javax.swing.JTabbedPane restInfoTab;
    private javax.swing.JTabbedPane restOptionTabs;
    private javax.swing.JScrollPane restViewInfoScrollPane;
    private javax.swing.JTable restViewInfoTable;
    private javax.swing.JPanel viewInfo;
    // End of variables declaration                   
}

public class RestaurantInfo extends javax.swing.JFrame {

   /**
    * Creates new form RestaurantInfo
    */
   public RestaurantInfo() {
       initComponents();
   }
   
   /**
    * This method is called from within the constructor to initialize the form.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 400, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 300, Short.MAX_VALUE)
       );

       pack();
   }// </editor-fold>                        

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new RestaurantInfo().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   // End of variables declaration                   
}


package calculator;

import javax.swing.SwingUtilities;


public class Calculator {

    public static void main(String[] args) {
       
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
               new MainFrame();
            }
            
            
            
        });
        
        
        
        
    }

   
    
}

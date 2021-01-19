
package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ResultPanel extends JPanel {
    
    
    private JTextField result ; 
    private Font font ;
    
    
    public ResultPanel()
    {
        
        font = new Font(Font.SANS_SERIF , Font.BOLD , 20);
        result  = new JTextField ();
        result.setPreferredSize(new Dimension(260,50));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        this.result.setEditable(false);
        
        result.setBackground(Color.LIGHT_GRAY);
        result.setFont(font);
        add(result);
        
        
        
        
    }
    
    
    public void setTextField(String text)
    {
        this.result.setText(text);
    }
    
    public String GetText()
    {
        return this.result.getText();
    }
    
    
    
    
    
}

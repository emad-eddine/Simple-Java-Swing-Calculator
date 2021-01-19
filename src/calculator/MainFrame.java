
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MainFrame extends JFrame {
    
    
    private InputPanel inputPanel;
    private ResultPanel resultPanel;
    
    
    public MainFrame()
    {
        super("Calculator");
        super.setSize(290, 370);
        super.setForeground(Color.BLACK);
        super.setVisible(true);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);
        
        
        // input
        
        inputPanel = new InputPanel();
        
      inputPanel.setBounds(5, 60, 270, 260);
        
        
        add(this.inputPanel  );     
        
        // result panel
        
        resultPanel = new ResultPanel();
        resultPanel.setBounds(5, 0, 270, 70);
        
        
        add(resultPanel );
        
        
        // tetx setter fucntions
        
        this.inputPanel.StringListnerSet(new StringListener(){
            float n1 = 0 ;
            float n2=0;
            float r = 0;
            char op;
            @Override
            public void StringWriter(String text) 
            {
             
                String str = resultPanel.GetText();
                str = str + text ;
                resultPanel.setTextField(str); 
                
               
              //   System.out.println(n1);
               
            }
            
             @Override
            public void StringNuller(String text) {
                resultPanel.setTextField(text);
            }

            @Override
            public void setOp(char op) {
                
                n1 = Float.parseFloat(resultPanel.GetText());
                this.op = op ;
                resultPanel.setTextField("");
            }

            @Override
            public void calculate() {
                
                switch(this.op)
                {
                    case '+' :
                        n2 = Float.parseFloat(resultPanel.GetText());
                        r = n2 + n1;
                        resultPanel.setTextField(Float.toString(r));
                        break;
                    
                    case '-':
                        n2 = Float.parseFloat(resultPanel.GetText());
                        r = n2 - n1 ;
                        r = r* -1;
                        resultPanel.setTextField(Float.toString(r));
                        break;
                    
                    case '*':
                        n2 = Float.parseFloat(resultPanel.GetText());
                        r = n2 * n1 ;
                        resultPanel.setTextField(Float.toString(r));
                        break;
                    
                    case '/':
                        n2 = Float.parseFloat(resultPanel.GetText());
                        
                        if(n2 == 0)
                        {
                            JOptionPane.showMessageDialog(new JFrame(), "NOT A NUMBER", "error", JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            r = n1 / n2;
                            resultPanel.setTextField(Float.toString(r));
                        }
                        break;
                        
                    case '%':
                        n2 = Float.parseFloat(resultPanel.GetText());
                        r = n1 % n2 ;
                        resultPanel.setTextField(Float.toString(r));
                        break;
                        
                        
                    default:
                        System.out.println("error in default");
                        break;    
                    
                }
                
                
            }

            @Override
            public void Switcher() {
                n1 = Float.parseFloat(resultPanel.GetText());
                n1 = n1 * -1 ;
                resultPanel.setTextField(Float.toString(n1));
            }
            
            
               
            
                        
                
                
                
                
                
            
        
        });
        
        
             
    }
    
    private  void calculated()
    {
        
        
        
        
        
    }
    
    
    
    
    
}

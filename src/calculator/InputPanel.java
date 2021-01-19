
package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class InputPanel extends JPanel implements ActionListener {
    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton bPlus;
    private JButton bMins;
    private JButton bFoi;
    private JButton bDev;
    private JButton bMod;
    private JButton bC;
    private JButton bEqual;
    private JButton bSwitcher;
    private JButton bDec;
    
    private Font font ;
    
    private StringListener l ;
    
    
    public InputPanel()
    {
        super(null);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bPlus = new JButton("+");
        bMins = new JButton("-");
        bFoi = new JButton("×");
        bDev = new JButton("÷ ");
        bMod = new JButton("%");
        bC = new JButton("AC");
        bSwitcher = new JButton("+/-");
        bEqual = new JButton("=");
        bDec = new JButton(".");
        
        
        font = new Font (Font.SANS_SERIF , Font.BOLD , 15) ;
        
        
        // first row
        
        this.bC.setBounds(10, 5, 60, 50);
        this.bSwitcher.setBounds(70, 5, 60, 50);
        this.bMod.setBounds(130, 5, 60, 50);
        this.bDev.setBounds(200, 5, 60, 50);
        
        // second row
        
        this.b7.setBounds(10, 55, 60, 50);
        this.b8.setBounds(70, 55, 60, 50);
        this.b9.setBounds(130, 55, 60, 50);
        this.bFoi.setBounds(200, 55, 60, 50);
   
        // third row
        
        this.b4.setBounds(10, 105, 60, 50);
        this.b5.setBounds(70, 105, 60, 50);
        this.b6.setBounds(130, 105, 60, 50);
        this.bPlus.setBounds(200, 105, 60, 50);
   
        // fourth rrow
        
        this.b1.setBounds(10, 155, 60, 50);
        this.b2.setBounds(70, 155, 60, 50);
        this.b3.setBounds(130, 155, 60, 50);
        this.bMins.setBounds(200, 155, 60, 50);
        
        // fifth row
        
        this.b0.setBounds(10, 205, 120, 50);
        this.bDec.setBounds(130, 205,60 , 50);
        this.bEqual.setBounds(200, 205, 60, 50);
        
   
        // add
        
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(this.bC);
        add(this.bDec);
        add(this.bDev);
        add(this.bEqual);
        add(this.bFoi);
        add(this.bPlus);
        add(this.bMins);
        add(this.bMod);
        add(this.bSwitcher);
           
        this.bDev.setBackground(Color.decode("#ffcf6e"));
        this.bFoi.setBackground(Color.decode("#ffcf6e"));
        this.bPlus.setBackground(Color.decode("#ffcf6e"));
        this.bMins.setBackground(Color.decode("#ffcf6e"));
        this.bEqual.setBackground(Color.decode("#ffcf6e"));
   
        
        
        b0.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        b6.setFont(font);
        b7.setFont(font);
        b8.setFont(font);
        b9.setFont(font);
        bSwitcher.setFont(font);
        bC.setFont(font);
        bMod.setFont(font);
        bDec.setFont(font);
        bFoi.setFont(font);
        bPlus.setFont(font);
        bMins.setFont(font);
        bEqual.setFont(font);
        bDev.setFont(font);
        
      //  super.setBackground(Color.BLACK);
        //super.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        
        
        // add action listenr
        
       b0.addActionListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       bC.addActionListener(this);
       bSwitcher.addActionListener(this);
       bMod.addActionListener(this);
       bDev.addActionListener(this);
       bPlus.addActionListener(this);
       bFoi.addActionListener(this);
       bMins.addActionListener(this);
       bDec.addActionListener(this);
       bEqual.addActionListener(this);
          
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton clicked = (JButton) ae.getSource();
        
        if(clicked == b0)
        {
            if(l != null)
            {
                l.StringWriter("0");
            }
        }
        else if(clicked == b1)
        {
            if(l != null)
            {
                l.StringWriter("1");
            }
        }
            
        else if(clicked == b2)
        {
            if(l != null)
            {
                l.StringWriter("2");
            }
        }
        
        else if(clicked == b3)
        {
            if(l != null)
            {
                l.StringWriter("3");
            }
        }
        else if(clicked == b4)
        {
            if(l != null)
            {
                l.StringWriter("4");
            }
        }
        else if(clicked == b5)
        {
            if(l != null)
            {
                l.StringWriter("5");
            }
        }
        else if(clicked == b6)
        {
            if(l != null)
            {
                l.StringWriter("6");
            }
        }
        else if(clicked == b7)
        {
            if(l != null)
            {
                l.StringWriter("7");
            }
        }else if(clicked == b8)
        {
            if(l != null)
            {
                l.StringWriter("8");
            }
        }
        else if(clicked == b9)
        {
            if(l != null)
            {
                l.StringWriter("9");
            }
        }
        
        else if(clicked == bDec)
        {
            if(l != null)
            {
                l.StringWriter(".");
            }
        }
        
        else if(clicked == bC)
        {
            if(l != null)
            {
                l.StringNuller("");
            }
        }
        
        
        
        
        else if(clicked == bSwitcher)
        {
            if(l != null)
            {
                l.Switcher();
            }
        }
        
        
        
        
        
        else if(clicked == bPlus)
        {
            if(l != null)
            {
                l.setOp('+');
            }
        }
        else if(clicked == bMins)
        {
            if(l != null)
            {
                l.setOp('-');
            }
        }
        else if(clicked == bFoi)
        {
            if(l != null)
            {
                l.setOp('*');
            }
        }
        else if(clicked == bDev)
        {
            if(l != null)
            {
                l.setOp('/');
            }
        }
        
        else if(clicked == bMod)
        {
            if(l != null)
            {
                l.setOp('%');
            }
        }
        
        else if(clicked == bEqual)
        {
            if(l != null)
            {
                l.calculate();
            }
        }
        
     
        
    }
    
    
    
    public void StringListnerSet(StringListener l)
    {
        this.l = l;
    }
    
    
    
    
    
    
    
    
    
}

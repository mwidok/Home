import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class GUI
{
    private JDialog _mainframe;
    private JPanel _leftpanel;
    private JPanel _rightpanel;
    private JTextField _insert;
    private JTextPane _output;
    private JButton _reverseBtn;
    private JButton _asciiValBtn;
    private JButton _asciiSumBtn;
    private JButton _vowelBtn;
    private JButton _palindromBtn;
    private static final String TITEL = "String Processor";
    
    public GUI()
    {
        buildMain();
        buildPanels();
        buildTotal();
        _mainframe.pack();
    }
    
    private void buildMain()
    {
        _mainframe = new JDialog();
        _mainframe.setTitle(TITEL);
        _mainframe.setSize(800,500);
        _mainframe.setLayout(new GridLayout(1,2));
        
        _mainframe.setResizable(false);
        _mainframe.setBackground(Color.BLACK);
        
    }
    
    private void buildPanels()
    {
        buildLeftPanel();
        buildRightPanel();
    }
    
    private void buildLeftPanel()
    {
        _leftpanel = new JPanel();
        _leftpanel.setLayout(new BoxLayout(_leftpanel, BoxLayout.Y_AXIS));
        _insert = new JTextField("");
        _insert.setSize(50, 25);
        
        _insert.setCaretPosition(JTextField.CENTER);
        _output = new JTextPane();
        SimpleAttributeSet attribs = new SimpleAttributeSet();  
        StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_CENTER);  
        _output.setParagraphAttributes(attribs,true);
        _output.setPreferredSize(new Dimension(125, 50));
        _output.setEditable(false);
        _leftpanel.add(Box.createHorizontalStrut(20));
        _leftpanel.add(Box.createVerticalStrut(15));
        _leftpanel.add(_insert, BorderLayout.CENTER);
        
        _leftpanel.add(Box.createHorizontalStrut(20));
        _leftpanel.add(Box.createVerticalStrut(25));
        _leftpanel.add(_output, BorderLayout.CENTER);
        
    }
    
    private void buildRightPanel()
    {
        _rightpanel = new JPanel();
        _rightpanel.setLayout(new GridLayout(4,2));
        _rightpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        _rightpanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        addButtons();
    }
    
    private void addButtons()
    {
        _reverseBtn = new JButton("Reverse String");
        _asciiValBtn = new JButton("Get ASCII Values");
        _asciiSumBtn = new JButton("Get ASCII sum");
        _vowelBtn = new JButton("Get Vowels");
        _palindromBtn = new JButton("Palindromcheck");
        _rightpanel.add(_reverseBtn);
        _rightpanel.add(_palindromBtn);
        _rightpanel.add(_asciiValBtn);
        _rightpanel.add(_asciiSumBtn);
        _rightpanel.add(_vowelBtn);
        
    }
    
    private void buildTotal()
    {
        _mainframe.add(_leftpanel);
        _mainframe.add(_rightpanel);
        _mainframe.setVisible(true);
    }
    

    public JTextField getInsert()
    {
        return _insert;
    }

    public JButton getReverseBtn()
    {
        return _reverseBtn;
    }
    
    public JButton getAsciiValBtn()
    {
        return _asciiValBtn;
    }
    
    public JButton getAsciiSumBtn()
    {
        return _asciiSumBtn;
    }

    public JTextPane getOutput()
    {
        return _output;
    }

    public void setOutput(String output)
    {
        _output.setText(output);   
    }
    
    public JButton getPalindromBtn()
    {
        return _palindromBtn;
    }
    
    public JButton getVowelBtn()
    {
        return _vowelBtn;
    }
    
    public JDialog getDialog()
    {
        return _mainframe;
    }
    
    public void warningMSG()
    {
        JOptionPane.showMessageDialog(_mainframe, "Non-characters detected!", "Input Error", JOptionPane.WARNING_MESSAGE);
    }
}

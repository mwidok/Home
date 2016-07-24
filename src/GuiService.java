
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiService implements ActionListener
{
    private GUI _gui;
    private StringHandler _handler;

    public GuiService()
    {
        _gui = new GUI();
        _handler = new StringHandler();
        initWindowListener();
        initBtnListener();
    }

    private void initWindowListener()
    {
        _gui.getDialog()
            .addWindowListener(new WindowListener()
            {

                @Override
                public void windowClosed(WindowEvent e)
                {
                    System.exit(0);
                }

                @Override
                public void windowActivated(WindowEvent e)
                {
                }

                @Override
                public void windowClosing(WindowEvent e)
                {
                }

                @Override
                public void windowDeactivated(WindowEvent e)
                {
                }

                @Override
                public void windowDeiconified(WindowEvent e)
                {
                }

                @Override
                public void windowIconified(WindowEvent e)
                {
                }

                @Override
                public void windowOpened(WindowEvent e)
                {
                }

            });
    }



    //    private void initBtnListener()
    //    {
    //        _gui.getReverseBtn().addActionListener(new ActionListener()
    //        {
    //            
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //               String output = _handler.reverse(_gui.getInsert().getText());
    //               _gui.setOutput(output);
    //            }
    //        });
    //        
    //        _gui.getAsciiValBtn().addActionListener(new ActionListener()
    //        {
    //            
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //                String output = _handler.charValues(_gui.getInsert().getText());
    //                _gui.setOutput(output);
    //                
    //            }
    //        });
    //        
    //        _gui.getAsciiSumBtn().addActionListener(new ActionListener()
    //        {
    //            
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //                String output = _handler.valSum(_gui.getInsert().getText());
    //                _gui.setOutput(output);
    //                
    //            }
    //        });
    //        
    //        _gui.getPalindromBtn().addActionListener(new ActionListener()
    //        {
    //            
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //                String output = String.valueOf(_handler.istPalindrom(_gui.getInsert().getText()));
    //                _gui.setOutput(output);
    //            }
    //        });
    //        
    //        _gui.getVowelBtn().addActionListener(new ActionListener()
    //        {
    //            
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //                String output = _handler.displayVowels(_gui.getInsert().getText());
    //                _gui.setOutput(output);
    //            }
    //        });
    //    }

    private void initBtnListener()
    {
        _gui.getReverseBtn().addActionListener(this);
        _gui.getPalindromBtn().addActionListener(this);
        _gui.getVowelBtn().addActionListener(this);
        _gui.getAsciiSumBtn().addActionListener(this);
        _gui.getAsciiValBtn().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        _gui.setOutput("");
        
        if(isWantedString())
        {
            String output = "";
            Object source = e.getSource();
            
            if(source == _gui.getReverseBtn())
            {
                output = _handler.reverse(_gui.getInsert().getText());
            }
            else if(source == _gui.getAsciiValBtn())
            {
                output = _handler.charValues(_gui.getInsert().getText());
            }
            else if(source == _gui.getAsciiSumBtn())
            {
                output = _handler.valSum(_gui.getInsert().getText());
            }
            else if(source == _gui.getPalindromBtn())
            {
                output = String.valueOf(_handler.istPalindrom(_gui.getInsert().getText()));
            }
            else if(source == _gui.getVowelBtn())
            {
                output = _handler.displayVowels(_gui.getInsert().getText());
            }
            
            _gui.setOutput(output);
        }
        else
        {
            _gui.warningMSG();
        }
        
    }
    
    private boolean isWantedString()
    {
        return _gui.getInsert()
            .getText()
            .matches("[a-zA-Z]+");
    }
}

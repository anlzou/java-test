package P231;

import javax.swing.*;

public class PanelNullLayout extends JPanel {
    JButton jButton;
    JTextField jTextField;
    PanelNullLayout(){
        setLayout(null);
        jButton = new JButton("确定");
        jTextField = new JTextField();
        add(jTextField);
        add(jButton);
        jTextField.setBounds(100,30,90,30);
        jButton.setBounds(190,30,66,30);
    }
}

package P231;
import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
    PanelGridLayout panelGridLayout;
    PanelNullLayout panelNullLayout;
    //WindowBoxLayout windowBoxLayout;
    JTabbedPane p;
    ShowLayout(){
        panelGridLayout = new PanelGridLayout();
        panelNullLayout = new PanelNullLayout();
        //windowBoxLayout = new WindowBoxLayout();
        p = new JTabbedPane();
        p.add("网格布局的面板",panelGridLayout);
        p.add("空布局的面板",panelNullLayout);
        //p.add("嵌套盒式布局容器",windowBoxLayout);
        add(p,BorderLayout.CENTER);
        add(new JButton("窗口是BorderLayout布局"),BorderLayout.NORTH);
        add(new JButton("南"),BorderLayout.SOUTH);
        add(new JButton("西"),BorderLayout.WEST);
        add(new JButton("东"),BorderLayout.EAST);
        setBounds(10,20,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
}

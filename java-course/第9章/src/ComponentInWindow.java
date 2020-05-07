import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame {
    JCheckBox checkBox1,checkBox2;              //复选框
    JRadioButton radioButton1,radioButton2;     //单选框
    ButtonGroup group;
    JComboBox<String> comboBox;                 //下拉列表
    public ComponentInWindow(int x,int y,int w,int h){
        init();
        setLocation(x,y);//初始位置
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init(){
        setLayout(new FlowLayout());
        comboBox = new JComboBox<String>();
        checkBox1 = new JCheckBox("喜欢听音乐");
        checkBox2 = new JCheckBox("喜欢酷游");
        group = new ButtonGroup();
        radioButton1 = new JRadioButton("男");
        radioButton2 = new JRadioButton("女");
        group.add(radioButton1);
        group.add(radioButton2);
        add(checkBox1);
        add(checkBox2);
        add(radioButton1);
        add(radioButton2);
        comboBox.addItem("音乐天堂");
        comboBox.addItem("武术天地");
        add(comboBox);
    }
}

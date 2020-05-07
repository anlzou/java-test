package P231;

import javax.swing.*;

public class WindowBoxLayout extends JFrame {
    Box boxH;
    Box boxVOne, boxVTow;

    WindowBoxLayout() {
        boxH = Box.createHorizontalBox();
        boxVOne = Box.createHorizontalBox();
        boxVTow = Box.createHorizontalBox();
        boxVOne.add(new JLabel("姓名"));
        boxVTow.add(new JLabel("性别"));
        boxVOne.add(new JTextField(10));
        boxVTow.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVOne);
        add(boxH);
    }
}
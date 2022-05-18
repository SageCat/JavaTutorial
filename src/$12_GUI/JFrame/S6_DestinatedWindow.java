package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;

public class S6_DestinatedWindow
{
    S0_MyCenterFrame myFrame;

    public S6_DestinatedWindow()
    {
        JLabel label = new JLabel("这是另一个窗口呀！！！");
        label.setFont(new Font("微软雅黑", Font.BOLD, 14));
        myFrame = new S0_MyCenterFrame(400, 400);
        myFrame.setTitle("这是另一个窗口|学习");
        myFrame.add(label);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
}

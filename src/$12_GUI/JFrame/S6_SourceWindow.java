package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S6_SourceWindow implements ActionListener
{

    JButton button;
    S0_MyCenterFrame myFrame;

    public S6_SourceWindow()
    {
        button = new JButton("打开另一个窗口");
        button.setBackground(new Color(0x015437));
        button.setForeground(new Color(0xffffff));
        button.setFont(new Font("微软雅黑", Font.BOLD, 22));
        // 设置按钮中的文字没有 聚焦 的边框
        button.setFocusable(false);
        button.setBounds(200, 200, 200, 60);
        // 设置按钮使得按钮看起来更有立体感
        button.setBorder(BorderFactory.createEtchedBorder());
        // 为按钮添加事件监听器
        button.addActionListener(this);

        myFrame = new S0_MyCenterFrame(1000, 800);
        myFrame.setTitle("打开另一个窗口|学习");
        myFrame.setLayout(null);
        myFrame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            button.setEnabled(false);
            new S6_DestinatedWindow();
        }
    }
}

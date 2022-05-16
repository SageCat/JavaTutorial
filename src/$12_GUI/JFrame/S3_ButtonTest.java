package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 学习 Button 的相关知识：
 *
 * @author g84196891
 */
public class S3_ButtonTest
{
    public static void main(String[] args)
    {
        new MyButtonFrame();
    }
}


class MyButtonFrame implements ActionListener
{
    JButton button;
    S0_MyCenterFrame myFrame;

    public MyButtonFrame()
    {
        button = new JButton("你点我啊");
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
        myFrame.setTitle("学习 Button 的相关知识");
        myFrame.setLayout(null);
        myFrame.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        // 为按钮添加事件处理动作
        if (e.getSource() == button)
        {
            System.out.println("Button 被点了！！！");
            // 按钮点击一次后就将其 Disable，保证按钮只被点击一次
            button.setEnabled(false);
        }
    }
}
package $12_GUI.JFrame;


import javax.swing.*;
import java.awt.*;

/**
 * @author g84196891
 */
public class S0_MyFrame extends JFrame
{
    public S0_MyFrame() throws HeadlessException
    {
        // 设置退出方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口大小
        this.setSize(800, 600);
        // 设置为不可调整大小
        this.setResizable(false);
        // 设置背景颜色
        this.getContentPane().setBackground(new Color(0xffffff));
        // 设置窗口标题
        this.setTitle("这是我自定义的一个JFrame");
        // 将窗口显示出来
        this.setVisible(true);

    }
}

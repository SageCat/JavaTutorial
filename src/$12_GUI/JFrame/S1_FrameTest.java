package $12_GUI.JFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author g84196891
 */
public class S1_FrameTest
{
    public static void main(String[] args)
    {
        // 创建一个 Label 对象
        JLabel myLabel = new JLabel("This is my Label");

        // 通过 Border 工厂创建一个绿色的border
        Border lineBorder = BorderFactory.createLineBorder(Color.green, 3);

        ImageIcon icon = new ImageIcon("./src/$12_GUI/JFrame/logo.png");
        // 为 Label 设置 Icon
        myLabel.setIcon(icon);
        // 设置 横向对齐方式为 左对齐 | 居中对其 | 右对齐
        myLabel.setHorizontalTextPosition(JLabel.CENTER);
        // 设置 纵向对齐方式为 顶部 | 居中 | 底部
        myLabel.setVerticalTextPosition(JLabel.TOP);
        // 修改字体颜色
        myLabel.setForeground(Color.WHITE);
        // 修改字体，大小和风格
        myLabel.setFont(new Font("Arial", Font.BOLD, 22));

        myLabel.setBackground(Color.BLACK);
        myLabel.setOpaque(true);
        myLabel.setBorder(lineBorder);

        myLabel.setVerticalAlignment(JLabel.CENTER);
        myLabel.setHorizontalAlignment(JLabel.CENTER);

        S0_MyFrame myFrame = new S0_MyFrame();
        // 向窗体中添加 Label
        myFrame.add(myLabel);
        myFrame.setResizable(true);
        // pack 方法要在最后一步添加， 否则不会显示后来添加的控件
        myFrame.pack();
    }
}

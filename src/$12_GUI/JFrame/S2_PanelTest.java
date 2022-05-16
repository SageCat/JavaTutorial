package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * 学习 JPanel 的相关知识:
 *
 * @author g84196891
 * @1. JPanel 是一个容器，也有自己的 Layout
 * @2. 可以向 JPanel 中添加 控件，如 Label， Text 等
 * @3. JPanel 可以添加到 JFrame 中
 * @4. JFrame也有自己的 Layout
 * @5. 当 “自己所属的容器” 的 Layout 为 null 时， 需要调用 setBounds 方法为 “自己”设置在容器中显示的位置
 */
public class S2_PanelTest
{
    public static void main(String[] args)
    {
        JPanel jPanelA = new JPanel();
        jPanelA.setBackground(new Color(0x0b2d64));
        // 若父容器的 Layout 为 null （此例中为 myFrame）， 则容器内的元素必须 调用 setBounds 方法设定具体位置，否则无法显示
        jPanelA.setBounds(0, 0, 400, 200);
        // JPanel 的默认 Layout 是 java.awt.FlowLayout
        System.out.println(jPanelA.getLayout());


        JPanel jPanelB = new JPanel();
        jPanelB.setBackground(new Color(0x874521));
        jPanelB.setBounds(400, 0, 400, 200);

        JPanel jPanelC = new JPanel();
        jPanelC.setBackground(new Color(0x2d5131));
        jPanelC.setBounds(0, 200, 800, 200);

        JPanel jPanelD = new JPanel();
        jPanelD.setBackground(new Color(0x972626));
        jPanelD.setBounds(0, 400, 800, 200);


        S0_MyFrame myFrame = new S0_MyFrame();
        myFrame.setBounds(300, 300, 800, 600);
        // JFrame 的默认 Layout 是 java.awt.BorderLayout
        System.out.println(myFrame.getLayout());
        myFrame.setLayout(null);
        myFrame.setResizable(false);
        myFrame.add(jPanelA);
        myFrame.add(jPanelB);
        myFrame.add(jPanelC);
        myFrame.add(jPanelD);

    }
}

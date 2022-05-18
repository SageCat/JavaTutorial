package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;

public class S4_LayoutTest
{
    public static void main(String[] args)
    {
        borderLayout();
//        flowLayout();
//        gridLayout();
    }

    private static void gridLayout()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 5, 5));
        panel.setBackground(new Color(0x2b88d6));

        addButtonsToPanel(panel);

        S0_MyCenterFrame frame = new S0_MyCenterFrame(500, 500);
        frame.add(panel);
        frame.setResizable(true);
    }

    private static void flowLayout()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(0x2b88d8));

        addButtonsToPanel(panel);

        S0_MyCenterFrame frame = new S0_MyCenterFrame(500, 500);
        frame.add(panel);
        frame.setResizable(true);
    }

    /**
     * BorderLayout 共有 NORTH, SOUTH, WEST, EAST, CENTER 五个位置，当窗体大小发生变化时
     * NORTH 和 SOUTH 的高度不发生变化，宽度会随着窗体的变化而变化
     * WEST 和 EAST 的宽度不发生变化，高度会随着窗体的变化而变化
     * CENTER 的宽度和高度都会随着窗体的变化而等比例变化
     */
    private static void borderLayout()
    {
        int windowWidth = 1000;
        int windowHeight = 800;

        JPanel jPanelA = new JPanel();
        jPanelA.setBackground(new Color(0xa4c9cc));
        jPanelA.setPreferredSize(new Dimension(windowWidth, windowHeight / 4));
        JLabel north = new JLabel("NORTH");
        north.setHorizontalTextPosition(JLabel.CENTER);
        jPanelA.add(north);

        JPanel jPanelB = new JPanel();
        jPanelB.setBackground(new Color(0x6ca8af));
        jPanelB.setPreferredSize(new Dimension(windowWidth, windowHeight / 4));
        JLabel south = new JLabel("SOUTH");
        south.setHorizontalTextPosition(JLabel.CENTER);
        jPanelB.add(south);

        JPanel jPanelC = new JPanel();
        jPanelC.setBackground(new Color(0x509296));
        jPanelC.setPreferredSize(new Dimension(windowWidth / 4, windowHeight / 2));
        JLabel west = new JLabel("WEST");
        west.setHorizontalTextPosition(JLabel.CENTER);
        jPanelC.add(west);

        JPanel jPanelD = new JPanel();
        jPanelD.setBackground(new Color(0x226b68));
        jPanelD.setPreferredSize(new Dimension(windowWidth / 4, windowHeight / 2));
        JLabel east = new JLabel("EAST");
        east.setHorizontalTextPosition(JLabel.CENTER);
        jPanelD.add(east);

        JPanel jPanelE = new JPanel();
        jPanelE.setBackground(new Color(0x108b96));
        jPanelE.setPreferredSize(new Dimension(windowWidth / 2, windowHeight / 2));
        JLabel center = new JLabel("CENTER");
        center.setHorizontalTextPosition(JLabel.CENTER);
        jPanelE.add(center);

        S0_MyCenterFrame frame = new S0_MyCenterFrame(windowWidth, windowHeight);
        // 设置当前窗体的 Layout 为 BorderLayout, 并设置纵向和横向的 margin 都为 4 （其实 JFrame 默认的 布局方式就是 BorderLayout）
        frame.setLayout(new BorderLayout(4, 4));
        frame.setResizable(true);

        frame.add(jPanelA, BorderLayout.NORTH);
        frame.add(jPanelB, BorderLayout.SOUTH);
        frame.add(jPanelC, BorderLayout.WEST);
        frame.add(jPanelD, BorderLayout.EAST);
        frame.add(jPanelE, BorderLayout.CENTER);
    }

    private static void addButtonsToPanel(JPanel panel)
    {
        JButton buttonOne = new JButton("Button One");
        JButton buttonTwo = new JButton("Button Two");
        JButton buttonThree = new JButton("Button Three");
        JButton buttonFour = new JButton("Button Four");
        JButton buttonFive = new JButton("Button Five");
        JButton buttonSix = new JButton("Button Six");
        JButton buttonSeven = new JButton("Button Seven");
        JButton buttonEight = new JButton("Button Eight");
        JButton buttonNine = new JButton("Button Nine");
        JButton buttonTen = new JButton("Button Ten");

        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonFour);
        panel.add(buttonFive);
        panel.add(buttonSix);
        panel.add(buttonSeven);
        panel.add(buttonEight);
        panel.add(buttonNine);
        panel.add(buttonTen);
    }
}

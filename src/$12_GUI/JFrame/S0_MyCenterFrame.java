package $12_GUI.JFrame;


import javax.swing.*;
import java.awt.*;

/**
 * 从 JFrame 继承，自定义一个居中显示的 窗体
 *
 * @author g84196891
 */
public class S0_MyCenterFrame extends JFrame
{
    private int windowWidth = 1200;
    private int windowHeight = 800;

    /**
     * @param windowWidth  传入想要创建的居中显示的窗体的 宽度
     * @param windowHeight 传入想要创建的居中显示的窗体的 高度
     * @throws HeadlessException
     */
    public S0_MyCenterFrame(int windowWidth, int windowHeight) throws HeadlessException
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;

        // 设置退出方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 获取当前屏幕尺寸
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int sizeWidth = (int) screenSize.getWidth();
        int sizeHeight = (int) screenSize.getHeight();

        // 设置窗口大小 和 位置
        this.setBounds(sizeWidth / 2 - this.windowWidth / 2, sizeHeight / 2 - this.windowHeight / 2, this.windowWidth, this.windowHeight);
        // 设置为不可调整大小
        this.setResizable(false);
        // 设置背景颜色
        this.getContentPane().setBackground(new Color(0x007175));
        // 设置窗口标题
        this.setTitle("这是我自定义的一个JFrame");
        // 设置窗口的 Logo
        this.setIconImage(new ImageIcon("src/$12_GUI/JFrame/logo.png").getImage());
        // 将窗口显示出来
        this.setVisible(true);
    }

    public void repair()
    {
        this.setVisible(false);
        this.setVisible(true);
    }
}

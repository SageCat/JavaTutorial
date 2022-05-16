package $12_GUI.JFrame;

import javax.swing.*;
import java.awt.*;

public class S5_LayeredPaneTest
{
    public static void main(String[] args)
    {
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);

        JLabel layerOne = new JLabel("Layer one");
        layerOne.setOpaque(true);
        layerOne.setBackground(new Color(0x0078d4));
        layerOne.setBounds(100, 100, 200, 200);

        JLabel layerTwo = new JLabel("Layer Two");
        layerTwo.setOpaque(true);
        layerTwo.setBackground(new Color(0xa4262c));
        layerTwo.setBounds(200, 200, 200, 200);

        JLabel layerThree = new JLabel("Layer Three");
        layerThree.setOpaque(true);
        layerThree.setBackground(new Color(0x107c10));
        layerThree.setBounds(300, 300, 200, 200);

        layeredPane.add(layerOne, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(layerTwo, JLayeredPane.POPUP_LAYER);
        layeredPane.add(layerThree, JLayeredPane.DRAG_LAYER);

        S0_MyCenterFrame centerFrame = new S0_MyCenterFrame(1000, 800);
        centerFrame.add(layeredPane);


    }
}

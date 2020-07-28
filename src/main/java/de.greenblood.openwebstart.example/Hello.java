package de.greenblood.openwebstart.example;

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Hello
{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        try
        {
            Thread.sleep(50);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        SwingUtilities.invokeAndWait(new Runnable()
        {
            public void run()
            {
                WebLookAndFeel.install ();
                JFrame f = new JFrame("main");
                f.setSize(200, 100);
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel("Hello World");
                f.add(label);
                f.setVisible(true);
            }
        });
    }
}
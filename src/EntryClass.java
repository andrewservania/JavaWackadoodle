import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Created by andrew on 9/24/15.
 */
public class EntryClass {


    public static void main(String[] arguments)
    {
        System.out.println("Andrew: Application has started.");
        createWindow();
    }


    private static void createWindow()
    {
        // 1. Create the frame
        JFrame frame = new JFrame("Andrew's first window");

        // 2. optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame.
        // ...create emptyLabel...
        JLabel label = new JLabel("Hi! I'm mr. window! I float around just like the other windows next to me :). I don't do much yet however so .. stay tuned! ;)");

        // Just a simple button
        JButton button4 = new JButton("South1");


        // add the label to the content pane
        frame.getContentPane().add(label, BorderLayout.CENTER);



        frame.getContentPane().add(button4, BorderLayout.SOUTH);



        // 4. Size the frame
        frame.setSize(new Dimension(900,400));

        // 5. Show it.
        frame.setVisible(true);




    }

    private static void createMenuBar()
    {

        // Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu, subMenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        // Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only meny in this program that has menu items");

        // a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");

        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon", new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
    }
}

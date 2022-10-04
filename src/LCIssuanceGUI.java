import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LCIssuanceGUI extends JFrame {
    private JPanel mainPanel;
    private JButton backButton;

    public LCIssuanceGUI() {
        setContentPane(mainPanel);
        setTitle("Create JFrame Example");
        setSize(640, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ServicesGui servicesGui = new ServicesGui();
                servicesGui.setVisible(true);
            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicesGui extends JFrame {
    private JPanel mainPanel;
    private JButton backBtn;
    private JToolBar toolBar1;
    private JButton issuanceButton;
    private JButton amendmentButton1;
    private JButton drawingButton2;
    private JButton drawingButton;
    private JButton issuanceButton1;

    public ServicesGui() {
        setContentPane(mainPanel);
        setTitle("Create JFrame Example");
        setSize(640, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGui loginGui = new LoginGui();
                loginGui.setVisible(true);
            }
        });

        issuanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LCIssuanceGUI lcIssuanceGUI = new LCIssuanceGUI();
                lcIssuanceGUI.setVisible(true);
            }
        });
    }
}

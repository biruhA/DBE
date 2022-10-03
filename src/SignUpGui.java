import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpGui extends JFrame {
    private JPanel mainPanel;
    private JButton backBtn;

    public SignUpGui() {
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
    }
}

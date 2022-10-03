import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGui extends JFrame {
    private JTextField emailTextField;
    private JTextField passwordTextField;
    private JButton loginBtn;
    private JButton signUpBtn;
    private JLabel welcomeTxt;
    private JLabel emailTxt;
    private JLabel passwordTxt;
    private JLabel errorTxt;
    private JPanel mainPanel;

    public LoginGui() {
        setContentPane(mainPanel);
        setTitle("Create JFrame Example");
        setSize(640, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTextField.getText();
                String password = passwordTextField.getText();

                Login login = new Login(email, password);
                errorTxt.setText(login.validateInput());
                System.out.print("getUser: " + login.getUser());

                if (login.getUser()) {
                    dispose();
                    ServicesGui servicesGui = new ServicesGui();
                    servicesGui.setVisible(true);
                }
            }
        });

        signUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SignUpGui signUpGui = new SignUpGui();
                signUpGui.setVisible(true);
            }
        });

    }
}

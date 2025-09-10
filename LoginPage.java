import java.awt.*;
import java.awt.event.*;

public class LoginPage extends Frame implements ActionListener {
    Label lblUsername, lblPassword, lblMessage;
    TextField txtUsername, txtPassword;
    Button btnLogin, btnCancel;

    public LoginPage() {
        setTitle("Login Page");
        setSize(350, 200);
        setLayout(null);
        setResizable(false);

        lblUsername = new Label("Username:");
        lblUsername.setBounds(50, 50, 80, 25);

        txtUsername = new TextField();
        txtUsername.setBounds(140, 50, 150, 25);

        lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 90, 80, 25);

        txtPassword = new TextField();
        txtPassword.setEchoChar('*');
        txtPassword.setBounds(140, 90, 150, 25);

        btnLogin = new Button("Login");
        btnLogin.setBounds(70, 130, 80, 30);

        btnCancel = new Button("Cancel");
        btnCancel.setBounds(200, 130, 80, 30);

        lblMessage = new Label("");
        lblMessage.setBounds(50, 170, 250, 25);
        lblMessage.setForeground(Color.RED);

        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnCancel);
        add(lblMessage);

        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();

            // Dummy check: valid if username = "admin" and password

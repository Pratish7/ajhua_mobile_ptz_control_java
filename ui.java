import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ui {
    private static JButton upLeftBtn;
    private static JButton upBtn;
    private static JButton rightUpBtn;
    private static JButton leftBtn;
    private static JButton zoomBtn;
    private static JButton rightBtn;
    private static JButton downLeftBtn;
    private static JButton downBtn;
    private static JButton rightDownBtn;
    private static JLabel statusLabel;

    public static void main(String args[]) {
        init_.init(null, null);

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame videoFrame = new JInternalFrame();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) videoFrame.getUI()).setNorthPane(null);
        videoFrame.setBorder(null);
        videoFrame.setLayout(new GridLayout(1, 1));
        JPanel videoPanel = new JPanel();
        videoPanel.setBackground(Color.BLACK);
        videoFrame.add(videoPanel);
        frame.add(videoFrame);
        videoFrame.setVisible(true);

        JPanel loginFrame = new JPanel();
        loginFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel hostLabel = new JLabel("Host");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 20;
        loginFrame.add(hostLabel, gbc);

        JTextPane host = new JTextPane();
        host.setBorder(BorderFactory.createLineBorder(Color.black));
        host.setFont(new Font("Serif", Font.PLAIN, 18));
        host.setText("192.168.1.108");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.5;
        loginFrame.add(host, gbc);
        
        JLabel portLabel = new JLabel("Port");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginFrame.add(portLabel, gbc);
        
        JTextPane port = new JTextPane();
        port.setFont(new Font("Serif", Font.PLAIN, 18));
        port.setText("37777");
        port.setBorder(BorderFactory.createLineBorder(Color.black));
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginFrame.add(port, gbc);

        JLabel userLabel = new JLabel("User");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 2;
        loginFrame.add(userLabel, gbc);

        JTextPane user = new JTextPane();
        user.setFont(new Font("Serif", Font.PLAIN, 18));
        user.setText("admin");
        user.setBorder(BorderFactory.createLineBorder(Color.black));
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginFrame.add(user, gbc);

        JLabel passwordLabel = new JLabel("Password");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 3;
        loginFrame.add(passwordLabel, gbc);

        JTextPane password = new JTextPane();
        password.setFont(new Font("Serif", Font.PLAIN, 18));
        password.setText("admin@123");
        password.setBorder(BorderFactory.createLineBorder(Color.black));
        gbc.gridx = 1;
        gbc.gridy = 3;
        loginFrame.add(password, gbc);
        
        JButton loginBtn = new JButton("Login");
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            boolean login = loginModule.login(host.getText(), Integer.parseInt(port.getText()), user.getText(), password.getText());
            if (login == true){
                statusLabel.setText("Logged in");
                upLeftBtn.setEnabled(true);
                upBtn.setEnabled(true);
                rightUpBtn.setEnabled(true);
                leftBtn.setEnabled(true);
                zoomBtn.setEnabled(true);
                rightBtn.setEnabled(true);
                downLeftBtn.setEnabled(true);
                downBtn.setEnabled(true);
                rightDownBtn.setEnabled(true);
            }else {
                statusLabel.setText("Error loggin in");
            }
        }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        loginFrame.add(loginBtn, gbc);

        statusLabel = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        loginFrame.add(statusLabel, gbc);

        loginFrame.setVisible(true);
        frame.add(loginFrame);

        JInternalFrame controlsFrame = new JInternalFrame();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) controlsFrame.getUI()).setNorthPane(null);
        controlsFrame.setBorder(null);
        controlsFrame.setLayout(new GridLayout(3, 3, 20, 20));

        upLeftBtn = new JButton("Up Left");
        upLeftBtn.setEnabled(false);
        upLeftBtn.setPreferredSize(new Dimension(100, 100));
        upLeftBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlLeftUpStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlLeftUptEnd();
            }
        });
        controlsFrame.add(upLeftBtn);

        upBtn = new JButton("Up");
        upBtn.setEnabled(false);
        upBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlUpStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlUpEnd();
            }
        });
        controlsFrame.add(upBtn);

        rightUpBtn = new JButton("Up Right");
        rightUpBtn.setEnabled(false);
        rightUpBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlRightUpStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlRightUpEnd();
            }
        });
        controlsFrame.add(rightUpBtn);

        leftBtn = new JButton("Left");
        leftBtn.setEnabled(false);
        leftBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlLeftStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControLeftEnd();
            }
        });
        controlsFrame.add(leftBtn);

        zoomBtn = new JButton("Zoom");
        zoomBtn.setEnabled(false);
        zoomBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
        });
        controlsFrame.add(zoomBtn);

        rightBtn = new JButton("Right");
        rightBtn.setEnabled(false);
        rightBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlRightStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlRightEnd();
            }
        });
        controlsFrame.add(rightBtn);

        downLeftBtn = new JButton("Down Left");
        downLeftBtn.setEnabled(false);
        downLeftBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlLeftDownStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlDownEnd();
            }
        });
        controlsFrame.add(downLeftBtn);

        downBtn = new JButton("Down");
        downBtn.setEnabled(false);
        downBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlDownStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlDownEnd();
            }
        });
        controlsFrame.add(downBtn);

        rightDownBtn = new JButton("Down Right");
        rightDownBtn.setEnabled(false);
        rightDownBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                controls.ptzControlRightDownStart();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                controls.ptzControlRightDownEnd();
            }
        });
        controlsFrame.add(rightDownBtn);

        frame.add(controlsFrame);

        controlsFrame.setVisible(true);

        frame.pack();
        frame.setVisible(true);

    }
}
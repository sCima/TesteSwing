import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teste {
    private JFrame frame;
    private JTextField textField;
    private JButton sairButton;
    private JButton bemVindoButton;
    private JTextField textField1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teste window = new Teste();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Teste() {

        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(168, 11, 241, 31);
        panel.add(textField);
        textField.setColumns(10);

        int n1, n2;

        JButton btnNewButton = new JButton("7");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(168, 53, 52, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("8");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setBounds(230, 53, 53, 23);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("9");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2.setBounds(293, 53, 53, 23);
        panel.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("4");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_3.setBounds(167, 87, 53, 23);
        panel.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("5");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_4.setBounds(230, 87, 53, 23);
        panel.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("6");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_5.setBounds(293, 87, 53, 23);
        panel.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("3");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("3");
            }
        });
        btnNewButton_6.setBounds(167, 121, 53, 23);
        panel.add(btnNewButton_6);

        JButton btnNewButton_7 = new JButton("2");
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_7.setBounds(230, 121, 53, 23);
        panel.add(btnNewButton_7);

        JButton btnNewButton_8 = new JButton("1");
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("1");
            }
        });
        btnNewButton_8.setBounds(293, 121, 53, 23);
        panel.add(btnNewButton_8);

        JButton btnNewButton_9 = new JButton("0");
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_9.setBounds(230, 155, 53, 23);
        panel.add(btnNewButton_9);

        // Somar
        JButton btnNewButton_12 = new JButton("+");
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                n1 = Integer.parseInt(textField.getText());
            }
        });
        btnNewButton_12.setBounds(356, 55, 53, 23);
        panel.add(btnNewButton_12);

        // Subtrair
        JButton btnNewButton_13 = new JButton("-");
        btnNewButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_13.setBounds(356, 89, 53, 23);
        panel.add(btnNewButton_13);

        // Multiplicar
        JButton btnX = new JButton("x");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnX.setBounds(356, 123, 53, 23);
        panel.add(btnX);

        // Dividir
        JButton btnNewButton_15 = new JButton("/");
        btnNewButton_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_15.setBounds(356, 155, 53, 23);
        panel.add(btnNewButton_15);
    }
}

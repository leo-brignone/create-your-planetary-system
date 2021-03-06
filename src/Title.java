import javax.swing.*;
import java.awt.*;

public class Title extends JFrame{

    public static void main(String[] args) {
        new Title();
    }

    public Title() {
        
        this.setTitle("Create your Solar System");
        this.setSize(1050,640);
        this.setResizable(false);
        this.setLocation(120,20);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.BLACK);
        firstPanel.setBounds(0,0,1050,640);
        firstPanel.setVisible(true);

        firstPanel.setLayout(null);
        JLabel affBackground = new JLabel (new ImageIcon("wallpaper HD.jpg"));
        affBackground.setBounds(0,25,1050,590);
        firstPanel.add(affBackground);

        JLabel txtLabel = new JLabel();
        txtLabel.setText("CREATE YOUR PLANETARY SYSTEM");
        txtLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,45));
        txtLabel.setForeground(Color.WHITE);
        txtLabel.setBounds(90,25,900,50);
        affBackground.add(txtLabel);

        JLabel titleLabel = new JLabel();
        titleLabel.setText("How many planet do you want to add ?");
        titleLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(295,425,600,50);
        affBackground.add(titleLabel);

        JTextField nbPlanetLabel= new JTextField();
        nbPlanetLabel.setBounds(495,495,100,35);
        nbPlanetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nbPlanetLabel.setBackground(Color.BLACK);
        nbPlanetLabel.setForeground(Color.WHITE);
        affBackground.add(nbPlanetLabel);

        JButton launchButton = new JButton("Start");
        launchButton.setBounds(505,535,80,25);
        launchButton.setForeground(Color.WHITE);
        launchButton.setBackground(Color.GRAY);
        affBackground.add(launchButton);

        this.add(firstPanel);
        this.setVisible(true);
    }

    private void ActionPerformed(){

    }
}

import javax.swing.*;
import java.awt.*;

public class TeamStatsGUI extends JFrame {

    public TeamStatsGUI() {

        setTitle("NFL Statistics");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // create a welcome label
        JLabel welcomeLabel = new JLabel("Welcome to NFL Statistics", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // create panel for the buttons with GridBagLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        // create GridBagConstraints for better control over layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // buttons
        JButton tableButton = new JButton("Table and Details");
        JButton statsButton = new JButton("Stats and Charts");

        // setting size of buttons
        tableButton.setPreferredSize(new Dimension(200, 50));
        statsButton.setPreferredSize(new Dimension(200, 50));

        // add buttons to the button panel
        buttonPanel.add(tableButton, gbc);
        buttonPanel.add(statsButton, gbc);

        // add components to the frame
        add(welcomeLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }


}


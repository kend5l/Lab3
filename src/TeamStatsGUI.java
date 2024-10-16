import javax.swing.*;
import java.awt.*;

public class TeamStatsGUI extends JFrame {

    public TeamStatsGUI() {

        setTitle("NFL Statistics");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a welcome label
        JLabel welcomeLabel = new JLabel("Welcome to NFL Statistics", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Corbel", Font.BOLD, 30));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align in BoxLayout

        // Create panel for the buttons with GridBagLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setOpaque(false); // Make the button panel transparent if needed

        // Create GridBagConstraints for better control over layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Buttons
        JButton tableButton = new JButton("Table and Details");
        JButton statsButton = new JButton("Stats and Charts");

        // Set size of buttons
        tableButton.setPreferredSize(new Dimension(200, 50));
        statsButton.setPreferredSize(new Dimension(200, 50));

        // Add buttons to the button panel
        buttonPanel.add(tableButton, gbc);
        buttonPanel.add(statsButton, gbc);

        // Create a panel with BoxLayout to stack welcome label and buttons vertically
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        verticalPanel.setOpaque(false); // Make the panel transparent to show background

        // Add components with spacing
        verticalPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Add spacing at the top
        verticalPanel.add(welcomeLabel);
        verticalPanel.add(Box.createRigidArea(new Dimension(0, 30))); // Spacing between label and buttons
        verticalPanel.add(buttonPanel);

        // Add the vertical panel to the frame
        add(verticalPanel, BorderLayout.CENTER); // Add it to the center of the frame

        setVisible(true);
    }


}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

public class TeamStatsGUI extends JFrame {

    private List<Map<String, String>> teamStats;

    public TeamStatsGUI(List<Map<String, String>> teamStats) {
        this.teamStats = teamStats;  // Pass the parsed data to the GUI

        setTitle("NFL Statistics");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a welcome label
        JLabel welcomeLabel = new JLabel("Welcome to NFL Statistics", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Corbel", Font.BOLD, 30));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Create panel for the buttons with GridBagLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Buttons
        JButton tableButton = new JButton("Table and Details");
        JButton statsButton = new JButton("Stats and Charts");

        tableButton.setPreferredSize(new Dimension(200, 50));
        statsButton.setPreferredSize(new Dimension(200, 50));

        buttonPanel.add(tableButton, gbc);
        buttonPanel.add(statsButton, gbc);

        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        verticalPanel.setOpaque(false);

        verticalPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        verticalPanel.add(welcomeLabel);
        verticalPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        verticalPanel.add(buttonPanel);

        add(verticalPanel, BorderLayout.CENTER);

        // Add ActionListener to "Table and Details" button
        tableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and display the TableAndDetails window
                new TableandDetails(teamStats);
            }
        });

        setVisible(true);
    }
}

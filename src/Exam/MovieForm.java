package Exam;

import javax.swing.*;

public class MovieForm extends JFrame {
    JLabel titleLabel, genreLabel, languageLabel, lengthLabel;
    JTextField titleField, genreField, languageField, lengthField;
    JButton okButton;

    public MovieForm() {
        // Set the frame properties
        setTitle("Add Movie");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the labels and text fields
        titleLabel = new JLabel("Title: ");
        titleField = new JTextField(20);
        genreLabel = new JLabel("Genre: ");
        genreField = new JTextField(20);
        languageLabel = new JLabel("Language: ");
        languageField = new JTextField(20);
        lengthLabel = new JLabel("Length: ");
        lengthField = new JTextField(20);

        // Create the OK button
        okButton = new JButton("OK");
        okButton.addActionListener(e -> insertMovie());

        // Create the panel and add components
        JPanel panel = new JPanel();
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(genreLabel);
        panel.add(genreField);
        panel.add(languageLabel);
        panel.add(languageField);
        panel.add(lengthLabel);
        panel.add(lengthField);
        panel.add(okButton);

        // Add the panel to the frame
        add(panel);

        setVisible(true);
    }

    private void insertMovie() {
        // Get the input values
        String title = titleField.getText();
        String genre = genreField.getText();
        String language = languageField.getText();
        int length = Integer.parseInt(lengthField.getText());

        // Insert the data into the movie table
        // Here, you can use SQL statements to insert the data into the table
        // You can use JDBC to connect to the database and execute the statements

        // Close the form
        dispose();
    }

    public static void main(String[] args) {
        MovieForm form = new MovieForm();
    }
}

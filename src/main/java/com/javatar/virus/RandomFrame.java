package com.javatar.virus;

import javax.swing.*;
import java.awt.*;


public class RandomFrame extends JFrame {
//    private String line;
    private static final String[] randomText = {
            "I'm not a virus",
            "god take you",
            "suffering hurts you",
            "eat straw",
            "O bull"
    };

    public RandomFrame(Dimension screenSize) {
        super("HHHHHHH HHHHHHHH");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(this.getRandomSize(screenSize));
        setLocation(this.getRandomLocation(screenSize));
        setResizable(false);
        this.setupLabel();
        setVisible(true);
    }

    private void setupLabel() {
        JLabel label = new JLabel(this.getRandomText(), JLabel.CENTER);
        label.setFont(new Font(Font.DIALOG, Font.BOLD, (int) (Math.random() * 200) + 50));
        label.setForeground(new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        ));
        this.add(label);
    }

    private String getRandomText() {
        return randomText[(int) (Math.random() * randomText.length)];
    }
    /*

    ArrayList<String> words = new ArrayList<>();
    // add words to array list
    private String getRandomText() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new
                    FileReader("Files/randomText"));
            line = reader.readLine();
            while (line != null) {
                words.add( line );
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words.get((int) (Math.random() * words.size()));
    }

     */
    private Point getRandomLocation(Dimension screenSize) {
        return new Point(
                (int) (Math.random() * screenSize.width),
                (int) (Math.random() * screenSize.height)
        );
    }

    private Dimension getRandomSize(Dimension screenSize) {
        return new Dimension(
                (int) (Math.random() * screenSize.width),
                (int) (Math.random() * screenSize.height)
        );
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RecipeFinderGUI extends JFrame implements ActionListener, KeyListener {

    // TO DO M4: declare the widgets as private fields
    private JTextField searchField;
    private JComboBox<String> categoryBox;
    private JCheckBox vegOnly;
    private JButton findButton;
    private JTextArea resultArea;
    private JLabel statusLabel;

    // TO DO M6: private RecipeBook model;
    private RecipeBook model;

    public RecipeFinderGUI() {
        setTitle("Caribbean Recipe Finder");
        setSize(750, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // TO DO M4: build the top FlowLayout panel and add it to BorderLayout.NORTH


        // TO DO M4: build the JTextArea + JScrollPane and add to BorderLayout.CENTER
        //   - rows 15, cols 60
        //   - editable = false
        //   - font: new Font("Courier New", Font.PLAIN, 12)


        // TO DO M4: add the statusLabel ("0 results") to BorderLayout.SOUTH


        // TO DO M5: findButton.addActionListener(this);
        // TO DO M7: searchField.addKeyListener(this);
    }

    // TO DO M6: store the model, populate categoryBox, call runSearch()
    public void setModel(RecipeBook m) {

    }

    // TO DO M5: the single point where the search happens.
    //   1. if model == null, return
    //   2. read category (default "All")
    //   3. result = model.findByCategory(category)
    //   4. if vegOnly is selected: result = model.findVegetarian(result)
    //   5. result = model.searchTitle(result, searchField.getText())
    //   6. build the text: each recipe's toString separated by "\n\n", or "(no matches)" if empty
    //   7. resultArea.setText(...)
    //   8. update statusLabel:
    //        n == 0  -> "No matches"
    //        n == 1  -> "1 result"
    //        else    -> "<n> results"
    private void runSearch() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TO DO M5: just call runSearch()
    }

    // KeyListener — only keyReleased should do work
    @Override public void keyTyped(KeyEvent e)    { /* TO DO M7: empty */ }
    @Override public void keyPressed(KeyEvent e)  { /* TO DO M7: empty */ }
    @Override
    public void keyReleased(KeyEvent e) {
        // TO DO M7: call runSearch()
    }
}

package revisionApp;
/**
 * A program to provide practice when rote-learning facts for an undergraduate
 * chemistry degree. 
 */

/**
 * @author Abbey Scofield-Marlowe
 * @version 1.0
 */

import java.util.*;
import java.awt.*;        // Using AWT container and component classes
import java.awt.List;
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.JFrame;


public class roteRevision extends Frame implements ActionListener, WindowListener {
	private Label questionLbl; // Declares a label for the question
	private TextArea answerText; // Declares a field of type "Text" for the student to enter the answers
	private TextArea givenAnswer; // Declares a second text area for the answers to be provided iin
	private Button submitBtn; // Declares a submit button
	static periodicTable pT = new periodicTable();
	
	public static void main(String[] args) { // Invoke the constructor to setup the GUI, by allocating an instance
		roteRevision app = new roteRevision();
		app.showGUI();
	}
	
	public void guiSetup(Container pane) {
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		questionLbl = new Label("Chemistry rote-learning tester.  Choose a mode to begin");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		pane.add(questionLbl, c); // Constructs and adds question label
		
		answerText = new TextArea("Enter answer here", 5, 100);
		answerText.setEditable(true);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		c.gridheight = 2;
		pane.add(answerText,c); // Constructs textbox, makes it editable and adds it
		
		givenAnswer = new TextArea("Answer will appear here", 5, 100);
		givenAnswer.setEditable(false);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		c.gridheight = 2;
		pane.add(givenAnswer,c); // Constructs textbox for answers to show in
		
		final List modeList = new List(6);
		modeList.add("Test1");
		modeList.add("Test2");
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 4;
		pane.add(modeList,c); // Sets up and constructs list of modes
		
		submitBtn = new Button("Submit");
		c.gridx = 2;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		pane.add(submitBtn,c); // Constructs and adds submit button
		
		submitBtn.addActionListener(this);
		// Makes the actionPerformed() fire when the button is pressed
		
		addWindowListener(this);
		// Listens for actions on the window buttons
		
	}
	
	private void showGUI() {
		JFrame frame = new JFrame("Rote Revision");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiSetup(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
		
	}
		
	// ActionEvent handler - Called back upon button-click.
	@Override
	public void actionPerformed(ActionEvent evt) {
		answerText.setText("Button pressed");
	}
	
	/* WindowEvent handlers */
	// Called back upon clicking close-window button
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);  // Terminate the program
	}
	 
	// Not Used, but need to provide an empty body to compile.
	@Override public void windowOpened(WindowEvent evt) { }
	@Override public void windowClosed(WindowEvent evt) { }
	@Override public void windowIconified(WindowEvent evt) { }
	@Override public void windowDeiconified(WindowEvent evt) { }
	@Override public void windowActivated(WindowEvent evt) { }
	@Override public void windowDeactivated(WindowEvent evt) { }
}

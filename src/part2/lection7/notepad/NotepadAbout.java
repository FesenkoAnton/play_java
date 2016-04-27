package part2.lection7.notepad;


import java.awt.*;
import javax.swing.*;


public class NotepadAbout extends JDialog{
	JButton ok;
	
	public NotepadAbout(Frame owner, boolean modal){
		super(owner, modal);
		
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Dimension dialogSize = new Dimension(100, 100);
        setSize(dialogSize);
        add(new JLabel("Це наше перше діалогове вікно"));
        ok = new JButton("OK");

        pack();
        
	}
}

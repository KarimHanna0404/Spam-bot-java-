
package funSpam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class spamBot {

	public static void main(String[] args) throws AWTException, InterruptedException  {

		int x = 1;
		
		Robot robot = new Robot();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		
		StringSelection stringselection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringselection, null);
		
		System.out.println("your about top get fucked by spams");
		while(true) {
	
		    robot.keyPress(KeyEvent.VK_META); // Press the Command key
		    robot.keyPress(KeyEvent.VK_V); // Press the V key
		    robot.keyRelease(KeyEvent.VK_V); // Release the V key
		    robot.keyRelease(KeyEvent.VK_META); // Release the Command key
		    
		    robot.keyPress(KeyEvent.VK_ENTER); // Press the Enter key
		    robot.keyRelease(KeyEvent.VK_ENTER); // Release the Enter key
		    
		    x++; // Though `x` isn't being used anywhere in this snippet
		}
}
}

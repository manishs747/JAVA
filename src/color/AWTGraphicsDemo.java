/**
 * 
 */
package color;

import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author arvind
 *
 */
public class AWTGraphicsDemo extends Frame{
	
	
	 public AWTGraphicsDemo(){
	      super("Java AWT Examples");
	      prepareGUI();
	   }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 AWTGraphicsDemo  awtGraphicsDemo = new AWTGraphicsDemo();  
	      awtGraphicsDemo.setVisible(true);

	}
	
	  private void prepareGUI(){
	      setSize(400,400);
	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      }); 
	   }  
	  
	  @Override
	   public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;        
	      Font plainFont = new Font("Serif", Font.PLAIN, 24);        
	      g2.setFont(plainFont);
	      g2.setColor(Color.red);
	      g2.drawString("Welcome to TutorialsPoint", 50, 70); 
	      g2.setColor(Color.GRAY);
	      g2.drawString("Welcome to TutorialsPoint", 50, 120);  
	   }

}

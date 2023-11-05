import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="KeyboardEvent.java" height=300 width=300></applet>
public class KeyboardEvent extends Applet implements KeyListener{
	String msg="",key;
	public void init()
	{
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,300,200);
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus(key +"key released");
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode=ke.getKeyCode();
		key=ke.getKeyText(keycode);
		repaint();
		showStatus(key+"key pressed");
	}
	public void keyTyped(KeyEvent ke)
	{
		char c=ke.getKeyChar();
		msg+=c;
		key=String.valueOf(c);
		repaint();
	}
}

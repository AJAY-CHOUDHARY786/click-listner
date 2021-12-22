import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ajay extends Applet implements MouseListener  {
    int x,y;
    public void init() {
        addMouseListener(this);
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseClicked(MouseEvent me){
        x=me.getX();
        y=me.getY();
        repaint();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 100, 100);
    }
}
/* 
<applet code="Ajay.class" width="1000" height="1000"> 
</applet> 
*/
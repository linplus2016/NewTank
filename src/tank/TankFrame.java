package tank;import java.awt.*;// 引入Graphic类public class TankFrame extends Frame {        int x=100,y=100;        TankFrame(){             setSize(800,600);             setLocation(100,100);             setVisible(true);             setTitle("坦克大战");        }         @Override         public void  paint(Graphics g){             g.fillRect(x,y,100,100);             x += 1;         }}
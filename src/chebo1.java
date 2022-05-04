 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    class chebo1 extends Frame implements ItemListener
    {
        Checkbox c1,c2;
        chebo1(String t)
        {
            super(t);
            Color co =new Color(28, 28, 28);
            Font f=new Font("Courier",Font.PLAIN,40);
            setLayout(new FlowLayout());
            setFont(f);
            setTitle("WILL YoU MARRY ME?");
            setBackground(Color.magenta);
            c1=new Checkbox("YES");
            c2=new Checkbox("NO");
            c1.addItemListener(this);
            c2.addItemListener(this );
            add(c1);
            add(c2);
        }

        public void itemStateChanged(ItemEvent i)
        {
            repaint();
        }

        public void paint (Graphics g)
        {
            if(c1.getState()== true)
            {
                g.drawString("🥰💐I LOVE YOU💐🥰",80,180);
                g.setColor(Color.YELLOW);
            }
            else if (c2.getState()== true) {
            g.setColor(Color.CYAN);
                g.drawString("💔GET LOST THEN.❤️‍🔥!!!",30,300);
            }
        }

        public static void main(String arg[])
        {
            chebo1 c=new chebo1("My Checkbox");
            c.setSize(500,600);
            c.show();
        }
    }


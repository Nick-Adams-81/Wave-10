package Main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shop extends MouseAdapter {

    Handler handler;
    HUD hud;

    private int B1 = 1000;
    private int B2 = 1000;
    private int B3 = 1000;

    public Shop(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("arial", 0, 40));
        g.drawString("Shop", Game.WIDTH / 2 - 50, 50);

        // box 1
        g.setFont(new Font("arial", 0 , 12));
        g.drawString("Upgrade Health", 110, 120);
        g.drawString("Cost: " + B1, 110, 140);
        g.drawRect(100, 100, 110, 80);

        // box 2
        g.drawString("Upgrade Speed", 260, 120);
        g.drawString("Cost: " + B2, 260, 140);
        g.drawRect(250, 100, 110, 80);

        // box 3
        g.drawString("Refill Health", 410, 120);
        g.drawString("Cost: " + B3, 110, 140);
        g.drawRect(400, 100, 110, 80);

        g.drawString("SCORE: " + hud.getScore(), Game.WIDTH / 2 - 50, 300);
        g.drawString("Press Space to go Back", Game.WIDTH / 2 - 50, 330);

    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        // box 1
        if(mx >= 100 && mx <= 200) {
            if(my >= 100 && my <= 180) {
                System.out.println("box 1");
            }
        }

        // box 2
        if(mx >= 250 && mx <= 350) {
            if(my >= 100 && my <= 180) {
                System.out.println("box 2");
            }
        }

        // box 3
        if(mx >= 400 && mx <= 500) {
            if(my >= 100 && my <= 180) {
                System.out.println("box 3");
            }
        }
    }
}

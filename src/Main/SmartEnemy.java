package Main;

import java.awt.*;

public class SmartEnemy extends GameObject {

    private Handler handler;
    private GameObject player;


    public SmartEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

        for(int i = 0; i < handler.object.size(); i++) {
            if(handler.object.get(i).getId() == ID.Player) {
                player = handler.object.get(i);
            }
        }


    }

    // cast x and y to int
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 16, 16);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        float diffX = x - player.getX() - 16;
        float diffY = y - player.getY() - 16;
        float distance = (float) Math.sqrt((x - player.getX()) * (x - player.getX()) + (y - player.getY()) * (y - player.getY()));

        velX = (int) ((-1 / distance) * diffX);
        velY = (int) ((-1 / distance) * diffY);

        handler.addObject(new Trail((int)x, (int)y,  ID.Trail, Color.GREEN, 16, 16, 0.02f, handler));

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect((int)x, (int)y, 16, 16);
    }
}

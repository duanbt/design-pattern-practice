package drawer;

import command.MacroCommand;

import java.awt.*;

/**
 * @author duanbt
 **/
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.RED;

    private int radius = 6;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }


    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

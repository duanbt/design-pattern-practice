package practice.turtle;

import practice.language.ExecuteException;
import practice.language.Executor;
import practice.language.ExecutorFactory;

import java.awt.*;

/**
 * @author duanbt
 **/
public class TurtleCanvas extends Canvas implements ExecutorFactory {

    /**
     * 前进时的长度单位
     */
    private static final int UNIT_LENGTH = 30;
    /**
     * 上方
     */
    private static final int DIRECTION_UP = 0;
    /**
     * 右方
     */
    private static final int DIRECTION_RIGHT = 3;
    /**
     * 下方
     */
    private static final int DIRECTION_DOWN = 6;
    /**
     * 左方
     */
    private static final int DIRECTION_LEFT = 9;
    /**
     * 右转
     */
    private static final int RELATIVE_DIRECTION_RIGHT = 3;
    /**
     * 左转
     */
    private static final int RELATIVE_DIRECTION_LEFT = -3;
    /**
     * 半径
     */
    private static final int RADIUS = 3;

    private int direction = 0;
    private Point position;
    private Executor executor;

    public TurtleCanvas(int width, int height) {
        setSize(width, height);
        initialize();
    }

    private void initialize() {
        Dimension size = getSize();
        position = new Point(size.width / 2, size.height / 2);
        direction = 0;
        setForeground(Color.RED);
        setBackground(Color.WHITE);
        Graphics g = getGraphics();
        if (g != null) {
            g.clearRect(0, 0, size.width, size.height);
        }
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    void setRelativeDirection(int relativeDirection) {
        setDirection(direction + relativeDirection);
    }

    void setDirection(int direction) {
        if (direction < 0) {
            direction = 12 - Math.abs(direction) % 12;
        } else {
            direction = direction % 12;
        }
        this.direction = direction;
    }

    void go(int lenght) {
        int newx = position.x;
        int newy = position.y;
        switch (direction) {
            case DIRECTION_UP:
                newy -= lenght;
                break;
            case DIRECTION_RIGHT:
                newx += lenght;
                break;
            case DIRECTION_DOWN:
                newy += lenght;
                break;
            case DIRECTION_LEFT:
                newx -= lenght;
                break;
            default:
        }
        Graphics g = getGraphics();
        if (g != null) {
            g.drawLine(position.x, position.y, newx, newy);
            g.fillOval(newx - RADIUS, newy - RADIUS, RADIUS * 2, RADIUS * 2);
        }
        position.x = newx;
        position.y = newy;
    }

    @Override
    public void paint(Graphics g) {
        initialize();
        if (executor != null) {
            try {
                executor.execute();
            } catch (ExecuteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Executor createExecutor(String name) {
        if ("go".equals(name)) {
            return new GoExecutor(this);
        } else if ("right".equals(name)) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_RIGHT);
        } else if ("left".equals(name)) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_LEFT);
        } else {
            return null;
        }
    }

    abstract class TurtleExecutor implements Executor {
        protected TurtleCanvas canvas;

        public TurtleExecutor(TurtleCanvas canvas) {
            this.canvas = canvas;
        }
    }

    class GoExecutor extends TurtleExecutor {

        public GoExecutor(TurtleCanvas canvas) {
            super(canvas);
        }

        @Override
        public void execute() throws ExecuteException {
            canvas.go(TurtleCanvas.UNIT_LENGTH);
        }
    }

    class DirectionExecutor extends TurtleExecutor {

        private int relativeDirection;

        public DirectionExecutor(TurtleCanvas canvas, int relateiveDirection) {
            super(canvas);
            this.relativeDirection = relateiveDirection;
        }

        @Override
        public void execute() throws ExecuteException {
            canvas.setRelativeDirection(relativeDirection);
        }
    }


}

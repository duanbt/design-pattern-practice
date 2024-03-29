import command.MacroCommand;
import drawer.DrawCanvas;
import drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author duanbt
 **/
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    /**
     * 绘制的历史记录
     */
    private MacroCommand history = new MacroCommand();

    /**
     * 绘制区域
     */
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private JButton clearButton = new JButton("clear");

    private JButton undoButton = new JButton("undo");

    public Main(String title){
        super(title);
        this.addWindowListener(this);
        this.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box((BoxLayout.X_AXIS));
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton){
            history.clear();
            canvas.repaint();
        }else if(e.getSource() == undoButton){
            history.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        DrawCommand cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}

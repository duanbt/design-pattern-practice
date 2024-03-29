import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 对话框，仲裁者
 *
 * @author duanbt
 * @version 1.0
 **/
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        //生成各个Colleague
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        //设置初始启用/禁用状态
        colleagueChanged();
        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    /**
     * 接收来自Colleague的通知然后判断各Colleague的启用/禁用状态
     */
    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else {
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }

    }

    private void userPassChanged() {
        if(textUser.getText().length() > 0){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length() > 0){
                buttonOk.setColleagueEnabled(true);
            }else {
                buttonOk.setColleagueEnabled(false);
            }
        }else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}

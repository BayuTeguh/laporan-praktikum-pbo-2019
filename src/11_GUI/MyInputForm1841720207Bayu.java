package hellogui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720207Bayu extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JPanel mPanel;

    public MyInputForm1841720207Bayu() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createTextField(){
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai B: ");
        mCLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }
    
    private void createButton(){
        mButton = new JButton("Tambahkan");
        class AddInterestListener1841720207Bayu implements ActionListener{
        
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                int c = a+b;
                mCLabel.setText("Hasil: "+c);
            }
        }
        ActionListener listener = new AddInterestListener1841720207Bayu();
        mButton.addActionListener(listener);
    }
    private void createPanel(){
            mPanel = new JPanel();
            mPanel.add(mALabel);
            mPanel.add(mAField);
            mPanel.add(mBLabel);
            mPanel.add(mBField);
            mPanel.add(mButton);
            mPanel.add(mCLabel);
            add(mPanel);
    }
}

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
public class Football extends JFrame
{
    int count = 0, count2 = 0;
    JButton button = new JButton("AC Milan ");
    JButton button2 = new JButton("Real Madrid");
    JLabel lbl = new JLabel("Result: 0 x 0");
    JLabel vs = new JLabel("VS");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: Draw");
    JPanel[] pnl = new JPanel[4];

    Football()
    {
        super("Футбол");

        // Получение размера экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        vs.setVerticalAlignment(JLabel.CENTER);
        vs.setHorizontalAlignment(JLabel.CENTER);

        // Создание 4 строк
        setLayout(new GridLayout(4,0));

        // Установка размеров формы
        setBounds((int)(width/2)-200,(int)(height/2) - 400,300,300);

        // Добавление панелей
        for (int i = 0; i<pnl.length; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
            pnl[i].setLayout(new FlowLayout());
        }

        // Добавление элементов на форму
        pnl[0].add(button);
        pnl[0].add(vs);
        pnl[0].add(button2);
        pnl[1].add(lbl,BorderLayout.CENTER);
        pnl[2].add(lbl2,BorderLayout.CENTER);
        pnl[3].add(lbl3,BorderLayout.CENTER);

        // События
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                count++;
                pnl[1].setBackground(new Color(0, 187, 51));
                lbl.setText("Result: " + count + " X " + count2 );
                lbl2.setText("Last Scorer: " + button.getText());
                if (count > count2) {
                    lbl3.setText("Winner: " + button.getText());
                }
                if (count2 > count)
                {
                    lbl3. setText("Winner: " + button.getText());
                }
                else if(count == count2)
                {
                    lbl3. setText("Winner: Draw");
                }
            }
        });

        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                count2++;
                pnl[1].setBackground(new Color(255, 0, 0));
                lbl.setText("Result: " + count + " X " + count2 );
                lbl2.setText("Last Scorer: " + button2.getText());
                if (count > count2) {
                    lbl3.setText("Winner: " + button2.getText());
                }
                if (count2 > count)
                {
                    lbl3. setText("Winner: " + button2.getText());
                }
                else if(count == count2)
                {
                    lbl3. setText("Winner: Draw");
                }
            }
        });


    }
    public static void main(String[] args)
    {
        new Football().setVisible(true);
    }
}

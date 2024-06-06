package quizapplication2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class quiztest extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit;

    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

   quiztest(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon2/quiz3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "How do you insert comments in python code?";
        questions[0][1] = "/* This is a comment*/";
        questions[0][2] = "#This is a comment";
        questions[0][3] = "//This is a comment";
        questions[0][4] = "#This is a comment#";

        questions[1][0] = "Which one is not a legal variable in python?";
        questions[1][1] = "-myvar";
        questions[1][2] = "my-var";
        questions[1][3] = "my_var";
        questions[1][4] = "Myvar";

        questions[2][0] = "What is the correct extension for python files?";
        questions[2][1] = ".py";
        questions[2][2] = ".pt";
        questions[2][3] = ".pyt";
        questions[2][4] = ".pyth";

        questions[3][0] = "What is the correct way to create a function in python?";
        questions[3][1] = "def myFunction():";
        questions[3][2] = "create myFunction():";
        questions[3][3] = "function myFunction():";
        questions[3][4] = "definition myfunction():";

        questions[4][0] = "What is the correct syntax to output the type of a variable or object in python?";;
        questions[4][1] = "print(typeof(x))";
        questions[4][2] = "print(type(x))";
        questions[4][3] = "print(typeOf(x))";
        questions[4][4] = "print(typeof x)";

        questions[5][0] = "How do you start writing a while loop in python?";
        questions[5][1] = "while x>y:";
        questions[5][2] = "while(x>y)";
        questions[5][3] = "while x>y{";
        questions[5][4] = " x>y while{";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "How do you start writing a for loop in python?";
        questions[7][1] = "for x in y:";
        questions[7][2] = "for x > y:";
        questions[7][3] = "for each x in y:";
        questions[7][4] = "for (x>Y):";

        questions[8][0] = "Which statement is used to stop a loop?";
        questions[8][1] = "break";
        questions[8][2] = "return";
        questions[8][3] = "exit";
        questions[8][4] = "stop";

        questions[9][0] = "Which method can be used to remove any whitespace from both the beginning and the end of a string?";
        questions[9][1] = "strip()";
        questions[9][2] = "ptrim()";
        questions[9][3] = "len()";
        questions[9][4] = "trim()";

        answers[0][1] = "#This is a comment";
        answers[1][1] = "my-var";
        answers[2][1] = ".py";
        answers[3][1] = "def myFunction():";
        answers[4][1] = "print(type(x))";
        answers[5][1] = "while x>y:";
        answers[6][1] = "import";
        answers[7][1] = "for x in y:";
        answers[8][1] = "break";
        answers[9][1] = "strip()";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        

        submit = new JButton("Submit");
        submit.setBounds(1100, 650, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score2(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score2(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new quiztest("User");
    }
}

package Exercise_1;


import javax.swing.*;
import java.security.SecureRandom;

public class Test {
        String que[] = new String[5];                           //array of questions
        String ans[] = {"b", "d", "b", "c", "a"};               //array of answers
        //String a[] = new String[5];
        int score = 0;


        public Test() {
            simulateQuestion();

        }


        public void simulateQuestion() {                        // questions
            this.que[0] = ("Q-1-Which one of the following symbols indicates a single line comment in Java application source code:\n" +
                    "(give answers like -> c )" +
                    "\n" +
                    "(a) #!\n" +
                    "(b) //\n" +
                    "(c) ##\n" +
                    "(d) ||\n");
            this.que[1] = ("Q-2-Which of the following components does a Java application need to have at least one of?\n" +
                    "(give answers like -> c )" +
                    "\n" +
                    "(a) Local variable\n" +
                    "(b) Non-static Method\n" +
                    "(c) Instance variable\n" +
                    "(d) Class\n");
            this.que[2] = ("Which of the following Java program units defines a group of related objects?\n" +
                    "(give answers like -> c )" +
                    "\n" +
                    "(a) Java\n" +
                    "(b) Java default constructor\n" +
                    "(c) Java method\n" +
                    "(d)Java Class\n");
            this.que[3] = ("What does an instance variable describe?\n" +
                    "(give answers like -> c )" +
                    "\n" +
                    "(a) Height of an object.\n" +
                    "(b) Measurement of an object\n" +
                    "(c) Properties of an object.\n" +
                    "(d) Behaviour of an object\n");
            this.que[4] = ("Class variables must be declared as___________.\n" +
                    "(give answers like -> c )" +
                    "\n" +
                    "(a) static\n" +
                    "(b) var\n" +
                    "(c) final\n" +
                    "(d) const\n");

        }


        public void checkAns(int queNum, String a) {                    //method to check answers

            if (ans[queNum].equals(a)) {                                //condition for right answers
                generateMessage();
                setScore();
            } else {                                                    //condition for wrong answers
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "wrong answer!!!!  \n right answer is " + ans[queNum]);
            }

        }


        public void setScore() {
            this.score++;
        }                      // method or set score


        public static void generateMessage() {                      //method to generate message
            SecureRandom random = new SecureRandom();
            JFrame f = new JFrame();
            int i = 1 + random.nextInt(4);                   //generate random number
            switch (i) {
                case 1:
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f, "right answer, congratulations!!");
                    break;
                case 2:
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f, "excellent work!!");
                    break;
                case 3:
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f, "hurray,perfect answer!!");
                    break;
                case 4:
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f, "good job, keep it up!!");
                    break;

            }

        }

        public void inputAns() {


            for (int i = 0; i < 5; i++) {                               // loop for ask questions
                String a = JOptionPane.showInputDialog(que[i]);
                //System.out.println(que[0]);
                checkAns(i, a);
            }

            int percentage = (score * 100) / 5;
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "* Your score is: " + score + " \n* Percentage is: " + percentage + "%");
        }
    }


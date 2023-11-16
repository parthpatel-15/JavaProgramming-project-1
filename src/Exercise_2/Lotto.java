package Exercise_2;
import java.security.SecureRandom;
import javax.swing.*;
public class Lotto {
    int[] a = new int[3];                          // create array
    int sum;
    int n= 5;
    public Lotto() {                               // constructor

        SecureRandom random = new SecureRandom();

        // add three numbers in array randomly
        for (int i = 0; i < 3; i++) {
            this.a[i] = 1 + random.nextInt(9);
        }
        System.out.println("["+a[0]+","+a[1]+","+a[2]+"]");     //show array before
        this.sum = a[1] + a[0] + a[2];
    }

    public void lottery(){
        // for loop to allow user 5 chances
        for (int i = n; i > 0; i--) {
            // joptionpane get input from user
            String input=input();
            boolean check=checkInput(input);

            if(!check){                     // if input is out of range it will start from beging

                lottery();
                break;
            }


            int num1 = Integer.parseInt(input);
            if (num1 == sum) {                        // condition for right guess
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"you win the game, congratulations");
                getArray();
                break;
            }

            else {                                    //condition for wrong guess
                JFrame f=new JFrame();
                int chance = i-1;
                JOptionPane.showMessageDialog(f,"Sorry,You have "+ chance + " chance left; keep going");

                System.out.println("sad"+i);
                if(chance ==0 ){
                    f = new JFrame();
                    JOptionPane.showMessageDialog(f," Computer wins ");
                    getArray();
                }
            }
        }

    }


    public String input(){                              //method to get input from user

        String input = JOptionPane.showInputDialog("------ LOTTERY TIME ------  \n" +
                " You have 5 chances in total; Good luck.\n"+
                " * Instruction: please choose number between 3 and 27." );

        return input;

    }


    public boolean checkInput(String input){    //method to is the input in the range
        try {                                       //try cath for error
            int num1 = Integer.parseInt(input);     // convert usernum from string to integer
            if (num1<3 || num1>27 ){
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"The number you have entered is out of range.\n" +
                        "lease enter number between 3 and 27:\n" +
                        "try again!");


                return false;
            }
            return true;
        }
        catch(Exception e){                         //try catch for error
            JFrame f=new JFrame();
            JOptionPane.showMessageDialog(f,"please enter number between 3 and 27:\n" +
                    "try again from beging");
            return false;

        }
    }


    public void getArray() {                                  // method to print random array
        JFrame f = new JFrame();
        sum=a[0]+a[1]+a[2];
        JOptionPane.showMessageDialog(f,"random array is : ["+a[0]+","+a[1]+","+a[2]+"] and sum is : "+sum );
        System.out.println("["+a[0]+","+a[1]+","+a[2]+"]");
    }

}

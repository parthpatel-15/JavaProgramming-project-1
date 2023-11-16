package Exercise_3;

public class Overloaded {
    public static int max(int a, int b)
    {  return Math.max(a,b);  }                                 //static method with 2 arguments

    public static int max(int a,int b,int c)
    { return Math.max(max(a,b),c);}                             //static method with 3 arguments

    public static int max(int a,int b,int c,int d)
    { return Math.max(max(a,b,c),d);}                           //static method with 4 arguments

    public static void main(String[] args) {

        System.out.println("biggest number from two numbers: "+max( +62, 18));

        System.out.println("biggest number from three numbers: "+max( 102, 118, 86));

        System.out.println("biggest number from four number: "+max( 231,123,435,64));

    }
}

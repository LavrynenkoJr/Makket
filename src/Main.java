import java.util.Random;

public class Main {




    static int x = 25;
    public static void main(String[] args) {

        Random r = new Random();

        int[][] a = new int[3][];

        a[0] = new int[3];
        a[1] = new int[] {1, 2};
        a[2] = new int[1];

        boolean b = true;

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }


        int min = 1;
        int max = 100;

        for (int i=0; i<26; i++){
            int k = r.nextInt((max)+ min);
            int n =r.nextInt((max) + min);
            if (k<n)
                System.out.println(k + " < " + n);
            else if(k>n)
                System.out.println(k + "  > " + n);
            else
                System.out.println(k + " = " + n);
        }

        //boolean b; break
        int q = 0;
        for(int i = 1; i<=1000; i++){
            for (int k =2; k<100; k++){
                q = i%k;
                if(q==0&&q!=i){
                    System.out.println(i);
                }
            }

        }
    }
}

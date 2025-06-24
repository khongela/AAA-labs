import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of random numbers to be generated");
        int numIntegers;
        Scanner myScanner = new Scanner(System.in);
        numIntegers = myScanner.nextInt();
        System.out.println("No order: " + randoms(numIntegers));
        System.out.println("Increasing: " + randomsASC(numIntegers));
        System.out.println("Decreasing: " + randomsDESC(numIntegers));
        }

    public static ArrayList<Integer> randoms(int n){
        ArrayList<Integer> randoms = new ArrayList<Integer>(n);
        for (int k = 0; k < n; k++){
            randoms.add((int)(Math.random() * 101));
        }
        return randoms;
    }

    public static ArrayList<Integer> randomsASC(int n){
        ArrayList<Integer> randoms = new ArrayList<Integer>(n);
        for (int k = 0; k < n; k++){
            randoms.add((int)(Math.random() * 101));
        }
        Collections.sort(randoms);
        return randoms;
    }


    public static ArrayList<Integer> randomsDESC(int n){
        ArrayList<Integer> randoms = new ArrayList<Integer>(n);
        for (int k = 0; k < n; k++){
            randoms.add((int)(Math.random() * 101));
        }
        Collections.sort(randoms, Collections.reverseOrder());
        return randoms;
    }
    }

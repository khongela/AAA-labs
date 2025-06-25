import java.util.*;
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
        int randomNo;
        for (int k = 0; k < n; k++){
            do {
                randomNo = (int) (Math.random() * 101);
            } while (randoms.contains(randomNo));
            randoms.add(randomNo);
        }
        return randoms;
    }

    public static ArrayList<Integer> randomsASC(int n){
        ArrayList<Integer> randoms = new ArrayList<Integer>(n);
        for (int k = 0; k < n; k++){
            int randomNo;
            do {
                randomNo = (int) (Math.random() * 101);
            } while (randoms.contains(randomNo));
            randoms.add(randomNo);
        }
        Collections.sort(randoms);
        return randoms;
    }


    public static ArrayList<Integer> randomsDESC(int n){
        ArrayList<Integer> randoms = new ArrayList<Integer>(n);
        for (int k = 0; k < n; k++){
            int randomNo;
            do {
                randomNo = (int) (Math.random() * 101);
            } while (randoms.contains(randomNo));
            randoms.add(randomNo);
        }
        randoms.sort(Collections.reverseOrder());
        return randoms;
    }
    }

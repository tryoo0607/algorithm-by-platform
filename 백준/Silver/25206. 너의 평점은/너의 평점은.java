import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = 20;

        float totalCredit = 0;
        float totalScore = 0;
        
        for(int i=0; i < n; i++) {
            String str = in.next();
            float credit = in.nextFloat();
            String grade = in.next();
           
            switch(grade) {
                case "P" :
                    break;
                case "A+" :
                    totalCredit += credit;
                    totalScore += credit * 4.5;
                    break;
                case "A0" :
                    totalCredit += credit;
                    totalScore += credit * 4.0;
                    break;
                case "B+" :
                    totalCredit += credit;
                    totalScore += credit * 3.5;
                    break;
                case "B0" :
                    totalCredit += credit;
                    totalScore += credit * 3.0;
                    break;
                case "C+" :
                    totalCredit += credit;
                    totalScore += credit * 2.5;
                    break;
                case "C0" :
                    totalCredit += credit;
                    totalScore += credit * 2.0;
                    break;
                case "D+" :
                    totalCredit += credit;
                    totalScore += credit * 1.5;
                    break;
                case "D0" :
                    totalCredit += credit;
                    totalScore += credit * 1.0;
                    break;
                case "F" :
                    totalCredit += credit;
                    break;
            }
        }
        
        System.out.printf("%.6f\n", totalScore / totalCredit);      
    }
}
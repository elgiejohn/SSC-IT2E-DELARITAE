
package delaritae;
import java.util.Scanner;

public class grade {
     public void getGrades(){
        Scanner sc = new Scanner(System.in);
        grades[] gr = new grades[100];
        
        System.out.print("Enter no. of students: ");
        int snum = sc.nextInt();
        
        for(int i = 0; i < snum; i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pre = sc.nextDouble();
            System.out.print("Midterm: ");
            double mid = sc.nextDouble();
            System.out.print("Prefi: ");
            double pref = sc.nextDouble();
            System.out.print("Final: ");
            double fin = sc.nextDouble();
            
            gr[i] = new grades();
            gr[i].addGrades(id, name, pre, mid, pref, fin);
        }
        
        double TCA = 0;
        int passed = 0;
        int failed = 0;
        
        for(int i = 0; i < snum; i++){
            gr[i].ave = (gr[i].p+gr[i].m+gr[i].pf+gr[i].f)/4;
            TCA = TCA + gr[i].ave;
            gr[i].getGrades();
            
            if(gr[i].ave > 3.0){
                passed++;
            } else{
                failed ++;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("No. of students: "+snum);
        System.out.println("Total Class Average: "+TCA/snum);
        System.out.println("No. of Passed: "+passed);
        System.out.println("No. of Failed: "+failed);
        
    }

    private static class Grades {

        public Grades() {
        }
    }
}

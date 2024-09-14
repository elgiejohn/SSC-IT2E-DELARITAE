
package delaritae;

public class Grades {
    
    int sid;
    String sname;
    double p, m, pf, f, ave;
    
    public void addGrades(int id, String name, double p, double m, double pf, double f){
        this.sid = id;
        this.sname = name;
        this.p = p;
        this.m = m;
        this.pf = pf;
        this.f = f;
    }
    
    public void viewGrades(){
        
        ave = (this.p+this.m+this.pf+this.f)/4;
        String remarks = (ave > 3.0) ? "failed" : "Passed";
                
        System.out.println(+this.sid+"   "+this.sname+"    "+this.p+"    "+this.m+"    "+this.pf+"   "+this.f+"    "+ave+"    "+remarks);
    }
}


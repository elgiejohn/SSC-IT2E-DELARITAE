package alcalajericho;

public class product {

    int id,price,stocks,sold;
    String name;
    
    
    public void addproduct(int pid, String pname,int pr,int sr,int teps){
        
        this.id=pid;
        this.name=pname;
        this.price=pr;
        this.stocks=sr;
        this.sold=sold;
    }
        public void viewproduct(){
            double total=this.price * this.stocks;
            String stats= (this.stocks == 0)?"out of stocks" : "Available";
            System.out.printf("%-10d %-10s %-10d %-10s %-20.2f/n",this.id,this.name,this.price,stats,total);
        
            
            
            
  
}


        


    
}

public class seniordev extends developers {
    int salary;
    seniordev(int id,String name,String l,int e,int s){
        super(id,name,l,e);
        this.salary=s;
    }
    seniordev(seniordev old){
        super(old);
        this.salary=old.salary;
    }
}

public class employee {
    int id;
    String name;
    employee(int id,String name){
        this.id=id;
        this.name=name;
    }
     employee(employee old){
        this.id=old.id;
        this.name=old.name;
    }
}

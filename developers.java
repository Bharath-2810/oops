public class developers extends employee{
    String language;
    int experience;
    developers(int id,String name,String l,int e){
        super(id,name);
        this.language=l;
        this.experience=e;
    }
      developers(developers old){
        super(old);
        this.language=old.language;
        this.experience=old.experience;
    }
}

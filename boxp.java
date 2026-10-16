public class boxp extends boxw {
    int price;
     boxp(int l,int h,int w,int w1,int p){
       super(l,h,w,w1);
        this.price=p;
    }
    boxp(boxp old){
        super(old);
        this.price=old.price;
    }
}

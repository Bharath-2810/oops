public class box {
    int l;
    int h;
    int w;
    // box(){
    //     this.l=6;
    //     this.h=0;
    //     this.w=4;
    // }
    //
    box(int l,int h,int w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

     box(box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
}

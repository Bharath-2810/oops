public class boxw extends box{
    int weight;
    boxw(int l,int h,int w,int w1){
          super(l,h,w);
          //change weight values from parent class box(weight)
        // //   super.weight=123;
        //   System.out.println(super.weight);
               this.weight =w1;
    }
    //}
//}
    boxw(boxw other){
        super(other);
        this.weight=other.weight;
    }
}

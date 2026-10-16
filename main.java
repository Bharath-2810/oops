public class main {
    public static void main(String[] args) {
        //object call the values should be intialized 
        // boxp box1 = new boxp(2,3,4,6,900);
        // boxp box2 =new boxp(box1);
        // // System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+box1.weight+" "+ box1.price);
        // System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight+" "+ box2.price);
        seniordev dev1 =new seniordev(101, "Bharath", "Java", 2, 60000);
        seniordev dev2= new seniordev(dev1);
        System.out.println(dev2.id);
        System.out.println(dev2.name);
        System.out.println(dev2.language);
        System.out.println(dev2.experience);
        System.out.println(dev2.salary);
    }
}

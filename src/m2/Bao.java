package m2;

public class Bao extends  Shape {
    public Color color;
    public  Bao(Color send){
        this.color = send;
    }
    public  void  rectangle(){
        System.out.println(color.getColor()+"长方形");
    }
    public  void  circle(){
        System.out.println(color.getColor()+"原形");
    }
}

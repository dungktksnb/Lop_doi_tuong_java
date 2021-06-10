public class Rectangle {
    private double with,height;

    public Rectangle() {
    }

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;

    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }
    public  double getPerimeter(){
        return (this.with +this.height)*2;
    }
    public  String display(){
        return "Rectangle{" +"width="+with +",height="+height+"}";
    }
    public  double getAcreage(){
        return (this.with*this.height);

    }

    public void setHeight(double height) {
        this.height = height;
    }
}

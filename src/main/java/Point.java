public class Point {

    public  double X;
    public double Y;





    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(p2.X - p1.X)*2 + (p2.Y - p1.Y)*2;
    }


}
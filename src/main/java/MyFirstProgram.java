public class MyFirstProgram {

    public static void main(String[] args) {

        hello(" world");
        hello(" User");
        hello(" Andrey");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со сторонами " + s.l + "="+ s.area());

        Rectsngle r = new Rectsngle(4, 6);


        System.out.println("Площадь прямоугольника со сторонами " + r.a +" и " + r.b + "=" + r.area());
    }
    public static void hello(String sombody){ //Создание функции

        System.out.println("Hello" + sombody + "!");
    }

    Point p1 = new Point(1, 2);
    Point p2 = new Point(4, 3);

    public static double distance(Point p1, Point p2){
        return Math.sqrt(p2.X - p1.X)*2 + (p2.Y - p1.Y)*2;
    }

}
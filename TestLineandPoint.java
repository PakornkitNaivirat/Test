import java.util.Scanner;

public class TestLineandPoint {
    public static void main(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Line l1 = new Line(p1,p2);
        System.out.println("Line A : " + l1.toString());
        System.out.print("Distance : ");
        System.out.printf("%.2f",l1.distance());
        System.out.println();

        p1.setLocation(2,2);
        System.out.println("Line A : " + l1.toString());
        System.out.print("Distance : ");
        System.out.printf("%.2f\n",l1.distance());


        Line lineB = new Line(2, 3, 2, 5);
        System.out.println("Line B : " + lineB.toString());
        System.out.print("Distance : ");
        System.out.printf("%.2f",lineB.distance());
        System.out.println("");



        int x,y;
        Scanner input = new Scanner(System.in);

        Line lineC = new Line();

        System.out.print("Input start point x and y : ");
        x = input.nextInt();
        y = input.nextInt();
        lineC.setStart(x,y);

        System.out.print("Input end point x and y : ");
        x = input.nextInt();
        y = input.nextInt();
        lineC.setEnd(x,y);

        System.out.println("Line C : " + lineC.toString());
        System.out.print("Distance : ");
        System.out.printf("%.2f",lineC.distance());
        System.out.println("");

        if(l1.distance() > lineB.distance() && l1.distance() > lineC.distance()){
            System.out.println("Longest line is lineA");
        }else if(lineB.distance() > lineC.distance()){
            System.out.println("Longest line is lineB");
        }else{
            System.out.println("Longest line is lineC");
        }
    }
}

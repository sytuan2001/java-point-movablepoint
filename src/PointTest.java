public class PointTest {
    public static void main(String[] args) {

        // Test Point
        Point p = new Point(2.5f, 3.5f);
        System.out.println(p);

        float[] xy = p.getXY();
        System.out.println("x = " + xy[0] + ", y = " + xy[1]);

        System.out.println("----------------------");

        // Test MovablePoint
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint before move:");
        System.out.println(mp);

        mp.move();
        System.out.println("MovablePoint after move:");
        System.out.println(mp);

        mp.move().move();// (1,2)(1.5,3.5)(
        System.out.println("MovablePoint after 2 more moves:");
        System.out.println(mp);
        mp.move().move().move();
        System.out.println(mp);
    }
}

package ball;

public class TestBall {
    public static void main(String[] args) {
        Ball red = new Ball(50.76,34.56);
        Ball blue = new Ball(80.43,99.99);
        red.move(45,30);
        System.out.println(red);
        blue.move(23,78);
        System.out.println(blue);
    }
}

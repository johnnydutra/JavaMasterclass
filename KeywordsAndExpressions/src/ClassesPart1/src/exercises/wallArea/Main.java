package exercises.wallArea;

public class Main {
    public static void main(String[] args) {

        Wall couchWall = new Wall();
        couchWall.setWidth(4.5);
        couchWall.setHeight(3);

        Wall windowWall = new Wall(3.25, 4);

        System.out.println("couchWall: " + couchWall.getWidth() +
                " in width by " + couchWall.getHeight() +
                " in height = " + couchWall.getArea() + " of total area");

        System.out.println("windowWall: " + windowWall.getWidth() +
                " in width by " + windowWall.getHeight() +
                " in height = " + windowWall.getArea() + " of total area");
    }
}

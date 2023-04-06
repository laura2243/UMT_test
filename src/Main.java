import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Point> pointList = new ArrayList<>();

        pointList.add(new Point(2, 1));
        pointList.add(new Point(1, 1));
        pointList.add(new Point(1, 3));
        pointList.add(new Point(3, 1));
        pointList.add(new Point(2, 3));
        pointList.add(new Point(3, 3));


        int counter = 0;

        while(!pointList.isEmpty()){
            Point point1 = pointList.get(0);
            for (int j = 1; j < pointList.size(); j++) {
                if (point1.getY() != pointList.get(j).getY() && point1.getX() != pointList.get(j).getX()) {

                    Point point2 = pointList.get(j);

                    if (pointList.contains(new Point(point1.getX(), point2.getY())) &&
                            pointList.contains(new Point(point2.getX(), point1.getY()))) {
                        counter++;

                    }

                }
            }
            pointList.remove(point1);

        }
        System.out.println(counter);
    }
}
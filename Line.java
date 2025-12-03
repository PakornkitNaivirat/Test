public class Line {
    Point start = new Point();
    Point end = new Point();

    public Line(){
        start = new Point(0,0);
        end = new Point(0,0);
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int xStart,int yStart,int xEnd,int yEnd){
        start = new Point(xStart,yStart);
        end = new Point(xEnd,yEnd);
    }

    public void setStart(int x , int y) {
        start = new Point(x,y);
    }

    public void setEnd(int x , int y) {
        end = new Point(x,y);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double distance(){
        return Math.sqrt(Math.pow(end.getX() - start.getX(),2) + Math.pow(end.getY() - start.getY(),2));
    }

    public String toString(){
        return "Line [Start=" + start.toString() +", end=" + end.toString();
    }
}

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    abstract void draw(Canvas canvas);

    abstract void move();

    public boolean intersects(BaseObject o) {
        double distX = x - o.x;
        double distY = y - o.y;
        double distance = Math.sqrt(distX * distX + distY * distY);
        double maxRad = Math.max(radius, o.radius);
        return distance <= maxRad;
    }
}

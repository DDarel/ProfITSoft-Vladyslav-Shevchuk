package org.example.Shapes;

public class Parallelepiped implements Shape {

    protected double parallelepiped_width_side;

    protected double parallelepiped_long_side;

    protected double parallelepiped_high_side;

    public Parallelepiped(double parallelepiped_width_side, double parallelepiped_long_side, double parallelepiped_high_side) {
        this.parallelepiped_width_side = parallelepiped_width_side;
        this.parallelepiped_long_side = parallelepiped_long_side;
        this.parallelepiped_high_side = parallelepiped_high_side;
    }

    @Override
    public double volume(){
        return parallelepiped_width_side*parallelepiped_long_side*parallelepiped_high_side;
    }

    @Override
    public String getName(){
        return "Parallelepiped";
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.volume() - shape.volume() < 0) {
            return -1;
        } else if (this.volume() - shape.volume() > 0) {
            return 1;
        } else return 0;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Shape)) {
            return false;
        }

        Shape c = (Shape) o;

        return Double.compare(this.volume(), c.volume()) == 0;
    }
}

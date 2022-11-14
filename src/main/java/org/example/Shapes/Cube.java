package org.example.Shapes;

public class Cube implements Shape {
    protected double cube_side;

    public Cube(double cube_side) {
        this.cube_side = cube_side;
    }

    @Override
    public double volume(){return cube_side*cube_side*cube_side;}

    @Override
    public String getName(){return "Cube";}

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

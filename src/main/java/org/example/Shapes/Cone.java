package org.example.Shapes;

public class Cone implements Shape {
    protected double cone_radius;

    protected double cone_high;

    public Cone(double cone_radius, double cone_high) {
        this.cone_radius = cone_radius;
        this.cone_high = cone_high;
    }

    @Override
    public double volume(){
        return Math.PI*cone_radius*cone_radius*cone_high/3;
    }

    @Override
    public String getName(){
        return "Cone";
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

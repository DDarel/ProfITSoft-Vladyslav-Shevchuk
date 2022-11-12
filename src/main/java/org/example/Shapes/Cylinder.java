package org.example.Shapes;

public class Cylinder implements Shapes{
    protected int cylinder_radius;
    protected int cylinder_high;

    public Cylinder(int cylinder_radius, int cylinder_high) {
        this.cylinder_radius = cylinder_radius;
        this.cylinder_high = cylinder_high;
    }

    @Override
    public double volume(){return Math.PI*cylinder_radius*cylinder_radius*cylinder_high;}

    @Override
    public String getName(){return "Cylinder";}

    @Override
    public int compareTo(Shapes shape) {
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

        if (!(o instanceof Shapes)) {
            return false;
        }

        Shapes c = (Shapes) o;

        return Double.compare(this.volume(), c.volume()) == 0;
    }
}

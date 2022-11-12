package org.example.Shapes;

public class Sphere implements Shapes {
    protected int sphere_radius;

    public Sphere(int sphere_radius) {
        this.sphere_radius = sphere_radius;
    }

    @Override
    public double volume() {
        return sphere_radius * sphere_radius * sphere_radius * 4 / 3 * Math.PI;
    }

    @Override
    public String getName() {
        return "Sphere";
    }

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
package org.example.Shapes;

public class Parallelepiped implements Shapes{
    protected int parallelepiped_width_side;
    protected int parallelepiped_long_side;
    protected int parallelepiped_high_side;

    public Parallelepiped(int parallelepiped_width_side, int parallelepiped_long_side, int parallelepiped_high_side) {
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

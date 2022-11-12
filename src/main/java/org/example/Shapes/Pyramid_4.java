package org.example.Shapes;

public class Pyramid_4 implements Shapes{
    protected int pyramid_4_side;
    protected int pyramid_4_high;

    public Pyramid_4(int pyramid_4_side, int pyramid_4_high) {
        this.pyramid_4_side = pyramid_4_side;
        this.pyramid_4_high = pyramid_4_high;
    }

    @Override
    public double volume(){
        return pyramid_4_side*pyramid_4_side*pyramid_4_high/3;
    }

    @Override
    public String getName(){
        return "Pyramid_4";
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

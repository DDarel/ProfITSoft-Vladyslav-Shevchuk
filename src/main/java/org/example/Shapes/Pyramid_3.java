package org.example.Shapes;

public class Pyramid_3 implements Shapes{
    protected int pyramid_3_side;
    protected int pyramid_3_high;

    public Pyramid_3(int pyramid_3_side, int pyramid_3_high) {
        this.pyramid_3_side = pyramid_3_side;
        this.pyramid_3_high = pyramid_3_high;
    }

    @Override
    public double volume(){
        return pyramid_3_side*pyramid_3_side*pyramid_3_high/(4*1.73205080757);
    }

    @Override
    public String getName(){
        return "Pyramid_3";
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

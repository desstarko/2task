/**
 * Created by Des on 29.05.2017.
 */
public class Quadr {
    private float   a,
                    b,
                    c;

    public Quadr(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadr quadr = (Quadr) o;

        if (Float.compare(quadr.a, a) != 0) return false;
        if (Float.compare(quadr.b, b) != 0) return false;
        return Float.compare(quadr.c, c) == 0;
    }

    @Override
    public int hashCode() {
        int result = (a != +0.0f ? Float.floatToIntBits(a) : 0);
        result = 31 * result + (b != +0.0f ? Float.floatToIntBits(b) : 0);
        result = 31 * result + (c != +0.0f ? Float.floatToIntBits(c) : 0);
        return result;
    }

    public float[] roots() throws QuaderExeption{
        float d = (float) Math.sqrt((getB() * getB()) - (4 * getA() * getC()));
        float[] result;
        if(d == 0){
            result = new float[1];
            result[0] = (-getB()) / (2*getA());
            return result;
        }
        if(d > 0){
            result = new float[2];
            result[0] = (-getB() + d) / (2*getA());
            result[1] = (-getB() - d) / (2*getA());
            return result;
        }
        throw new QuaderExeption("0<");
    }

}

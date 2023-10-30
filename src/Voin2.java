public class Voin2 {
    String k;
    String a;
    String i;
    String r;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getR() {
        return r;
    }

    @Override
    public String toString() {
        return  k + "\n"+
                a + "\n"+
                i + "\n"+
                r + "\n"
                ;
    }

    public void setR(String r) {
        this.r = r;
    }
}

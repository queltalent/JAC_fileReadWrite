package Assignment5_Part1;

public class Pair <T1,T2>{
    private T1 x;
    private T2 y;

    public Pair(T1 x,T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public T2 getY() {
        return y;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public void setY(T2 y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{x:" + x +", y:" + y + "}";
    }
}

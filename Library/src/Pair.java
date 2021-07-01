public class Pair <T, E>{
    private T genT;
    private E genE;

    public Pair(T genT,E genE){
        this.genT = genT;
        this.genE = genE;
    }
    public T getGenT() {
        return genT;
    }
    public E getGenE() {
        return genE;
    }
}

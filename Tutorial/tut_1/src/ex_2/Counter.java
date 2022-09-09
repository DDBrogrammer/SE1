package ex_2;

public class Counter {
    private int baseCounter;
    public Counter() {
        this.baseCounter = 0;
    }
    public int get(){
        return this.baseCounter;
    }
    public void incr(){
        this.baseCounter++;
    }
}

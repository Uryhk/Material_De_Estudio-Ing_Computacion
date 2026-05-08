package ec1.EJ1;
public class A {
    private static int k = 0;
    private int i;
    public A(int j){
        i = j;
    }
    public void m1(int i) {
        A aux = new A(0);
        aux.m2(i);
        k = k+i+1;
        System.out.println(this.i);
    }
    public void m2(int i) {
        this.i += i;
        i = i*2;
        k = k+i;}
}

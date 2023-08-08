public class Hesap {
    private int bakiye = 1000;

    public void paraCek(int paracek){
        bakiye -=paracek;

    }
    public void paraYatır(int paraYatır){
        bakiye += paraYatır;
    }
}

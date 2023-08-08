public class Hasta implements Comparable<Hasta> {
    private String hastaName;
    private String Sikayet;
    private int oncelik;

    @Override
    public String toString() {
        String bilgiler = "Hasta Adı :."+ hastaName
                +"\n Şikayet ::"+Sikayet+
                        "\nÖncelik "+oncelik;
        return bilgiler;
    }

    public Hasta(String hastaName, String Sikayet){

        this.hastaName = hastaName;

        this.Sikayet = Sikayet;

        if(Sikayet.equals("Apandisit")){
            this.oncelik = 3;
        }
        else if (Sikayet.equals("Yanık")){

            this.oncelik = 2;
        }
        else {
            this.oncelik = 1;
        }


    }


    @Override
    public int compareTo(Hasta o) {
       if (this.oncelik<o.oncelik){
           return 1;
       } else if (this.oncelik>o.oncelik) {
           return -1;
       }
       return 0;
    }
}

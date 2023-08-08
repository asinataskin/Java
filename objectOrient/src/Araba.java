public class Araba {

    private String renk ;
    private int kapılar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model){
        this.model = model;



    }
    public String getModel() {

        return this.model = model;
    }
    public void setRenk(String renk){

        this.renk = renk;



    }
    public void setKapılar(int kapılar){

       if (kapılar<0) {

           System.out.println("kapılar sıfırdan küçük olamaz");
       }

       else {

           this.kapılar = kapılar;
       }

    }
    public String getRenk(){

        return this.renk = renk;
    }


    public int getKapılar(){

        return this.kapılar = kapılar ;

    }

    public void setTekerlekler( int tekerlekler){

        this.tekerlekler = tekerlekler;
    }
    public int getTekerlekler (){

        return this.tekerlekler = tekerlekler;
    }








}

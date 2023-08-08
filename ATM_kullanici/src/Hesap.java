public class Hesap {
    private String isim = "Ahmet Köse";
    private String email;
    private String telNo;
    private double bakiye;
    private String hesapNo;

    private String parola = "1478963";

    public Hesap(){



    }

    public Hesap(String isim, String email, String hesapNo , String telNo, double bakiye) {


        this.isim = isim;
        this.email = email;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.telNo = telNo;





    }

    public void setBakiye( double bakiye){

        this.bakiye = bakiye;






    }

    public double getBakiye( ) {

        return bakiye;
    }

    public void paraYatırma(double yeniBakiye){

        yeniBakiye+= bakiye;

        System.out.println("Yeni bakiyeniz ::  "+ yeniBakiye);

    }
    public void paraCekme(double yeniBakiye){

        yeniBakiye -= bakiye;

        if (yeniBakiye == 0){

            System.out.println("Yeni bakiyeniz ::."+yeniBakiye);



        } else if (yeniBakiye<0) {
            System.out.println("Yeni olşan bakiyeniz :: "+yeniBakiye);

        }
        else {


            System.out.println("Yeni oluşan bakiyeniz ::: "+ yeniBakiye);
        }


    }

    public void setIsim(String isim){

        this.isim = isim;
    }
    public String getIsim(){

        return isim;
    }

    public void setEmail(String email){

        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setHesapNo(String hesapNo){

        this.hesapNo = hesapNo;
    }
    public String getHesapNo(){

        return hesapNo ;
    }
    public void setTelNo(String telNo){

        this.telNo = telNo;
    }
    public String getTelNo(){
        return telNo;
    }

    public void getParola(String parola){

        this.parola = parola;
    }

    public String getParola(){
        return parola;
    }




}

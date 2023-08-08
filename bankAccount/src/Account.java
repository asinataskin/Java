import javax.swing.*;

public class Account {


    private String hesapNo;
    private double bakiye;

    private String isim;
    private String email;
    private String telNO;

    public Account(){
       /* this.isim = "ramazan bağcı";
        this.email = "ramazanbagcı@gmail.com";
        this.bakiye = 0;
        this.telNO = "123456798";
        this.hesapNo = "Bilgi Yok";
        */
        this("bilig yok","bilgi yok","bilgi Yok",0,"Bilgi Yok");





    }
    public Account(String isim ,String email , String telNO,int bakiye,String hesapNo){
        this.isim = isim ;
        this.email = email;
        this.bakiye = bakiye;
        this.telNO = telNO;
        this.hesapNo = hesapNo;

    }
    public Account (String isim ,String email,String telNO){

        this.telNO = telNO;
        this.isim = isim;
        this.email = email;

    }
    public void bilgileriGoster(){

        System.out.println("Hesap No:  "+this.hesapNo);
        System.out.println("Müşterimizin ismi :: "+this.isim);
        System.out.println("Müşterinin Email :  "+this.email);
        System.out.println("Müüşterinin Bakiyesi :  "+this.bakiye);
        System.out.println("Müşterini Tel No:  "+this.telNO);




    }




    public void paraYatır(double x){
        double yeniBakiye;

        yeniBakiye = x+ this.getBakiye();

        System.out.println("Yeni oluşan banka bakiyesi::  "+yeniBakiye);

    }

    public void paraCekme(double x){

        if ((this.getBakiye())-(x) == 0){
            double yeniBakiye;

            yeniBakiye = this.getBakiye()-x;

            System.out.println("Hesabınızdaki para ::: "+yeniBakiye);


        }
        else if ((this.getBakiye()-(x)<0))
        {

            double yeniBakiye;
            yeniBakiye = this.getBakiye()-x;

            System.out.println("Hesabınızdaki para ::: "+ yeniBakiye);


        }
        else {

            double yeniBakiye;

            yeniBakiye = this.getBakiye()-x;

            System.out.println("Hesabınızdaki para ::: "+ yeniBakiye);

        }



    }


    public  void setHesapNo(String hesapNo){


        this.hesapNo = hesapNo;

    }

    public String getHesapNo(){

        return this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye){
        this.bakiye = bakiye;

    }

    public double getBakiye(){

        return this.bakiye = bakiye;
    }

    public void setEmail(String email ){
        this.email = email;
    }
    public String getEmail(){
        return this.email = email;
    }

    public void setTelNO(String telNO){
        this.telNO = telNO;
    }
    public String getTelNO (){
        return this.telNO = telNO;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return  this.isim = isim;
    }







}

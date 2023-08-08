public class idman {

    private int burpee_saysı;
    private int pushup_sayıs;
    private int squat_sayısı;

    private int situp_sayısı;

    public int getBurpee_saysı() {
        return burpee_saysı;
    }

    public void setBurpee_saysı(int burpee_saysı) {
        this.burpee_saysı = burpee_saysı;
    }

    public int getPushup_sayıs() {
        return pushup_sayıs;
    }

    public void setPushup_sayıs(int pushup_sayıs) {
        this.pushup_sayıs = pushup_sayıs;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public idman(int burpee_saysı, int pushup_sayıs, int squat_sayısı, int situp_sayısı) {
        this.burpee_saysı = burpee_saysı;
        this.pushup_sayıs = pushup_sayıs;
        this.squat_sayısı = squat_sayısı;
        this.situp_sayısı = situp_sayısı;


    }
        public void burpeeYap(int sayi){

            if (burpee_saysı == 0){

                System.out.println("Yapacak purpee kalmadı ...");
            } else if (burpee_saysı-sayi<0) {

                System.out.println("Hedeflediğin burpee sayını geçtin.Tebrikler ");
                burpee_saysı =0;
                System.out.println("Kalan burpee sayısı ::"+burpee_saysı);

            }
            else {
                burpee_saysı-=sayi;
                System.out.println("Kalan burpee sayısı :  "+burpee_saysı);

            }





        }
        public void pushupYap(int sayi2 ){


            if (pushup_sayıs == 0){

                System.out.println("Yapacak purpee kalmadı ...");
            } else if (pushup_sayıs-sayi2<0) {

                System.out.println("Hedeflediğin pushup sayını geçtin.Tebrikler ");
                pushup_sayıs =0;
                System.out.println("Kalan pushup sayısı ::"+pushup_sayıs);

            }
            else {
                pushup_sayıs-=sayi2;
                System.out.println("Kalan pushup sayısı :  "+pushup_sayıs);

            }





        }
        public void squatYap(int sayi3){

            if (squat_sayısı == 0){

                System.out.println("Yapacak squat kalmadı ...");
            }
            else if (squat_sayısı-sayi3<0) {

                System.out.println("Hedeflediğin squat sayını geçtin.Tebrikler ");
                squat_sayısı =0;
                System.out.println("Kalan squat sayısı ::"+squat_sayısı);

            }
            else {
                squat_sayısı-=sayi3;
                System.out.println("Kalan squat sayısı :  "+squat_sayısı);

            }





        }
        public void situpYap(int sayi4){

            if (situp_sayısı == 0){

                System.out.println("Yapacak situp kalmadı ...");
            }
            else if (situp_sayısı-sayi4<0) {

                System.out.println("Hedeflediğin situp sayını geçtin.Tebrikler ");
                situp_sayısı =0;
                System.out.println("Kalan situp sayısı ::"+situp_sayısı);

            }
            else {
                situp_sayısı-=sayi4;
                System.out.println("Kalan situp sayısı :  "+situp_sayısı);

            }





        }

    public void hareketYap(String hareketTuru, int sayı){
        if (hareketTuru.equals("Burpee")){

            burpeeYap(sayı);

        } else if (hareketTuru.equals("Pushup")) {

            pushupYap(sayı);

        }
        else if (hareketTuru.equals("Squat")) {

            squatYap(sayı);

        }
        else if (hareketTuru.equals("Situp")) {

            situpYap(sayı);

        }
        else {

            System.out.println("Geçersiz Hareket girdiniz ... ");
        }




    }
    public boolean idmanBittiMi(){

        return (burpee_saysı == 0) && (pushup_sayıs == 0) && (situp_sayısı == 0)&& (squat_sayısı == 0);
    }
}

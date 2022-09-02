package practice;

public class Soru3 {
    /*
               Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
            iri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
            rasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız

            rnek :

            nput : hour : 12,  minutes : 30
            utput: 165
                */
    public static void main(String[] args) {
        System.out.println(angleClock(12, 30));

    }

    public static double angleClock(int hour, int minute) {
        double ek = (double) minute / 12;
        double hourAngel = ((hour % 12) * 30) + (ek * 6);
        double newMinute = (double) minute / 5;
        double minuteAngel = newMinute * 30;
        double angel = Math.abs(hourAngel - minuteAngel); // mutlak değeri aldık
        if (angel > 180) return (360 - angel);
        else return angel;
    }


}

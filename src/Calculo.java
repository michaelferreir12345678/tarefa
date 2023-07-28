public class Calculo {

    public static void main (String args[]){

        Media media = new Media();
        media.setNota1(9.3);
        media.setNota2(8);
        media.setNota3(7);
        media.setNota4(9.83);

        double media1 = media.calculoMedia();

        System.out.println(media1);

    }
}

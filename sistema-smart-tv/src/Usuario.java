public class Usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual : " +smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual : " +smartTv.canal);

        
        System.out.println("volume atual :" +smartTv.volume);

        
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " +smartTv.volume);

        smartTv.ligar ();
        System.out.println("novo status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> Tv Ligada ? " + smartTv.ligada);



    }
}
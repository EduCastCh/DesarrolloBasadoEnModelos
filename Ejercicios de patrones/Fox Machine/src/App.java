public class App {
    public static void main(String[] args){
        Impresora impresora1 = new HP();
        impresora1 = new CincoDescuento(impresora1);
        System.out.println(impresora1.getDescription());
        
        Impresora impresora2 = new Lainner();
        impresora2 = new NingunDescuento(impresora2);
        System.out.println(impresora2.getDescription());

        Impresora impresora3 = new Samgsung();
        impresora3 = new SocioFrecuente(impresora3);
        System.out.println(impresora3.getDescription());

        Impresora impresora4 = new HP();
        impresora4 = new    ReducirPrecio(impresora4);
        System.out.println(impresora4.getDescription());
    }
}
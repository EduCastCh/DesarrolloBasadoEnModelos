public class CincoDescuento extends Impresora{

    Impresora impresora;

    public CincoDescuento(Impresora impresora){
        this.impresora = impresora;
    }

    public String getDescription(){
        return impresora.getDescription() + ", Usted tiene el 5% de descuento";
    }

}
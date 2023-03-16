public class NingunDescuento extends Impresora {

    Impresora impresora;

    public NingunDescuento(Impresora impresora){
        this.impresora = impresora;
    }

    public String getDescription(){
        return impresora.getDescription() + ", Usted no cuenta con ningun descuento";
    }
}

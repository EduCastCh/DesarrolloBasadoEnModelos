public class SocioFrecuente extends DiscountBehavior {
    Impresora impresora;

    public SocioFrecuente(Impresora impresora){
        this.impresora = impresora;
    }

    public String getDescription(){
        return impresora.getDescription() + ", Usted cuenta con descuento de socio frecuente";
    }
}
public class ReducirPrecio extends DiscountBehavior{
 
    Impresora impresora;

    public ReducirPrecio(Impresora impresora){
        this.impresora = impresora;
    }

    public String getDescription(){
        return impresora.getDescription() + ", Usted cuenta con una reducción de descuento";
    }
}
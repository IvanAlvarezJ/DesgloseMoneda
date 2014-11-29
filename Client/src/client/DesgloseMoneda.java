package client;

public class DesgloseMoneda {
     private int cantDinero;
     private String tipoMoneda;



    public DesgloseMoneda(int cantDinero, String tipoMoneda) {
        this.cantDinero = cantDinero;
        this.tipoMoneda = tipoMoneda;
    
    }

   

    public String desglose(){
       
    }
    
    public String toString(){
        String hilera= " La cantidad de dienero es: " +
            "\n"+this.cantDinero+" "+this.tipoMoneda+"\n"
            +this.desglose();
        return hilera;
    }

    public void setCantDinero(int cantDinero) {
        this.cantDinero = cantDinero;
    }

    public int getCantDinero() {
        return cantDinero;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }
   
    }

   

  


package Simuladorcontadormanual;

public class ClassContadorManual {
  private int valor;
    
    public ClassContadorManual() {
        valor = 0;
    }
    
    public void contar() {
        valor = valor + 1;
    }
    
    public int getConteoActual() {
        return valor;
    }
    
    public void reiniciarConteo() {
        valor = 0;
    }  
}

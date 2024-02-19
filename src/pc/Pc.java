
package pc;

public class Pc {

 public static void main(String[] args) {
 
        DispositivoEntrada mouse = new Mouse();
        mouse.clicar();

        TecladoVirtual adaptadorTeclado = new AdaptadorMouseParaTeclado(mouse);
        adaptadorTeclado.pressionarTecla('V');
    }
}
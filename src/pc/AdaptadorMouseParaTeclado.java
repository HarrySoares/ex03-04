package pc;

public class AdaptadorMouseParaTeclado implements TecladoVirtual {
    private final DispositivoEntrada mouse;

    public AdaptadorMouseParaTeclado(DispositivoEntrada mouse) {
        this.mouse = mouse;
    }

    @Override
    public void pressionarTecla(char tecla) {
        System.out.println("Evento de clique do mouse convertido para pressionamento da tecla: " + tecla);
        mouse.clicar(); 
    }
}
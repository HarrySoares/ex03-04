package pc;

public class Mouse implements DispositivoEntrada {
    @Override
    public void clicar() {
        System.out.println("Clique do Mouse");
    }
}
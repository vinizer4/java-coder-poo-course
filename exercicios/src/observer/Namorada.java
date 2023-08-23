package observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("E... surpresa!!!");
    }
}

package ejercicio1;

public class Init {
    public static void main(String... args) {
        new OperaObjetosVoladores().despegarTodos(
                new Avion(),
                new Avion(),
                new Helicoptero(),
                new Avion(),
                new Avion(),
                new Piedrazo(),
                new Helicoptero(),
                new Ovni(),
                new Piedrazo(),
                new Ovni()
        );
    }
}

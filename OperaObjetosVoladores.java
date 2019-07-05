package ejercicio1;

public class OperaObjetosVoladores {
    public void despegarTodos(ObjetoVolador... arrOV) {
        for (ObjetoVolador ov : arrOV) {
            ov.despegar();
        }
    }
}

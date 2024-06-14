public class App {
    public static void main(String[] args) {
        IPhone i7 = new IPhone(999888757);
        i7.setLigado(true);
        i7.selecionarMusica("wanna be");

        System.out.println(i7.toString());
    }
}

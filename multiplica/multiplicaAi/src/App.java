public class App {
    public static void main(String[] args) throws Exception {
        int number = 8;

        System.out.println("Tabela de multiplicação de " + number);

        for(int i = 0; i<11; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

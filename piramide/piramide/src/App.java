public class App {
    public static void main(String[] args) throws Exception {
        int numberInitial = 1;
        int numberFinal = 5;

        for(int i = numberInitial; i<= numberFinal; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

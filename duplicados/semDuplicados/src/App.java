import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"a", "b", "c"};
        String[] array2 = new String[]{"a", "d", "e"};

        List<String> elementosEmComum = new ArrayList<>();

        for(int i = 0; i< array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].equals(array2[j])){
                    elementosEmComum.add(array1[i]);
                }
            }
        }
        System.out.println("Elementos em comum: " + elementosEmComum);
    }
}

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            final String projectDir = System.getProperty("user.dir") + "/" + "input.txt";
            FileReader fstream = new FileReader(projectDir);
            BufferedReader br = new BufferedReader(fstream);
            String line;
            int s = 0;
            ArrayList<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            int[] a = new int[Integer.parseInt(list.get(0))];
            line = list.get(1);
            String[] numb = line.split(" ");
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(numb[i]);
            }
            for (int iter : a) {
                int temp = 0;
                for (int n = 0; n < a.length; n++) {
                    if (iter == a[n]) {
                        temp++;
                        if (temp > 1) a[n] = 0;
                    }
                }
            }
            for (int sum : a) {
                s += sum;
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package n11718_그대로출력하기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ( (str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

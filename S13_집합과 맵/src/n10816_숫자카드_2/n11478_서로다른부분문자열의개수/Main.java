package n10816_숫자카드_2.n11478_서로다른부분문자열의개수;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = new Scanner(System.in).next();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}

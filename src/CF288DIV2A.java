import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//uses set to store the distinct colors
public class CF288DIV2A {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> bootset=new HashSet<Integer>();

        for (String s:in.readLine().split(" ")){
            bootset.add(Integer.parseInt(s));
        }

        System.out.println(4-bootset.size());
    }
}

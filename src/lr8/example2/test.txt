import java.io.*;

public  class Solution1327 {
    public static void main(String[] args) throws IOException {
       new Solution1327().run();}

    StreamTokenizer input;
    PrintWriter output;

    void run() throws IOException {
        input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        output = new PrintWriter(System.out);
        solve();
        output.flush();}

    int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;}

    void solve() throws IOException {
            int A = nextInt();
            int B = nextInt();
            int amount_fuses = 0;
            if (A % 2 == 1 && B % 2 == 1) {
                amount_fuses = ((B - A)/2) + 1;
            } else if (A % 2 == 0 && B % 2 == 0) {
                amount_fuses = ((B-A)/2);
            } else if (A % 2 != B % 2) {
                amount_fuses = (B - A + 1)/2;
            }
            output.print(amount_fuses);
            output.print("\n");}}
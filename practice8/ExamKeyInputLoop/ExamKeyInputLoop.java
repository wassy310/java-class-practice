import java.io.*;

class ExamKeyInputLoop {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        for(;;) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(">");
                String s = br.readLine();
                if(s.equals("bye")) {
                    System.out.println("バイバイ");
                    break;
                }
                System.out.println("入力文字列 = " + s);
            }
            catch(IOException e) {
                System.out.println(e);
            }
        }
    }
}
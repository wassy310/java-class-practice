import java.io.*;

class ExamFileCopy {
    public static void main(String[] args) throws IOException {
        System.out.println("Programmed by Ryoga Washizawa.");

        if(args.length < 2) {
            if(args.length < 1) {
                System.out.println("入力ファイル名と出力ファイル名が必要です");
            } else {
                System.out.println("出力ファイル名が必要です");
            }
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));

        while(true) {
            String s = br.readLine();
            if(s == null)
            break;
            pw.println(s);
        }
        br.close();
        pw.close();
    }
}
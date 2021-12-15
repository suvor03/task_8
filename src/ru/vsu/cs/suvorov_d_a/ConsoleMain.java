package ru.vsu.cs.suvorov_d_a;

import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;
import java.io.PrintStream;

public class ConsoleMain {
    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            if (args.length < 1) {
                params.help = true;
                params.error = true;
                return params;
            }
            params.inputFile = args[0];
            if (args.length > 1) {
                params.outputFile = args[1];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) throws Exception {
        ConsoleMain.CmdParams params = parseArgs(args);
        RotateMatrix rotate = new RotateMatrix();
        if (params.help) {
            PrintStream out = params.error ? System.err : System.out;
            out.println("Usage:");
            out.println("  <cmd> args <input-file> (<output-file>)");
            out.println("  <cmd> --help");
            out.println("  <cmd> --window  // show window");
            System.exit(params.error ? 1 : 0);
        }

        if (params.window) {
            GUIMain.winMain();
        } else {
            int[][] arr2 = ArrayUtils.readIntArray2FromFile(params.inputFile);
            if (arr2 == null) {
                System.err.printf("Can't read array from \"%s\"%n", params.inputFile);
                System.exit(2);
            }

            int[][] rotatedArr2 = rotate.rotateMatrixOnNinetyDegrees(arr2);

            PrintStream out = (params.outputFile != null) ? new PrintStream(params.outputFile) : System.out;
            out.println(ArrayUtils.toString(rotatedArr2));
            out.close();
        }
    }
}
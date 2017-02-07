import pomdp_analyser.AdvParser;
import pomdp_analyser.Strategy;

import java.io.File;

public class main {

    public static void main (String[] args) {
        if (args.length > 0) {
            for (String arg : args) {

                String file = new File("").getAbsolutePath() + "/" + args[0];
                Strategy s = AdvParser.parse(file);

                if (arg.equals("-g")) {
                    System.out.println(s.getGraph());
                } else if (arg.equals("-t")) {
                    System.out.println(s.toString());
                } else if (arg.equals("-h") || arg.equals("-help")) {
                    System.out.println("java main.java <file.adv>");
                    System.out.println("-g returns graph");
                    System.out.println("-t returns text");
                }

            }
        } else {
            System.out.println("java main <filename>");
        }
    }
}
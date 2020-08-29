
package src.main.java.sum_machine;
import java.util.HashMap;
import java.util.Scanner;

import src.main.java.sum_machine.App;

class Main {
    public static void main(String[] args) {


        Input input = new Input() {
            private Scanner scanner = new Scanner(System.in);

            @Override
            public String next() {
                String token = this.scanner.next();

                return token;
            }

            @Override
            public int nextInt() {


                int number = this.scanner.nextInt();
                return number;
            }
        };


        Output output = new Output() {

            @Override
            public void output(String message) {
                System.out.print(message);
            }

            @Override
            public void outFormat(String pattern, Object... args) {
                System.out.printf(pattern, args);
            }
        };

        App application = new App(input, output);

        application.run();
    }
}



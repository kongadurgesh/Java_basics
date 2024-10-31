package apis;

import java.util.List;
import java.util.Scanner;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

public class JShellAPIDemo {
    public static void main(String[] args) {
        JShell jShell = JShell.create();
        String inputString = "";
        try (Scanner inp = new Scanner(System.in)) {
            while (true) {
                inputString = inp.nextLine();
                if(inputString.equals("EXIT")){
                    break;
                }
                List<SnippetEvent> events = jShell.eval(inputString);
                events.stream().forEach(event->{
                    System.out.println("Result: "+event.value());
                });
            }
        }
        jShell.close();
    }
}

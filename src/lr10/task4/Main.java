package src.lr10.task4;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try {
            NewsParser paper = new NewsParser();
            paper.print_news();
            paper.save_news();
        } catch (UnknownHostException e){
            System.out.println("Не возможно открыть сайт!");
        } catch (IOException e){
            System.out.println(e);
        }
    }
}

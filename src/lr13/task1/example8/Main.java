package src.lr13.task1.example8;

public class Main {

        public static void main(String[] args) {
            try{
                System.out.println(m());}
            catch (RuntimeException e){
                System.out.println("2");
            }}

        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
            System.out.println("1");}
    }}

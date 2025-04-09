package src.lr12.task5;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размер массива для поиска минимального числа.");
    int[] big_array = getArray(input.nextInt());
    int minValue;
    if(big_array.length < 10){
        System.out.println("Массив не достаточной длины, для запуска потоков");
        minValue = Arrays.stream(big_array).min().orElseThrow();
        System.out.println("Минимальное значение массива: " +  minValue);
        return;
    }
    System.out.println("Поиск минимального значения с помощью потоков!");
    try {
          minValue = findMinimalValue(big_array);
          System.out.println("Минимальное значение массива: " +  minValue);
    } catch (Exception e){
        e.printStackTrace();}}

  private static int[] getArray(int N){
    int[] result = new int[N];
    Random r = new Random();
    for(int i=0; i<N; i++){
      result[i] = r.nextInt(1,10000);}
    return result;}

  public static int findMinimalValue(int[] big_array) throws InterruptedException {
      int cpus_count = getCpusCount();
      int offset = big_array.length / cpus_count;
      int remainder = big_array.length % cpus_count;

      List<Thread> threads = new ArrayList<>();
      List<Result> results = new ArrayList<>();

      for(int i=0; i< cpus_count; i++){
          results.add(new Result());}

      for(int i=0; i<cpus_count; i++){
          int diff = remainder > 0 ? 1 : 0;
          int[] chunk = Arrays.copyOfRange(big_array,
              i*offset,
              (i+1)*offset + diff);
          threads.add(new Thread(new MinFinder(chunk, results.get(i))));
          remainder--;}

    for(Thread thread: threads){
        thread.start();}

    for(Thread thread: threads){
        thread.join();}

    Result result =  results.stream()
                             .min(Comparator.comparingInt(Result::getMinValue))
                             .orElseThrow();
    return result.minValue;
    }

  private static int getCpusCount(){
      return Runtime.getRuntime().availableProcessors();}
}


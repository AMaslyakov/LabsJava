package src.lr12.task6;

import java.util.*;

public class Main {

  private static long[] getArray(int N){
    long[] result = new long[N];
    for(int i=0; i<N; i++){
       result[i] = i+1;}
    return result;}


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размер массива для поиска минимального числа.");
    long[] big_array = getArray(input.nextInt());
    long sumValue;
    if(big_array.length < 10){
        System.out.println("Массив не достаточной длины, для запуска потоков");
        sumValue = Arrays.stream(big_array).min().orElseThrow();
        System.out.println("Сумма элементов массива: " +  sumValue);
        return;
    }
    System.out.println("Сложение элементов массива с помощью потоков!");
    try {
          sumValue =calculateSum(big_array);
          System.out.println("Cумма элементов массива: " +  sumValue);
    } catch (Exception e){
        e.printStackTrace();

  }}

  public static long calculateSum(long[] big_array) throws InterruptedException {
    int cpus_num = getCpusCount();

    int offset = big_array.length / cpus_num;
    int reminder = big_array.length % cpus_num;

    List<Thread> threads = new ArrayList<>();
    List<Result> results = new ArrayList<>();

    for(int i=0; i< cpus_num; i++){
      results.add(new Result());}

    for(int i=0; i<cpus_num; i++){
      int diff = reminder > 0 ? 1 : 0;
      long[] chunk = Arrays.copyOfRange(big_array,
              i*offset,
              (i+1)*offset + diff);
      threads.add(new Thread(new Summator(chunk, results.get(i))));
      reminder--;}

    for(Thread thread: threads){
      thread.start();}

    for(Thread thread: threads){
      thread.join();}

      return results.stream()
              .map(Result::toInt)
              .reduce(Long::sum)
              .orElseThrow();}

    private static int getCpusCount(){
      return Runtime.getRuntime().availableProcessors();}
}


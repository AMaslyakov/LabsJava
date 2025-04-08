package src.lr12.task5;

import java.util.*;

public class Main {

  private static int[] getArray(int N){
    int[] result = new int[N];
    Random r = new Random();
    for(int i=0; i<N; i++){
       result[i] = r.nextInt(1,10000);
    }
    return result;
  }


  public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размер массива для поиска минимального числа.");
    int[] big_array = getArray(input.nextInt());

  int cpus_num = defCpusNum();



  int MIN_LENGTH_ON_CORE = 4*cpus_num;

  if(big_array.length < MIN_LENGTH_ON_CORE){
     System.out.println("Минимальное значение массива: ");
     System.out.println(Arrays.stream(big_array).min());
  }else{

    int offset = big_array.length % cpus_num == cpus_num - 1  ?
                 (big_array.length / cpus_num)+1 :
                 big_array.length/cpus_num;

    List<Thread> threads = new ArrayList<>();
    List<Result> results = new ArrayList<>();

    for(int i=0; i< cpus_num; i++){
      results.add(new Result());
    }

    for(int i=0; i<cpus_num; i++){
      int[] chunk = Arrays.copyOfRange(big_array,
              i*offset,
              i < cpus_num - 1 ? (i+1)*offset : big_array.length);
      threads.add(new Thread(new MinFinder(chunk, results.get(i))));
    }

    for(Thread thread: threads){
      thread.start();
    }

    for(Thread thread: threads){
      thread.join();
    }

    Result MINIMAL =  results.stream().min(Comparator.comparingInt(Result::getMinValue)).orElseThrow();
    System.out.println("Минимальное значение массива: " +  MINIMAL.minValue);
    }
  }

    private static int defCpusNum(){
      return Runtime.getRuntime().availableProcessors();
    }
}


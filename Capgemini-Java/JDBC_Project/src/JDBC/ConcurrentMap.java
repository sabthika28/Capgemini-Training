package JDBC;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
	 public static void main(String[] args) {
	        List<String> sentences = Arrays.asList(
	            "hello world",
	            "hello",
	            "world of concurrency",
	            "concurrency in java"
	        );

	        ConcurrentHashMap<String, Integer> wordFreq = new ConcurrentHashMap<>();

	        sentences.parallelStream()
	            .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
	            .forEach(word -> 
	                wordFreq.merge(word, 1, Integer::sum)  
	            );

	        wordFreq.forEach((word, count) -> 
	            System.out.println(word + " -> " + count)
	        );
	    }

}

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan metin alıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metninizi Giriniz: ");
        String words = scanner.nextLine();

        // Metni kelimelere ayırıp bir diziye yerleştiriyoruz.
        String[] splitWords = words.split(" ");

        // Kelimeleri oluşturduğumuz bir HashMap'te tutuyoruz.
        HashMap<String, Integer> countWords = new HashMap<>();

        // Kelimeleri tek tek dolaşıyoruz ve sayıları güncelliyoruz.
        for (String wordsAll : splitWords) {
            wordsAll.toLowerCase(); // büyük küçük harf duyarlılığını ortadan kaldırıyoruz.
            if (countWords.containsKey(wordsAll)) {
                int number = countWords.get(wordsAll);
                countWords.put(wordsAll, number + 1);
            } else {
                countWords.put(wordsAll, 1);
            }
        }

        // En çok geçen kelimeyi buluyoruz.
        String mostCommonWord = null;
        int mostCommonWordCount = 0;

        for (String wordsAll : countWords.keySet()) {
            int number = countWords.get(wordsAll);
            if (number > mostCommonWordCount) {
                mostCommonWord = wordsAll;
                mostCommonWordCount = number;
            }
        }
        System.out.println("En çok geçen kelime: " + mostCommonWord);
        System.out.println("Bu kelime " + mostCommonWordCount + " kez geçmiştir.");
    }
}

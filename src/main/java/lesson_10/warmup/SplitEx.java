package main.java.lesson_10.warmup;

public class SplitEx {
    public static void main(String[] args) {

        String word = "Əziz məktəb tapşırığı olaraq bir inşa yazmalıdır. Son tarix yaxındır, lakin Əziz hələ bir şey yazmayıb. Amma o bilir ki, dostu Barış keçən il eyni tapşırığı yerinə yetirib və beləcə Əziz onun inşasını köçürmək qərarına gəlir. Əziz bunun plagiat sistemi tərəfindən aşkar edilməsini istəmir. Buna görə də o, qərara alır ki, Barışın inşasındakı hər bir cümlənin sözlərini tərs sırada yazsın. Bunu etdikdə Əziz hər bir cümlə üçün öz cümləsi ilə orijinal cümlə arasındakı fərqi hesablayır.";

        String[] arr = word.split(" ");

        for (String word2 : arr) {
            System.out.println(word2);
        }
    }
}

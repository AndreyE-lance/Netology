package task452;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static Set<Candidate> candidates;

    public static void main(String[] args) {
        Comparator<Candidate> compareByRatingAndRelevance = Comparator
                .comparing(Candidate::getRelevance)
                .thenComparing(Candidate::getRating);
        candidates = new TreeSet<>(compareByRatingAndRelevance);
        addCandidates();
        candidates.forEach(k-> System.out.println(k.toString()));
    }

    private static void addCandidates(){
        candidates.add(new Candidate("Терин Иван Иванович","м","35",4,5));
        candidates.add(new Candidate("Рыкова Ольга Сергеевна","ж","22",3,3));
        candidates.add(new Candidate("Ильина Елена Петровна","ж","26",5,4));
        candidates.add(new Candidate("Русских Игорь Петрович","м","32",5,5));
        candidates.add(new Candidate("Платов Василий Алибабаевич","м","18",1,1));
        candidates.add(new Candidate("Енина Ольга Васильевна","ж","24",4,3));
        candidates.add(new Candidate("Майер Алексей Петрович","м","34",5,3));
        candidates.add(new Candidate("Ведров Валерий Михайлович","м","18",4,2));
        candidates.add(new Candidate("Иванов Азат Вазитович","м","29",4,1));
        candidates.add(new Candidate("Олегов Олег Олегович","м","39",5,4));//не добавляет
    }
}

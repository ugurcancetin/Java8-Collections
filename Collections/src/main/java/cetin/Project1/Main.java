package cetin.Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> l = new ArrayList<>(theatre.seats);
        Collections.shuffle(l);
        l.forEach((i) -> System.out.println(i.getSeatNumber()));
        sortList(l);
        l.forEach((i) -> System.out.println(i.getSeatNumber()));

    }

    private static void sortList(List<? extends Theatre.Seat> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i , j);
                }
            }
        }
    }
}

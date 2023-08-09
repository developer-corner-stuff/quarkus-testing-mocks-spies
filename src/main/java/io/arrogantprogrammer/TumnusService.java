package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class TumnusService {

    static final List<String> quotes = new ArrayList<>(){{
        add("If only I had worked harder at geography when I was a little faun, I should no doubt know all about those strange countries. It is too late now.");
        add("Meanwhile, it is winter in Narnia, and has been for ever so long, and we shall both catch cold if we stand here talking in the snow. Daughter of Eve from the far land of Spare Oom where eternal summer reigns around the bright city of War Drobe, how would it be if you came and had tea with me?");
        add("Always winter but never Christmas.");
    }};

    public String quote() {
        return quotes.get(new Random().nextInt(0, 3));
    }
}

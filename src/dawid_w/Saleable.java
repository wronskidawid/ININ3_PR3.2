package dawid_w;

import dawid_w.creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}

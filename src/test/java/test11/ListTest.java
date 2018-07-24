package test11;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    private List liste = new ArrayList();

    public void add(String araba){
        liste.add(araba);
    }

    public void remove(String araba){
        liste.remove(araba);
    }
    public int size(){
        return liste.size();
    }

    public void removeAll(){
        liste.clear();
    }

    @Override
    public String toString() {
        return "ListTest{" +
                "liste=" + liste +
                '}';
    }
}

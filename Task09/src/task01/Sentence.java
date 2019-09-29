package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> value;

    public Sentence(List<Word> value) {
        this.value = value;
    }

    public Sentence(Word...word) {
        this.value = new ArrayList<Word>();
        for(Word w: word){
            this.value.add(w);
        }
    }

    public Sentence() {
        this.value = new ArrayList<>();
    }

    public List<Word> getValue() {
        return value;
    }

    public void setValue(List<Word> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(value, sentence.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        String sentence = "";
        for(int i = 0; i < value.size() - 1; i++){
            sentence += value.get(i) + " ";
        }
        sentence += value.get(value.size()-1) + ". ";
        return sentence;
    }
}

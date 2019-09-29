package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private String title;
    private List<Sentence> value;

    public Text(String title, List<Sentence> value) {
        this.title = title;
        this.value = value;
    }

    public Text(String title, Sentence...sentences) {
        this.title = title;
        this.value = new ArrayList<Sentence>();
        for(Sentence s: sentences){
            this.value.add(s);
        }
    }

    public Text(String title) {
        this.title = title;
        this.value = new ArrayList<>();
    }

    public void add(Sentence...sentences){
        for(Sentence s: sentences){
            this.value.add(s);
        }

    }

    public List<Sentence> getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(List<Sentence> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(value, text.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        String text = "\t" + title + "\n";
        for(int i = 0; i < value.size() - 1; i++){
            text += value.get(i) + " ";
        }
        text += value.get(value.size()-1);

        return text;
    }
}
package app.model;

import java.util.Objects;

public class Symbol {
    private boolean view;
    private char character;

    Symbol(char character){
        this.character=character;
        this.view=false;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol = (Symbol) o;
        return character == symbol.character;
    }

    @Override
    public int hashCode() {
        return Objects.hash(character);
    }

    @Override
    public String toString() {
        if(view){
            return character+" ";
        }
        else return "-";
    }
}
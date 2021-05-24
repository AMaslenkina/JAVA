package by.gsu.pms;

import java.util.List;

public class Word{

    public boolean startsWithVowel() {
        List<LexicalElement> word = getListOfElements();
        return word.size() != 0 &&
            vowel_letter.matches(((Symbol) word.get(0)).getSymbol());
    }

    public Symbol getFirstConsonant() {
        for (LexicalElement symbol : getListOfElements()) {
            Symbol result = (Symbol) symbol;
            if (consonant_letter.matches(result.getSymbol())) {
                return result;
            }
        }
        return Symbol.createSymbol('z');
    }

    public void parse(Symbol symbol){
        add(symbol);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        getListOfElements().forEach(
                (elem) -> result.append(elem.toString())

        );
        return result.toString();
    }
}
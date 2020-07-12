/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author IM
 */
public class Word {
    private String Word;
    private char Letter;
    private boolean CorrectLetter;
    private boolean CompleteWord;
    
        public Word(){
            Word = "";
            Letter = ' ';
            CorrectLetter = false;
            CompleteWord = false;
        }

    public char getLetter() {
        return Letter;
    }

    public String getWord() {
        return Word;
    }

    public void setCompleteWord(boolean CompleteWord) {
        this.CompleteWord = CompleteWord;
    }

    public void setCorrectLetter(boolean CorrectLetter) {
        this.CorrectLetter = CorrectLetter;
    }

    public void setLetter(char Letter) {
        this.Letter = Letter;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }
        
        
}

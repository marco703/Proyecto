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
    public boolean getCorrectLetter() {
        return CorrectLetter;
     }
    
    public boolean getCompleteWord() {
        return CompleteWord;
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
        
      public boolean FindLetter(String WordSelected, char UsersChar){
        
        for(int i = 0; i < WordSelected.length(); i++){
            if(WordSelected.charAt(i) == UsersChar){
                System.out.println(WordSelected.charAt(i));
                return true;
            }
        }
        
        return false; 
    }
    
    public String ReplaceLetter(String LabelContain,String WordSelected, char UsersChar){
        
        System.out.println(WordSelected.length());
        System.out.println(LabelContain.length());
        for(int i = 0; i < WordSelected.length(); i++){
            if(WordSelected.charAt(i) == UsersChar){
                char[] LabelChars = LabelContain.toCharArray();
                LabelChars[i*2+1] = UsersChar;
                LabelContain = String.valueOf(LabelChars);
            }
        }
        
        return LabelContain;
    }
        
}

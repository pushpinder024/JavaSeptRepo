package practice;

public class codingBatWordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("1XYFIWHIWFXYKEGDF", "XY"));
    }



    public  static String wordEnds(String str, String word) {
        String finalString = "";

        for(int i =1; i<str.length();i++){
            int index = str.indexOf(word,i);
            if(str.contains(word)){
                finalString =  finalString + str.charAt(index+1) + str.charAt(index+word.length()+1);
            }
        } return finalString;
    }
}

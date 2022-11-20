package practice;

public class codingBatPlusOut {
    public static void main(String[] args) {
        String ss = "breadwksdfbwskhfabreadbkkhfgsdlakfbreadvsddg";
        ss.replace("bad","");
        System.out.println(ss.lastIndexOf("bread"));

        plusOut("vuakjDYCgadycbadvskcgaidcbad","bad");


    }
    public static String plusOut(String str, String word) {
        if(str.contains(word)){
            str  = str.replace(word,"P");
        }
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!='P'){
              str =  str.replace(str.charAt(i),'+');
            }
        }
        if(str.contains("P")){
            str = str.replace("P",word);

        }
        System.out.println(str);

        return str;

    }

}

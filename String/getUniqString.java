package String;

public class getUniqString {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbccccddeeeef";
        uniqueStr(str);
       uniqueStrCnt(str);
    }

    static void uniqueStr(String str){
        String newStr = str.charAt(0)+"";
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                continue;
            }
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

    static void uniqueStrCnt(String str){
        String newStr = str.charAt(0)+"";
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                continue;
            }
            newStr += count == 1 ? "" : count;
            newStr += str.charAt(i);
            count = 1;
        }
        newStr += count == 1 ? "" : count;
        System.out.println(newStr);
    }

}

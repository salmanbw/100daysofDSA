package days100;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        System.out.println(validPalindrome(s1));
    }

    public static boolean validPalindrome(String s){

        String alphaNum = s.replaceAll("[^a-zA-Z0-9]", "");
        alphaNum = alphaNum.trim().toLowerCase();

        char[] ch = alphaNum.toCharArray();
        int n = ch.length;
        for(int i=0;i<n/2;i++){
            if(ch[i] != ch[n-i-1])
                return false;
        }
        return true;
    }
}

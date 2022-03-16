import java.util.Scanner;
class vowelConsonant {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a charecter (A-Z): ");
        char ch = input.next().charAt(0);
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            if((ch == 'A' || ch == 'a') || (ch == 'E' || ch == 'e') || (ch == 'I' || ch == 'i') || (ch == 'O' || ch == 'o') || (ch == 'U' || ch == 'u')){
                System.out.println(ch +" is a vowel");
            }else{
                System.out.println(ch + " is a consonant");
            }
        }else{
            System.out.println("Entered charecter isn't vowel neither consonant");
        }
    }
}
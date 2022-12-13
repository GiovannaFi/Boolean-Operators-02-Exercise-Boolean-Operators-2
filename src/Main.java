public class Main {
    public static void main(String[] args) {

        boolean boolean1 = (55 != 55) && (false ^ true);
        System.out.println(boolean1);

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d='2';
        boolean boolean2 = (!a || !b) || c == d ;
        System.out.println(boolean2);

        boolean boolean3 = false && true || false && !false;
        System.out.println(boolean3);

        boolean boolean4 = (false && true) || (false || true);
        System.out.println(boolean4);


    }
}
/*[A]: (55 != 55) && (false ^ true)  false
[B]: considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d )   true
[C]: false && true || false && !false        false
[D]: (false && true) || (false || true))     true   */
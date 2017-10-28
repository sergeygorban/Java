package string_19;

/*
1. „тобы проверить две символьные строки на равенство, достаточно вызвать метод
equals ().

2. ƒл€ того чтобы проверить идентичность строк, игнориру€ отличи€ в прописных
и строчных буквах, следует вызвать метод equalsIgnoreCase ()

3. ƒл€ проверки символьных строк на равенство нельз€ примен€ть операцию == . ќна
лишь определ€ет, хран€тс€ ли обе строки в одной и той же области пам€ти.
–азумеетс€, если обе строки хран€тс€ в одном и том же месте, они должны совпадать.
Ќо вполне возможна ситуаци€, когда одинаковые символьные строки хран€тс€ в разных
местах

*/
public class CompareStrings {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = "JAVA";

        if (a == b) {
            System.out.println("a and b = true");
        }

        if (a == c) {
            System.out.println("a and c = true");
        } else {
            System.out.println("a and c = false");
        }

        if (a.equals(c)) {
            System.out.println("a and c = true");
        }

        if (a.equalsIgnoreCase(d)) {
            System.out.println("a and d = true");
        }


    }
}

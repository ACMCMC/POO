import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.HashSet;

public class TestLambdaConsumer {
    public static void testLambdaConsumer() {
        System.out.println("Vamos a hacer una operación con funciones lambda.");
        class Obj {
            String s;

            Obj(String s) {
                this.s = s;
            }

            String getS() {
                return s;
            }

            void printS() {
                System.out.println(s);
            }
        }
        ;
        Set<Obj> setObjs = new HashSet<Obj>() {
            {
                add(new Obj("abc"));
                add(new Obj("def"));
                add(new Obj("ghi"));
                add(new Obj("jkl"));
            }
        };

        consumeIf(setObjs, obj -> !obj.getS().equals("abc"), Obj::printS);
    }

    public static <T> void consumeIf(Collection<T> col, Predicate<T> p, Consumer<T> con) {
        col.stream().filter(p).forEach(con);
    }
}
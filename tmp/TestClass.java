import com.ezanmoto.rep.Callable;

public class TestClass implements Callable {

    public Object call() {
        int n = 10;
        System.out.println( "Computing " + n + "!" );
        return factorial( n );
    }

    private int factorial( int n ) {
        return n < 1 ? 1 : n * factorial( n - 1 );
    }
}

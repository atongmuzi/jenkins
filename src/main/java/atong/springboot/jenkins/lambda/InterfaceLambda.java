package atong.springboot.jenkins.lambda;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;

class Foo{
}

class Bar{
    Foo f;
    Bar(Foo f){
        this.f = f;
    }
}

class IBaz{
    int i;
    IBaz(int i){
        this.i = i;
    }
}

class LBaz{
    long l;
    LBaz(long l){
        this.l = l;
    }
}

class DBaz{
    double d;
    DBaz(double b){
        this.d = d;
    }
}

public class InterfaceLambda {

    static Function<Foo,Bar> f1 = f -> new Bar(f) ;
    static IntFunction<IBaz> fi = f -> new IBaz(f) ;
    static LongFunction<LBaz> fl = f -> new LBaz(f);
    static IntToLongFunction  fitol = i -> i;

    public static void main(String[] args) {
        f1.apply(new Foo());

    }
}

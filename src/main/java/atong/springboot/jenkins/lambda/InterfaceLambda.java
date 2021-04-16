package atong.springboot.jenkins.lambda;

import java.util.function.Function;
import java.util.function.IntFunction;

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

    public static void main(String[] args) {

    }
}

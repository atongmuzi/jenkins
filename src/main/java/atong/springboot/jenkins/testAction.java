package atong.springboot.jenkins;


import java.util.Objects;

public class testAction {

    String name ;
    String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        testAction that = (testAction) o;
        return Objects.equals(name, that.name) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    public static void main(String[] args) {
        int i =1;
        System.out.println(i+++"heheh"+i);

    }

}

class A{
    public String meth(){
        return("Invoking method from class A");
    }
}

class B extends A{

    @Override
    public String meth(){
        return("Method is overridden in Extendend class B");
    }
}

    public class Main {
        public static void main(String[] args) {

            B b=new B();
            System.out.print(b.meth());

        }
    }

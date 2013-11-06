class DelegateExample {
    String name;

    void configure(Closure c ) {
        c.delegate = this
        c.setResolveStrategy Closure.DELEGATE_FIRST
        c()
    }

    void hello()
    {
        println name
    }
}

def example = new DelegateExample()

example.configure {
    name = "name"
}
example.hello()

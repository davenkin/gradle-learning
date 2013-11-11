class GroovyBeanExample {
   private String name
}

def bean = new GroovyBeanExample()
bean.name = "this is name"
println bean.name


class Child {
    private String name
}

class Parent {
    Child child = new Child();

    void configChild(Closure c) {
        c.delegate = child
        c.setResolveStrategy Closure.DELEGATE_FIRST
        c()
    }
}

def parent = new Parent()
parent.configChild {
    name = "child name"
}

println parent.child.name


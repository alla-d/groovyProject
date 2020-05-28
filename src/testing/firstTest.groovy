package testing

class firstTest {

    /* def x  create variable, it could be created in Class level which
            calls global variable and it can be used for whole class.
            If variable declared inside method it will be local variable
            which you can use only inside method
    */

    /* def final i= 100  creating constraint, by default it will be 0.
                 Value for constraint can't be changed
    */

    firstTest()        /* Constructor name is always the same as class name.
                       Constructor is a special type of method.
                       Constructor never return value.
                       Constructor takes arguments. It could more than one constructor.
    */
    {
    println("This is constructor")
    }

    def hello() //method without argument
    {
        println "this is Hello Method" //println - method
    }

    def sum(def a, def b) // method with arguments
    {
    def c = a + b
        println(c)
    }

    def sub(def a, def b)// method with arguments which return value
    {
        def c = a-b
        return c
    }

}


package exercises

class fabonnaci {

    // Generate Fabonnaci series till value is 100

    def generateFabSeries(def limit)
    {
        def a = 1
        def b = 1
        def  num = 2
        print(a + " , " + b)
        while (a+b<limit)
        {
            b =a+b
            a =b -a
            print(" , " + b)
            num = num + 1
        }
        println()
        println("Total number generated are: " + num)
    }


}

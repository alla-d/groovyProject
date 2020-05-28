package exercises

class primeNumbers {

    // Check if a number is prime or not
    def checkPrimeNumber(def input){

        def z = 0
        for(def i=2; i<=(input/2); i++)
        {
            if (input%i==0)
            {
                println("This is number not a prime number")
                z=1
                break
            }

            if (z==0) {
                println("This is a prime number")
            }
        }
    }
}

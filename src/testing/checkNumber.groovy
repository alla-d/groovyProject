package testing

class checkNumber {
    // Number is negative than display negative number
    // Number 0  than display Zero
    // Number is Even or Odd

    def checkEvenOdd(def a) {
        if (a<0){
            println("This is negative value: " + a)
        }
        else if(a == 0){
            println("This is Zero number: " + a)
        }
        else if(a % 2 == 0) {
            println("Even value: " + a)
        }
        else {
            println("Odd value: " + a)
        }
    }
}

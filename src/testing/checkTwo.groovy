package testing

class checkTwo {

    // if number is less than 0 or greater than 100, this is invalid value
    //if number is between 0-30 - failed
    //if number is 31-45 - 3 rd
    // if number is 46-59 - 2sd
    // if number between 60-100 - first

    def checkNumbers(def number) {

        if (number < 0 || number > 100) {
            println("You entered invalid number " + number)
        }
        else if (number >= 0 && number <=30){
            println("You are Failed " + number)
        }
        else if (number> 30 && number <=45){
            println("You are Third " + number)
        }
        else if (number > 45 && number <60){
            println("You are Second " + number)
        }
        else {
            println("You are First "+ number)
        }
    }
}

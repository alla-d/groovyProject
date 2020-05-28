
def a = 21
if (a%2 == 0){
    println("Even value")
}
else{
    println("Odd value")
}

def x = 28
if (x < 0){
    println("This is Negative Number")
}
else if(x == 0){
    println("This is Zero")
}
else if (x%2 == 0){
    println("Even value")
}
else{
    println("Odd value")
}


def b = 23
if(b< 0 || b> 100){
    println("This is invalid value")
}
else if (b<=0 && b<=30){
    println("You are failed")
}
else {
        println("You are passes")
}
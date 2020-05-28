// executable file

import testing.firstTest
import testing.checkTwo
import testing.swapTest
import testing.checkNumber

def obj = new firstTest() // create object
obj.hello() // for call method


// obj.sum(100, 200)
def z
z =  obj.sub(200, 100)
obj.sum(1000, z)

def sw = new swapTest()
sw.numberSwap(100, 200)

def check =new checkNumber()
check.checkEvenOdd(-5)

def checkTwo = new checkTwo()
checkTwo.checkNumbers(101)

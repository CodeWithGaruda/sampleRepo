let myName = "sanath"

function printName() {
    console.log(myName);
}
/**
 * here this is closure  even though the myname vaiable is defined outside the function scope
 * it can still be acessible by function
 */
printName()

myName = "sunny"
printName()
/**now here the myname variable is updated when u call the function again */

//----------------------------------------------------------------------------------------

function outerFunction(outerVariable) {
    return function innerFunction(innerVariable) {
        console.log(outerVariable);
        console.log(innerVariable);
    }
}
const newFunction = outerFunction("outside")
newFunction("inside")


//u can see this process more often in axios,fetch.....
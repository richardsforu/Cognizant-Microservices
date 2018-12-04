console.log('--- Functional Programming ---');


//console.log(add(10,20));

//function add(n1,n2){
  //  return n1+n2;
//}

//console.log('sum is '+add(10,20));

// ---------------------------------
// Function Expression
//-----------------------------------

//console.log('sum: '+add(100,200));

var add=function(n1,n2){
    return n1+n2;
}

//console.log('sum: '+add(100,200));

//-----------------------------------------------
// function with parameters 
//-----------------------------------
function func(a,b,c,d){
console.dir(arguments);
console.log('size: '+arguments.length);
}

//func();
//func(10,20,30,40,50,87,65);

//------------------------------
// FP principles
//----------------------

/*
    In FP-language, functions are first class values / citizenz

    - A function can be stored in a variable
    - A Parameter of a function can be a function'
    - The return value of a function can be a function

*/

function greet(){
    console.log('Good Evening');
}

var sayHello=greet;

//sayHello();


//----------------------------

function teach(){
    console.log('--- teaching java script');
    let learn=function(){
        console.log('-- learning java script');
    }
    learn();
    console.log('--- teaching Ends');
    return learn;
}

// Bad Code
//teach();
//teach();

let learnc=teach();
learnc();
learnc();
learnc();

//-------------------------------------------------
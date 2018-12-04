console.log('--- scopes ---');

/*
---------------------------
scope / execution-context
---------------------------

memory/ statck-frame which contains arguments and local veriables to execute set of 
instaructions

1. phase-1: create /push
---------------------------
-> variables declared with 'var' keyword any where in the scope always get hoisted
 (lifted up) with default value 'undefined'.

 2. phase-2: execution/pop
 ---------------------------
 -> instructions will execute in a sequence order

*/


/*
// named functions  -> phase-1
//test();
function test(){
    console.log("name is "+empName);
}

var empName;

// anonymous function -> a function with out a name -> phase-2 -> execution



var s1=function(){
    return sname;
}

var sname='James';

console.log('name is '+s1());



Very Imp Notes: Every java script has one global-scope by default

--> for js environment global object : window
--> for node.js environment global object : process
--> Every js function has its own scope. 

f1(){ // child of global scope
    f2(){ // child of f1
        f3(){ // child of f2
            // display some thing --> starts from global by default -> window
        }

    }
}

note: Every function invocation also  creats a new-scope,
      which is child of in-which scope that function has declared/created

*/

sayName();

function sayName(){
    console.log('Your name is '+sname);
}

var sname;

// Quiz

var v=12;
function f1(){ // f1 has its own context -> f1 context
    function f2(){ // f2 also has its own context -> f2
      //var v=15;
        console.log('--- V is '+v);
    }
   
    f2();  // f2() <- f1
    var v=13;

}

f1(); // ? 

// Problems with var keyword
/*
    ==> always get hoist
    ==> can re-declare same variable within scope
    ==> No block scope

*/


let a=10;
let ab=20;


{
    let t=10; // ES-6
    console.log('T value is '+t);
}

//console.log('T value is outside block '+t);



// Quiz

const trainer={
    name:'Praveen'
};

trainer.name='Ozvitha';
trainer=null;  // Error



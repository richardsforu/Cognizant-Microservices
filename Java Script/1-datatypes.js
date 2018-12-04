console.log('-- data types');

/*

---------------------
Data types
---------------------

1. simple/primitive  ==> values
    a. undefined
    b. string
    c. number
    d. boolean

*/

// 1. Simple Types
// a. undefined

var num;
//------------------------

// b. string

var name='Praveen';
var s1="James";

var dynamicString='The Trainer is '+name;

var dynamicString2=`the trainer ${name}`;

var result=`the sum of 1 and 2 is ${1+2}`;

var multiLineString=`

line -1
line -2
line -3

`;

var htmltemplate=`

<div>
    <h1>Name is ${name} </h1>
</div>
`;

//-------------------------------
// c. number
//--------------------------------

var count=12;
var cost=34.87;

// ------------------------------
// d. boolean 
//-------------------------------

var isFound=true;

/*

Notes: 
falsy-values ==> false , 0 , "" , null , undefined and NAN
*/

//----------------------------------------

// 2. Complex/reference -types  ==> Objects

//-----------------------------------------

/*

How to create object?

syntax:

var ref=new Constructor();


*/

//--------------
// class
//--------------

// ES-5 Feature to create class and objects

/*
function Person(name,age){
    this.name=name;
    this.age=age;

    this.sayName=function(){
        console.log('Your Name is '+this.name);
    }
    this.sayAge=function(){
        console.log('Your Age is '+this.age);
    }

}
*/

//var p1=new Person('Praveen',67);
//var p2=new Person('Ozvitha',24);

//---------------------------------
// class (from ES-6)
//--------------------------------

class Person{
    constructor(name,age){
        this.name=name;
        this.age=age;
        Person.address=null;
        Person.personCount++;
    }

    sayName(){
        console.log('Name is '+this.name);
    }

    sayAge(){
        console.log('Age is '+this.age);
    }
}

// Class Operations

Person.personCount=0;
var p1=new Person('Amith',34);
var p2=new Person('Sujith',23);
var p3=new Person('Prekith',28);

//----------------------
// literal-style object(s)
//------------------------

//------------------------
// a. object
//-------------------------

var config=new Object();
config.url='http://abc.com';
config.httpMethod='post';
config.onSuccess=function(){console.log('on success consuming response')};

// or

var config={
url:'http://xyz.com',
httpMethod:'get',
onSuccess:function(){console.log('on success consuming get response')}
}


config.isSecured=false;
config.url='http://test.com/';

//------------------------------------
// Arrays
//-------------------------------------

// Note: Every Array or Function in .js by default treat as Object

//var menu=new Array();
//menu[0]='Idle';
//menu[1]='Sambar';
//menu[2]='Biryani';

//menu.push('Puri');
//menu.push('Sambar');
//menu.push('Idle');


var menu=['I1,I2,I3,I4,I5'];

//-----------------------------
// RegExp
//------------------------------

var pattern=new RegExp('\\d{4}-\\d{4}-\\d{4}');

// or

var adharPattern=/\d{4}-\d{4}-d{4}/;


//-----------------------------
// Functions
//-------------------------------

var add=new Function("n1","n2","var result=n1+n2;return result");

// or

function newAdd(n1,n2){
return n1+n2;
}

// or

var result=function(n1,n2){
    return n1+n2;
}


// ---------------------------------------
// how to access object's property values?
//----------------------------------------

/*
2 ways

-> '.' if property name doesn't have a space or -
else
-> '[]' , for any property


*/

var student={
name:'Praveen',
'home-address':'Hyderabad',
1:'One',
100:'Hundred'
};


//--------------------------------------------------









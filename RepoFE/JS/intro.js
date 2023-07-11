
//dichiarare una variabile
var nome = 'Gino';

var eta = 27;
var numEta = 27.00;

var eSveglio = true;

//dichiarare una variabile
let nomeG = 'Pino';
let etaG = '28';
let eSveglia = false;

//dichiarare una costante
const PI = 3.14;

//dimostrazione di tipizzazione dinamica
etaG = 22;
eSveglia = "e' sveglio";


let persona = {
    nome: 'gino',
    cognome: 'pino'
}

let numbersOnly = [1,2,3,4,5,6];
let numbersOr = [1,2,3,4,5,'6'];

//--->

let provaVar;
// const CLASSE;
const CLASSE = 'Academy23';

// Tipi di dato:
//string
//number:   comprende si i valori interi che con la virgola
//boolean
//any:      puo' contenere qualunque tipo di valore
//Null
//Object
//symbol:   rappresenta valori univoci (es id)



//Operatori
// + - * / < > <= >= == ===
let sum = 5 + 7;

let num7 = 7;
let num5 = 5;
let difference = 5 - 7;

let product = num7 * num5;

let modulo = 5 % 3;

//equals
let isEquals = 5 == 5;      // confronta il valore
let isEquals2 = 5 === '5';  // confronta il tipo poi il valore


//Condizioni e cicli

if(num7 > 10) {
    console.log("num7 e' maggiore di 10");
} else if (num7 < 10) {
    console.log("num7 e' minore di 10");
} else if (num7 == 0) {
    console.log("num7 e zero");
}

for(let i = 0; i < 10; i++) {

}

let indice = 10;
while(indice >= 0) {

    //fai qualcosa
    indice--;
}


switch(indice) {
    case valore1:
    //fai qualcosa
    break;   
        
    case valore1:
    //fai qualcosa
    break;
        
    default:
    //fai qualcosa
}


switch(indice) {
    case 10:
        //fai qualcosa
        console.log();
        break;
    case 7:
        //fai qualcosa
        console.log();
        break
}
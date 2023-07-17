var variabile = "Ciao";
console.log(variabile);
alert(variabile);
// let persona:[string, number] = ["Gino","Pino",9]
function somma0(num1, num2) {
    console.log(num1 + num2);
}
function somma(num1, num2) {
    console.log(num1 + num2);
}
somma(4, 9);
function somma2(num1, num2) {
    if (num1 === void 0) { num1 = 1; }
    if (num2 === void 0) { num2 = 2; }
    //: number e' ridondante
    //fai qualcosa
    console.log("Completato");
}
somma2();
function somma3(num1, num2) {
    //: number e' il tipo di ritorno
    console.log("La somma e' = " + num1 + num2);
    return num1 + num2;
}
//dichiarazione
var eta = 77;
var nome = "Gino";
var isVadil = false;
var persona = null;
var dato = undefined;
//any
var dati = "Ciao";
dati = 7;
//array
var personaN = ["Gino", "Pino", 9];
var number = [1, 2, 3];
var stringhe = ["Gino", "Pino"];
// Tupla
//e' un tipo di array di dimensione fissa di n elementi di diverso tipo
var personaT2 = ["Gino", 77];
var personaT3 = ["Gino", 77, "pino"];
//Oggetti
var studente = {
    nome: "Pino",
    cognome: "Panino",
    eta: 5,
};
//ENUM
//insieme di costanti
var Colori;
(function (Colori) {
    Colori[Colori["Rosso"] = 0] = "Rosso";
    Colori[Colori["Blu"] = 1] = "Blu";
    Colori[Colori["Verde"] = 2] = "Verde";
    Colori[Colori["Giallo"] = 3] = "Giallo";
})(Colori || (Colori = {}));
var scegliColore = Colori.Verde;
var Ruoli;
(function (Ruoli) {
    Ruoli["Admin"] = "Admin10";
    Ruoli["Pm"] = "Project Manager";
    Ruoli["General"] = "Normal User";
    Ruoli["Public"] = "Public Users";
})(Ruoli || (Ruoli = {}));
// let index = Ruoli[0];
var ruolo = Ruoli.Admin;
//Alias
//let p ---> crea un nome alternativo per una tipo custom
var p = { x: 7, y: 11 };
var gatto = {
    nome: "chicco",
    eta: 14,
    collare: "verde",
    verso: function () {
        console.log("meow");
    },
};
var dip = {
    nome: "Pino",
    eta: 7,
    intestazione: "string",
    indirizzo: "string",
};
console.log("_____________________");
//Generics
// tipi generici che possono assumere tipi di valore diverso
function genericsFunction(arg) {
    return arg;
}
var result = genericsFunction("Hello Typescript!");
console.log("_____________________");
console.log(result);
var result1 = genericsFunction(5);
console.log("_____________________");
console.log(result1);
var result2 = genericsFunction(5);
console.log("_____________________");
console.log(result2);
var result3 = genericsFunction(dip);
console.log("_____________________");
console.log(result3);
var result4 = genericsFunction(true);
console.log("_____________________");
console.log(result4);
var result5 = genericsFunction(gatto);
console.log("_____________________");
console.log(result5);
gatto.verso();

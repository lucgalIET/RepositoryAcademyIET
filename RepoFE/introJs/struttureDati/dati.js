
//in JS MAP e SET

let myMap = new Map(); //coppie chiave valore
myMap.set(1,'Gino');
myMap.set(2, 'Pino');

let mySet = new Set(); //valori univoci
mySet.add('pino');
mySet.add('gino');

/* ------------------------ DEFINIZIONE DI UN OGGETTO ----------------------- */

const STUDENTE_PINO = { //let studente
    nome: "Pino",
    eta: 19,
    indirizzo: {
        via: 'via della pace',
        civico:77
    },
    saluto: function() {
        // alert("Ciao sono " + this.nome + ", ho " + this.eta + " anni!");
        console.log("Ciao sono " + this.nome + ", ho " + this.eta + " anni!");
    }
}

STUDENTE_PINO.saluto(); //studente.saluto();


/* -------------------------- FUNZIONE COSTRUTTRICE ------------------------- */
function Studente(nome, eta) {
    this.nome = nome;
    this.eta = eta;
}

let studenteGino = new Studente('Gino', 22);


/* -------------------------- DEFINIZIONE DI CLASSE ------------------------- */
class StudenteClass {
    constructor(nome, eta) {
        this.nome = nome;
        this.eta = eta;
    }
}

let studente = new StudenteClass('Pino', 33);

/* ------------------ SIMULAZIONE INIZIO PAGINA PER IMPORT ------------------ */
import {saluto, ADMIN} from 'modulo.js';

saluto();

console.log(ADMIN);


/* ---------------------------------- DATE JS---------------------------------- */
let date = new Date();
date.getFullYear(); //anno corrente
date.getMonth();
date.getDay();
date.getTime(); //Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC.
date.getHours();
date.getMilliseconds();
date.getSeconds();


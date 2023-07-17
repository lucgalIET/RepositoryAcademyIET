let variabile: string = "Ciao";
console.log(variabile);
alert(variabile);

// let persona:[string, number] = ["Gino","Pino",9]

function somma0(num1, num2) {
  console.log(num1 + num2);
}

function somma(num1: number, num2: number) {
  console.log(num1 + num2);
}

somma(4, 9);

function somma2(num1 = 1, num2 = 2) {
  //: number e' ridondante
  //fai qualcosa
  console.log("Completato");
}

somma2();

function somma3(num1: number, num2: number): number {
  //: number e' il tipo di ritorno
  console.log("La somma e' = " + num1 + num2);
  return num1 + num2;
}

//dichiarazione

let eta: number = 77;
let nome: string = "Gino";
let isVadil: boolean = false;
let persona: null = null;
let dato: undefined = undefined;

//any
let dati: any = "Ciao";
dati = 7;

//array
let personaN = ["Gino", "Pino", 9];

let number: number[] = [1, 2, 3];
let stringhe: string[] = ["Gino", "Pino"];

// Tupla
//e' un tipo di array di dimensione fissa di n elementi di diverso tipo
let personaT2: [string, number] = ["Gino", 77];
let personaT3: [string, number, string] = ["Gino", 77, "pino"];

//Oggetti

let studente: { nome: string; cognome: string; eta: number } = {
  nome: "Pino",
  cognome: "Panino",
  eta: 5,
};

//ENUM
//insieme di costanti
enum Colori {
  Rosso,
  Blu,
  Verde,
  Giallo,
}

let scegliColore: Colori = Colori.Verde;

enum Ruoli {
  Admin = "Admin10",
  Pm = "Project Manager",
  General = "Normal User",
  Public = "Public Users",
}

// let index = Ruoli[0];

let ruolo: Ruoli = Ruoli.Admin;

//type Type => type Punto ---> creazione di un tipo custom
type Punto = { x: number; y: number };
//Alias
//let p ---> crea un nome alternativo per una tipo custom
let p: Punto = { x: 7, y: 11 };

//Interfacce
// crea un contratto che obbliga le variabili che creeranno oggetti a partire dall'interfaccia x, a rispettare campi, varibili e metodi presenti
interface Gatto {
  nome: string;
  eta: number;
  collare: string;
  verso(): void;
}

let gatto: Gatto = {
  nome: "chicco",
  eta: 14,
  collare: "verde",
  verso() {
    console.log("meow");
  },
};

//creare Type partendo da altri Types
type Dipendente = {
  nome: string;
  eta: number;
};

type Azienda = {
  intestazione: string;
  indirizzo: string;
};

type DipendenteAzienda = Dipendente & Azienda;

let dip: DipendenteAzienda = {
  nome: "Pino",
  eta: 7,
  intestazione: "string",
  indirizzo: "string",
};

console.log("_____________________");
//Generics
// tipi generici che possono assumere tipi di valore diverso

function genericsFunction<T>(arg: T): T {
  return arg;
}

let result = genericsFunction<string>("Hello Typescript!");
console.log("_____________________");
console.log(result);

let result1 = genericsFunction<number>(5);
console.log("_____________________")
console.log(result1);

let result2 = genericsFunction<any>(5);
console.log("_____________________")
console.log(result2);

let result3 = genericsFunction<DipendenteAzienda>(dip);
console.log("_____________________")
console.log(result3);

let result4 = genericsFunction<boolean>(true);
console.log("_____________________")
console.log(result4);

let result5 = genericsFunction<Gatto>(gatto);
console.log("_____________________")
console.log(result5);
gatto.verso();
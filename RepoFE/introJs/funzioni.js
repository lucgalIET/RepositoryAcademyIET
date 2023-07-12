
//funzioni

function name1(params) {
    //fai qualcosa
    return '';
}

function name12(params) {
    //fai qualcosa
    let num = 3;
    return num;
}


function name(params) {
    //fai qualcosa
}

function nomeGino(nome) {
    return "Ciao sono" + nome + "!";
}

console.log(nomeGino("GIno"));


function somma(param1, param2) {
    //fai qualcosa
    return param1 + param2;
}

somma("Ciao", "Gino");
somma(4, "Gino");
somma(4, 6);
somma(true, 6);


// arrow function

let num = (x) => x * x;
num(4);

//function ricorsive
function calcoloFattoriale(num) {
    if(num === 1) {
        return 1;
    } else {
        return num * calcoloFattoriale(num -1);
    }
}


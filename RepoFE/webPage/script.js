function saluto() {
    const nome = prompt("Inserisci il tuo nome: ");
    const salutoOutput = document.getElementById("saluto");
    salutoOutput.textContent = "Ciao" + nome + "!";
}

function cambiaColore() {
    const container = document.querySelector("body");
    container.style.backgroundColor = "green";
}

function avviso() {
    alert("Ciao sto funzionando");
}

document.addEventListener("DOMContentLoaded", function() {
    const bottoneSaluta = document.getElementById("saluto");
    bottoneSaluta.addEventListener("click", saluto);

    const bottoneCambioColore = document.getElementById("cambioColore");
    bottoneCambioColore.addEventListener("click", cambiaColore);

    const mostraAlert = document.getElementById("alertButton");
    mostraAlert.addEventListener("click", avviso);

})
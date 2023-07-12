// function saluta(nome, cognome) {
// }

//definiamo un oggetto person
let person = {
    name:"",
    surname: "",
    hello: function() {
        alert("Hello, I'm " + this.name + ", " + this.surname);
    }
};

function manageHello() {

    let nameInput = document.getElementById("nameInput").value;
    let surnameInput = document.getElementById("surnameInput").value;

    //aggiornato i valore degli attributi dell'oggetto person
    person.name = nameInput;
    person.surname = surnameInput;

    person.hello();
};

function manageForm(event) {
    //previene l'invio automatico del form
    event.preventDefault();

    let nameInput = document.getElementById("nameInput").value;
    let surnameInput = document.getElementById("surnameInput").value;

    //simula l'invio del form
    console.log("Name" + nameInput);
    console.log("Surname" + surnameInput);

    document.getElementById("myForm").reset();
}

let form = document.getElementById("myForm");
form.addEventListener("click", manageForm);


//aggiungere l'evento click sul buttonHello
let buttonHello = document.getElementById("buttonHello");
buttonHello.addEventListener("click", manageHello);
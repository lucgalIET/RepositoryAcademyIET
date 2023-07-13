//modifichiamo il contenuto del <p> con id myElement
function changeElement() {
  let elem = document.getElementById("myElement");
  elem.innerHTML = "This is a new content!";
}

function newElement() {
  let newElemP = document.createElement("p");
  newElemP.textContent = "I m a new element!";
  newElemP.setAttribute("class", "highlight");
  newElemP.id = "elemToRemove";

  let p = document.getElementById("section1");
  p.appendChild(newElemP);
}

function removeElement() {
  let elemToRemove = document.getElementById("elemToRemove");
  elemToRemove.parentNode.removeChild(elemToRemove);
}

//evento legato "input"

let myInput = document.getElementById("myInput");
myInput.addEventListener('input', function() {
  let myInputValue = myInput.value;
  let result = document.getElementById('result');
  result.innerHTML = myInputValue;
});

//funzione evento click sulle sezioni => restituisce un alert con la sezione cliccata

// let section = document.getElementsByClassName("section");
// for(let i = 0; i < section.length; i++) {
//   section[i].addEventListener('click', function() {
//     alert("Hai cliccato :" + this.querySelector(".h2Title").textContent);
//   });
// }

let section = document.getElementsByClassName("section");
// debugger;
section.addEventListener("click", function () {
  alert("Hai cliccato :" + this.querySelector(".h2Title").textContent);
});

addEventListener();

//modifichiamo il contenuto del <p> con id myElement
function changeElement() {
  let elem = document.getElementById("myElement");
  elem.innerHTML = "This is a new content!";
}

function newElement() {
    let newElemP = document.createElement('p');
    newElemP.textContent = 'I m a new element!';
    newElemP.setAttribute('class', 'highlight');
    newElemP.id = 'elemToRemove';

    let p = document.getElementById('section1');
    p.appendChild(newElemP);
}

function removeElement() {
    let elemToRemove = document.getElementById('elemToRemove');
    elemToRemove.parentNode.removeChild(elemToRemove);
}
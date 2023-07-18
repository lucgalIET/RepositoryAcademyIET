document.addEventListener("DOMContentLoaded", () => {
  //caricamento delle immagini

  const arrayDiImg: { nome: string; img: string }[] = [
    {
      nome: "cheeseburger",
      img: "img/cheeseburger.png",
    },
    {
      nome: "fries",
      img: "img/fries.png",
    },
    {
      nome: "hotdog",
      img: "img/hotdog.png",
    },
    {
      nome: "ice-cream",
      img: "img/ice-cream.png",
    },
    {
      nome: "milkshake",
      img: "img/milkshake.png",
    },
    {
      nome: "pizza",
      img: "img/pizza.png",
    },
    {
      nome: "cheeseburger",
      img: "img/cheeseburger.png",
    },
    {
      nome: "fries",
      img: "img/fries.png",
    },
    {
      nome: "hotdog",
      img: "img/hotdog.png",
    },
    {
      nome: "ice-cream",
      img: "img/ice-cream.png",
    },
    {
      nome: "milkshake",
      img: "img/milkshake.png",
    },
    {
      nome: "pizza",
      img: "img/pizza.png",
    }
  ];

  arrayDiImg.sort(() => 0.5 - Math.random());

  const griglia = document.querySelector(".griglia") as HTMLElement;
  const risultatoFinale = document.querySelector("#risultato") as HTMLElement;

  let carteSelezionate: string[] = [];
  let idCartaSelezionato: number[] = [];
  let carteCoppieVincenti: string[][] = [];

  //funzione per creare lo schema
  function creaSchemaCarte() {
    for (let i = 0; i < arrayDiImg.length; i++) {
      let carta = document.createElement("img");
      carta.setAttribute("src", "img/blank.png");
      carta.setAttribute("carta-id", i.toString());
      carta.addEventListener("click", giraCarta);
      griglia.appendChild(carta);
    }
  }

  //controllare le coppie delle carte
  function checkAccopp() {
    const carte = document.querySelectorAll("img");
    const carta1Id = idCartaSelezionato[0];
    const carta2Id = idCartaSelezionato[1];

    if (carta1Id === carta2Id) {
      carte[carta1Id].setAttribute("src", "img/blank.png");
      carte[carta2Id].setAttribute("src", "img/blank.png");
      // carte[carta2Id]
      alert("Hai selezionato due volta la stessa carta!");
    } else if (carteSelezionate[0] === carteSelezionate[1]) {
      alert("Comlimenti, hai trovato una coppia!");
      carte[carta1Id].setAttribute("src", "img/white.png");
      carte[carta2Id].setAttribute("src", "img/white.png");
      carte[carta1Id].removeEventListener("click", giraCarta);
      carte[carta2Id].removeEventListener("click", giraCarta);

      carteCoppieVincenti.push(carteSelezionate);
    } else {
      carte[carta1Id].setAttribute("src", "img/blank.png");
      carte[carta2Id].setAttribute("src", "img/blank.png");
      alert("Hai sbagliato, riprova!");
    }

    carteSelezionate = [];
    idCartaSelezionato = [];

    // risultatoFinale.textContent = document.
    // if() {
    //     "Bravo, hai vinto!"
    // }
    
  }

  function giraCarta(this: HTMLElement) {
    let cartaId = this.getAttribute("carta-id");
    if (cartaId) {
      carteSelezionate.push(arrayDiImg[parseInt(cartaId)].nome);
      idCartaSelezionato.push(parseInt(cartaId));
      this.setAttribute("src", arrayDiImg[parseInt(cartaId)].img);
      //
      checkAccopp();
    }
  }
  creaSchemaCarte();
});

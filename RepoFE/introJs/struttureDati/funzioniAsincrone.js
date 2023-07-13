//ASYNC/AWAIT

async function getDati() {
    const response = await fetch("api/studenti/{id}");
    const dati = await response.json();
    return dati;
}
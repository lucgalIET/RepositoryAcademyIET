function multipleChoise() {
  let answer = document.getElementsByName("answer") as NodeListOf<HTMLInputElement>;
debugger;
  let selectedAnswer = "";

  for (let i = 0; i < answer.length; i++) {
    if (answer[i].checked) {
      selectedAnswer = answer[i].value;
      break;
    }
  }

  let result = "";
  if(selectedAnswer === "Roma") {
    result = "Risposta corretta";
} else {
    result = "Risposta errata";
  }

  let resultAnswer = document.getElementById("result");
  if(resultAnswer!=null) resultAnswer.textContent = result;

}

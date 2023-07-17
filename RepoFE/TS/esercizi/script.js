function multipleChoise() {
    var answer = document.getElementsByName("answer");
    debugger;
    var selectedAnswer = "";
    for (var i = 0; i < answer.length; i++) {
        if (answer[i].checked) {
            selectedAnswer = answer[i].value;
            break;
        }
    }
    var result = "";
    if (selectedAnswer === "Roma") {
        result = "Risposta corretta";
    }
    else {
        result = "Risposta errata";
    }
    var resultAnswer = document.getElementById("result");
    if (resultAnswer != null)
        resultAnswer.textContent = result;
}

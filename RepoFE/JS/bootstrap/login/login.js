//getore degli eveneti

document.getElementById('loginForm').addEventListener('submit', function(event){
    event.preventDefault(); //previene l'invio del form/modulo

    let usernameInput = document.getElementById('username');
    let passwordInput = document.getElementById('password');
    let user = usernameInput.value;
    let psw = passwordInput.value;

    //controllare le credenziali inserite
    if(user ==='admin' && psw === '123') {

        localStorage.setItem('isLoggedIn','true');
        window.location.href = '../home/home.html';
    } else {
        alert("Attenzione! Credeziali errate!");
    }

    //ripristiniamo i campi vuoi
    usernameInput = '';
    passwordInput = '';
})
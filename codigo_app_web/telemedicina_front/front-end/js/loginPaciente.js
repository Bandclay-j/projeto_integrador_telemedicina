function loginMedico() {
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;

    if (email == "" ||
        senha == "") {
        alert("Preencha todos os campos obrigatórios!");
        return;
    }

    axios.get('http://localhost:8080/paciente', {
        "email": email,
        "senha": senha,
    })
    .then(function (response) {
        console.log(response);
        alert("Paciente logado com sucesso!");
    })
    .catch(function (error) {
        console.log(error);
        alert("Erro ao logar paciente!");
    });
}
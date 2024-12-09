function loginMedico() {
    var nome = document.getElementById("nome").value;
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;

    if (nome == "" ||
        email == "" ||
        senha == "") {
        alert("Preencha todos os campos obrigatórios!");
        return;
    }

    axios.get('http://localhost:8080/medico', {
        "nome": nome,
        "email": email,
        "senha": senha,
    })
    .then(function (response) {
        console.log(response);
        alert("Médico logado com sucesso!");
    })
    .catch(function (error) {
        console.log(error);
        alert("Erro ao logar médico!");
    });
}
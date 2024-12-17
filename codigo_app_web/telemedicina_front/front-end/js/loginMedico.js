function loginMedico() {
    var emailMed = document.getElementById("email").value;
    var senhaMed = document.getElementById("senha").value;

    if (emailMed == "" ||
        senhaMed == "") {
        alert("Preencha todos os campos obrigatórios!");
        return;
    }

    axios.get('http://localhost:8080/medico', {
        "emailMed": emailMed,
        "senhaMed": senhaMed,
    })
    .then(function (response) {
        console.log(response);
        alert("Médico logado com sucesso!");
        window.location = "../src/medicoInicio.html"
    })
    .catch(function (error) {
        console.log(error);
        alert("Erro ao logar médico!");
        return;
    });
}
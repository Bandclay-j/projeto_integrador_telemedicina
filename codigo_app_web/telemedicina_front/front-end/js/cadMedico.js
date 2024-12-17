const section1 = document.getElementById('section1');
const section2 = document.getElementById('section2');

function validar() {
    var nomeMed = $("#nomeMed").val();
    var cpfMed = $("#cpfMed").val();
    var nascimentoMed = $("#nascimentoMed").val();
    var generoMed = $("#generoMed").val();
    var telefoneMed = $("#telefoneMed").val();
    var enderecoMed = $("#enderecoMed").val();
    var emailMed = $("#emailMed").val();
    var rgMed = $("#rgMed").val();
    var senhaMed = $("#senhaMed").val();
    var confirmarSenhaMed = $("#confirmarSenhaMed").val();

    if (senhaMed !== confirmarSenhaMed) {
        alert("As senhas não coincidem!");
        return false;
    }

    if (nomeMed === "" ||
        cpfMed === "" || 
        nascimentoMed === "" || 
        generoMed === "" || 
        telefoneMed === "" || 
        enderecoMed === "" || 
        emailMed === "" || 
        rgMed === "" || 
        senhaMed === "" || 
        confirmarSenhaMed === "") {

        alert("Preencha todos os campos!");
        return false;
    }

    return true;
}

function next() {
    if (validar()) {
        section1.style.display = 'none';
        section2.style.display = 'block';
    }
}

function cadMedico() {
    var nomeMed = $("#nomeMed").val();
    var cpfMed = $("#cpfMed").val();
    var nascimentoMed = $("#nascimentoMed").val();
    var generoMed = $("#generoMed").val();
    var telefoneMed = $("#telefoneMed").val();
    var enderecoMed = $("#enderecoMed").val();
    var emailMed = $("#emailMed").val();
    var rgMed = $("#rgMed").val();
    var senhaMed = $("#senhaMed").val();
    var confirmarSenhaMed = $("#confirmarSenhaMed").val();
    var registroMed = $("#registroMed").val();
    var especializacao = $("#especializacao").val();
    var instituicaoEnsino = $("#instituicaoEnsino").val();
    var conclusaoGrad = $("#conclusaoGrad").val();
    var certificacao = $("#certificacao").val();
    var areaInteresse = $("#areaInteresse").val();
    var credenciais = $("#credenciais").val();
    var experiencias = $("#experiencias").val();

    if (nomeMed === "" ||
        cpfMed === "" || 
        nascimentoMed === "" || 
        generoMed === "" || 
        telefoneMed === "" || 
        enderecoMed === "" || 
        emailMed === "" || 
        rgMed === "" || 
        senhaMed === "" || 
        confirmarSenhaMed === "" ||
        registroMed === "" ||
        especializacao === "" ||
        instituicaoEnsino === "" ||
        conclusaoGrad === "" ||
        certificacao === "" ||
        areaInteresse === "" ||
        credenciais === "" ||
        experiencias === "") {

        alert("Preencha todos os campos!");
        return;
    }

    if (senhaMed === confirmarSenhaMed) {
        // Faz a requisição POST para o servidor
        axios.post('http://localhost:8080/medico', {
            "nomeMed": nomeMed,
            "cpfMed": cpfMed,
            "nascimentoMed": nascimentoMed,
            "generoMed": generoMed,
            "telefoneMed": telefoneMed,
            "enderecoMed": enderecoMed,
            "emailMed": emailMed,
            "rgMed": rgMed,
            "senhaMed": senhaMed,
            "registroMed": registroMed,
            "especializacao": especializacao,
            "instituicaoEnsino": instituicaoEnsino,
            "conclusaoGrad": conclusaoGrad,
            "certificacao": certificacao,
            "areaInteresse": areaInteresse,
            "credenciais": credenciais,
            "experiencias": experiencias
        })
        .then(function (response) {
            console.log(response);
            alert("Cadastro realizado com sucesso!");
            window.location = "../src/loginMedico.html";
        })
        .catch(function (error) {
            console.log(error);
            alert("Erro ao realizar o cadastro!");
        })
    } else if (senhaMed !== confirmarSenhaMed) {
        alert("As senhas não coincidem!");
        return;
    }
}
function cadPaciente() {
    //Obtém os valores dos campos do formulário
    var nome = $("#nome").val();
    var cpf = $("#cpf").val();
    var dataNascimento = $("#dataNascimento").val();
    var genero = $("#genero").val();
    var telefone = $("#telefone").val();
    var endereco = $("#endereco").val();
    var email = $("#email").val();
    var rg = $("#rg").val();
    var senha = $("#senha").val();
    var confirmarSenha = $("#confirmarSenha").val();
    var error = $("#error");
    var senhaError = $("#senhaError");

    //Valida se os campos obrigatórios foram preenchidos
    if (nome == "" ||
         cpf == "" || 
         dataNascimento == "" || 
         genero == "" || 
         telefone == "" || 
         endereco == "" || 
         email == "" || 
         rg == "" || 
         senha == "" || 
         confirmarSenha == "") {

            error.show();
        return;
    }

    //Valida se a senha e a confirmação de senha são iguais
    if (senha === confirmarSenha) {
        //Faz a requisição POST para o servidor
        axios.post('http://localhost:8080/paciente', {
            "nome": nome,
            "cpf": cpf,
            "dataNascimento": dataNascimento,
            "genero": genero,
            "telefone": telefone,
            "endereco": endereco,
            "email": email,
            "rg": rg,
            "senha": senha,
        })
        .then(function (response) {
            console.log(response);
            alert("Paciente cadastrado com sucesso!");
            window.location = "../src/loginPaciente.html";
        })
        .catch(function (error) {
            console.log(error);
            alert("Erro ao cadastrar paciente!");
        });
    } else if (senha !== confirmarSenha) {
        senhaError.show();
        return;
    }
}
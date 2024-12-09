function cadPaciente() {
    //Obtém os valores dos campos do formulário
    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var dataNascimento = document.getElementById("dataNascimento").value;
    var genero = document.getElementById("genero").value;
    var telefone = document.getElementById("telefone").value;
    var endereco = document.getElementById("endereco").value;
    var email = document.getElementById("email").value;
    var rg = document.getElementById("rg").value;
    var senha = document.getElementById("senha").value;
    var confirmaSenha = document.getElementById("confirmaSenha").value;

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
         confirmaSenha == "") {

        alert("Preencha todos os campos obrigatórios!");
        return;
    }

    //Valida se a senha e a confirmação de senha são iguais
    if (senha != confirmaSenha) {
        alert("Senha e confirmação de senha não são iguais!");
        return;
    }

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
    })
    .catch(function (error) {
        console.log(error);
        alert("Erro ao cadastrar paciente!");
    });
}
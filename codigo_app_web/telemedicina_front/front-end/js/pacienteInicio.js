function getAllConsultas() {
    
    axios.get("http://localhost:8080/consulta")
    .then(function(response) {
        console.log(response);

        var jsonData = response.data;
        var tableBody = $("table tbody");

        jsonData.forEach(consultas => {
            var markup = "<tr>" +
                            "<td>" + consultas.medicoNome + "</td>" +
                            "<td>" + consultas.dataConsulta + "</td>" +
                            "<td>" + consultas.clinicaNome + "</td>" +
                         "</tr>";

            tableBody.append(markup);
        });
    })
    .catch(function(error) {
        console.log(error);
    });
}
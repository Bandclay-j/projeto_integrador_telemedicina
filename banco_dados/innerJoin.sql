SELECT m.nomeMed, cl.nomeClinica, cl.enderecoClinica FROM Medico m  INNER JOIN Atende ate ON m.ID = ate.ID_MEDICO INNER JOIN Clinica cl on cl.ID = ate.ID_CLINICA   WHERE cl.enderecoClinica LIKE "%DF";

SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT m.nomeMed, cs.dataConsulta, cs.formatoConsulta, cs.pagamentoConsulta FROM Medico m INNER JOIN Consulta cs ON m.ID = cs.ID_MEDICO;

SELECT cl.nomeClinica, ex.descricaoExame, ex.dataExame, ex.statusExame, ex.diagnosticoExame, ex.valorExame FROM Clinica cl INNER JOIN Exame ex ON cl.ID = ex.ID_CLINICA WHERE cl.ID <= 10;

SELECT me.nomeMed, pa.nome, pr.dataPrescricao, pr.medicamento, pr.observacao FROM Medico me INNER JOIN prescricao pr ON me.ID = pr.ID_MEDICO INNER JOIN Paciente pa ON pa.ID = pr.ID_PACIENTE;
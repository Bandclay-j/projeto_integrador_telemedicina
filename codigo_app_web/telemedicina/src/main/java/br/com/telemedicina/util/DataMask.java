package br.com.telemedicina.util;

public class DataMask {

    public static String maskCpf(String cpf){
        if (cpf != null && cpf.length() == 14) {
            return cpf.substring(0, 3) + ".***.***-" + cpf.substring(9, 11);
        }
        return cpf;
    }

    public static String maskRg(String rg) {
        if (rg != null) {
            // Remover espaços em branco, para garantir que estamos lidando com um formato correto
            rg = rg.replaceAll("\\s", "");

            // Mascara todos os números por asteriscos, mas mantém os caracteres não numéricos
            String rgMasked = rg.replaceAll("[0-9]", "*");

            // A partir do último ponto (.) no RG, mostramos os 3 últimos números.
            int lastDotIndex = rg.lastIndexOf('.');

            if (lastDotIndex != -1 && rg.length() > lastDotIndex + 3) {
                // Exibe a parte mascarada até o ponto e adiciona os últimos 3 números
                return rgMasked.substring(0, lastDotIndex + 1) + rg.substring(lastDotIndex + 1);
            }
        }
        return rg; // Se não tiver o formato esperado, retorna o valor original
    }

    public static String maskTelefone(String telefone) {
        if (telefone != null) {
            // Remove qualquer caractere que não seja número
            String telefoneNumerico = telefone.replaceAll("[^0-9]", "");

            // Verifica se o telefone tem exatamente 11 dígitos
            if (telefoneNumerico.length() == 11) {
                // Aplica a máscara: 10 primeiros asteriscos e os últimos 4 números visíveis
                return "**********-" + telefoneNumerico.substring(7); // Ex: **********-4321
            }
        }
        return telefone; // Se não for válido, retorna o telefone original
    }

}

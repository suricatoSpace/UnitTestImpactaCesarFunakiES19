public class ManipulaString {

    private String Saudacao;

    public ManipulaString(){
        IncluiSaudacao();
    }

    private void IncluiSaudacao(){
        Saudacao = "Bem vindo!!! seu resultado: ";
    }

    public String concatena(String valor1, String valor2){
        return concatena(valor1, valor2, false);
    }

    public String concatena(String valor1, String valor2, boolean Saudacao) {

        if((valor1 == null || valor1.length() == 0) && (valor2 == null || valor2.length() == 0)){
            return "";
        }

        if(valor1 == null || valor1.length() == 0){
            return valor2;
        }

        if(valor2 == null || valor2.length() == 0){
            return valor1;
        }

        if (Saudacao){
            return  GetSaudacao() + valor1 + valor2;
        }

        return  valor1 + valor2;
    }

    public String GetSaudacao(){
        return Saudacao;
    }


}

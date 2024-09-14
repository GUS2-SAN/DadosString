import javax.swing.JOptionPane;

public class armString {
    //ATRIBUTOS
    public String str;

   //CONSTRUTOR
   public armString(String str){
       this.str = str;

    }

    //METODOS
    public int quantVogais()
    {
        int quant = 0;
        char[] vogais = {'a','e','i','o','u','A','E','I','O','U'};


        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            for (char isvogal : vogais)
            {
                if (ch == isvogal)
                {
                    quant++;
                }
            }
        }


        return quant;
    }

    //METODOS
    public int quantEsp()
    {
        int quant = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
                if (Character.isWhitespace(ch)) {
                    quant++;

                }

        }
        return quant;
    }

    private boolean isVogal(char ch) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vogal : vogais) {
            if (ch == vogal) {
                return true;
            }
        }
        return false;
    }

    public int quantCon()
    {
        int quant = 0;
        for(int i = 0; i < str.length(); i++)
        {

            char ch = str.charAt(i);
            if (Character.isLetter(ch) && !isVogal(ch))
            {
                quant++;
            }

        }
        return quant;
    }


    //MAIN
    public static void main(String[] args) {

       String entrada = JOptionPane.showInputDialog("Digite uma string:");

       armString strin = new armString(entrada);

       String saida = "A String " + entrada + " possui:\n"
               + strin.quantVogais() +" vogal(is) \n"
               + strin.quantCon() + " consoante(s)\n"
               +  strin.quantEsp() + " espaço(s) em branco";

        JOptionPane.showMessageDialog(null, saida);

    }

}
public class Palavra {
    private String texto;
    private char[] palavraOculta;

    public Palavra(String texto) {
        this.texto = texto.toUpperCase();
        palavraOculta = new char[texto.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
    }

    public boolean revelarLetra(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                palavraOculta[i] = letra;
                encontrada = true;
            }
        }
        return encontrada;
    }

    public boolean estaCompleta() {
        return texto.equals(new String(palavraOculta));
    }

    public String getTexto() {
        return texto;
    }

    public String getPalavraOculta() {
        return new String(palavraOculta);
    }
}


public class IPhone implements IPod, Phone, Safari {
  private int numero;
  private boolean ligado;
  private boolean tocando;
  private boolean chamando;
  
  public IPhone(int numero) {
    this.numero = numero;
    this.ligado = false;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public boolean isLigado() {
    return this.ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isTocando() {
    return this.tocando;
  }

  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  public boolean isChamando() {
    return this.chamando;
  }

  public void setChamando(boolean chamando) {
    this.chamando = chamando;
  }

  @Override
  public void exibirPagina(String url) {
    if (this.ligado) {
      System.out.println("Exibindo página " + url);
    }
  }

  @Override
  public void adicionarNovaAba() {
    if (this.ligado) {
      System.out.println("Abrindo nova aba");
    }
  }

  @Override
  public void atualizarPagina() {
    if (this.ligado) {
      System.out.println("Atualizando página atual");
    }
  }

  @Override
  public void ligar(int numero) {
    if (this.ligado) {
      System.out.println("Ligando para " + numero);
    }    
  }

  @Override
  public void atender() {
    if (this.ligado && this.chamando) {
      this.chamando = ! this.chamando;
      System.out.println("Alô");
    }
  }

  @Override
  public void iniciarCorreioVoz() {
    if (this.ligado && ! this.chamando) {
      System.out.println("Deixe sua mensagem após o sinal");
    }
  }

  @Override
  public void play() {
    if (this.ligado && ! this.tocando) {
      this.tocando = true;
    }
  }

  @Override
  public void pause() {
    if (this.ligado && this.tocando) {
      this.tocando = false;
    }
  }

  @Override
  public void selecionarMusica(String musica) {
    if (this.ligado) {
      System.out.println("Mudando para a música " + musica);
      this.tocando = true;
    }
  }

  @Override
  public String toString() {
    return "{" +
      " numero='" + getNumero() + "'" +
      ", ligado='" + isLigado() + "'" +
      ", tocando='" + isTocando() + "'" +
      ", chamando='" + isChamando() + "'" +
      "}";
  }

}

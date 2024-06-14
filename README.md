Desafio de implementação da Classe Iphone com 3 interfaces, proposto pelo Bootcamp de Backend com Java oferecido pelo Santander em parceria com a DIO.

Abaixo é possível observar o Diagrama de Classe UML do desafio.

```mermaid
classDiagram
    class IPod {
        +play()
        +pause()
        +selecionarMusica(String musica)
    }

    class Phone {
        +ligar(int numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Safari {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        -int numero
        -boolean ligado
        -boolean tocando
        -boolean chamando
        +getNumero()
        +setNumero()
        +getLigado()
        +setLigado()
        +getTocando()
        +setTocando()
        +getChamando()
        +setChamando()
    }

    iPhone --> IPod
    iPhone --> Phone
    iPhone --> Safari
```

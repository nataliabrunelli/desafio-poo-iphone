Desafio de implementação da Classe Iphone com 3 interfaces, proposto pelo Bootcamp de Backend com Java oferecido pelo Santander em parceria com a DIO.

Abaixo é possível observar o Diagrama de Classe UML do desafio.

```mermaid
classDiagram
    class IPod {
        <<interface>>
        +play()
        +pause()
        +selecionarMusica(String musica)
    }

    class Phone {
        <<interface>>
        +ligar(int numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Safari {
        <<interface>>
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

    iPhone ..|> IPod
    iPhone ..|> Phone
    iPhone ..|> Safari
```

Referência para a elaboração do diagrama UML utilizando a ferramenta [Mermaid](https://mermaid.js.org/syntax/classDiagram.html).

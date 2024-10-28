# **PROCESSOS**

## Guia de Símbolos:

    [ ❌ ] - Não finalizado.

    [ ✔️ ] - Finalizado.

    [ 🛠️ ] - Finalizado, porém, não está 100% fiel ao que foi pedido.

## Breve Contexto

- Nesses exercícios foi utilizada uma VM, chamada Virtual Box, para simular uma máquina com o Linux Debian, a fins de resolver algoritmos java em Sistemas Operacionais além do Windows.

## [ ✔️ ] Exercício 1

(🗺️) - Classes:

- [☕] - [Principal.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/view/Principal.java)
- [☕] - [RedesController.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/controller/exerciciosprincipais/RedesController.java)

### Descrição:

- [ ✔️ ] - *Criar, em um Java Project, uma classe chamada RedesController.java no package controller e uma classe Main.java no package view.*

- [ ✔️ ] - *A classe RedesController.java deve ter 3 métodos.*

    - [ ✔️ ] 1 - *O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado)*

    - [ ✔️ ] 2 - *O segundo, chamado ip, que verifica o Sistema Operacional e, de acordo com o S.O., faz a chamada de configuração de IP.*

        - [ ✔️ ] 2.1 - *A leitura do processo chamado deve verificar cada linha e, imprimir, apenas, o nome do adaptador de rede e o IPv4, portanto, adaptadores sem IPv4 não devem ser mostrados.*

    - [ ✔️ ] 3 - *O terceiro, chamado ping, que verifica o Sistema Operacional e, de acordo com o S.O. e, faz a chamada de ping em IPv4 com 10 iterações.*

        - [ ✔️ ] 3.1 - *A leitura do processo chamado deve verificar as linhas de saída e exibir, apenas, o tempo médio do ping. O teste de ping deve ser feito com a URL www.google.com.br*

- [ ✔️ ] - *A Classe Main.java deve dar as opções de chamadas do método ip ou do método ping com JOptionPane e, dependendo da escolha, instanciar a Classe RedesController.java e chamar o método escolhido. A opção de finalizar a aplicação também deve estar disponível.*

## **Tecnologia(s) utilizadas neste exercício 💻**
<div style="display: inline_block">
    <img align="center" alt="html5" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Debian-A81D33?style=for-the-badge&logo=debian&logoColor=white" />
</div><br/>

## **Feito por 👤**

- [👨‍💻] - [Kawan Serafim](https://github.com/KawanSerafim)

========================================================================================================================================================================================

## [ ✔️ ] Exercício 2

(🗺️) - Classes:

- [☕] - [Principal.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/view/Principal.java)
- [☕] - [KillController.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/controller/exerciciosprincipais/KillController.java)

### Descrição:

- [ ✔️ ] - *Criar, em Java Project, uma classe chamada KillController.java no package controller e uma classe Main.java no package view.*

- [ ✔️ ] - *A classe KillController.java deve ter 4 métodos.*

    - [ ✔️ ] 1 - *O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado).*

    - [ ✔️ ] 2 - *O segundo, chamado listaProcessos, que verifica o SO e, de acordo com SO, selecione o comando para listar os processos ativos.*

        - [ ✔️ ] 2.1 - *O método deve receber todas as linhas de saída do processo de listagem e exibi-las em console.*

    - [ ✔️ ] 3 - *O terceiro, chamado mataPid, que recebe um PID como parâmetro de entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o finalize.*

    - [ ✔️ ] 4 - *O quarto, chamado mataNome, que recebe um nome de processo como parâmetro de entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o finalize.*

- [ ❌ ] - *Ideias adicionais(minhas).*

    - [ ❌ ] *Para cada método de matar processo, identificar se de fato matou. Caso não, enviar mensagem dizendo que não conseguiu finalizar o processo*.

## **Tecnologia(s) utilizadas neste exercício 💻**
<div style="display: inline_block">
    <img align="center" alt="html5" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Debian-A81D33?style=for-the-badge&logo=debian&logoColor=white" />
</div><br/>

## **Feito por 👤**

- [👨‍💻] - [Kawan Serafim](https://github.com/KawanSerafim)

========================================================================================================================================================================================

## [ ✔️ ] Exercício 3 - Exclusivo Linux

(🗺️) - Classes:

- [☕] - [Principal.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/view/Principal.java)
- [☕] - [DistroController.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/controller/exerciciosprincipais/DistroController.java)

### Descrição:

- [ ✔️ ] - *Criar, em Java Project, uma classe chamada DistroController.java no package controller e uma classe Main.java no package view.*

- [ ✔️ ] - *A classe DistroController.java deve ter 2 métodos.*

    - [ ✔️ ] 1 - *O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado).*

    - [ ✔️ ] 2 - *O segundo, chamado exibeDistro, que verifica o SO e, se for Linux, selecione o comando para exibir as propriedades da distribuição. Deve-se exibir o nome e a versão da distribuição. Caso o SO não seja Linux, exibir uma mensagem comunicando.*

- [ ✔️ ] - *A classe Main.java deve ter um chamado para a exibição das informações.*

## **Tecnologia(s) utilizadas neste exercício 💻**
<div style="display: inline_block">
    <img align="center" alt="html5" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Debian-A81D33?style=for-the-badge&logo=debian&logoColor=white" />
</div><br/>

## **Feito por 👤**

- [👨‍💻] - [Kawan Serafim](https://github.com/KawanSerafim)

========================================================================================================================================================================================

## [ 🛠️ ] Exercício 4 - Desafio Exclusivo Windows

(🗺️) - Classes:

- [☕] - [TelaExecutar.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/view/desafio/TelaExecutar.java)
- [☕] - [SearchController.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/controller/desafio/SearchController.java)
- [☕] - [RunController.java](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/controller/desafio/RunController.java)

### Descrição:

- [ ✔️ ] - *Criar, em Java, um sistema que simula o Executar (Run) do Windows.*

- [ ✔️ ] - *No package view, deve ser criado, com auxílio do framework, conforme figura abaixo, uma tela com um JTextField e 3 botões (OK, Cancelar e Procurar).*

![Figura](https://github.com/KawanSerafim/Sistemas_Operacionais/blob/main/src/processos/imagens/Imagem%20do%20WhatsApp%20de%202024-10-16%20à(s)%2010.21.40_4f4fabc8.jpg)

- [ 🛠️ ] - *No package controller, devemos ter:*

    - [ ✔️ ] - *Uma classe, chamada SearchController, que receba o JTextField pelo construtor, implementa um ActionListener para executar a ação do botão Procurar. No método ActionPerformed, deve ter uma busca de arquivos executáveis Windows, via JFileChooser, e seleciona o arquivo a ser executado e escreve seu caminho completo no JTextField.*

    - [ 🛠️ ] - *Uma classe, chamada RunController, que receba o JTextField e o próprio JFrame da tela pelo construtor, implementa um ActionListener para executar a ação do botão OK. No método ActionPerformed, deve tentar executar o que está escrito no JTextField (O usuário pode digitar o caminho por conta própria, ao invés de procurar). Caso o arquivo seja inválido, dar uma mensagem de erro. Uma vez executado, sem erro, a tela deverá ser finalizada pelo método dispose().*

    - [ 🛠️ ] - *Uma classe, chamada CancelController, que receba o próprio JFrame da tela pelo construtor, implementa um ActionListener para executar a ação do botão Cancelar. O método actionPerformed deve proceder um dispose() da tela.*

## **Tecnologia(s) utilizadas neste exercício 💻**
<div style="display: inline_block">
    <img align="center" alt="html5" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
    <img align="center" alt="html5" src="https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white" />
</div><br/>

## **Feito por 👤**

- [👨‍💻] - [Kawan Serafim](https://github.com/KawanSerafim)

========================================================================================================================================================================================

# 🎲 Gerenciador de Jogos de Tabuleiro

Este é um programa orientado a objetos para gerenciar coleções de **jogos de tabuleiro** e registrar **partidas realizadas** entre os jogadores. Ele permite cadastrar diferentes tipos de jogos, registrar resultados e realizar consultas de jogos e partidas.

## 📌 Funcionalidades

- 📚 **Cadastro de jogos de tabuleiro**:
  - Estratégia (ex.: Xadrez, Go)
  - Cooperativo (ex.: Pandemic, Arkham Horror)
  - Competitivo (ex.: Catan, Carcassonne)
- 📝 **Registro de partidas**, incluindo:
  - Data da partida
  - Jogadores participantes
  - Resultado final
- 🔎 **Consultas de jogos** por nome, editora e tipo.
- 📊 **Relatório de partidas** jogadas para um jogo específico.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java / Python / C++ (escolha a linguagem conforme sua implementação)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Conceitos:** Herança, polimorfismo, abstração e composição

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/gerenciador-jogos-tabuleiro.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd gerenciador-jogos-tabuleiro
   ```
3. Compile e execute o código:
   ```bash
   javac Main.java
   java Main
   ```
   Ou, caso esteja em Python:
   ```bash
   python main.py
   ```

## 📂 Estrutura do Projeto

```
📦 challengGPT
 ┣ 📂 src
 ┃ ┣ 📂 GerenciadorGames
 ┃ ┃ ┣ 📜 CadastraGame.java
 ┃ ┃ ┣ 📜 Competitivo.java
 ┃ ┃ ┣ 📜 ConsultarGame.java
 ┃ ┃ ┣ 📜 Cooperativo.java
 ┃ ┃ ┣ 📜 Estrategia.java
 ┃ ┃ ┣ 📜 Game.java
 ┃ ┃ ┣ 📜 Main.java
 ┃ ┃ ┗ 📜 Partida.java
 ┣ 📜 .gitignore
 ┣ 📜 challengGPT.iml
 ┣ 📂 out
 ┣ 📂 .idea
 ┗ 📂 External Libraries
```

## 📖 Exemplo de Uso

Após iniciar o programa, o usuário pode:

1️⃣ **Cadastrar um novo jogo:**  
💬 *Digite o nome do jogo:* "Xadrez"  
💬 *Escolha o tipo:* "Estratégia"  
💬 *Número de jogadores:* "2"  
💬 *Tempo médio de jogo:* "30 minutos"  

2️⃣ **Registrar uma partida:**  
💬 *Digite o nome do jogo:* "Xadrez"  
💬 *Data da partida:* "01/02/2025"  
💬 *Jogadores:* "Alice, Bob"  
💬 *Vencedor:* "Alice"  

3️⃣ **Consultar jogos cadastrados e partidas jogadas.**

## 📜 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias! Para isso:

1. Faça um fork do projeto.
2. Crie uma branch (`git checkout -b minha-feature`).
3. Faça as alterações e commit (`git commit -m 'Minha nova feature'`).
4. Envie um push (`git push origin minha-feature`).
5. Abra um Pull Request!

---

💡 **Dúvidas ou sugestões?** Entre em contato ou abra uma issue! 🚀
por: Caio Moreira 

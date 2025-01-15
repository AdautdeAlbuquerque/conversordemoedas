# 💰 Challenge: Conversor de Moedas

## 📝 Sobre o Projeto

Este projeto foi desenvolvido como parte do **Challenge Alura | Oracle ONE**, um programa de formação promovido pela **Alura** em parceria com a **Oracle**. O objetivo principal deste desafio é reforçar os conceitos de **Java** e **Programação Orientada a Objetos (POO)**, além de praticar o consumo de APIs externas.

O Conversor de Moedas é uma aplicação que permite ao usuário realizar a conversão de valores entre diferentes moedas, utilizando taxas de câmbio atualizadas obtidas através da **ExchangeRate-API**.

---

## ⚙️ Funcionalidades

### ✅ Conversão de Moedas em Tempo Real
- O programa consulta a **ExchangeRate-API** para obter as taxas de câmbio mais recentes.
- Permite que o usuário converta valores entre diversas moedas de maneira simples e rápida.

### 💱 Moedas Suportadas
Atualmente, o conversor de moedas suporta as seguintes conversões:

| Conversão                  | Código das Moedas |
|----------------------------|-------------------|
| Dólar para Peso Argentino   | USD ➡ ARS         |
| Peso Argentino para Dólar   | ARS ➡ USD         |
| Dólar para Real Brasileiro  | USD ➡ BRL         |
| Real Brasileiro para Dólar  | BRL ➡ USD         |
| Dólar para Peso Colombiano  | USD ➡ COP         |
| Peso Colombiano para Dólar  | COP ➡ USD         |

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

Para executar o projeto, você precisará ter instalado:

- **Java JDK** (recomendado: versão 17 ou superior).
- **IDE de sua preferência** (exemplo: IntelliJ IDEA ou Eclipse).

### 🔧 Passo a Passo

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moedas.git
   ```

2. Abra o projeto em sua IDE.

3. Baixe a biblioteca **Gson** (se ainda não tiver):

   - Acesse [https://mvnrepository.com/artifact/com.google.code.gson/gson](https://mvnrepository.com/artifact/com.google.code.gson/gson).
   - Baixe a versão mais recente do arquivo `.jar`.
   - Adicione o arquivo `.jar` ao classpath do projeto.

4. Compile e execute a classe **conversorDeMoeda.java**.

---

## 💻 Tecnologias Utilizadas

- **Java JDK**: versão 17.
- **IDE**: IntelliJ IDEA.
- **Paradigma de Programação Orientada a Objetos (POO)**.
- **ExchangeRate-API**: Para obter taxas de câmbio em tempo real.
- **Gson**: Biblioteca para manipulação de JSON.

---

## 📂 Estrutura do Projeto

```
📦 conversor-de-moedas
 ┣ 📂src
 ┃ ┣ 📜DadosDaAPI.java
 ┃ ┗ 📜conversorDeMoeda.java
```

---

## 🌐 Sobre a API Utilizada

O projeto faz uso da **ExchangeRate-API**, que fornece taxas de câmbio atualizadas para diversas moedas. É necessário uma **API Key** para realizar as consultas. No projeto, a chave está definida na classe `DadosDaAPI`.

Para obter uma chave de acesso, você pode se cadastrar em:

🔗 [https://www.exchangerate-api.com](https://www.exchangerate-api.com)

---

## 📚 Conceitos Praticados

- **Programação Orientada a Objetos (POO)**.
- Manipulação de **requisições HTTP** utilizando a biblioteca **HttpClient** do Java.
- Leitura e manipulação de **JSON** com a biblioteca **Gson**.
- Estruturação de um **menu interativo** em console.

---

## 🔧 Melhorias Futuras

- [ ] Adicionar suporte a mais moedas.
- [ ] Implementar tratamento de erros mais robusto.

---

## 🏆 Desafio Alura | Oracle ONE

Este projeto foi desenvolvido como parte do **Challenge Alura | Oracle ONE**, que tem como objetivo preparar profissionais para o mercado de tecnologia.

Saiba mais sobre o programa em:

🔗 [https://www.oracle.com/br/education/oracle-next-education/](https://www.oracle.com/br/education/oracle-next-education/)

---

### 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou enviar **pull requests** com melhorias.

---

### 🧑‍💻 Autor

Projeto desenvolvido por Adaut de Albuquerque.
e-mail: adautlima@gmail.com
🔗 Linkedin: (https://www.linkedin.com/in/adaut-sacchi-d-albuquerque-lima-67a314210/)

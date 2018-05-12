# srmJava
Camada Backend SRM


## Inicio

### Pré-requisitos

JDK 8 instalado

MySql 5 instalado

### Instalando

* No terminal: git clone https://github.com/sidneynakatani/srmJava.git

* cd srmJava

* Dentro do Eclipse, atualizar dependências: Clicar com botão direito do mouse no projeto -> Maven -> Update Project

### Iniciando aplicação

* Configurar o "application.properties" apontando host, porta e banco, além das credenciais do banco de dados.

* Dentro do Eclipse, Clicar com botão direito do mouse na Classe "com.srmasset.srmtest.SrmTestApplication.java" -> Run -> Java Application

* **Importante**: Após rodar a aplicação alterar o parâmetro **spring.jpa.hibernate.ddl-auto** para **none** ou **update** 
do arquivo "application.properties" para não recriar a estrutura da base de dados.


### Teste de integração:

* Com Curl, digite o comando no terminal(Linux/Mac): curl -d '{"nomeCliente":"Sidney", "limiteDeCredito":10.00, "risco":"A"}' -H "Content-Type: application/json" -X POST http://localhost:8080/cliente

* No Browser: http://localhost:8080/cliente/all

### Detalhes

* A estrutura inicial do projeto foi criado a partir do [Spring Initializr](https://start.spring.io/) para acelerar a entrega do projeto.

* Tempo de desenvolvimento para o primeiro MVP de 3 horas.



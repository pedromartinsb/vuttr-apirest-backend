<h1 align="center"> VUTTR (Very Useful Tools to Remember) </h1>
<p align="justify"> Uma API real simples contendo  CRUD de classes, Spring Security e JWT, Spring Cache, Paginação e ordenação dos resultados da API, monitoramento dos endpoints com Spring Boot Actuator e Admin, e documentação da API com Swagger. </p>

![Badge](https://img.shields.io/static/v1?label=java&message=language&color=red&style=for-the-badge&logo=JAVA)
![Badge](https://img.shields.io/static/v1?label=spring+boot&message=framework&color=green&style=for-the-badge&logo=SPRING)
![Badge](https://img.shields.io/static/v1?label=postman&message=testing+apis&color=orange&style=for-the-badge&logo=POSTMAN)
![Badge](https://img.shields.io/static/v1?label=postgresql&message=data+base&color=blue&style=for-the-badge&logo=PostgreSQL)
![Badge](https://img.shields.io/static/v1?label=h2+console&message=data+base&color=green&style=for-the-badge&logo=H2)
![Badge](https://img.shields.io/static/v1?label=swagger&message=api+documentation&color=green&style=for-the-badge&logo=SWAGGER)
![Badge](https://img.shields.io/static/v1?label=jwt+token&message=spring+security&color=blue&style=for-the-badge&logo=JWT+TOKEN)

### Funcionalidades da Aplicação  

- CRUD de classes
    - Classe de Ferramenta com relacionamento com a classe de Tag
- Spring Security e JWT
    - Habilitando o Spring Security 
    - Liberando acesso aos endpoints públicos
    - Restringindo acesso aos endpoints privados
    - Autenticando o usuário
 - Spring Cache
    - Anotação @Cacheable
    - Boas práticas no uso de Cacheable
- Paginação e Ordenação
- Spring Boot Actuator e Admin
    - Monitoramento com Spring Boot Actuator
    - Monitoramento da API com Spring Admin Client
- Documentação da API com Swagger
    - SpringFox Swagger
    - Enviando token JWT no Swagger
    - Classe SwaggerConfigurations
    
## O que a plataforma é capaz de fazer :checkered_flag:

:trophy: Cadastrar, Listar, Excluir e Alterar a classe de Ferramentas 

:trophy: Autenticar e Autorizar um Usuário para acessar a aplicação 

:trophy: Permite que o usuário pesquise uma certa Ferramenta através do nome da Tag

## Status do Projeto

> API Rest - Backend: Concluido :heavy_check_mark:

> Docker e deploy Servidor: Em desenvolvimento :warning:

> Projeto Frontend: Em desenvolvimento :warning:

## Deploy da Aplicação com Heroku ou  Amazon AWS: :dash:

> Aguardando finalizar todo o desenvolvimento backend :warning:

## Como rodar a aplicação

No terminal, clone o projeto:
git clone https://github.com/pedromartinsb/vuttr-apirest-backend.git

Entre na pasta do projeto:
cd vuttr-apirest-backend

Rodar a aplicação:
-> Abrir a árvore de arquivos src/main/java/br.com.vuttr.apirest -> Abrir o arquivo ApiRestApplication.java -> Botão direito dentro do arquivo -> Run As -> Java Application

Pronto, agora é possível rodar a aplicação a partir da rota http://localhost:3000/ferramentas

## Linguagens e libs utilizadas :books:

- [Java Download](https://www.java.com/pt_BR/download/): versão 8

- [Spring Boot Tutorial](https://spring.io/guides/gs/spring-boot/): versão 2.3.1

Frameworks utilizados:

- [Eclipse IDE](https://www.eclipse.org/downloads/): versão 2020‑06

- [Postman](https://www.postman.com/)

### Classe Ferramenta: 
|nome|descricao|links|tags|
| -------- | -------- | -------- |-------- |
|hotel|All in one tool|google.com.br|"node","java","react"|


## Desenvolvedor
[<img src="https://avatars0.githubusercontent.com/u/33515329?s=460&u=251d4ef587ca509428d495ef98c0f6f1887dc3de&v=4" width=200 > <br> <sub> Pedro Campos </sub>](https://github.com/pedromartinsb)
| :---: |



## Requisições:

### Autenticar e receber Token

![Captura de tela de 2020-07-21 11-43-19](https://user-images.githubusercontent.com/33515329/88069116-72f50c00-cb47-11ea-832e-06dc383f2c1a.png)


###  GET de Ferramentas trazendo as Tag's

![Captura de tela de 2020-07-20 12-14-59](https://user-images.githubusercontent.com/33515329/87954451-c3eefc80-ca82-11ea-8da5-055b52357421.png)


###  PUT de Ferramentas

![Captura de tela de 2020-07-20 12-22-28](https://user-images.githubusercontent.com/33515329/87955144-b5edab80-ca83-11ea-9a64-a35a4b5f8a2b.png)


###  Ferramentas com filtro de Tag descrição

![Captura de tela de 2020-07-20 12-19-37](https://user-images.githubusercontent.com/33515329/87954853-4d9eca00-ca83-11ea-8f4d-342abbcb5314.png)


###  POST Ferramenta passando lista de Tags

![Captura de tela de 2020-07-20 12-06-18](https://user-images.githubusercontent.com/33515329/87953698-c1d86e00-ca81-11ea-949c-e29aa96d04a2.png)


###  DELETE

![Captura de tela de 2020-07-20 12-10-33](https://user-images.githubusercontent.com/33515329/87953931-12e86200-ca82-11ea-9e7b-63b1c891bc53.png)


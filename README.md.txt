## GETReq 

Projeto que disponibiliza dados da internet no Logcat. 
## Sobre mim 

Iniciei meus estudos de programação em março de 2020, por sugestão de um amigo da área. Com o tempo. fui me interessando cada vez mais pelo assunto, e em fevereiro de 2021, passei a estudar desenvolvimento de apps através do Android Studio associado à linguagem Kotlin.

Estou em busca de uma oportunidade onde eu possa aplicar os conhecimentos que obtive, pelos cursos que fiz e pelas orientações que me foram passadas durante a minha jornada de estudos. Busco uma empresa onde eu possa aprender muito e entregar o melhor resultado possível.

## O projeto 

O projeto consiste basicamente em efetuar uma GET request e receber uma resposta no formato JSON que é disponibilizada no Logcat. Os dados pertencem a uma ferramenta chamada [JSONPlaceholder](https://jsonplaceholder.typicode.com/), que simula o back-end de uma aplicão, para que testes possam ser feitos pelo front-end. 

## Tecnologias usadas 

Essas são as principais tecnologias usadas nessa aplicação:

## O projeto 

O projeto consiste basicamente em efetuar um GET request e receber uma resposta no formato JSON que é disponibilizada no Logcat. Os dados pertencem a uma ferramenta chamada [JSONPlaceholder](https://jsonplaceholder.typicode.com/), que simula o back-end de uma aplicão, para que testes possam ser feitos pelo front-end. 

## Tecnologias usadas 

Essas são as principais tecnologias usadas nessa aplicação:

## GETReq 

Projeto que disponibiliza dados da internet no Logcat. 
## Sobre mim 

Iniciei meus estudos de programação em março de 2020, por sugestão de um amigo da área. Com o tempo. fui me interessando cada vez mais pelo assunto, e em fevereiro de 2021, passei a estudar desenvolvimento de apps através do Android Studio associado à linguagem Kotlin.

Estou em busca de uma oportunidade onde eu possa aplicar os conhecimentos que obtive, pelos cursos que fiz e pelas orientações que me foram passadas durante a minha jornada de estudos. Busco uma empresa onde eu possa aprender muito e entregar o melhor resultado possível.

## O projeto 

O projeto consiste basicamente em efetuar um GET request e receber uma resposta no formato JSON que é disponibilizada no Logcat. Os dados pertencem a uma ferramenta chamada [JSONPlaceholder](https://jsonplaceholder.typicode.com/), que simula o back-end de uma aplicão, para que testes possam ser feitos pelo front-end. 

## Tecnologias usadas 

Essas são as principais tecnologias usadas nessa aplicação:

| Biblioteca     | Função                                                    |
| -------------- | --------------------------------------------------------- |
| [Retrofit]      | Biblioteca para efetuar requests e responses biblioteca para efetuar requests e responses. |
| [Coroutines] | Biblioteca para facilitar o uso de código assíncrono.          |

## Funcionamento

 O aplicativo em si não é o foco do projeto, mas sim a técnica que envolve a utilização da biblioteca Retrofit para que dados da internet sejam apresentados no Logcat. 
 A utilização da data class 'Post' representa a forma como os dados são organizados na API. 
 A função da Interface é a base de todo o código assíncrono, uma vez o uso de Coroutines é necessário para que operações que independem da internet funcionem separadamente. 
 No objeto RetrofitInstance, uma retrofit é criada a partir da URL base e sua endpoint. Ambos são representados por valores distintos, uma vez que a URL base é sempre a mesma, já a endpoint pode ser dinâmica. 
As views relativas aos dados e a forma como são disponibilizadas no Logcat são organizadas na MainActivity. 

![screenshot](https://raw.githubusercontent.com/lmtmoraes/GETReq/master/logcat.jpg)




Os dados são apresentados no Logcat a partir do momento que o aplicativo é aberto. 
 
   
   
[retrofit]: https://github.com/square/retrofit
[coroutines]: https://github.com/Kotlin/kotlinx.coroutines
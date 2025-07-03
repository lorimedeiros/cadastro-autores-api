## 🔧 API de Cadastro de Autores
Uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de autores, incluindo operações CRUD (Create, Read, Update, Delete).

## 💡 Tecnologias e Funcionalidades
✔ Spring Boot – Framework para desenvolvimento  
✔ PostgreSQL (Docker) – Banco de dados robusto, containerizado para fácil deploy  
✔ JWT (Bearer Token) – Autenticação stateless com segurança via tokens  
✔ Spring Security – Controle de acesso e proteção de endpoints  
✔ JPA/Hibernate – Mapeamento objeto-relacional (ORM)  
✔ DTOs (Data Transfer Objects) – Padrão para transferência de dados entre camadas  
✔ Tratamento de Exceções – Respostas personalizadas para erros  
✔ Validações – Restrições nos campos para garantir dados consistentes  
✔ Documentação - Com Swagger

## 🚀 Endpoints Principais
### 📚 Autores
| Método | Endpoint |	Descrição | Códigos de Resposta |
|-------------|-------------|-------------|-------------|
| POST |/autores | Cadastra um novo autor |	**201** Created (Location header)<br>**422** Unprocessable Entity (validação)<br>**409** Conflict (duplicado) |
| GET |/autores/{id} | Retorna detalhes de um autor |	**200** OK <br>**404** Not Found |
| DELETE |/autores/{id} | Remove um autor |	**204** No Content <br>**400** Bad Request (regra de negócio) |
| GET |/autores | Lista autores por filtros |	**200** OK |
| PUT |/autores/{id} | Atualiza um autor existente |	**204** No Content <br>**422** Unprocessable Entity <br>**409** Conflict |

### 📖 Livros
| Método | Endpoint |	Descrição | Códigos de Resposta |
|-------------|-------------|-------------|-------------|
| POST |/livros | Cadastra um novo livro |	**201** Created (Location header)<br>**422** Unprocessable Entity (validação)<br>**409** Conflict (duplicado) |
| GET |/livros/{id} | Retorna detalhes de um livro |	**200** OK <br>**404** Not Found |
| DELETE |/livros/{id} | Remove um livro |	**204** No Content <br>**404** Not Found) |
| GET |/livros | Lista livros por filtros |	**200** OK |
| PUT |/livros/{id} | Atualiza um livro existente |	**204** No Content <br>**422** Unprocessable Entity <br>**409** Conflict |

## 🔐 Autenticação
* POST /auth/login – Gera um token JWT válido
* Endpoints protegidos – Requerem o token no header (Authorization: Bearer <token>)

## 📌 Objetivo
Este projeto foi desenvolvido para praticar:
* APIs REST com Spring Boot
* Autenticação JWT e Spring Security
* Integração com PostgreSQL em ambiente Dockerizado
* Boas práticas de arquitetura e segurança

## 📚 API de Cadastro de Autores
Uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de autores, incluindo operações CRUD (Create, Read, Update, Delete).

## 🔧 Tecnologias e Funcionalidades
✔ Spring Boot – Framework para desenvolvimento  
✔ PostgreSQL (Docker) – Banco de dados robusto, containerizado para fácil deploy  
✔ JWT (Bearer Token) – Autenticação stateless com segurança via tokens  
✔ Spring Security – Controle de acesso e proteção de endpoints  
✔ JPA/Hibernate – Mapeamento objeto-relacional (ORM)  
✔ DTOs (Data Transfer Objects) – Padrão para transferência de dados entre camadas  
✔ Tratamento de Exceções – Respostas personalizadas para erros  
✔ Validações – Restrições nos campos para garantir dados consistentes  
✔ Documentação - Com Swagger

## 🔐 Autenticação
* POST /auth/login – Gera um token JWT válido
* Endpoints protegidos – Requerem o token no header (Authorization: Bearer <token>)

## 📌 Objetivo
Este projeto foi desenvolvido para praticar:
* APIs REST com Spring Boot
* Autenticação JWT e Spring Security
* Integração com PostgreSQL em ambiente Dockerizado
* Boas práticas de arquitetura e segurança

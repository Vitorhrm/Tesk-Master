# Tesk-Master

Fork de um protótipo acadêmico para gerenciamento de eventos. O [repositório da equipe](https://github.com/TeskMaster/Tesk-Master) concentra o histórico do trabalho.

## Estrutura

| Diretório | Conteúdo |
| --- | --- |
| [`Front/`](Front/) | Páginas de login, cadastro e painel em HTML, CSS e JavaScript |
| [`config-service/criar-usuarios/`](config-service/criar-usuarios/) | Cadastro e listagem de usuários |
| [`config-service/crud-de-eventos/`](config-service/crud-de-eventos/) | Endpoints para salvar e atualizar eventos |
| [`config-service/notification-service/`](config-service/notification-service/) | Endpoint de envio de e-mail por SMTP |
| [`microsservices_esofii/`](microsservices_esofii/) | Servidores Spring Cloud de configuração e descoberta |

## Explorar o protótipo

Abra [`Front/login.html`](Front/login.html) em um navegador para visualizar a interface. Use JDK 17. Os três serviços em `config-service/` têm wrapper Maven. Para empacotar os servidores de configuração e descoberta, instale o Maven e rode `mvn -f microsservices_esofii/pom.xml verify` na raiz. Os serviços de usuários e eventos esperam bancos MySQL locais chamados `usuarios` e `eventos`.

Configure `SPRING_DATASOURCE_USERNAME` e `SPRING_DATASOURCE_PASSWORD` para as instâncias que usam MySQL. Para experimentar o serviço de notificações, defina `SPRING_MAIL_USERNAME` e `SPRING_MAIL_PASSWORD` no ambiente do processo.

## Planejamento acadêmico

O registro abaixo reúne os objetivos e requisitos definidos durante o projeto, incluindo funcionalidades previstas para etapas futuras.

<details>
<summary>Objetivos, metodologia e requisitos originais</summary>

🎯 Objetivo

Desenvolver uma plataforma acessível por navegadores modernos para:

- Criar e gerenciar eventos
- Organizar participantes
- Emitir certificados automaticamente
- Enviar convites
- Fornecer visualizações intuitivas de agenda

## 🛠️ Tecnologias Utilizadas

- *Back-end:* Java, Spring Framework, JPA
- *Front-end:* HTML, CSS, JavaScript
- *Banco de Dados:* (a definir, exemplo: MySQL)
- *Gerenciamento:* Trello (Kanban), reuniões semanais

## Modelos de Processos

## 🔄 Metodologia de Desenvolvimento

Adotamos *Scrum*, com:

- Sprints quinzenais
- Reuniões semanais de alinhamento
- Reuniões de review e planning
- Product Backlog no Trello

## 🧭 Fluxo de Usuário (Exemplo)

1. Acessar sistema e autenticar-se
2. Criar evento com data, título e descrição
3. Cadastrar participantes via formulário ou importação
4. Enviar convites automáticos por e-mail
5. Visualizar cronômetro regressivo
6. Após o evento, gerar certificados para download

## 📌 Próximos Passos

- Finalizar definição dos papéis
- Implementar backend com Spring Boot
- Conectar front-end à API REST
- Implementar envio de e-mails e geração de certificados

## ✅ Requisitos Funcionais

- *RF01:* Login e autenticação de usuários via token JWT (auth-service)
- *RF02:* CRUD de eventos com visualização por calendário (event-service)
- *RF03:* Cadastro, edição e exclusão de participantes vinculados a eventos (participant-service)
- *RF04:* Envio de convites personalizados por e-mail (notification-service)
- *RF05:* Temporizador regressivo até o início do evento (timer-service)
- *RF06:* Emissão automática de certificados ao final do evento (certificate-service)
- *RF07:* Remanejamento visual de datas dos eventos via front-end
- *RF08:* Comunicação entre microserviços via API Gateway

## ⚙️ Requisitos Não Funcionais

- *RNF01:* Compatibilidade com navegadores modernos (Chrome, Firefox, Edge)
- *RNF02:* Proteção de dados com HTTPS, autenticação segura e tokens JWT
- *RNF03:* Interface responsiva para diferentes tamanhos de tela
- *RNF04:* Arquitetura escalável e modular, com serviços independentes
- *RNF05:* Tolerância a falhas em microserviços (fallbacks e retries)
- *RNF06:* Orquestração e deploy com Docker e Docker Compose

</details>

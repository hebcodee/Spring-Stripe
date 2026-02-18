# Stripe Payment With Spring
Projeto simples em Spring Boot demonstrando integração com a API
do Stripe para criar um checkout básico. Útil como esqueleto para
pagamentos em aplicações Java/Spring.

![Home](src/main/resources/static/images/Home.png)

**Depdencias**
- Spring Boot Web
- Lombok
- Stripe-Java
- Thymeleaf (Opcional para frontend)

**Pré-requisitos**
- Java 17+ 
- Maven 
- Conta Stripe e chaves de API (secret key and public key)

## Instalação e execução

1. Clone o repositório:

```bash
git clone https://github.com/hebcodee/Spring-Stripe.git
cd Spring-Stripe
```

2. Defina a chave secreta do Stripe no application.properties:

```application.properties
stripe.secretKey=${STRIPE_SECRET_KEY}
```

3. Execute a aplicação usando o Maven:

```powershell
mvn spring-boot:run
```

## Uso / Endpoints

> POST `/product/v1/checkout` — cria uma sessão de pagamento no Stripe.

Exemplo de payload (JSON):

```json
{
  "amount": 300,
  "quantity": 1,
  "currency": "BRL",
  "name": "Course"
}
```

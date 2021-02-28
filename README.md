# Descrição
Esta aplicação foi desenvolvida para verificar se uma senha é válida respeitando as seguintes regras:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

A aplicação foi implementada utilizando JAVA Spring Boot

## Como executar
- Compilar e executar a classe PasswordValidationApplication
- Por padrão, a aplicação será iniciada na porta 8080

## Contrato
A rota implementada é um POST no path /password.
### Exemplo de Request
```json
{
    "value":"abcdef$A1"
}
```
### Exemplo de Response
```json
{
    "valid": true
}
```
## Detalhes da Solução
### Controller
Foram criados objetos de request e response para isolar o que é utilizado nessa camada do domínio da aplicação. Todos os parses estão em classes separadas para evitar dependências.

### Domain
As regras de validação de senha estão separadas em classes, implementando uma interface, para facilitar a manutenção e promover um código limpo, respeitando os princípios do SOLID.
Para as validações mais simples, foi utilizado expressão regular.

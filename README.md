# Documentos de Requisitos - Controle de estoque

## Introdução

O programa de controle de estoque tem como objetivo facilitar a controle de entrada e saída de produtos em um empresa.

Publico-alvo: Empresas de pequeno porte.

### Objetivo

O objetivo deste documento é descrever o que esse programa faz e quais serão suas funcionalidades

### Escopo do produto

O escopo deste documento abrange as funcionalidades e caracteristicas desse programa, seja cadastro de funcionario e produto, como a entrada e saída desses produtos.

## Requisitos Funcionais

| Código | Nome | Descrição |
| ---: | --- | --- |
| RF01 | Cadastrar Funcionario | Serve para cadastrar um funcionario, para que cada um tenho um usuario e senha e diferentes permissões para que seja limitado o que cada funcionario seja capaz de ver e modificar |
| RF02 | Cadastrar Produto | Serve para que você possa cadastrar um produto, que tenha nome, fornecedor, preço de compra e preço de venda, etc |
| RF03 | Modificar Produto | Permite o usuario modificar os atributos do produto |
| RF04 | Deletar Produto | Cria uma flag para que o produto não seja mais observavel para o usuario, alem de que guarda a informação de quem deletou o produto e quando |
| RF05 | Cadastrar Fornecedor | Cadastrar o fornecedor e quais produtos eles oferecem |
| RF06 | Fazer entrada e saída de produto | O usuario faz uma entrada ou saída de um produto ja cadastrado

## Requisitos não Funcionais

| Código | Requisito / Aplicação | Descrição |
| ---: | --- | --- |
| RNF01 | Aplicação | A Aplicação deve ser leve e rapida |
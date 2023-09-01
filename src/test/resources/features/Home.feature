# encoding: iso-8859-1
@Testar
Feature: Home

Scenario: Validar Titulos Secoes Home
	When acesso a home do site
	Then verifico o titulo Somos Verity_
	And verifico o titulo Nossos clientes_

Scenario Outline: Validar Newsletter
	Given acesso a home do site
	When preencho o campo Nome com valor <nome>
	And preencho o campo Telefone com valor <telefone>
	And preencho o campo Email com valor <email>
	And preencho o campo Nos conte o seu desafio com valor <nosConteOSeuDesafio>
	And marco o checkbox Aceito receber mensagens da Verity
	And clico no botao Enviar
	Then verifico o texto de confirmacao
	Examples:
	| nome         | telefone    | email                   | nosConteOSeuDesafio                     |
	| usuarioTeste | 81999999999 | naoExiste@naoExiste.com | aprimorar automação de testes WEB e API |

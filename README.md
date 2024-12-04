# conversor-moedas-challenge
Desafio Alura - Criação de um conversor de moedas 

# Descrição
Esta é uma aplicação de conversão de moedas que faz uma requisição para uma API externa para converter o valor de uma moeda de um país para outra. O usuário seleciona as moedas desejadas e a aplicação realiza o cálculo com base nas taxas de câmbio obtidas da API. A interface é simples e intuitiva, permitindo a seleção das moedas e a exibição do valor convertido.

# Tecnologias Utilizadas
Spring Boot: Framework para a construção da aplicação Java, responsável pela lógica de back-end e integração com a API externa.
Thymeleaf: Template engine usada para renderizar o HTML com os dados da API, permitindo a integração com o back-end de maneira fácil e dinâmica.
Java: Linguagem de programação usada para construir a lógica da aplicação e realizar as requisições à API.
HTML: Usado para estruturar as páginas da aplicação.
CSS: Utilizado para estilizar a interface, tornando-a mais agradável e intuitiva.
Funcionalidades
Conversão de valores de uma moeda para outra utilizando uma API de conversão de câmbio.
Seleção dinâmica de moedas disponíveis a partir dos dados fornecidos pela API.
Interface simples e intuitiva, construída com Thymeleaf e estilizada com CSS.
Requisições em tempo real para uma API externa para obter as taxas de câmbio mais atualizadas.
Como a aplicação funciona
O usuário acessa a página principal e seleciona duas moedas (moeda de origem e moeda de destino) a partir de um select.
A aplicação faz uma requisição para uma API de conversão de moedas externa, obtendo as taxas de câmbio.
O valor convertido é calculado e exibido diretamente na página, sem recarregar a página inteira, graças à integração entre Spring Boot e Thymeleaf.
# Requisitos
Java 11 ou superior
Maven
Dependências do Spring Boot
Acesso à API externa de conversão de moedas (por exemplo, ExchangeRate-API)

CSS: Arquivos de estilo para personalizar a aparência da aplicação.
API Utilizada
A aplicação utiliza a ExchangeRate-API para buscar as taxas de câmbio atualizadas.

# Melhorias Futuras
Implementar histórico de conversões realizadas.
Adicionar suporte para múltiplas línguas.
Melhorar o design da interface para dispositivos móveis.

# Resultado

https://github.com/user-attachments/assets/cc88abb1-4435-405a-a236-9a12596e4d11





# Javafy - Plataforma de Recomendação de Músicas e Podcasts

## Descrição

Javafy é uma plataforma interativa de recomendação de músicas e podcasts desenvolvida em Java. O projeto foi criado para reforçar conceitos do paradigma de Orientação a Objetos (POO), como herança, polimorfismo, encapsulamento e abstração. Além disso, utiliza a classe `Collections` do Java (`ArrayList` e `List`) e implementa uma Interface para estruturar suas funcionalidades.

## Requisitos

- Java 8+
- IntelliJ IDEA (ou outra IDE de sua preferência)

## Instalação

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/javafy.git
   ```
2. Abra o projeto em sua IDE.
3. Configure o SDK para Java 8 ou superior.

## Como Executar

1. Compile o projeto:
   ```sh
   javac src/*.java
   ```
2. Execute a classe principal:
   ```sh
   java src.Main
   ```

## Funcionalidades

- **Sugerir novos títulos**: O usuário pode sugerir novas músicas ou podcasts para a plataforma.
- **Listar títulos sugeridos**: Exibe todos os títulos recomendados pelo usuário.
- **Exibir títulos sugeridos por você e que foram adicionados à lista de favoritos**: Toda vez que o usuário sugere um novo título, pode optar por adicioná-lo automaticamente à sua lista de favoritos.
- **Exibir tempo de reprodução**: Calcula o tempo total de audição de todos os títulos favoritados.
- **Simulação da adesão da comunidade à recomendação**: Após sugerir um novo título, o sistema simula interações da comunidade, atribuindo um número aleatório de curtidas e reproduções à recomendação.
- **Exibir a avaliação de um título sugerido**: Com base na simulação de adesão da comunidade, o sistema imprime uma avaliação para o título sugerido, informando se ele foi bem recebido ou ainda não impactou um grande número de pessoas.

## Contribuição

Contribuições são bem-vindas! Fique à vontade para abrir issues e pull requests.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.


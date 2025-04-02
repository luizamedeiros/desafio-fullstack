# Desafio Full Stack - Java/React Jr.

## Resumo da aplicação  
Esta aplicação simula uma simples página web onde transações podem ser feitas para um dos clientes do banco de dados.  

### Tecnologias utilizadas  
- **Back-end**: Java 17 + Spring Boot  
- **Front-end**: JavaScript + React  
- **Infraestrutura**: Docker, Nginx/Haproxy, Gatling
- **Banco de dados**: PostgreSQL

## Como executar  
Para rodar a aplicação localmente, basta clonar este repositório e executar:  

```sh
docker-compose up -d --build
```

## Considerações sobre o desenvolvimento  
Este desafio foi, sem dúvidas, desafiador até o último momento! 😅 Dediquei todos os dias possíveis para trabalhar nele e aprender o máximo possível.  

Tive contato com diversas tecnologias novas para mim, como **Dockerização da aplicação, balanceador de carga, limitação de recursos e Gatling**. Algumas decisões foram ajustadas ao longo do caminho, e algumas dificuldades acabaram impactando a entrega final:  

- Inicialmente, utilizei **Nginx** para servir os arquivos do front-end, mas depois de um dia inteiro tentando configurá-lo corretamente, mudei para **Haproxy**. 
- Os testes com **Gatling** falharam, possivelmente porque só compreendi o funcionamento pleno do load balancer na aplicação ao final do desafio. Por isso, não os incluí na versão final do código.
- Não consegui fazer a limitação de recursos funcionar dentro dos requisitos estabelecidos. O front-end frequentemente quebrava com exit 137 por falta de memória, mesmo após várias tentativas de ajuste no código.

Durante o desenvolvimento, pesquisei **extensivamente** em diversas fontes para tentar solucionar os problemas encontrados, incluindo:  

- **Blog posts técnicos**  
- **Stack Overflow**  
- **Tutoriais no YouTube**  
- **ChatGPT**  
- **DeepSeek**  
- **Documentação oficial das tecnologias utilizadas**  

Mesmo tentando todas as abordagens possíveis, algumas dificuldades persistiram.

## Pontos de melhoria  
Apesar dos desafios, aprendi muito e estou determinada a melhorar essa solução. Alguns pontos que planejo revisar:  

- **Inclusão dos testes Gatling**, para validar a performance da aplicação.
- **Ajustes na limitação de recursos**, garantindo que o projeto rode dentro dos limites estabelecidos sem quebrar por falta de memória.
- **Melhoria no front-end**, tornando a experiência mais próxima de um CRUD completo e facilitando os testes.  

## Melhorias na interface  
Aqui está um exemplo rápido de melhoria na UI que implementei, mas não subi na versão final por questões de recursos e priorização de tentar cumprir com os requisitos originais:  

<p align="center">
  <img src="https://github.com/luizamedeiros/desafio-fullstack/blob/main/desafio-web/src/assets/Mock1.png" alt="Mock 1">
  <img src="https://github.com/luizamedeiros/desafio-fullstack/blob/main/desafio-web/src/assets/Mock2.png" alt="Mock 2">
  <img src="https://github.com/luizamedeiros/desafio-fullstack/blob/main/desafio-web/src/assets/Mock3.png" alt="Mock 3">
</p>

## Feedbacks são bem-vindos! 🚀  
Este desafio foi um grande aprendizado, e sei que há muito a melhorar! Se você tiver qualquer **feedback, sugestão ou dica**, por favor, compartilhe — ficarei muito grata com a oportunidade de deixá-lo plenamente funcional!

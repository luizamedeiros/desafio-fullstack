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
Este desafio foi, sem dúvidas, desafiador! 😅 Dediquei todos os dias possíveis para trabalhar nele e aprender o máximo possível.  

Tive contato com diversas tecnologias novas para mim, como **Dockerização da aplicação, balanceador de carga, limitação de recursos e Gatling**. Algumas decisões foram ajustadas ao longo do caminho, e algumas dificuldades acabaram impactando a entrega final:  

- Inicialmente, utilizei **Nginx** para servir os arquivos do front-end, mas depois de um dia inteiro tentando configurá-lo corretamente, mudei para **Haproxy**. Embora tenha funcionado para a comunicação entre os serviços, não consegui fazer o load-balancer operar corretamente.  
- No **docker-compose**, o load-balancer está presente, mas o front-end se comunica diretamente com `localhost:8080` ao invés de usar a porta do balanceador. Isso ocorreu porque, ao apontar para o load-balancer, o container ficava como `unhealthy`, e apesar de diversas tentativas, não consegui resolver esse problema a tempo.  
- Os testes com **Gatling** também falharam, possivelmente pela mesma razão do load-balancer. Por conta disso, não os incluí na versão final do código.  

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

- **Correção do load-balancer**, garantindo que funcione corretamente e sem impactar os serviços.  
- **Inclusão dos testes Gatling**, para validar a performance da aplicação.  
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

CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    limite INTEGER NOT NULL,
    saldo INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE transacao (
    id SERIAL PRIMARY KEY,
    valor INTEGER NOT NULL,
    tipo CHAR(1) NOT NULL,
    descricao VARCHAR(10) NOT NULL,
    realizada_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cli_id INTEGER NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (cli_id) REFERENCES cliente(id)
);

INSERT INTO cliente (id, limite, saldo) VALUES
    (1, 100000, 0),    
    (2, 80000, 0),     
    (3, 1000000, 0),  
    (4, 10000000, 0), 
    (5, 500000, 0);   

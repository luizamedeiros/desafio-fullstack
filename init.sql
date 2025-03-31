-- Criação da tabela cliente (observe os nomes de colunas iguais ao seu @Column)
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    limite INTEGER NOT NULL,
    saldo INTEGER NOT NULL DEFAULT 0
);

-- Criação da tabela transacao (com os mesmos nomes de campos)
CREATE TABLE transacao (
    id SERIAL PRIMARY KEY,
    valor INTEGER NOT NULL,
    tipo CHAR(1) NOT NULL,
    descricao VARCHAR(10) NOT NULL,
    realizada_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cli_id INTEGER NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (cli_id) REFERENCES cliente(id)
);

-- Inserção dos clientes exigidos (com limites em centavos)
INSERT INTO cliente (id, limite, saldo) VALUES
    (1, 100000, 0),    -- Limite: R$ 1.000,00
    (2, 80000, 0),     -- Limite: R$ 800,00
    (3, 1000000, 0),   -- Limite: R$ 10.000,00
    (4, 10000000, 0),  -- Limite: R$ 100.000,00
    (5, 500000, 0);    -- Limite: R$ 5.000,00

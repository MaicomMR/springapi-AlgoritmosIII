CREATE TABLE passageiro (
 id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY ,
 nome VARCHAR (255) NOT NULL,
 cpf VARCHAR(12) NOT NULL,
 rg VARCHAR(10) NOT NULL,
 nascimento DATE NOT NULL,
 telefone VARCHAR(20),
 endereco VARCHAR (255),
 cidade VARCHAR (255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

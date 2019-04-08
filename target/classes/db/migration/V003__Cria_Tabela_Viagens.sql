CREATE TABLE viagem (
  id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  dist_pre double,
  dist_real double,
  origem VARCHAR(255),
  origem_estado INT,
  destino VARCHAR (255),
  destino_estado INT,
  orcamento DOUBLE ,
  data_s DATE,
  hora_s TIME,
  data_r DATE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

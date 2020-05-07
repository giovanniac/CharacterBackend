DROP TABLE IF EXISTS personagens;
 
CREATE TABLE personagens (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  primeiro_nome VARCHAR(250) NOT NULL,
  ultimo_nome VARCHAR(250) NOT NULL,
  idade INTEGER
);

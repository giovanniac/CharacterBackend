DROP TABLE IF EXISTS personagens;
 
CREATE TABLE personagens (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO personagens VALUES (0,'Mickey');
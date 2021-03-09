DROP TABLE IF EXISTS character;
 
CREATE TABLE character (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO character VALUES (0,'Mickey');
INSERT INTO character VALUES (1,'Jotaro');
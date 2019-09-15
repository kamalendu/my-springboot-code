DROP TABLE IF EXISTS customer;
 
CREATE TABLE customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  city VARCHAR(10) DEFAULT NULL
);
 
INSERT INTO customer (name, city) VALUES
  ('Kamal','Cuttack'),
  ('Gopal','Gokul'),
  ('Ram','Ayodhya');
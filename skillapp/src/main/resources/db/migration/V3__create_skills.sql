CREATE TABLE skills(id INT PRIMARY KEY AUTO_INCREMENT,
NAME  VARCHAR(60) NOT NULL,
is_active INT NOT NULL DEFAULT 1);


INSERT INTO skills(NAME) VALUES
('java'),
('servlet'),
('jsp'),
('spring'),
('hibernate');
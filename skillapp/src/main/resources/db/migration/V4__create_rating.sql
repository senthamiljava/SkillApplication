CREATE table ratings(id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,
scale INT UNSIGNED NOT NULL
);

INSERT INTO ratings(NAME,scale) VALUES
('not applicable',0),
('yet to sart',1),
('started',2),
('moderate',3),
('proficient',4);

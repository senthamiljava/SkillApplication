CREATE TABLE user_ratings(
id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
user_id INT NOT NULL,
skill_id INT  NOT NULL,
rating_id INT  NOT NULL default 2,
is_active INT NOT NULL DEFAULT 1,
created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
modified_date TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
FOREIGN KEY(user_id) REFERENCES users(id),
FOREIGN KEY(skill_id) REFERENCES skills(id),
FOREIGN KEY(rating_id) REFERENCES ratings(id),
UNIQUE(user_id,skill_id)
);
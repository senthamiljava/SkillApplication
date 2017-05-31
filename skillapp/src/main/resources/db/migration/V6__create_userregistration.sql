create table user_registration(
id int primary key auto_increment,
user_id int not null,
activation_code int not null,
foreign key(user_id) references users(id));

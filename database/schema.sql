create database todo;
use todo;

create table user(
    user_id varchar (8) not null,
    username varchar(50) not null,
    name varchar(50),
    constraint pk_table_id primary key(user_id)
);

create table task(
    task_id int not null auto_increment,
    description varchar(255),
    priority int,
    due_date date,
    user_id varchar(8) not null,
    constraint pk_task_id primary key(task_id),
    constraint fk_user_id foreign key (user_id) references user(user_id)
);

use mcc;

create table Player (
id varchar(255) not null, 
age integer not null, 
battingAvg double precision not null, 
bowlingAvg double precision not null, 
name varchar(255), 
status varchar(255), 
type varchar(255), 
primary key (id)
);


create table Team (
id integer not null, 
name varchar(255), 
state varchar(255), 
primary key (id)
);
 
create table Team_Player (
Team_id integer not null, 
players_id varchar(255) not null
);

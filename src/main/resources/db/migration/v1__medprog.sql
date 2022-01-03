create table client (
login varchar(50),
pass varchar(100),
status varchar(50)
);

create table patients (
patientSNILS varchar(255) primary key,
patientFamilyName varchar(255) not null,
patientFirstName varchar(255) not null,
patientFathersName varchar(255),
patientBornDate date not null,
patientSex varchar(1),
patientTelNum varchar(20) not null,
patientHomeAddress varchar(255),
patientDistrict varchar(255),
patientRegistrationDate date,
patientCalls int);

insert into patients (patientSNILS, patientFamilyName, patientFirstName,patientBornData,patientTelNum)
values
('234567856','Petrov','Vania',13.01.2000,'89152345456'),
('234565678','Ivanov', 'Petia' ,25.03.2001,'89152345456'),
('223434564','Smitnov','Sasha',13.10.1997,'89152345456'),
('234785678','Tezov','Misha',20.01.1977,'89152345456'),
('234123567','Retov','Grisha',16.01.2000,'89152345456'),
('234895678','Bitov','Anton',19.01.2000,'89152345456');

create table administrators (
adminTelNum varchar(20) primary key,
adminName varchar(255) not null);

insert into administrators (adminTelNum,adminName)
values
('89163456587','Samorezov');

create table ambulanceTeams (
id bigserial primary key,
dateOfChange date,
doctorName varchar(255),
teamNames text,
ambTelNum varchar(20),
ambDistrict varchar(30),
organisationId bigserial not null,
foreign key (organisationId) references organization (organisationId));

insert into ambulanceTeams (id, dataOfChange, doctorName, teamNames, ambTelNum, ambDistrict, organisationId)
values
(01,15.01.2022,'Saburov','Lebedeva, Voitov', '89264537766','S','01'),
(02,15.01.2022,'Krylov','Ter, Idov', '89264535566','S','01'),
(03,15.01.2022,'Mitov','Krotova, Molotov ', '89264533466','W','01');

create table organization (
organizationId bigserial primary key,
organizationName varchar(255) not null,
organizationTelNum varchar(20),
registrationDate date);

create table if not exsists call(
callId bigserial primary key,
callDate date,
patientSNILS varchar(15),
patientFamilyName varchar(255),
patientFirstName varchar(255),
patientFathersName varchar(255),
patientBornDate date,
patientTelNum varchar(20),
callAddress varchar(255),
callDistrict varchar(30),
symptoms text,
comments text,
needResuscitation boolean,
callForChild boolean);

create table if not exists callDocument(
callId bigserial primary key,
callDate date,
documentDate date,
patientSNILS varchar(15),
patientFamilyName varchar(255),
patientFirstName varchar(255),
patientFathersName varchar(255),
patientBornDate date,
callAddress varchar(255) not null,
callDistrict varchar(30),
symptoms text,
ambHelp text,
needResuscitation boolean,
callForChild boolean,
patientHospitalization boolean,
payment boolean);

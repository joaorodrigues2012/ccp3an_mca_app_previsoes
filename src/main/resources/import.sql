INSERT INTO tb_semana(id_semana,dia_semana) VALUES (1,'Segunda-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (2,'Terça-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (3,'Quarta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (4,'Quinta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (5,'Sexta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (6,'Sábado')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (7,'Domingo')

INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (1,'Guaianazes',28.0,-27.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (2,'São Paulo',65,-54.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (3,'Bahia',98.0,-25.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (4,'Rio de Janeiro',78.0,-45.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (5,'Minas Gerais',36.0,-54.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (6,'São Mateus',15.0,-57.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (7,'Rio Grande Do Sul',38.0,-17.0)

insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (1,1,1,21.4,27.2,56,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (2,2,2,21.4,27.2,56,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (3,3,3,20.6,27.8,0,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (4,4,4,20.8,27.8,34,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (5,5,5,20.1,27.7,56,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (6,6,6,20.4,25.5,24,'2019-03-25','');
insert into tb_periodo (id_periodo,id_cidade,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,desc_periodo) values (7,7,7,22.3,27.2,56,CURRENT_DATE(),'');
insert into usuario (id, login, senha) values (1, 'admin', 'admin')

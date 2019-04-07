INSERT INTO tb_semana(id_semana,dia_semana) VALUES (1,'Segunda-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (2,'Terça-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (3,'Quarta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (4,'Quinta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (5,'Sexta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (6,'Sábado')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (7,'Domingo')

insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (1,1,21.4,27.2,56,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (2,2,21.4,27.2,56,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (3,3,20.6,27.8,0,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (4,4,20.8,27.8,34,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (5,5,20.1,27.7,56,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (6,6,20.4,25.5,24,'2019-03-25',28.45,45.28,'');
insert into tb_periodo (id_periodo,id_semana,tempmin_periodo,tempmax_periodo,humidade_periodo,datahora_periodo,lat_periodo,lon_periodo,desc_periodo) values (7,7,22.3,27.2,56,CURRENT_DATE(),28.45,45.28,'');
insert into usuario (id, login, senha) values (1, 'admin', 'admin')

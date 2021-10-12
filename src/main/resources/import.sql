insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Arroz Branco 2',null,null,null);

insert into sl_usuario values (nextval('sq_usuario'),'1986-08-14', 'paulogomes.tec@gmail.com', 'Paulo Gomes', 85, 998442025, 'dadfasdf465f4agd56f65t5kfhjk');

insert into sl_status_lista values(1, 'Nova');
insert into sl_status_lista values(2, 'Andamento');
insert into sl_status_lista values(3, 'Finalizada');
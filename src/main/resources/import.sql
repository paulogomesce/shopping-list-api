insert into sl_usuario values (nextval('sq_usuario'),'1986-08-14', 'paulogomes.tec@gmail.com', 'Paulo Gomes', 85, 998442025, 'dadfasdf465f4agd56f65t5kfhjk');

insert into sl_status_lista values(1, 'Nova');
insert into sl_status_lista values(2, 'Andamento');
insert into sl_status_lista values(3, 'Finalizada');

insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Sem Categoria');
insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Frutas');
insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Verduras');
insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Sereais');
insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Higiêne');
insert into sl_categoria_produto values(nextval('sq_categoria_produto'), 'Limpesa');

insert into sl_status_produto values (0, 'Novo');
insert into sl_status_produto values (1, 'Ativo');
insert into sl_status_produto values (2, 'Cancelado');
insert into sl_status_produto values (3, 'Lixeira');

insert into sl_status_item_lista values(0, 'Pendente');
insert into sl_status_item_lista values(1, 'Realizado');

insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Arroz Branco',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Arroz Parbolizado',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Arroz Integral',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Feijão',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Leite do Felipe',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Maçã',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Goiaba',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Limão',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Macarrão 3 Minutos',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Massa do Felipe',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Achocolatado Nescal',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Café',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Leite de Caixa',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Sardinha',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Sabonete',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Alface',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Aveia',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Pimentão',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Cebola',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Tomate',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Cenoura',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Beterraba',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Filtro de café 102',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Sal Rosa',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Açúcar',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Papel Higiênico',1,0,1);
insert into sl_produto(cd_produto,dt_atualizacao,dt_cadastro,nm_produto,cd_categoria,cd_status,cd_usuario) values(nextval('sq_produto'),CURRENT_TIMESTAMP,CURRENT_DATE,'Ovo',1,0,1);
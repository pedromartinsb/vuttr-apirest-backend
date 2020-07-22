INSERT INTO `ferramenta` (`id`, `descricao`, `links`, `nome`) VALUES
	(1, 'Teste descricao', 'Link teste', 'TESTE');

INSERT INTO `tag` (`id`, `descricao`, `ferramenta_id`) VALUES
	(1, 'Tag1', 1),
	(2, 'Teste de Tag', 1),
	(3, 'Java', 1);
    
INSERT INTO `usuario` (`id`, `email`, `nome`, `senha`) VALUES
	(1, 'adm@email.com', 'Adm', '$2a$10$tKEhFJR0yr50wUbKclCzE.Y9x2qzyGXeScVL7Y9cnt.eVNienZRDK');
    

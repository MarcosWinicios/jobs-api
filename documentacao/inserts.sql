INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(1, 'Remoto', 'Remoto');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(2, 'Goiânia', 'Goiás');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(3, 'Brasília', 'Distrito Federal');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(4, 'São Paulo', 'São Paulo');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(5, 'Rio de Janeiro', 'Rio de Janeiro');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(6, 'Belo Horizonte', 'Minas Gerais');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(7, 'Teresina', 'Piauí');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(8, 'Palmas', 'Tocantins');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(9, 'Salvador', 'Bahia');
INSERT INTO
  tb_cidade (id, cidade, estado)
VALUES(10, 'Rio Branco', 'Acre');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (1, 'Java');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (2, 'HTML');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (3, 'CSS');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (4, 'JavaScript');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (5, 'MySQL');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (6, 'Postgres');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (7, 'C');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (8, 'PHP');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (9, 'MongoDB');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (10, 'React JS');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (11, 'React Native');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (12, 'Angular');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (13, 'Android');
INSERT INTO
  tb_skill(id, nome)
VALUES
  (14, 'IOS');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(1, 'Outros');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(2, 'Vale Transporte');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(3, 'Vale Refeição');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(4, 'Plano de Saúde');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(5, 'Auxílio Home-Office');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(6, 'Plano Odontológico');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(7, 'Bônus');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(8, 'Seguro de vida');
INSERT INTO
  tb_beneficio(id, nome)
VALUES(9, 'Vale Alimentação');
INSERT INTO
  tb_empresa(
    id,
    nome,
    tamanho,
    descricao,
    link,
    cidade_id
  )
VALUES(
    1,
    'Konstroi',
    'PEQUENA_EMPRESA',
    'A KONSTROI se originou a partir da fusão da Datafocus e a Masterfocus, duas empresas líderes que somam trinta e dois anos de tecnologia e serviços dedicados exclusivamente ao segmento da construção. Uma empresa que já nasce com vocação para construir de maneira integrada e inovadora, trazendo em seu DNA o sistema que é pioneiro em gerenciamento para a indústria da construção: o Informakon, líder de mercado e com soluções customizadas para projetos de todos os portes.',
    'https://programathor.com.br/companies/15653',
    4
  );
INSERT INTO
  tb_empresa(
    id,
    nome,
    tamanho,
    descricao,
    link,
    cidade_id
  )
VALUES(
    2,
    'Simpli',
    'PEQUENA_EMPRESA',
    'A Simpli é uma Software-House que atua desde 2013 focada em desenvolver soluções digitais personalizadas para empresas e startups. Prezamos, acima de tudo, por relações eficientes, sinceras e humanas com nossos colaboradores e clientes. Contamos com uma equipe sólida e sempre crescente, com fluência nas principais e mais modernas tecnologias.
     Estamos constantemente em busca de novos talentos, com diversos níveis de experiência. O principal requisito é o interesse no desenvolvimento contínuo de suas habilidades técnicas e a disposição para o trabalho em equipe.',
    'https://programathor.com.br/companies/15643',
    1
  );
INSERT INTO
  tb_empresa(
    id,
    nome,
    tamanho,
    descricao,
    link,
    cidade_id
  )
VALUES(
    3,
    'Loja do Mecânico',
    'GRAMDE_EMPRESA',
    'O Grupo GurgelMix, um grande conglomerado de empresas, nasceu no ano de 2013, com o intuito de interligar todas as suas marcas. Porém, a história teve início bem antes disso, começou em 1993, com o nascimento da Gurgel Ferramentas, através do empreendedorismo do seu idealizador, Márcio Gurgel.
    Durante esse percurso, surgiu à necessidade de criar diferentes empresas para atender clientes diferenciados. O primeiro a nascer, em 2003, foi o site Ferramentas Automotivas, que visava atender o público de mecânicos automobilísticos. Em 2006, transforma-se na Loja do Mecânico. Já em 2007, surge o portal Clube das Ferramentas, que veio somar no segmento de máquinas e ferramentas, possibilitando ao público, mais um espaço para adquirir de forma segura, os mais variados tipos de ferramentas.

    Em 2013, cria-se a empresa FortG, marca própria da Loja do Mecânico, com foco no desenvolvimento de ferramentas especiais de alta qualidade e desempenho, voltada também para mecânicos e demais segmentos que demandam ferramentas especiais. Ainda para atender clientes locais, a GurgelMix possui, desde 2006, uma loja física na cidade de Franca (SP), denominada Gurgel Máquinas e Ferramentas.

    E não para por ai, no ano de 2016, já muito forte no segmento de e-commerce, o Grupo decidiu apostar no nicho de calçados. Desde abril do respectivo ano, a Calçados Online passa a também fazer parte da GurgelMix.

    Especializações
    E-commerce, Varejo, Ferramentas, Máquinas e Ferramentas Automotivas',
    'https://programathor.com.br/companies/15644',
    1
  );
INSERT INTO
  public.tb_vaga(
    id,
    aceita_de_fora,
    ativa,
    atividades,
    data_cadastro,
    nivel_experiencia,
    remoto,
    requisitos,
    salario,
    tipo_contrato,
    titulo,
    empresa_id
  )
VALUES
  (
    1,
    true,
    true,
    'Desenvolvimento de software;Metodologia ágil;Horário flexível;Reunião quinzenal de Sprint (sextas-feiras);Reunião diária de Stand Up (seg-sex às 15h).',
    '2021-10-18',
    'JUNIOR',
    true,
    'Formação em ensino superior ou técnico;Experiência nas linguagens informadas;Conhecimento em metodologias ágeis (Scrum/Kanban);',
    3000,
    'CLT',
    'Desenvolvedor(a) Front-End',
    2
  );
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (1, 2);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (1, 3);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (1, 8);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (1, 9);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(1, 2);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(1, 3);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(1, 4);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(1, 10);
INSERT INTO
  public.tb_vaga(
    id,
    aceita_de_fora,
    ativa,
    atividades,
    data_cadastro,
    nivel_experiencia,
    remoto,
    requisitos,
    salario,
    tipo_contrato,
    titulo,
    empresa_id
  )
VALUES
  (
    2,
    true,
    true,
    'Análise, desenvolvimento, teste e implantação dos aplicativos para Android e IOS tanto no Front-End(Angular/Ionic) quanto no Back-End( C#/SQL Server );Manutenção dos serviços utilizado pelos aplicativos;Publicação de aplicativos nas lojas correspondentes.',
    '2021-09-29',
    'PLENO',
    false,
    'Formação em ensino superior ou técnico;Experiência prévia nas linguagens informadas;Inglês Intermediário;Experiência com ferramentas de versionamento de código (GIT,...);Habilidades interpessoais de escrita e de comunicação verbal;Conhecimento em metodologias ágeis (Scrum/Kanban);Necessário experiência comprovada em mobile no desenvolvimento de aplicações híbridas com framework Ionic (apresentar portfólio);',
    null,
    'CLT PJ',
    'Desenvolvedor(a) Fullstack',
    1
  );
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (2, 2);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (2, 3);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (2, 8);
INSERT INTO
  tb_beneficio_vaga(vaga_id, beneficio_id)
VALUES
  (2, 9);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 2);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 3);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 4);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 10);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 13);
INSERT INTO
  tb_vaga_skill(vaga_id, skill_id)
VALUES(2, 14);
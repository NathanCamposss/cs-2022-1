1. Qual o comando para obter a versão instalada do Git?
**Resposta:** git --version


2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  **Resposta:** Exibe os comandos e a função de cada um deles


  b. git help checkout
  **Resposta:** Abre uma nova guia com explicações e exemplos do comando checkout


  c. git help merge
   **Resposta:** Abre uma nova guia com explicações e exemplos do comando merge

  d. git init
  **Resposta:** Cria um novo repositório do git


  e. git add --all
  **Resposta:**  O arquivo é mandado para staging area e preparado para ser considerado  no próximo commit


  f. git add -u
  **Resposta:** Adiciona os arquivos editados e que são monitorados pelo git 


  g. git config -l
  **Resposta:** O comando git config -l lista todos as configurações do úsuario em questão


  h. git mv a.txt b.txt
  **Resposta:** O comando é usado para renomear arquivos com nome de a.txt para b.txt 


  i. git reset --hard
  **Resposta:** Reseta os commit, passando a exibir o último commit 


  j. git log -27
  **Resposta:** Exibe os últimos 27 commits


3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
**Resposta:** git add * e em seguida git commit -m 'texto do commit'


4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
**Resposta:** git show


5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
**Resposta:** git status


6. Qual o comando para efetuar um _commit_?
**Resposta:** *git commit-m 'comentario do commit'*


7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
**Resposta:** git checkout ...


8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
**Resposta:** Deve-se criar arquivos .gitignore (como por exemplo */log)


9. O que acontece se o seu repositório local for acidentalmente removido?
**Resposta:** Você perde o repositório local mas não necessariamente o remoto


10. Como clonar um repositório remoto?
**Resposta:** git clone


11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
**Resposta:** git log --pretty=oneline 


12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
**Resposta:** ~/.gitconfig


13. Qual o comando para criar um repositório local?
**Resposta:** Deve-se criar uma nova posta e executar o comando *git init* dentro dela


14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
**Resposta:** Será o mesmo da pasta onde o comando foi executado


15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
**Resposta:** git add --all


16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
**Resposta:** Git tem seu checksum calculado antes que seja armazenado e então passa a ser referenciado pelo checksum. Isso significa que é impossível mudar o conteúdo de qualquer arquivo ou diretório sem que o Git saiba.O mecanismo que o Git usa para fazer o checksum é chamado de hash SHA-1.O SHA-1 é uma string de 40 caracteres composta de caracteres hexadecimais que é calculado a partir do conteúdo de um arquivo ou estrutura de um diretório no Git


17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
**Resposta:** -abbrev-commit


18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
**Resposta:** Não pois git add -u adiciona os arquivos editados e que são monitorados pelo git

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
**Resposta:** O primeiro volta ao último commit e mantém os últimos arquivos no *Stage area* e o segundo exibe o último commit


20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
**Resposta:** git clean -f


21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
**Resposta:** Arquivos .gitignore


22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
**Resposta:** Basta colocar *.class


23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
**Resposta:** Exibe nome e email dos usuários


25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
**Resposta:** Exibe a URL (link) do diretorio remoto jqueryrepo


26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
**Resposta:** git tag


27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
**Resposta:** git tag -a


28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
**Resposta:** A partir do comando cria uma tag e armazena com a mensagem "minha versão ouro"


29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
**Resposta:** Após executado vai exibir os dados da tag junto com o commit


30. O que o comando **git push origin 3.4-gold** teria como efeito?
**Resposta:** O comando mostra a informação da pessoa que criou a tag, a data do commit taggeado, e a mensagem antes de mostrar a informação do commit


31. Após executar um commit, qual o efeito de **git commit --amend**?
**Resposta:** Usado para editar a mensagem de commit anterior sem alterar o seu instantâneo


32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
**Resposta:**  Retira o arquivo x.txt da staging Area


33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
**Resposta:** Descarta as mudanças ocorridas no arquivo


34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
**Resposta:** O git reset HEAD x.txt retira o arquivo x.txt da staging Area,já o git checkout -- a.txt descarta as mudanças feitas no arquivo


35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.


